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
 *<li>Rule 4:  sPathName ::= identifier
 *</b>
 */
public class PathNameIdent extends Node implements IsPathName
{
    private Ident _identifier;

    public Ident getidentifier() { return _identifier; }

    public PathNameIdent(IToken leftIToken, IToken rightIToken,
                         Ident _identifier)
    {
        super(leftIToken, rightIToken);

        this._identifier = _identifier;
        initialize();
    }

    public void accept(OclAstVisitor v) { v.visit(this); }
}

