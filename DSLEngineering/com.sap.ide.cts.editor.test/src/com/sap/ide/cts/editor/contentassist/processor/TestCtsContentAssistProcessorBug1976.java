package com.sap.ide.cts.editor.contentassist.processor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sap.ide.cts.editor.test.util.StringReplacement;
import com.sap.mi.textual.common.exceptions.GrammarGenerationException;
import com.sap.mi.textual.common.exceptions.ModelAdapterException;
import com.sap.mi.textual.grammar.exceptions.InvalidParserImplementationException;
import com.sap.mi.textual.grammar.exceptions.SyntaxParsingException;
import com.sap.mi.textual.grammar.exceptions.UnknownProductionRuleException;

public class TestCtsContentAssistProcessorBug1976 extends
		CtsContentAssistProcessorTestBase {

	@BeforeClass
	public static void generateParser() throws FileNotFoundException,
			GrammarGenerationException, SyntaxParsingException,
			ModelAdapterException, IOException {
		// use only default metamodel PRIs
		initMetamodelId("");
		generateParserForLanguage("Bug1976");
		generateParserFactoryForLanguage(getLanguage(),
				"com.sap.tc.moin.repository.mmi.model.ModelPackage",
				"com.sap.tc.moin.libraries.api");
	}

	@Before
	public void initProcessor() throws IOException,
			InvalidParserImplementationException,
			UnknownProductionRuleException, InstantiationException,
			IllegalAccessException {
		initProcessorForFixture("Fixture" + "." + getLanguage(),
				new StringReplacement(3, 1, "as"),
				CtsContentAssistProcessorTestBase.class
						.getResourceAsStream("../fixtures/syntax/"
								+ getLanguage() + ".tcs"));
	}

	@Test
	public void afterAs() {
		List<String> expected = new ArrayList<String>();
		expected.add("association");
		expected.add("association name { ; }");

		assertDisplayStrings(expected, 3, 3);
	}
}