package com.sap.mi.textual.test.scenarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.ide.cts.editor.test.util.ParserGenerationTestHelper;
import com.sap.mi.textual.test.util.EcoreMetaLookUp;
import com.sap.mi.textual.test.util.StubModelAdapter;

/**
 * Simple Test for the a custom language having a metamodel with several 
 * subpackages and classnames that are not unique (only unique within package)
 */
public class MultiPackageTest extends ExtendedGeneratedParserBasedTest {


	private static final String DSLSAMPLEDIR = "./scenarioTestSample/";
	private static final String LANGUAGE = "MultiPackage";

	
	@BeforeClass
	public static void setupParser() throws Exception {
		setParserGenerationTestHelper(ParserGenerationTestHelper.getDefault());
		setLookup(new EcoreMetaLookUp("MultiPackage.ecore"));
		generateParserForLanguage(LANGUAGE);
	}
	
	
	@Test
	public void testSample1() throws Exception {
		
		StubModelAdapter stubModelHandler = parseFile("ExpressionSample01.sam", LANGUAGE, DSLSAMPLEDIR, 0);
		Set values = stubModelHandler.getElementsbyType("expression::rightPackage::ExpressionList");
		assertNotNull(values);
		assertEquals(1, values.size());
        
		values = stubModelHandler.getElementsbyType("expression::rightPackage::BinaryExpression");
		assertNotNull(values);
        assertEquals(6, values.size());
        
		values = stubModelHandler.getElementsbyType("expression::rightPackage::ValueExpression");
		assertNotNull(values);
		assertEquals(9, values.size());
	}
	
	@Test
    public void testSample2() throws Exception {
        
        parseFile("ExpressionSample02.sam", LANGUAGE, DSLSAMPLEDIR, 1);
        
	}
	
	   @Test
	    public void testSampleDirect() throws Exception {
	        
	        parseString("1+1+2", LANGUAGE,  0);
	        
	        parseString("1+1+", LANGUAGE,  1);
	        parseString("1+1+a", LANGUAGE,  1);
	        parseString("1+1+b, 2+c", LANGUAGE,  2);
	      
	        
	    }
}