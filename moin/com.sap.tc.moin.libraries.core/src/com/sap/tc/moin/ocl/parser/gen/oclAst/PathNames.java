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
 *<li>Rule 5:  sPathName ::= identifier :: sPathName
 *</b>
 */
public class PathNames extends Node implements IsPathName
{
    private Ident _identifier;
    private IsPathName _sPathName;

    public Ident getidentifier() { return _identifier; }
    public IsPathName getsPathName() { return _sPathName; }

    public PathNames(IToken leftIToken, IToken rightIToken,
                     Ident _identifier,
                     IsPathName _sPathName)
    {
        super(leftIToken, rightIToken);

        this._identifier = _identifier;
        this._sPathName = _sPathName;
        initialize();
    }

    public void accept(OclAstVisitor v) { v.visit(this); }
}

