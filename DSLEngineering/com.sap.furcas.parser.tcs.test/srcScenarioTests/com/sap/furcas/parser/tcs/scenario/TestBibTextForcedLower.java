package com.sap.furcas.parser.tcs.scenario;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.parsergenerator.TCSSyntaxContainerBean;
import com.sap.furcas.runtime.parser.ParserFacade;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserBasedTest;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserTestConfiguration;
import com.sap.furcas.runtime.parser.testbase.stubs.StubParsingHelper;
import com.sap.furcas.test.fixture.ScenarioFixtureData;

/**
 * Simple Test for the custom BibText language, using the ForcedLower property arg.
 */
public class TestBibTextForcedLower extends GeneratedParserBasedTest {

    private static final String LANGUAGE = "BibtextForcedLower";
    private static final File TCS = ScenarioFixtureData.BIBTEXT_FORCED_LOWER_TCS;
    private static final File[] METAMODELS = { ScenarioFixtureData.BIBTEXT_METAMODEL, ScenarioFixtureData.BIBTEXT1_METAMODEL };

    private static StubParsingHelper parsingHelper;



    @BeforeClass
    public static void setupParser() throws Exception {
        GeneratedParserTestConfiguration testConfig = new GeneratedParserTestConfiguration(LANGUAGE, TCS, METAMODELS);
        TCSSyntaxContainerBean syntaxBean = parseSyntax(testConfig);
        ParserFacade facade = generateParserForLanguage(syntaxBean, testConfig, new ClassLookupImpl());
        parsingHelper = new StubParsingHelper(facade);
    }

    /**
     * Tests references are set, this protects against bugs relating to naming of classes.
     * 
     * @throws Exception
     */
    @Test
    public void testForcedLower() throws Exception {
        // this specific syntax variant requires at least 3 entries in the sample
        String sample = "article{" + "  Testing, \"John Doe\"," + "  year = \"2002\"" + "}" + "author = \"John Doe\".";

        // expect one error
        parsingHelper.parseString(sample, 1);

        sample = "author = \"Jane Doll\"." + "author = \"John Doe\".";

        // expect one error
        parsingHelper.parseString(sample, 1);

        sample = "author = \"John Doe\".";

        // expect one error
        parsingHelper.parseString(sample, 1);

        // expect no errors
        sample = "author = \"John Doe\"." + "author = \"Jane Doll\"." + "author = \"Tom Dooley\".";

        parsingHelper.parseString(sample, 0);

        sample = "article{" + "  Testing, \"John Doe\"," + "  year = \"2002\"" + "}" + "author = \"John Doe\"."
                + "author = \"Jane Doll\".";

        parsingHelper.parseString(sample, 0);

    }

}
