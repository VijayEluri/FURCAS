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
package com.sap.furcas.prettyprinter;

import static com.sap.furcas.prettyprinter.TextBlocksFactory.getLengthOf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sap.furcas.metamodel.FURCAS.TCS.ConcreteSyntax;
import com.sap.furcas.metamodel.FURCAS.textblocks.DocumentNode;
import com.sap.furcas.metamodel.FURCAS.textblocks.OmittedToken;
import com.sap.furcas.prettyprinter.context.PrintContext;

/**
 * The {@link PrettyPrinter} produces formatted text. It has to add spaces between elements for
 * disambiguation purposes (e.g. "1 2" and not "12") and to perform the actual formatting (e.g. linebreaks,
 * indentation and spaces before and after symbols as configured in the {@link ConcreteSyntax}). 
 * 
 * Due to the way a syntax is structured, the correct whitespaces/formatting between text fragments (e.g.
 * 'text before' and 'text after') can only be calculated at the moment when 'text after' shall be printed.
 * 
 * ...text before] [Whitespace/Formatting] [text after...
 *  
 * After printing 'text before', the {@link PrettyPrinter} therefore does not directly create any
 * whitespaces ({@link OmittedToken}s). Instead, it  queues so called {@link FormatRequest}s.
 * The number and kind of these requests depends on the {@link ConcreteSyntax} and the current pretty printing
 * context.
 * 
 * It is then the responsibility of this class to interpret these {@link FormatRequest}s and to translate
 * them into {@link OmittedToken}s. These tokens can then be appended to the print result before 'text after'
 * is printed.    
 *  
 * @author Stephan Erb
 *
 */
public class Formatter {
    
    public enum Type {
        ADD_TAB,
        ADD_NEWLINE,
        ADD_CUSTOM,
        /** Skippable via {@link #SKIP_SPACE} */
        ADD_SPACE,
        /** Skippable via {@link #SKIP_SPACE} or {@link #SKIP_OPTIONAL_SPACE} */
        ADD_OPTIONAL_SPACE,
        /** Unskippable */
        ADD_FORCED_SPACE,
        
        SKIP_SPACE,
        SKIP_OPTIONAL_SPACE
    }
    
    /**
     * @see Formatter
     */
    public static class FormatRequest {
        
        private final Type type;
        private final String payload;
        private final int indentationLevel;
        
        private FormatRequest(Type type, String payload, int indentationLevel) {
            this.type = type;
            this.payload = payload;
            this.indentationLevel = indentationLevel;
        }
        
        public static FormatRequest create(Type type) {
            return new FormatRequest(type, null, 0);
        }
        
        public static FormatRequest createNewline(int indentationLevel) {
            return new FormatRequest(Type.ADD_NEWLINE, null, indentationLevel);
        }
        
        public static FormatRequest createCustom(String payload) {
            return new FormatRequest(Type.ADD_CUSTOM, payload, 0);
        }
    }
    
    // Per default indent with four spaces
    private final static String INDENTATION_PRIMITIVE = " ";
    private final static int INDENTATION_PRIMITIVE_COUNT = 4;
    
    private final TextBlocksFactory factory;

    
    public Formatter(TextBlocksFactory factory) {
        this.factory = factory;
    }
    
    public List<DocumentNode> translateToTokens(List<FormatRequest> formatRequests, PrintContext context) {
        int offset = context.getNextOffset();
        List<DocumentNode> formatting = new ArrayList<DocumentNode>();        
        
        OmittedToken disambiguationToken = null;
        boolean skipSpace = false;
        boolean skipOptionalSpace = false;

        
        for (FormatRequest request : formatRequests) {
            switch (request.type) {
            case ADD_FORCED_SPACE:
                formatting.add(factory.createOmittedToken(" ", offset));
                break;
            case ADD_SPACE:
                if (skipSpace) {
                    continue;
                }
                if (disambiguationToken == null) {
                    disambiguationToken = factory.createOmittedToken(" ", offset);
                }
            case ADD_OPTIONAL_SPACE:
                if (skipOptionalSpace) {
                    continue;
                }
                if (disambiguationToken == null) {
                    disambiguationToken = factory.createOmittedToken(" ", offset);
                }
                continue;
            case ADD_NEWLINE:
                formatting.add(factory.createOmittedToken("\n", offset));
                formatting.addAll(createIndentation(request.indentationLevel,
                        getLengthOf(formatting, context.getNextOffset())));
                break;
            case ADD_TAB:
                formatting.add(factory.createOmittedToken("\t", offset));
                break;
            case ADD_CUSTOM:
                formatting.add(factory.createOmittedToken(request.payload, offset));
                break;
            case SKIP_SPACE:
                skipSpace = true;
                // fall through
            case SKIP_OPTIONAL_SPACE:
                skipOptionalSpace = true;
                disambiguationToken = null;
                continue;
            }
            offset = getLengthOf(formatting, context.getNextOffset());
        }
        if (formatting.isEmpty() && disambiguationToken != null) {
            formatting.add(disambiguationToken);
        }
        return formatting;
    }
    
    private Collection<OmittedToken> createIndentation(int indentationLevel, int offset) {
        List<OmittedToken> indentation = new ArrayList<OmittedToken>(indentationLevel);
        for (int i=0; i < indentationLevel; i++) {
            for (int j=0; j<INDENTATION_PRIMITIVE_COUNT; j++) {
                indentation.add(factory.createOmittedToken(INDENTATION_PRIMITIVE, offset));
                offset++;
            }
        }
        return indentation;
    }

}
