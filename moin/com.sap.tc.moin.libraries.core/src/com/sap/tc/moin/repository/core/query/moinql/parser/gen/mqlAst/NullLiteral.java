/**
   * This file is generated for MOIN-MQL with LPG. 
   */

package com.sap.tc.moin.repository.core.query.moinql.parser.gen.mqlAst;

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
 *<li>Rule 66:  literal ::= null
 *</b>
 */
public class NullLiteral extends NodeToken implements Iliteral
{
    public NullLiteral(IToken token) { super(token); initialize(); }

    public void accept(MqlAstVisitor v) { v.visit(this); }
}

