package com.sap.furcas.prettyprinter.template;

import java.io.File;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.metamodel.FURCAS.TCS.ConcreteSyntax;
import com.sap.furcas.parsergenerator.TCSSyntaxContainerBean;
import com.sap.furcas.prettyprinter.testutils.PrettyPrintAssertionUtil;
import com.sap.furcas.prettyprinter.testutils.PrettyPrintTestHelper;
import com.sap.furcas.runtime.parser.ModelParsingResult;
import com.sap.furcas.runtime.parser.ParserFacade;
import com.sap.furcas.runtime.parser.testbase.EMFParsingHelper;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserBasedTest;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserTestConfiguration;
import com.sap.furcas.test.fixture.ScenarioFixtureData;

/**
 * Simple Test for the custom BibText language
 */
public class TestFunctionTemplate extends GeneratedParserBasedTest {

    private static final String LANGUAGE = "BibtextWithFunction";
    private static final File TCS = ScenarioFixtureData.BIBTEXT_WITH_FUNCTION_TCS;
    private static final File[] METAMODELS = { ScenarioFixtureData.BIBTEXT_METAMODEL, ScenarioFixtureData.BIBTEXT1_METAMODEL };
    private static final String PACKAGE_URI = ScenarioFixtureData.BIBTEXT_PACKAGE_URI;
    private static final String DSLSAMPLEDIR = "./scenarioTestSample/";

    private static EMFParsingHelper parsingHelper;
    private static ConcreteSyntax syntax;
    private static Set<URI> referenceScope;


    @BeforeClass
    public static void setupParser() throws Exception {
        GeneratedParserTestConfiguration testConfig = new GeneratedParserTestConfiguration(LANGUAGE, TCS, METAMODELS);
        TCSSyntaxContainerBean syntaxBean = parseSyntax(testConfig);
        referenceScope = testConfig.getSourceConfiguration().getReferenceScope();
        syntax = syntaxBean.getSyntax();
        ParserFacade facade = generateParserForLanguage(syntaxBean, testConfig, new ClassLookupImpl());
        parsingHelper = new EMFParsingHelper(facade, testConfig, PACKAGE_URI);
    }

    @Test
    public void testParseAndReprint() throws Exception {
        ModelParsingResult result = parsingHelper.parseFile("FunctionTemplateBibTextSample.sam", DSLSAMPLEDIR, /*expected errors*/ 0);
        
        String expected = PrettyPrintTestHelper.readFile(DSLSAMPLEDIR + "FunctionTemplateBibTextSample.sam");
        String printed = PrettyPrintTestHelper.prettyPrintString((EObject) result.getParsedModelElement(), syntax, referenceScope);
        
        PrettyPrintAssertionUtil.assertEqualsIgnoreWhitespaces(expected, printed);
    }
    
}
