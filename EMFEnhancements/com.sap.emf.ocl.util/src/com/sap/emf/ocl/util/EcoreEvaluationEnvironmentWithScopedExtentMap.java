/*******************************************************************************
 * Copyright (c) 2010 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     SAP AG - initial API and implementation
 ******************************************************************************/
package com.sap.emf.ocl.util;

import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ecore.EcoreEvaluationEnvironment;
import org.eclipse.ocl.ecore.opposites.ExtentMap;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;

public class EcoreEvaluationEnvironmentWithScopedExtentMap extends EcoreEvaluationEnvironment {

    public EcoreEvaluationEnvironmentWithScopedExtentMap(OppositeEndFinder oppositeEndFinder) {
        super(oppositeEndFinder);
    }

    public EcoreEvaluationEnvironmentWithScopedExtentMap(EvaluationEnvironment<EClassifier, EOperation, EStructuralFeature, EClass, EObject> parent) {
        super(parent);
    }

    @Override
    public Map<EClass, Set<EObject>> createExtentMap(Object object) {
        if (object instanceof Notifier) {
            return new ExtentMap((Notifier) object, getOppositeEndFinder());
        } else {
            return super.createExtentMap(object);
        }
    }

}