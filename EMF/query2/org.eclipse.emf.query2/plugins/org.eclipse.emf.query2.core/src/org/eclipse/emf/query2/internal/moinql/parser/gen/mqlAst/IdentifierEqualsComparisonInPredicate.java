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
 *<li>Rule 88:  comparisonPostElementEquals ::= identifier comparisonPostFix
 *</b>
 */
public class IdentifierEqualsComparisonInPredicate extends Node implements IcomparisonPostElementEquals
{
    private Ident _identifier;
    private ComparisonPredicate _comparisonPostFix;

    public Ident getidentifier() { return _identifier; }
    /**
     * The value returned by <b>getcomparisonPostFix</b> may be <b>null</b>
     */
    public ComparisonPredicate getcomparisonPostFix() { return _comparisonPostFix; }

    public IdentifierEqualsComparisonInPredicate(IToken leftIToken, IToken rightIToken,
                                                 Ident _identifier,
                                                 ComparisonPredicate _comparisonPostFix)
    {
        super(leftIToken, rightIToken);

        this._identifier = _identifier;
        this._comparisonPostFix = _comparisonPostFix;
        initialize();
    }

    public void accept(MqlAstVisitor v) { v.visit(this); }
}

