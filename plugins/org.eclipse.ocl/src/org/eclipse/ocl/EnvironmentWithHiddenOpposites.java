/*******************************************************************************
 * Copyright (c) 2009, 2010 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.ocl;

import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;


/**
 * Adds methods regarding lookup and navigation of "hidden" opposite properties
 * to {@link Environment} and is implemented by {@link AbstractEnvironment}.
 * 
 * @author Axel Uhl
 * @since 3.1
 */
public interface EnvironmentWithHiddenOpposites<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>
extends Environment<PK, C, O, P, EL, PM, S, COA, SSA, CT, CLS, E>{
	/**
	 * Finds a property defined or inherited by the specified classifier, based
	 * on a hidden opposite's name which is specified in an annotation on the property.
	 * 
	 * @param owner the owner of the "hidden" (non-existing) property that we are looking for, or
	 *     <code>null</code> to find an implicit owner type (in iteration
     *     expressions)
	 * @param name the property name
	 * 
	 * @return the opposite property, or <code>null</code> if it could not be found
	 */ 	
	P lookupOppositeProperty(C owner, String name) throws LookupException;
	
	/**
	 * Determines a property's (hidden) opposite's type, assuming that there is not real opposite
	 * but that the opposite's type implicitly defaults to the property's owning class.
	 */
	C getOppositePropertyType(C owner, P property);
	
	/**
	 * Finds all {@link EReference}s whose {@link ETypedElement#getEType() type}
	 * is <code>classifier</code> or any of <code>classifier</code>'s super
	 * types and that own an {@link EAnnotation annotation} with source
	 * {@link EMOFExtendedMetaData#EMOF_PACKAGE_NS_URI_2_0} containing a detail
	 * entry with key {@link EcoreEnvironment#PROPERTY_OPPOSITE_ROLE_NAME_KEY}.
	 * The value of the annotation detail is entered into the resulting map as a
	 * key, the {@link EReference} on which the annotation was found is entered
	 * into the result map as the corresponding value.
	 * <p>
	 * 
	 * @return a non-<code>null</code> map of all "hidden references" accessible from
	 *         <code>classifier</code> together with their corresponding forward
	 *         references
	 */
	Map<String, P> getHiddenOppositeProperties(C classifier);
	
    interface Lookup<PK, C, O, P> extends Environment.Lookup<PK, C, O, P> {
        /**
         * Finds a hidden opposite property defined or inherited by the specified classifier.
         * Such an opposite is expected to be defined as a comment/annotation on the forward-directed
         * property/reference.
         * 
         * @param owner the owner of the "hidden" property that we are looking for, or
         *     <code>null</code> to find an implicit owner type (in iteration
         *     expressions). Note, that for such hidden properties the property that
         *     may be found is owned by the class at the other end. 
         * @param name the property name
         * 
         * @return the forward property, or <code>null</code> if it could not be found. If a property
         * is found, note that its name is not (at best coincidentally) equal to <code>name</code>.
         * @throws LookupException if lookup fails due to an error such as an ambiguity
         */     
        P tryLookupOppositeProperty(C owner, String name) throws LookupException;
    }
}