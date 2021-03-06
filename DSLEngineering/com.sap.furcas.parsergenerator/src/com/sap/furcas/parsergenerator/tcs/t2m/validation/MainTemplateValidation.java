/*******************************************************************************
 * Copyright (c) 2008 SAP
 * see https://research.qkal.sap.corp/mediawiki/index.php/CoMONET
 * 
 * Date: $Date: 2008-03-27 17:34:32 +0100 (Do, 27 Mrz 2008) $
 * @version $Revision: 696 $
 * @author: $Author: c5107456 $
 *******************************************************************************/
package com.sap.furcas.parsergenerator.tcs.t2m.validation;

import java.util.Collection;
import java.util.Iterator;

import com.sap.furcas.metamodel.FURCAS.TCS.ClassTemplate;
import com.sap.furcas.metamodel.FURCAS.TCS.ConcreteSyntax;
import com.sap.furcas.metamodel.FURCAS.TCS.Template;
import com.sap.furcas.parsergenerator.tcs.t2m.grammar.SemanticErrorBucket;
import com.sap.furcas.runtime.common.interfaces.IMetaModelLookup;

/**
 * The Class UniquenessValidation.
 */
public class MainTemplateValidation implements ISyntaxValidationRule {

    /* (non-Javadoc)
     * @see com.sap.mi.textual.grammar.impl.tcs.t2m.validation.ISyntaxValidationRule#validate(TCS.ConcreteSyntax)
     */
    @Override
    public void validate(ConcreteSyntax syntax, IMetaModelLookup<?> metaLookup, SemanticErrorBucket errorBucket) {
        Collection<Template> templates = syntax.getTemplates();
        boolean mainfound = false;
        for (Iterator<Template> iterator = templates.iterator(); iterator.hasNext();) {
            Template template = iterator.next();
            if (template instanceof ClassTemplate) {
                ClassTemplate ct = (ClassTemplate) template;
                if (ct.isIsMain()) {
                    if (!mainfound) {
                        mainfound = true;
                    } else {
                        errorBucket.addError("Duplicate definition of main method.", template);
                    }
                }
            }
        }
        if (mainfound == false) {
            errorBucket.addError("No main Classtemplate declared.", syntax);
        }
    }

}
