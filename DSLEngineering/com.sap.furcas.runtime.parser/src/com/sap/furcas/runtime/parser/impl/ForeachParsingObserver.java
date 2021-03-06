package com.sap.furcas.runtime.parser.impl;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock;
import com.sap.furcas.runtime.parser.IParsingObserver;

public class ForeachParsingObserver implements IParsingObserver {

    private final TextBlock textBlock;

    public ForeachParsingObserver(TextBlock textBlock) {
        this.textBlock = textBlock;
    }

    @Override
    public void notifyCommitModelElementFailed() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyCommittedModelElementCreation(Object newModelElement) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyDelayedReferenceCreated(DelayedReference ref) {
        ref.setTextBlock(textBlock);
    }

    @Override
    public void notifyElementAddedToContext(Object element) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterInjectorAction() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterOperatorSequence(String operator, int arity,
            boolean isUnaryPostfix) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterOperatoredBrackettedSequence() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterRule(String templateURI) {
        // TODO Auto-generated method stub
    }

    @Override
    public void notifyEnterSeparatorSequence() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterSequenceAlternative(int choice) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterSequenceElement() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyEnterSequenceElement(String sequenceElementURI) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyErrorInRule(RecognitionException re) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitInjectorAction() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitOperatorSequence() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitOperatoredBrackettedSequence() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitRule() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitSeparatorSequence() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitSequenceAlternative() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyExitSequenceElement() {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyModelElementResolvedOutOfContext(Object modelElement,
            Object contextModelElement, Token referenceLocation,
            DelayedReference reference) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyTokenConsume(Token token) {
        // TODO Auto-generated method stub

    }

    @Override
    public void notifyTokenConsumeWithError(Token token) {
        // TODO Auto-generated method stub

    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub

    }

}
