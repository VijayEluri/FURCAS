package com.sap.mi.textual.test.scenarios;

import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.ide.cts.editor.test.util.ParserGenerationTestHelper;
import com.sap.mi.textual.test.util.EcoreMetaLookUp;
import com.sap.mi.textual.test.util.StubModelAdapter;

/**
 * Simple Test for the custom Expression language
 */
public class LOTOSTest extends ExtendedGeneratedParserBasedTest {


	private static final String DSLSAMPLEDIR = "./scenarioTestSample/";
	private static final String LANGUAGE = "LOTOS";


	@BeforeClass
	public static void setupParser() throws Exception {
		setParserGenerationTestHelper(ParserGenerationTestHelper.getDefault());
		setLookup(new EcoreMetaLookUp("LOTOS.ecore"));
		generateParserForLanguage(LANGUAGE);
	}
	
	
	@Test
	public void testSample1() throws Exception {
		
		StubModelAdapter stubModelHandler = parseFile("LOTOSSample.sam", LANGUAGE, DSLSAMPLEDIR, 0);
		
	}
	
}