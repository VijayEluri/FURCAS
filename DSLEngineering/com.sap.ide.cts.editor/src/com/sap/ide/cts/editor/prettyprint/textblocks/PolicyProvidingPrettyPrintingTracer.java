package com.sap.ide.cts.editor.prettyprint.textblocks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tcs.Alternative;
import tcs.SequenceElement;
import tcs.SequenceInAlternative;
import tcs.Template;

import com.sap.ide.cts.editor.prettyprint.imported.PrettyPrintingPolicy;
import com.sap.ide.cts.editor.prettyprint.imported.PrettyPrintingTracer;
import com.sap.tc.moin.repository.mmi.reflect.RefObject;

/**
 * A thin wrapper around the {@link TextBlockPrettyPrintingTraverser},
 * shielding from the backtracking process.
 * 
 * @author Stephan Erb (d049157)
 *
 */
public class PolicyProvidingPrettyPrintingTracer implements PrettyPrintingTracer, PrettyPrintingPolicy {


    private TextBlockPrettyPrintingTraverser currentTraverser;
    private final Map<Integer, TextBlockPrettyPrintingTraverser> backtrackingTraverserBackup = new HashMap<Integer, TextBlockPrettyPrintingTraverser>();
    
    public PolicyProvidingPrettyPrintingTracer(TextBlockPrettyPrintingTraverser traverser) {
	this.currentTraverser = traverser;
    }

    @Override
    public List<SequenceInAlternative> getSequenceElementsOfCurrentAlternativeInPreferredOrder(Alternative alternative) {
	return currentTraverser.getSequenceElementsOfCurrentAlternativeInPreferredOrder(alternative);
    }

    @Override
    public String adaptWhiteSpace(String tcsImpliedWhiteSpace) {
	return currentTraverser.adaptWhiteSpace(tcsImpliedWhiteSpace);
    }

    @Override
    public Boolean desiresAdditionalWhiteSpace() {
	return currentTraverser.desiresAdditionalWhiteSpace();
    }

    @Override
    public void notifyStartedClassTemplateForObject(int handle, RefObject printedModelElement, Template template) {
	currentTraverser.notifyStartedClassTemplateForObject(handle, printedModelElement, template);
    }

    @Override
    public void notifyEndedClassTemplate(int handle) {
	currentTraverser.notifyEndedClassTemplate(handle);
    }

    @Override
    public void notifyEnteredSequenceElement(SequenceElement e) {
	currentTraverser.notifyEnteredSequenceElement(e);	
    }

    @Override
    public void notifyExitedSequenceElement() {
	currentTraverser.notifyExitedSequenceElement();
    }

    @Override
    public void notifyEnteredAlternative(Alternative alt) {
	currentTraverser.notifyEnteredAlternative(alt);
    }

    @Override
    public void notifyBeganAlternativeChoice(int choiceIndexInAlternative) {
	currentTraverser.notifyBeganAlternativeChoice(choiceIndexInAlternative);
    }

    @Override
    public void notifyExitedAlternative() {
	currentTraverser.notifyExitedAlternative();
    }

    @Override
    public void notifyAboutToPrintToken() {
	currentTraverser.notifyAboutToPrintToken();
    }

    @Override
    public void notifyPrintedToken() {
	currentTraverser.notifyPrintedToken();
    }

    @Override
    public void notifyAboutToPrintWhiteSpace() {
	currentTraverser.notifyAboutToPrintWhiteSpace();
    }

    @Override
    public void notifyPrintedWhiteSpace(String ws) {
	currentTraverser.notifyPrintedWhiteSpace(ws);
    }

    @Override
    public void notifySafePointCreated(int handle) {
	backtrackingTraverserBackup.put(handle, currentTraverser.clone());
    }

    @Override
    public void notifyResettedToSafePoint(int handle) {
	currentTraverser = backtrackingTraverserBackup.get(handle);
    }
    
   

}