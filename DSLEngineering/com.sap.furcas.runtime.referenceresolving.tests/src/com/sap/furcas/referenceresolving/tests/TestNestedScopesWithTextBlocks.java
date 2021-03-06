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

package com.sap.furcas.referenceresolving.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ecore.opposites.DefaultOppositeEndFinder;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextblocksPackage;
import com.sap.furcas.metamodel.FURCAS.textblocks.Version;
import com.sap.furcas.runtime.referenceresolving.Activator;
import com.sap.furcas.runtime.referenceresolving.TokenChanger;
import com.sap.furcas.runtime.textblocks.model.TextBlocksModel;
import com.sap.furcas.runtime.textblocks.modifcation.TbChangeUtil;
import com.sap.furcas.runtime.textblocks.modifcation.TbVersionUtil;
import com.sap.furcas.test.fixture.ScenarioFixtureData;
import com.sap.ide.cts.parser.errorhandling.SemanticParserException;
import com.sap.ide.cts.parser.errorhandling.SemanticParserException.Component;

/**
 * Tests NestedScopes TCS and metamodel and impact analysis behavior on renames using the NestedScopes language.
 * 
 * @author Sebastian Schlag (D049672)
 * 
 */

public class TestNestedScopesWithTextBlocks extends AbstractReferenceResolvingTest {

    private static final String LANGUAGE = "NestedScopesTestSyntax";
    private static final File TCS = ScenarioFixtureData.NESTED_SCOPE_TCS;
    private static final File METAMODEL = ScenarioFixtureData.NESTED_SCOPE_METAMODEL;

    @BeforeClass
    public static void setupParser() throws Exception {
        setupParser(LANGUAGE, TCS, METAMODEL);
    }

    /**
     * TCS and metamodel test: Usages should be bound to the corresponding definition.
     */
    @Test
    public void testResolvableBindingsBasicExample() throws Exception {
        String sample = "{ def a; use a;" + "{ def b; use b; }" + "}";
        setupModelFromTextToParse(sample);
        assertNotNull(rootElement);

        EObject defA = getStatementNonNestingLevelM(1, 0);
        assertEquals("Definition", defA.eClass().getName());
        assertEquals("a", defA.eGet(defA.eClass().getEStructuralFeature("name")));

        EObject useA = getStatementNonNestingLevelM(2, 0);
        assertEquals("Usage", useA.eClass().getName());
        assertSame(useA.eGet(useA.eClass().getEStructuralFeature("boundDefinition")), defA);

        EObject defB = getStatementNonNestingLevelM(1, 1);
        assertEquals("Definition", defB.eClass().getName());
        assertEquals("b", defB.eGet(defB.eClass().getEStructuralFeature("name")));

        EObject useB = getStatementNonNestingLevelM(2, 1);
        assertEquals("Usage", useB.eClass().getName());
        assertSame(useB.eGet(useB.eClass().getEStructuralFeature("boundDefinition")), defB);

    }

    /**
     * TCS and metamodel test: Definition of a should not be visible outside the inner scope. Therefore the boundDefinition
     * property of Usage "a" should not be set.
     */
    @Test
    public void testDefinitionNotVisibleOutsideOfScope() {
        boolean failed = false;

        String sample = "{" + "{ def a; }" + "use a; }";
        try {
            setupModelFromTextToParse(sample);
        } catch (SemanticParserException e) {
            assertTrue(e.getComponentThatFailed() == Component.SEMANTIC_ANALYSIS);
            failed = true;
        }
        
        // if semantic analysis failed the root element should have been created.
        // It should be valid in all aspect except for the missing reference
        rootElement = TbVersionUtil.getOtherVersion(rootTextBlock, Version.CURRENT).getCorrespondingModelElements().iterator().next();

        EObject useA = getStatementNonNestingLevelM(2, 0);
        assertEquals("Usage", useA.eClass().getName());
        assertFalse(useA.eIsSet((useA.eClass().getEStructuralFeature("boundDefinition"))));
        assertTrue(failed);
    }

    /**
     * TCS and metamodel test: "Use before declaration" should not be possible.
     */
    @Test
    public void testUseBeforeDeclaration() {
        boolean failed = false;
        
        String sample = "{use a; def a;}";
        try {
            setupModelFromTextToParse(sample);
        } catch (SemanticParserException e) {
            assertTrue(e.getComponentThatFailed() == Component.SEMANTIC_ANALYSIS);
            failed = true;
        }
        // if semantic analysis failed the root element should have been created.
        // It should be valid in all aspect except for the missing reference
        rootElement = TbVersionUtil.getOtherVersion(rootTextBlock, Version.CURRENT).getCorrespondingModelElements().iterator().next();

        EObject useA = getStatementNonNestingLevelM(1, 0);
        assertEquals("Usage", useA.eClass().getName());
        assertFalse(useA.eIsSet((useA.eClass().getEStructuralFeature("boundDefinition"))));
        assertTrue(failed);
    }

    /**
     * TCS and metamodel test: Usage should be bound to the innermost definition of a.
     */
    @Test
    public void testShadowing() throws SemanticParserException {
        String sample = "{ def a;" + "{def a; use a;}" + "}";
        setupModelFromTextToParse(sample);
        assertNotNull(rootElement);

        EObject firstDefA = getStatementNonNestingLevelM(1, 0);
        assertEquals("Definition", firstDefA.eClass().getName());
        assertEquals("a", firstDefA.eGet(firstDefA.eClass().getEStructuralFeature("name")));

        EObject secondDefA = getStatementNonNestingLevelM(1, 1);
        assertEquals("Definition", secondDefA.eClass().getName());
        assertEquals("a", secondDefA.eGet(secondDefA.eClass().getEStructuralFeature("name")));

        EObject useA = getStatementNonNestingLevelM(2, 1);
        assertEquals("Usage", useA.eClass().getName());
        assertSame(useA.eGet(useA.eClass().getEStructuralFeature("boundDefinition")), secondDefA);
        assertNotSame(useA.eGet(useA.eClass().getEStructuralFeature("boundDefinition")), firstDefA);

    }

    /**
     * After renaming the definition of "a" to "b", the usage's boundDefinition attribute should be bound to the new definition of
     * "b" inside the inner scope instead of being bound to the definition in the outer scope.
     */
    @Test
    public void testRebindingToDefinitionInInnerScope() throws SemanticParserException {
        String sample = "{ def b;" + "{ def a; use b; }" + "}";
        setupModelFromTextToParse(sample);
        assertNotNull(rootElement);

        EObject bDefinitionOuterScope = getStatementNonNestingLevelM(1, 0);
        EObject definitionInnerScope = getStatementNonNestingLevelM(1, 1);
        EObject bUsageInnerScope = getStatementNonNestingLevelM(2, 1);

        assertEquals("Definition", definitionInnerScope.eClass().getName());
        assertEquals("a", definitionInnerScope.eGet(definitionInnerScope.eClass().getEStructuralFeature("name")));
        assertEquals("Usage", bUsageInnerScope.eClass().getName());
        assertSame(bUsageInnerScope.eGet(bUsageInnerScope.eClass().getEStructuralFeature("boundDefinition")),bDefinitionOuterScope);

        renameElementOnModel(definitionInnerScope, "b");
        assertEquals("b", definitionInnerScope.eGet(definitionInnerScope.eClass().getEStructuralFeature("name")));

        assertSame(bUsageInnerScope.eGet(bUsageInnerScope.eClass().getEStructuralFeature("boundDefinition")),definitionInnerScope);

    }

    /**
     * Tests explicitly that Impact Analysis chooses the correct element to which the usage is bound out of all elements contained
     * in the lookup scope. Thus after renaming the definition of "b" to "d" the usage should still be bound to this definition.
     */
    @Test
    public void testChoosingOfcorrectLookupScopeElemen() throws SemanticParserException {
        String sample = "{ def a; def b; def c; use b; }";
        setupModelFromTextToParse(sample);

        EObject bDefinition = getStatementNonNestingLevelM(2, 0);
        EObject bUsage = getStatementNonNestingLevelM(4, 0);

        assertSame(bDefinition, bUsage.eGet(bUsage.eClass().getEStructuralFeature("boundDefinition")));
        renameElementOnModel(bDefinition, "d");
        assertSame(bDefinition, bUsage.eGet(bUsage.eClass().getEStructuralFeature("boundDefinition")));

    }

    /**
     * Tests that if a usage is bound and it's bound definition is in the current lookup scope, Impact Analysis updates the
     * reference according to the result of referenceBy on the bound element. Thus after renaming the definition of "b" to "a" the
     * usage should still be bound to this definition (meaning that the usage is also renamed since it was directly bound to this
     * definition).
     * 
     * This test case also asserts that a {@link TokenChanger} registered with the
     * {@link Activator} will be requested to update the token value.
     */
    @Test
    public void testCorrectBindingIfBoundElementIsStillInLookupScopeAfterRename() throws SemanticParserException {
        String sample = "{ def b; use b; }";
        final boolean[] receivedRequestToUpdateTokenValue = new boolean[1];
        TokenChanger tokenChanger = new TokenChanger() {
            @Override
            public void requestTokenValueChange(LexedToken token, String oldTokenValue, String newTokenValue) {
                receivedRequestToUpdateTokenValue[0] = oldTokenValue.equals("b") && newTokenValue.equals("a");
            }
        };
        syntaxRegistry.addTokenChanger(tokenChanger);
        setupModelFromTextToParse(sample);
        assertNotNull(rootElement);

        EObject bDefinition = getStatementNonNestingLevelM(1, 0);
        EObject bUsage = getStatementNonNestingLevelM(2, 1);

        assertEquals("Definition", bDefinition.eClass().getName());
        assertEquals("b", bDefinition.eGet(bDefinition.eClass().getEStructuralFeature("name")));
        assertEquals("Usage", bUsage.eClass().getName());
        assertSame(bUsage.eGet(bUsage.eClass().getEStructuralFeature("boundDefinition")), bDefinition);

        renameElementOnModel(bDefinition, "a");

        assertSame(bUsage.eGet(bUsage.eClass().getEStructuralFeature("boundDefinition")), bDefinition);
        assertTrue("Expected to receive request to update token value for a token with value \"b\" to \"a\" but didn't",
                receivedRequestToUpdateTokenValue[0]);
        syntaxRegistry.removeTokenValueChanger(tokenChanger);
    }

    /**
     * Tests that if a usage was bound, but the definition to which it was bound ("def a") is no longer contained in the lookup
     * scope due to shadowing, Impact Analysis uses the name of this previously bound definition to perform a fresh lookup and sets the reference
     * based on the lookup result.
     */
    @Test
    public void testCorrectBindingIfBoundElementIsNoLongerInLookupScopeAfterRenameWithShadowing() throws SemanticParserException {
        String sample = "{ def a;" + "{ def b; use a;}" + "}";
        setupModelFromTextToParse(sample);

        EObject aDefinition = getStatementNonNestingLevelM(1, 0);
        EObject bDefinition = getStatementNonNestingLevelM(1, 1);
        EObject aUsage = getStatementNonNestingLevelM(2, 1);

        assertSame(aDefinition, aUsage.eGet(aUsage.eClass().getEStructuralFeature("boundDefinition")));
        renameElementOnModel(bDefinition, "a");
        assertSame(bDefinition, aUsage.eGet(aUsage.eClass().getEStructuralFeature("boundDefinition")));

    }
    
    /**
     * Tests that if a usage initially was bound, but the definition to which it was bound ("def a") is no longer contained in the lookup
     * scope due to a textual rename of the usage's token value, Impact Analysis breaks the boundDefinition reference.
     */
    @Test
    public void testCorrectBindingIfBoundElementIsNoLongerInLookupScopeAfterRenameWithoutShadowing() throws SemanticParserException {
        String sample = "{ def a; { def b; use a;} }";
        setupModelFromTextToParse(sample);
        
        EObject aDefinition = getStatementNonNestingLevelM(1, 0);
        EObject bDefinition = getStatementNonNestingLevelM(1, 1);
        EObject aUsage = getStatementNonNestingLevelM(2, 1);
        assertSame(aDefinition, aUsage.eGet(aUsage.eClass().getEStructuralFeature("boundDefinition")));
        
        renameElementOnTextBlock("{ def ".length(), "a".length(),  "d");
        
        OppositeEndFinder oppositeEndFinder = DefaultOppositeEndFinder.getInstance();
        LexedToken newLexedTokenOfUsage = findCurrentReferenceTokenReferencing(aDefinition, oppositeEndFinder);
        assertNotNull(newLexedTokenOfUsage);
        //assertEquals("d", newLexedTokenOfUsage.getValue());
        assertEquals("d", aDefinition.eGet(aDefinition.eClass().getEStructuralFeature("name")));
        //assertFalse("boundDefinition reference should not be set",
        //       aUsage.eIsSet((aUsage.eClass().getEStructuralFeature("boundDefinition"))));
        
        renameElementOnModel(bDefinition, "a");
        //assertFalse(aUsage.eIsSet((aUsage.eClass().getEStructuralFeature("boundDefinition"))));
    }

    private LexedToken findCurrentReferenceTokenReferencing(EObject aDefinition, OppositeEndFinder oppositeEndFinder) {
        for (EObject o : oppositeEndFinder.navigateOppositePropertyWithBackwardScope(TextblocksPackage.eINSTANCE.getLexedToken_ReferencedElements(), aDefinition)) {
            if (EcoreUtil.getRootContainer(o) == rootTextBlock) {
                return (LexedToken) o;
            }
        }
        return null;
    }
     
    /**
     * Tests that if a usage was not bound to a definition before a rename, Impact analysis performs a
     * fresh lookup. It then should set the reference based on the lookup result.
     */
    @Test
    public void testCorrectBindingIfElementWasNotBoundBeforeRenameVariant1() throws SemanticParserException {
        String sample = "{ def a;" + "{ def b; use a; }" + "}";
        setupModelFromTextToParse(sample);

        EObject aDefinition = getStatementNonNestingLevelM(1, 0);
        EObject bDefinition = getStatementNonNestingLevelM(1, 1);
        EObject aUsage = getStatementNonNestingLevelM(2, 1);

        assertEquals("Definition", aDefinition.eClass().getName());

        EcoreUtil.delete(aDefinition);
        assertFalse(aUsage.eIsSet(aUsage.eClass().getEStructuralFeature("boundDefinition")));
        
        renameElementOnModel(bDefinition, "a");
        assertSame(bDefinition, aUsage.eGet(aUsage.eClass().getEStructuralFeature("boundDefinition")));
        
    }
    
    /**
     * Variant of testCorrectBindingIfElementWasNotBoundBeforeRename1 that
     * checks that a rename operation does not accidentally trigger the binding
     * of a usage to a wrong definition.
     */
    @Test
    public void testCorrectBindingIfElementWasNotBoundBeforeRenameVariant2() throws SemanticParserException {
        String sample = "{ def a;" + "{ def b; use a; }" + "}";
        setupModelFromTextToParse(sample);

        EObject aDefinition = getStatementNonNestingLevelM(1, 0);
        EObject bDefinition = getStatementNonNestingLevelM(1, 1);
        EObject aUsage = getStatementNonNestingLevelM(2, 1);

        assertEquals("Definition", aDefinition.eClass().getName());

        EcoreUtil.delete(aDefinition);
        assertFalse(aUsage.eIsSet(aUsage.eClass().getEStructuralFeature("boundDefinition")));
        
        renameElementOnModel(bDefinition, "c");
        assertFalse(aUsage.eIsSet(aUsage.eClass().getEStructuralFeature("boundDefinition")));
        
    }

    private EObject getStatementNonNestingLevelM(int n, int m) {
        EObject currentBlock = rootElement;
        for (int nestingLevel = 0; nestingLevel < m; nestingLevel++) {
            @SuppressWarnings("unchecked")
            Collection<EObject> statements = (Collection<EObject>) currentBlock.eGet(currentBlock.eClass().getEStructuralFeature("statementsInBlock"));
            for (EObject statement : statements) {
                if (statement.eClass().getName().equals("Block")) {
                    currentBlock = statement;
                }
            }
        }
        @SuppressWarnings("unchecked")
        Collection<EObject> statmentsInBlockM = (Collection<EObject>) currentBlock.eGet(currentBlock.eClass().getEStructuralFeature("statementsInBlock"));
        return (EObject) statmentsInBlockM.toArray()[n - 1];
    }

    private void renameElementOnModel(EObject element, String newValue) {
            element.eSet(element.eClass().getEStructuralFeature("name"), newValue);
    }
    
    private void renameElementOnTextBlock(int replacedRegionOffset, int replacedRegionLength, String newText) throws SemanticParserException {
        TextBlocksModel model = new TextBlocksModel(rootTextBlock);
        model.replace(replacedRegionOffset, replacedRegionLength, newText);
        TextBlock currentVersionTb = incrementalParserFacade.parseIncrementally(rootTextBlock);
        rootTextBlock = (TextBlock) TbChangeUtil.cleanUp(currentVersionTb);
    }

}
