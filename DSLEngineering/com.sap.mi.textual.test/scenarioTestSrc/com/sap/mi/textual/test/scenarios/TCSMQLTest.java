package com.sap.mi.textual.test.scenarios;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sap.ide.cts.editor.test.util.ParserGenerationTestHelper;
import com.sap.mi.textual.common.interfaces.IMetaModelLookup;
import com.sap.mi.textual.grammar.ModelParsingResult;
import com.sap.mi.textual.test.util.EcoreMetaLookUp;
import com.sap.mi.textual.test.util.StubModelAdapter;
import com.sap.mi.textual.test.util.StubModelElement;

/**
 * Tests generation of TCS Parsers using metamodel in MOIN.
 */
@Ignore
public class TCSMQLTest extends ExtendedGeneratedParserBasedTest {

    private static final String DSLSAMPLEDIR = "./scenarioTestResource/";
    
    private static final String LANGUAGE = "TCSMQLTest";
    private static IMetaModelLookup lookup;


    @BeforeClass
	public static void setupParser() throws Exception {
		setParserGenerationTestHelper(ParserGenerationTestHelper.getDefault());
		setLookup(new EcoreMetaLookUp("TCS.ecore"));
		generateParserForLanguage(LANGUAGE);
	}


    @Test
    public void testSample1() throws Exception {
        // using old obsolete TCS syntax
        String sample = "syntax mySyntax {\n" +
        "  primitiveTemplate identifier for String default using NAME:\n" + 
        "        value = \"%token%\";\n" + 	
        "  template ->ExpressionList main operatored (myOperators)\n" + 
        "    : elements{separator=\",\"}\n" + 
        "    ;\n" +
        " operatorTemplate ->BinaryExpression(operators =\r\n" + 
        "            opPlus, source = \'left\', storeRightTo = \'right\');" + 
        "    \n" +
        "operators myOperators{\n" + 
        "        priority 0 {\n" + 
        "            opPlus = \"+\", 2;\n" + 
        "        }\n" + 
        "    }\n" + 
        "}";
        

        // now test the mql query, requires new parsing
        StubModelAdapter stubModelHandler = new StubModelAdapter();
        Object expected = new Object();
        stubModelHandler.queryResult = expected;
        
        ModelParsingResult result = parseString(sample , LANGUAGE, stubModelHandler);
        assertEquals(result.getErrors().toString(), 0, result.getErrors().size());
        
        StubModelElement ct = stubModelHandler.getElementsbyType("TCS::ClassTemplate").iterator().next();
        assertEquals(expected, ct.get("operatorList"));
        
        assertEquals("test 'my' query", stubModelHandler.mqlQuery);
    }
        
}