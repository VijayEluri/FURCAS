/**
   * This file is generated for MOIN-OCL with LPG. 
   */

package com.sap.tc.moin.ocl.parser.gen.oclAst;

import lpg.lpgjavaruntime.*;


import com.sap.tc.moin.repository.shared.util.parsers.AstException;
import com.sap.tc.moin.repository.shared.util.ProcessErrorImpl;
import com.sap.tc.moin.repository.shared.util.ProcessWarningImpl;
import com.sap.tc.moin.repository.shared.util.ProcessMessages;
import com.sap.tc.moin.repository.ProcessReport;
import com.sap.tc.moin.repository.exception.MoinBaseException;
import com.sap.tc.moin.repository.shared.util.parsers.LPGMessages;
import com.sap.tc.moin.repository.shared.util.LocalizedProcessException;

/**
 *<b>
 *<li>Rule 112:  unaryExpression ::= - unaryExpression
 *</b>
 */
public class MinusUnaryExpression extends Node implements IunaryExpression
{
    private IunaryExpression _unaryExpression;

    public IunaryExpression getunaryExpression() { return _unaryExpression; }

    public MinusUnaryExpression(IToken leftIToken, IToken rightIToken,
                                IunaryExpression _unaryExpression)
    {
        super(leftIToken, rightIToken);

        this._unaryExpression = _unaryExpression;
        initialize();
    }

    public void accept(OclAstVisitor v) { v.visit(this); }
}

