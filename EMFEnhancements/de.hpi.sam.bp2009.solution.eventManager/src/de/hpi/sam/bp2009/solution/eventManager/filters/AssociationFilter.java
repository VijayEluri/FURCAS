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
package de.hpi.sam.bp2009.solution.eventManager.filters;

import org.eclipse.emf.ecore.EStructuralFeature;

public class AssociationFilter extends StructuralFeatureFilter {
    public AssociationFilter(EStructuralFeature feature) {
        super(feature);
    }

    @Override
    public AssociationFilter clone(){
        return new AssociationFilter(getFeature());

    }

} // AssociationFilterImpl