package com.sap.furcas.referenceresolving.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ecore.opposites.DefaultOppositeEndFinder;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.metamodel.FURCAS.textblocks.TextBlock;
import com.sap.furcas.metamodel.FURCAS.textblocks.TextblocksPackage;
import com.sap.furcas.test.fixture.ScenarioFixtureData;
import com.sap.ide.cts.parser.errorhandling.SemanticParserException;

/**
 * A test case that use a FURCAS mapping specification (".tcs" file) and based on this produce lexer and
 * parser, then parse a text resource and register all reference resolving callbacks. Then, the test
 * manipulates the model produced by the parser run and observes how OCL-based property assignments get re-assigned.
 * 
 * @author Axel Uhl (D043530)
 * 
 */
public class TestPropertyInitReEvaluationWithTextBlocks extends AbstractReferenceResolvingTest {
    
    private static final String LANGUAGE = "BibtexWithPropertyInits";
    private static final File TCS = new File("fixtures/BibtexWithPropertyInits.tcs");
    private static final File[] METAMODELS = { ScenarioFixtureData.BIBTEXT_METAMODEL, ScenarioFixtureData.BIBTEXT1_METAMODEL };

    private EObject johnDoe;
    private EObject article;
    private EClass authorClass;
    private EClass articleClass;

    @BeforeClass
    public static void setupParser() throws Exception {
        setupParser(LANGUAGE, TCS, METAMODELS);
    }
    
    /**
     * Tests whether an simple addition to a textblock is correctly mapped to an insertion in the model without
     * re-creating the parent element.
     * 
     * @throws Exception
     */
    @Before
    public void setupInitialModel() throws SemanticParserException {
        String textToParse = "article{" + "  Testing, \"John Doe\"," + "  year = \"2002\"" + "}" +
                             "author = \"John Doe\"." + "author = \"Jane Doll\".";
        setupModelFromTextToParse(textToParse);
        johnDoe = null;
        article = null;
        authorClass = null;
        articleClass = null;
        assertNotNull(rootElement);
        EClass bibTexFileClass = rootElement.eClass();
        assertEquals("BibTextFile", bibTexFileClass.getName());
        @SuppressWarnings("unchecked")
        Collection<EObject> entries = (Collection<EObject>) rootElement.eGet(bibTexFileClass
                .getEStructuralFeature("entries"));
        for (EObject entry : entries) {
            if (entry.eClass().getName().equals("Author")) {
                authorClass = entry.eClass();
                if (entry.eGet(authorClass.getEStructuralFeature("name")).equals("John Doe")) {
                    johnDoe = entry;
                }
            } else if (entry.eClass().getName().equals("Article")) {
                articleClass = entry.eClass();
                article = entry;
            }
        }
    }

    @Test
    public void testInitialModel() {
        assertNotNull(rootElement);
        EList<?> entries = (EList<?>) (rootElement).eGet((rootElement).eClass().getEStructuralFeature("entries"));
        assertEquals(3, entries.size());

        assertNotNull(johnDoe);
        // now check the reference was set using the right property name
        // assertNotNull(johnDoe.get("articles")); StubModelHandler not powerful enough
        assertNotNull(article.eGet(articleClass.getEStructuralFeature("author")));
        assertEquals(johnDoe, article.eGet(articleClass.getEStructuralFeature("author")));
        assertEquals("Where John Doe wrote it", article.eGet(articleClass.getEStructuralFeature("location")));
     }

    @Test
    public void testForeachPropertyInitValueInInitialModel() throws Exception {
        @SuppressWarnings("unchecked")
        EList<EObject> revenues = (EList<EObject>) johnDoe.eGet(authorClass.getEStructuralFeature("revenues"));
        @SuppressWarnings("unchecked")
        EList<EObject> johnsArticles = (EList<EObject>) johnDoe.eGet(authorClass.getEStructuralFeature("articles"));
        assertEquals(johnsArticles.size(), revenues.size());
        Iterator<EObject> johnsArticlesIterator = johnsArticles.iterator();
        for (EObject revenue : revenues) {
            EObject theArticle = johnsArticlesIterator.next();
            assertSame(theArticle, revenue.eGet(revenue.eClass().getEStructuralFeature("article")));
            assertEquals(((String) ((EObject) theArticle.eGet(articleClass.getEStructuralFeature("author"))).eGet(
                    authorClass.getEStructuralFeature("name"))).length(), revenue.eGet(
                            revenue.eClass().getEStructuralFeature("revenueInEUR")));
        }
    }
    
    @Test
    public void testChangeOfExpressionValueUsingHashForeach() throws Exception {
        johnDoe.eSet(authorClass.getEStructuralFeature("name"), "The Only John Doe");
        testForeachPropertyInitValueInInitialModel();
    }

    @Test
    public void testChangeAuthorName() {
        johnDoe.eSet(authorClass.getEStructuralFeature("name"), "John Dough");
        assertEquals("Where John Dough wrote it", article.eGet(articleClass.getEStructuralFeature("location")));
    }
    
    /**
     * Tests that updating an author's name does not trigger the property init through the
     * impact analysis in case the author hasn't been created using concrete syntax and
     * therefore no text block exists for the property init's execution.
     */
    @Test
    public void testChangeAuthorNameForAuthorNotCreatedByConcreteSyntax() {
        EObject newAuthor = authorClass.getEPackage().getEFactoryInstance().create(authorClass);
        johnDoe.eResource().getContents().add(newAuthor);
        EObject newAuthorsArticle = articleClass.getEPackage().getEFactoryInstance().create(articleClass);
        @SuppressWarnings("unchecked")
        EList<EObject> articleList = (EList<EObject>) newAuthor.eGet(authorClass.getEStructuralFeature("articles"));
        articleList.add(newAuthorsArticle);
        newAuthor.eSet(authorClass.getEStructuralFeature("name"), "The New Author");
        assertNull(newAuthorsArticle.eGet(articleClass.getEStructuralFeature("location")));
    }
    
    @Test
    public void testAddArticleAndExpectRevenueLedgerCreation() throws Exception {
        EObject newArticle = articleClass.getEPackage().getEFactoryInstance().create(articleClass);
        newArticle.eSet(articleClass.getEStructuralFeature("location"), "Location of the New Article");
        @SuppressWarnings("unchecked")
        EList<EObject> johnsArticles = (EList<EObject>) johnDoe.eGet(authorClass.getEStructuralFeature("articles"));
        johnsArticles.add(newArticle);
        @SuppressWarnings("unchecked")
        EList<EObject> revenues = (EList<EObject>) johnDoe.eGet(authorClass.getEStructuralFeature("revenues"));
        assertEquals(johnsArticles.size(), revenues.size());
        // now ensure that a ForEachContext has been created for the RevenueLedger construction
        OppositeEndFinder oppositeEndFinder = DefaultOppositeEndFinder.getInstance();
        Set<EObject> johnsArticlesAsSet = new HashSet<EObject>(johnsArticles);
        Set<EObject> revenueLedgerArticles = new HashSet<EObject>();
        for (EObject revenueLedger : revenues) {
            revenueLedgerArticles.add((EObject) revenueLedger.eGet(revenueLedger.eClass().getEStructuralFeature("article")));
            assertEquals(
                    ((String) ((EObject) ((EObject) revenueLedger.eGet(revenueLedger.eClass().getEStructuralFeature(
                            "article"))).eGet(articleClass.getEStructuralFeature("author"))).eGet(                    authorClass.getEStructuralFeature("name"))).length(), revenueLedger.eGet(
                            revenueLedger.eClass().getEStructuralFeature("revenueInEUR")));
            assertEquals("Expected to find exactly one ForEachContext for produced RevenueLedger element "+revenueLedger,
                    1, oppositeEndFinder.navigateOppositePropertyWithBackwardScope(
                    TextblocksPackage.eINSTANCE.getForEachExecution_ResultModelElement(), revenueLedger).size());
            EObject author = revenueLedger.eContainer();
            TextBlock authorCreationRecord = (TextBlock) oppositeEndFinder.navigateOppositePropertyWithBackwardScope(
                    TextblocksPackage.eINSTANCE.getTextBlock_CorrespondingModelElements(), author).iterator().next();
            assertEquals("Expected exactly as many ForEachContext records as we have RevenueLedger objects for author "+
                    author, revenues.size(), authorCreationRecord.getForEachExecutions().size());
        }
        assertEquals(johnsArticlesAsSet, revenueLedgerArticles);
    }

}
