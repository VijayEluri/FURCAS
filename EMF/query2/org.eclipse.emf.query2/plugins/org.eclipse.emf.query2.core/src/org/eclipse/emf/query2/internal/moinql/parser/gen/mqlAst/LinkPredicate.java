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

import org.eclipse.emf.query2.exception.BaseException;
import org.eclipse.emf.query2.internal.moinql.parser.AstException;
import org.eclipse.emf.query2.internal.moinql.parser.LPGMessages;
import org.eclipse.emf.query2.internal.report.ProcessErrorImpl;
import org.eclipse.emf.query2.internal.report.ProcessWarningImpl;
import org.eclipse.emf.query2.report.LocalizedProcessException;
import org.eclipse.emf.query2.report.ProcessMessages;
import org.eclipse.emf.query2.report.ProcessReport;

import lpg.lpgjavaruntime.*;



/**
 *<b>
 *<li>Rule 78:  joinPart ::= notOpt in ( query )
 *</b>
 */
public class LinkPredicate extends Node implements IjoinPart
{
    private Not _notOpt;
    private MqlQuery _query;

    /**
     * The value returned by <b>getnotOpt</b> may be <b>null</b>
     */
    public Not getnotOpt() { return _notOpt; }
    /**
     * The value returned by <b>getquery</b> may be <b>null</b>
     */
    public MqlQuery getquery() { return _query; }

    public LinkPredicate(IToken leftIToken, IToken rightIToken,
                         Not _notOpt,
                         MqlQuery _query)
    {
        super(leftIToken, rightIToken);

        this._notOpt = _notOpt;
        this._query = _query;
        initialize();
    }

    public void accept(MqlAstVisitor v) { v.visit(this); }
}

