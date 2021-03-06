/*******************************************************************************
 * Copyright (c) 2008 SAP
 * see https://research.qkal.sap.corp/mediawiki/index.php/CoMONET
 * 
 * Date: $Date: 2009-04-23 14:54:43 +0200 (Do, 23 Apr 2009) $
 * @version $Revision: 6272 $
 * @author: $Author: c5106462 $
 *******************************************************************************/
package com.sap.furcas.parsergenerator.tcs.t2m.grammar.rules;

import com.sap.furcas.parsergenerator.util.VarStringBuffer;


/**
 * defines a simple rule for TCS symbols.
 */
public class SymbolProductionRule extends AbstractAntlr3Rule {


    String rulebody;
    
    private static int fixedLength = COLONSTRING.length() + SEMICOLONSTRING.length();
    
    private final int length;
    
    public SymbolProductionRule(String ruleHead, String rulebody) {
        super(ruleHead);
        this.rulebody = rulebody;
        this.length = fixedLength + ruleHead.length() + rulebody.length() + 2;
    }


    /* (non-Javadoc)
     * @see com.sap.mi.textual.grammar.impl.tcs.t2m.grammar.rules.IAntlr3Rule#addRuleBody(java.lang.StringBuffer)
     */
    @Override
    protected void addRuleBody(VarStringBuffer buf) {
        //escape any ' characters
        String escaped = rulebody.replaceAll("'", "\\\\'");
        buf.append('\'').append(escaped).append('\'');
    }


    /* (non-Javadoc)
     * @see com.sap.mi.textual.grammar.impl.tcs.t2m.grammar.rules.IAntlr3Rule#getLength()
     */
    @Override
    public int getLength() {
        return length;
    }



}
