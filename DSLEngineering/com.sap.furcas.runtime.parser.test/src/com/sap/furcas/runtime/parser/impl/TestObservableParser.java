/**
 * 
 */
package com.sap.furcas.runtime.parser.impl;

import static junit.framework.Assert.assertEquals;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.junit.Test;

import com.sap.furcas.runtime.parser.ANTLR3LocationToken;
import com.sap.furcas.runtime.parser.IParsingObserver;
import com.sap.furcas.runtime.parser.antlr3.ANTLR3LocationTokenImpl;

/**
 * 
 */
public class TestObservableParser {
    
    @Test
    public void testNullObserverNoException() throws Exception {
        TestableObservablePatchedParser parser = new TestableObservablePatchedParser(null, null);
        parser._afterSeqEl();
        parser._beforeSeqEl();
        parser._enterAlt(1);
        parser._exitAlt();
        parser.onEnterTemplateRule(null);
        parser.onErrorInTemplateRule(null);
        parser.onExitTemplateRule();
        parser.onRuleElementCreationCommited(null);
        parser.onRuleElementResolvedOutOfContext(null, null, null, null);
    }

    /**
     * test add and remove functionality of the DelegationParsingObserver helper class
     */
    @Test
    public void testDelegationParsingObserverAddRemove() {
        MockObserver mock = new MockObserver();
        DelegationParsingObserver delegationObserver = new DelegationParsingObserver();

        assertEquals("", mock.result);

        // not yet added mock observer
        delegationObserver.notifyEnterSequenceElement();

        assertEquals("", mock.result);

        delegationObserver.addParsingObserver(mock);

        // should fire
        delegationObserver.notifyEnterSequenceElement();
        assertEquals("3", mock.result);

        delegationObserver.removeParsingObserver(mock);

        // should not fire, result should not change
        delegationObserver.notifyCommittedModelElementCreation(null);
        assertEquals("3", mock.result);
    }

    /**
     * a mere regression test
     * 
     * @throws Exception
     */
    @Test
    public void testObserverOneEvent() throws Exception {
        TestableObservablePatchedParser parser = new TestableObservablePatchedParser(null, null);
        MockObserver mock = new MockObserver();

        // test the (simple) DelegationParsingObserver class also
        DelegationParsingObserver delegationObserver = new DelegationParsingObserver();
        delegationObserver.addParsingObserver(mock);

        parser.setObserver(delegationObserver);

        parser._afterSeqEl();
        assertEquals("7", mock.result);

        parser._beforeSeqEl();
        assertEquals("3", mock.result);

        parser._enterAlt(1);
        assertEquals("21", mock.result);

        parser._enterAlt(0);
        assertEquals("20", mock.result);

        parser._exitAlt();
        assertEquals("6", mock.result);

        parser.onEnterTemplateRule("platform:/plugin/com.example/mapping/TCS.tcs#//@templates.1");
        assertEquals("1platform:/plugin/com.example/mapping/TCS.tcs#//@templates.1", mock.result);

        parser.onErrorInTemplateRule(new RecognitionException());
        assertEquals("4null", mock.result);

        parser.onExitTemplateRule();
        assertEquals("5", mock.result);

        parser.onRuleElementCreationCommited("test");
        assertEquals("8test", mock.result);

        parser.onRuleElementResolvedOutOfContext("test", "1234", new ANTLR3LocationTokenImpl(3, "hello"), null);
        assertEquals("9test1234hello", mock.result);

    }

    /**
     * @return
     */
    private class MockObserver implements IParsingObserver {
        public String result = "";

        @Override
        public void notifyEnterRule(String templateURI) {
            result = 1 + templateURI;
        }

        @Override
        public void notifyEnterSequenceAlternative(int choice) {
            result = 2 + Integer.toString(choice);
        }

        @Override
        public void notifyEnterSequenceElement() {
            result = "3";
        }

        @Override
        public void notifyEnterSequenceElement(String sequenceElementURI) {
            result = "3";
        }

        @Override
        public void notifyErrorInRule(RecognitionException re) {
            result = 4 + re.getMessage();
        }

        @Override
        public void notifyExitRule() {
            result = "5";
        }

        @Override
        public void notifyExitSequenceAlternative() {
            result = "6";
        }

        @Override
        public void notifyExitSequenceElement() {
            result = "7";
        }

        @Override
        public void notifyCommittedModelElementCreation(Object newModelElement) {
            result = 8 + newModelElement.toString();
        }

        @Override
        public void notifyModelElementResolvedOutOfContext(Object modelElement, Object contextModelElement,
                Token referenceLocation, DelayedReference reference) {
            result = 9 + modelElement.toString() + contextModelElement + referenceLocation.getText()
                    + ((reference == null) ? "" : reference);
        }

        @Override
        public void notifyTokenConsume(Token token) {
            result = 10 + token.getText();
        }

        @Override
        public void notifyTokenConsumeWithError(Token token) {
            result = 11 + token.getText();
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyModelElementResolutionFailed()
         */
        @Override
        public void notifyCommitModelElementFailed() {
            result = "12";
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyEnterSeparatorSequence()
         */
        @Override
        public void notifyEnterSeparatorSequence() {
            result = "13";

        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyExitSeparatorSequence()
         */
        @Override
        public void notifyExitSeparatorSequence() {
            result = "14";
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyEnterOperatoredBrackettedSequence()
         */
        @Override
        public void notifyEnterOperatoredBrackettedSequence() {
            result = "15";
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyExitOperatoredBrackettedSequence()
         */
        @Override
        public void notifyExitOperatoredBrackettedSequence() {
            result = "16";
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyEnterOperatorSequence(java.lang.String, int, boolean)
         */
        @Override
        public void notifyEnterOperatorSequence(String operator, int arity, boolean isUnaryPostfix) {
            result = "17";
        }

        /*
         * (non-Javadoc)
         * 
         * @see com.sap.mi.textual.grammar.impl.IParsingObserver#notifyExitOperatorSequence()
         */
        @Override
        public void notifyExitOperatorSequence() {
            result = "18";
        }

        @Override
        public void notifyElementAddedToContext(Object element) {
            result = "19";
        }

        @Override
        public void notifyDelayedReferenceCreated(DelayedReference ref) {
            result = "20";
        }

        @Override
        public void notifyEnterInjectorAction() {
            result = "21";
        }

        @Override
        public void notifyExitInjectorAction() {
            result = "22";
        }

        @Override
        public void reset() {
            result = "23";
        }

    }
    
    /**
     * Delegate to protected / private methods.
     */
    private class TestableObservablePatchedParser extends ObservablePatchedParser {

        @Override
        public void onErrorInTemplateRule(RecognitionException re) {
            super.onErrorInTemplateRule(re);
        }

        public TestableObservablePatchedParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
        }

        @Override
        public void onEnterTemplateRule(String templateURI) {
            super.onEnterTemplateRule(templateURI);
        }
        
        @Override
        public void onRuleElementCreationCommited(Object modelElement) {
            super.onRuleElementCreationCommited(modelElement);
        }

        @Override
        public void onRuleElementResolvedOutOfContext(Object modelElement, Object contextModelElement,
                ANTLR3LocationToken referenceLocation, DelayedReference reference) {
            super.onRuleElementResolvedOutOfContext(modelElement, contextModelElement, referenceLocation, reference);
        }

        @Override
        public void onExitTemplateRule() {
            super.onExitTemplateRule();
        }

        @Override
        public void _beforeSeqEl() {
            super._beforeSeqEl();
        }

        @Override
        public void _afterSeqEl() {
            super._afterSeqEl();
        }

        @Override
        public void _enterAlt(int choice) {
            super._enterAlt(choice);
        }

        @Override
        public void _exitAlt() {
            super._exitAlt();
        }
    }

}
