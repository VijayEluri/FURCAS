/*******************************************************************************
 * Copyright (c) 2006, 2009 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
/**
   * This file is generated for MOIN-MQL with LPG. 
   */

package org.eclipse.emf.query2.internal.moinql.parser.gen.mqlAst;

import lpg.lpgjavaruntime.IToken;



/**
 *<b>
 *<li>Rule 4:  identifierN ::= identifier , identifierN
 *</b>
 */
public class IdentifierN extends Node implements IidentifierN
{
    private Ident _identifier;
    private IidentifierN _identifierN;

    public Ident getidentifier() { return _identifier; }
    public IidentifierN getidentifierN() { return _identifierN; }

    public IdentifierN(IToken leftIToken, IToken rightIToken,
                       Ident _identifier,
                       IidentifierN _identifierN)
    {
        super(leftIToken, rightIToken);

        this._identifier = _identifier;
        this._identifierN = _identifierN;
        initialize();
    }

    public void accept(MqlAstVisitor v) { v.visit(this); }
}

