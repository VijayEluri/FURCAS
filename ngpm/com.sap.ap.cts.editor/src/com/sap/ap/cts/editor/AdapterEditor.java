package com.sap.ap.cts.editor;

import textblocks.TextBlock;

import com.sap.ap.cts.monet.parser.AdapterParserFactory;
import com.sap.ide.cts.editor.AbstractGrammarBasedEditor;
import com.sap.ide.cts.parser.errorhandling.SemanticParserException;
import com.sap.tc.moin.repository.Connection;

public class AdapterEditor extends AbstractGrammarBasedEditor {

	private static final String ADAPTER_LANGUAGE_ID = "Adapter";

	public AdapterEditor() {
		super(new AdapterParserFactory(), new ClassMapper());
	}

	@Override
	public TextBlock parse(TextBlock rootBlock) throws SemanticParserException {
		Connection connection = getWorkingConnection();
		initializeNewParser(connection);
		TextBlock newRoot =  super.parse(rootBlock);
		return newRoot;
	}

	@Override
	public String getLanguageId() {
		return ADAPTER_LANGUAGE_ID;
	}

}