package com.sap.runlet.testmetamodel.editor;

import org.antlr.runtime.Lexer;

import runlettest.RunlettestPackage;

import com.sap.ide.cts.moin.parserfactory.AbstractParserFactory;
import com.sap.mi.textual.grammar.impl.ObservableInjectingParser;
import com.sap.tc.moin.repository.Connection;
import com.sap.tc.moin.repository.mmi.reflect.RefPackage;

public abstract class AbstractRunletParserFactory<P extends ObservableInjectingParser, L extends Lexer>
extends AbstractParserFactory<P, L> {

    protected String[] getHiddenChannelTokenNames() {
	return new String[] { "WS", "NL", "COMMENT", "MULTI_LINE_COMMENT" };
    }

    @Override
    public RefPackage getMetamodelPackage(Connection connection) {
        return connection.getPackage(RunlettestPackage.PACKAGE_DESCRIPTOR);
    }

}