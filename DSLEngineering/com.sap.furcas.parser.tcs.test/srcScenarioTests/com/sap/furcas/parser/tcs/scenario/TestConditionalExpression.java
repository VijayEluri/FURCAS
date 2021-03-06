package com.sap.furcas.parser.tcs.scenario;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.furcas.parsergenerator.TCSSyntaxContainerBean;
import com.sap.furcas.runtime.parser.ParserFacade;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserBasedTest;
import com.sap.furcas.runtime.parser.testbase.GeneratedParserTestConfiguration;
import com.sap.furcas.runtime.parser.testbase.stubs.StubModelAdapter;
import com.sap.furcas.runtime.parser.testbase.stubs.StubModelElement;
import com.sap.furcas.runtime.parser.testbase.stubs.StubParsingHelper;
import com.sap.furcas.test.fixture.ScenarioFixtureData;

/**
 * Simple Test for the custom Expression language that uses lots of conditionals.
 */
public class TestConditionalExpression extends GeneratedParserBasedTest {

    private static final String LANGUAGE = "ExpressionConditional";
    private static final File TCS = ScenarioFixtureData.EXPRESSION_CONDITIONAL_TCS;
    private static final File[] METAMODELS = { ScenarioFixtureData.EXPRESSION_METAMODEL };

    private static StubParsingHelper parsingHelper;

    @BeforeClass
    public static void setupParser() throws Exception {
        GeneratedParserTestConfiguration testConfig = new GeneratedParserTestConfiguration(LANGUAGE, TCS, METAMODELS);
        TCSSyntaxContainerBean syntaxBean = parseSyntax(testConfig);
        ParserFacade facade = generateParserForLanguage(syntaxBean, testConfig, new ClassLookupImpl());
        parsingHelper = new StubParsingHelper(facade);
    }

    @Test
    public void testAcceptSamples() throws Exception {
        // samples don't make much sense unless you understand the templates of the syntax

        parsingHelper.parseString("fourty-two", 0);
        parsingHelper.parseString("noInt", 0);
        parsingHelper.parseString("-twelve", 0);
        parsingHelper.parseString("nothing", 0);
        parsingHelper.parseString("Hello", 0);
        parsingHelper.parseString("trueS", 0);
        parsingHelper.parseString("falseS", 0);
        parsingHelper.parseString("falseS, trueS, Hello, nothing, -twelve, fourty-two", 0);
    }

    @Test
    public void testIntValConditional() throws Exception {

        StubModelAdapter stubModelHandler = parsingHelper.parseString("fourty-two", 0);
        Collection<StubModelElement> values = stubModelHandler.getElementsOfType("expression::ValueExpression");
        assertEquals(1, values.size());
        StubModelElement element = values.iterator().next();
        assertEquals(new Integer(42), element.get("value"));

        // in this case, we should still get a ValueExpression, but with value property not set
        stubModelHandler = parsingHelper.parseString("noInt", 0);
        values = stubModelHandler.getElementsOfType("expression::ValueExpression");
        assertEquals(1, values.size());
        element = values.iterator().next();
        assertEquals(null, element.get("value"));
    }

    @Test
    public void testNegIntValConditional() throws Exception {
        // here, 2 properties should be set in the then case, and one in the else case
        StubModelAdapter stubModelHandler = parsingHelper.parseString("-twelve", 0);
        Collection<StubModelElement> values = stubModelHandler.getElementsOfType("expression::NegativeIntExpression");
        assertEquals(1, values.size());
        StubModelElement element = values.iterator().next();
        assertEquals(new Integer(12), element.get("value"));
        assertEquals(Boolean.TRUE, element.get("isNegative"));

        stubModelHandler = parsingHelper.parseString("nothing", 0);
        values = stubModelHandler.getElementsOfType("expression::NegativeIntExpression");
        assertEquals(1, values.size());
        element = values.iterator().next();
        assertEquals(Boolean.FALSE, element.get("isNegative"));
    }

    @Test
    public void testStringValConditional() throws Exception {

        StubModelAdapter stubModelHandler = parsingHelper.parseString("Hello", 0);
        Collection<StubModelElement> values = stubModelHandler.getElementsOfType("expression::StringExpression");
        assertEquals(1, values.size());
        StubModelElement element = values.iterator().next();
        assertEquals("World", element.get("value"));

        // in this case, we should still get a StringExpression, but with value property not set
        stubModelHandler = parsingHelper.parseString("Bye", 0);
        values = stubModelHandler.getElementsOfType("expression::StringExpression");
        assertEquals(1, values.size());
        element = values.iterator().next();
        assertEquals(null, element.get("value"));
    }

    @Test
    public void testBoolConditional() throws Exception {

        StubModelAdapter stubModelHandler = parsingHelper.parseString("trueS", 0);
        Collection<StubModelElement> values = stubModelHandler.getElementsOfType("expression::BooleanExpression");
        assertEquals(1, values.size());
        StubModelElement element = values.iterator().next();
        assertEquals(Boolean.TRUE, element.get("value"));

        // in this case, we should still get a BooleanExpression, but with value false
        stubModelHandler = parsingHelper.parseString("falseS", 0);
        values = stubModelHandler.getElementsOfType("expression::BooleanExpression");
        assertEquals(1, values.size());
        element = values.iterator().next();
        assertEquals(Boolean.FALSE, element.get("value"));
    }
}