/*******************************************************************************
 * Copyright (c) 2011 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package com.sap.furcas.prettyprinter.incremental;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.EObject;

import com.sap.furcas.metamodel.FURCAS.TCS.ContextTemplate;
import com.sap.furcas.metamodel.FURCAS.TCS.Property;
import com.sap.furcas.metamodel.FURCAS.TCS.SequenceElement;
import com.sap.furcas.metamodel.FURCAS.TCS.SequenceInAlternative;
import com.sap.furcas.metamodel.FURCAS.textblocks.AbstractToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.Bostoken;
import com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode;
import com.sap.furcas.metamodel.FURCAS.textblocks.Eostoken;
import com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.OmittedToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock;
import com.sap.furcas.prettyprinter.Formatter.FormatRequest;
import com.sap.furcas.prettyprinter.policy.DefaultPrintPolicy;
import com.sap.furcas.prettyprinter.policy.PrintPolicy;
import com.sap.furcas.runtime.tcs.TcsUtil;

/**
 * A {@link PrintPolicy} which allows to re-use information from old/preexisting {@link TextBlock}s.
 * 
 * Stated goal is re-use as much as possible, including formatting, comments, serialization order
 * of unordered collections, chosen alternatives, names for for currently un-resolvable elements, ...
 * 
 * A {@link TextBlock} represent a single policy. Its sub-blocks are realized as sub-policies
 * (see {@link #getPolicyFor}). 
 * 
 * @author Stephan Erb
 *
 */
public class TextBlockBasedPrintPolicy implements PrintPolicy {

    private final TextBlock textBlock;
    private final HashMap<SequenceElement, Integer> firstPreceedingWhiteSpaceTokenIndexPerSequenceElement = new HashMap<SequenceElement, Integer>();
    private final HashMap<String, Integer> firstPreceedingWhiteSpaceTokenIndexPerTokenValue = new HashMap<String, Integer>();
    private final TextBlockIndex index;
    private final ContextTemplate template;
    
    public TextBlockBasedPrintPolicy(TextBlock oldBlock, ContextTemplate template, TextBlockIndex index) {
        this.textBlock = oldBlock;
        this.template = template;
        this.index = index;
        
        initializeSequenceElementStore(textBlock.getSubNodes());
    }
    
    private void initializeSequenceElementStore(List<DocumentNode> tokensOfBlock) {
        int currentleftMostWhiteSpace = getUndefinedIndex(); 
        
        for (int i=0; i<tokensOfBlock.size(); i++) {
            DocumentNode node = tokensOfBlock.get(i);
            
            if (node instanceof LexedToken) {
                int tokenIndex = isUndefinedIndex(currentleftMostWhiteSpace) ? i : currentleftMostWhiteSpace;
                
                firstPreceedingWhiteSpaceTokenIndexPerSequenceElement.put(((LexedToken) node).getSequenceElement(), tokenIndex);
                firstPreceedingWhiteSpaceTokenIndexPerTokenValue.put(((LexedToken) node).getValue(), tokenIndex);
                currentleftMostWhiteSpace = getUndefinedIndex();
                
            } else if (isWhiteSpace(node) && isUndefinedIndex(currentleftMostWhiteSpace)) {
                currentleftMostWhiteSpace = i;
                    
            } else if (node instanceof TextBlock) {
                currentleftMostWhiteSpace = getUndefinedIndex();
            }
        }
        // Special case handling for the whitespace/comments at the end of the block
        firstPreceedingWhiteSpaceTokenIndexPerSequenceElement.put(null, isUndefinedIndex(currentleftMostWhiteSpace) ? null : currentleftMostWhiteSpace);
    }
    
    private static boolean isUndefinedIndex(int i) {
        return i < 0;
    }
    private static int getUndefinedIndex() {
        return -1;
    }
    
    private static boolean isPseudoToken(DocumentNode node) {
        return node instanceof Bostoken || node instanceof Eostoken;
    }
    
    private static boolean isWhiteSpace(DocumentNode node) {
        return node instanceof OmittedToken;
    }
    

    @Override
    public PrintPolicy getPolicyFor(EObject modelElement, SequenceElement seqElem, EObject valueToBePrinted, ContextTemplate template) {
        return DefaultPrintPolicy.getPolicyFor(index, valueToBePrinted, template);
    }
    
    @Override
    public Collection<?> getPreferredCollectionOrderOf(EObject modelElement, Property seqElem, Collection<?> elements) {
        return elements;
    }
    
    @Override
    public Collection<ContextTemplate> getPreferredTemplateOrderOf(EObject modelElement, SequenceElement seqElem, EObject value,
            Collection<ContextTemplate> elements) {
        return elements;
    }

    @Override
    public Collection<SequenceInAlternative> getPreferredAlternativeChoiceOrderOf(Collection<SequenceInAlternative> sequences) {
        // This is slow in theory, but seems fast enough for now...
        // Find the chosen alternative in the old textblock
        SequenceInAlternative executedAlternative = null;
        for (SequenceInAlternative seq : sequences) {
            if (seq.getElements().isEmpty()) {
                executedAlternative = seq;
                continue; // only use if we there wasn't another one being executed.
            }
            if (TcsUtil.wasExecuted(template, textBlock.getParentAltChoices(), seq.getElements().iterator().next())) {
                executedAlternative = seq;
                break; // there can only be one
            }
        }
        if (executedAlternative == null) {
            return sequences;
        } else {
            // put it to front: It should be tested first
            List<SequenceInAlternative> reordered = new ArrayList<SequenceInAlternative>(sequences);
            reordered.remove(executedAlternative);
            reordered.add(0, executedAlternative);
            return reordered;
        }
    }

    @Override
    public Object getRecoveredReferenceValueFor(SequenceElement seqElem) {
        // The reference is broken. We now have to recover the text used to reference the deleted object, so that 
        // the reference can be re-established at a later point in time.
        for (DocumentNode node : textBlock.getSubNodes()) {
            // FIXME: this might fail if we have a multi-value reference and more than two references
            // break at the same time. We don't know which value shall be re-used here
            if (node instanceof LexedToken && seqElem.equals(node.getSequenceElement())) {
                return ((LexedToken) node).getValue();
            }
        }
        return "";
    }

    @Override
    public List<FormatRequest> getOverruledFormattingBetween(List<FormatRequest> pendingFormattingRequest,
            SequenceElement previousSeqElement, SequenceElement followingSeqElement, String followingTokenValue) {
        Integer targetTokenIndex = getTargetToken(followingSeqElement, followingTokenValue);
        
        if (targetTokenIndex == null) {
            return pendingFormattingRequest;
        } else {
            ListIterator<DocumentNode> iter = textBlock.getSubNodes().listIterator(targetTokenIndex);
            return getFormattingRequestsForNextWhiteSpaces(iter);
        }
    }

    private Integer getTargetToken(SequenceElement followingSeqElement, String followingTokenValue) {
        if (followingSeqElement == null) {
            // get the content behind the last sequence element
            return firstPreceedingWhiteSpaceTokenIndexPerSequenceElement.get(followingSeqElement);
        } else if (TcsUtil.isFirstSequenceElement(followingSeqElement) &&
                followingSeqElement.getElementSequence().equals(template.getTemplateSequence())) {
            // get the content before the first sequence element
            return 0;
        } else {
            Integer tokenIndex = firstPreceedingWhiteSpaceTokenIndexPerSequenceElement.get(followingSeqElement);
            if (tokenIndex == null) {
                // token value based fallback. 
                tokenIndex = firstPreceedingWhiteSpaceTokenIndexPerTokenValue.get(followingTokenValue);
            }
            return tokenIndex;
        }
    }

    private  List<FormatRequest> getFormattingRequestsForNextWhiteSpaces(Iterator<DocumentNode> iter) {
        List<FormatRequest> requests = new ArrayList<FormatRequest>();
        
        while (iter.hasNext()) {
            DocumentNode node = iter.next();
            if (isPseudoToken(node)) {
                continue;
            }
            if (isWhiteSpace(node)) {
                requests.add(FormatRequest.createCustom(((AbstractToken) node).getValue()));
            } else {
                break;
            }
        }
        return requests;
    }

}
