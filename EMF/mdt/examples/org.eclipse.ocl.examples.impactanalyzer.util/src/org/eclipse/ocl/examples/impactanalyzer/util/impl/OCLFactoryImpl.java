/*******************************************************************************
 * Copyright (c) 2009, 2010 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.ocl.examples.impactanalyzer.util.impl;

import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;
import org.eclipse.ocl.examples.impactanalyzer.util.EcoreEnvironmentFactoryWithScopedExtentMap;
import org.eclipse.ocl.examples.impactanalyzer.util.OCLFactory;



public class OCLFactoryImpl implements OCLFactory {

    public OCL createOCL(EcoreEnvironmentFactory environmentFactory) {
    	if (!(environmentFactory instanceof EcoreEnvironmentFactoryWithScopedExtentMap)) {
    		throw new IllegalArgumentException("Inconsistent environment factory type. "+
    				"Expected EcoreEnvironmentFactoryWithScopedExtentMap but found "+
    				environmentFactory.getClass().getName());
    	}
        return OCL.newInstance((EcoreEnvironmentFactoryWithScopedExtentMap) environmentFactory);
    }

    public OCL createOCL(OppositeEndFinder oppositeEndFinder) {
        return org.eclipse.ocl.examples.impactanalyzer.util.OCL.newInstance(oppositeEndFinder);
    }

}