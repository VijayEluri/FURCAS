/*******************************************************************************
 * Copyright (c) 2010 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package com.sap.furcas.parser.tcs.stable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.sap.furcas.ide.parserfactory.AbstractParserFactory;
import com.sap.furcas.metamodel.FURCAS.FURCASPackage;
 

public class TCSParserFactory extends AbstractParserFactory<TCSParser, TCSLexer> {

    private static final String LANGUAGE_ID = "TCS";

    @Override
    public Class<TCSLexer> getLexerClass() {
        return TCSLexer.class;
    }

    @Override
    public Class<TCSParser> getParserClass() {
        return TCSParser.class;
    }

    @Override
    public String getLanguageId() {
        return LANGUAGE_ID;
    }

    @Override
    public EPackage getMetamodelPackage(ResourceSet connection) {
        return EPackage.Registry.INSTANCE.getEPackage(FURCASPackage.eNS_URI);
    }

    @Override
    public String[] getHiddenChannelTokenNames() {
        return new String[] { "WS", "NL", "COMMENT" };
    }

    @Override
    public URI getSyntaxUri() {
        String packagePath = TCSParserFactory.class.getPackage().getName().replace(".", "/");
        return URI.createPlatformPluginURI("/com.sap.furcas.parser.tcs/src/" + packagePath + "/TCS.tcs", true);
    }
        
}