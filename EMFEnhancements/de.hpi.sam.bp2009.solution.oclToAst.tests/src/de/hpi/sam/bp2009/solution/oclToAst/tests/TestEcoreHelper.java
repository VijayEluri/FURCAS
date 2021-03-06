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
package de.hpi.sam.bp2009.solution.oclToAst.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.query.index.IndexFactory;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.ecore.OCLExpression;
import org.junit.Test;

import com.sap.ocl.oppositefinder.query2.EcoreHelper;
import com.sap.ocl.oppositefinder.query2.Query2OppositeEndFinder;

import de.hpi.sam.petriNet.PetriNet;
import de.hpi.sam.petriNet.PetriNetFactory;
import de.hpi.sam.petriNet.PetriNetPackage;
import de.hpi.sam.petriNet.Place;
import de.hpi.sam.petriNet.Transition;

public class TestEcoreHelper {
    @Test
    public void testSubclassQuery() {
        EcoreHelper helper = EcoreHelper.getInstance();
        EClass testClass = PetriNetPackage.eINSTANCE.getElement();
        Collection<EClass> subclasses = helper.getAllSubclasses(testClass, IndexFactory.getInstance());
        assertEquals(4, subclasses.size());
        Set<String> foundNames = new HashSet<String>();
        Set<String> expectedNames = new HashSet<String>();
        expectedNames.addAll(Arrays.asList("Node", "Arc", "Transition", "Place"));
        for (EClass subclass : subclasses) {
            foundNames.add(subclass.getName());
        }
        assertEquals(expectedNames, foundNames);
    }

    @Test
    public void testReverseReferenceTraverser() {
        EcoreHelper helper = EcoreHelper.getInstance();
        PetriNet petriNet = PetriNetFactory.eINSTANCE.createPetriNet();
        Place place = PetriNetFactory.eINSTANCE.createPlace();
        petriNet.getElements().add(place);
        ResourceSet rs = new ResourceSetImpl();
        Resource e = rs.createResource(URI.createURI("http://my.own.resource/something"));
        e.getContents().add(petriNet);
        Collection<EObject> result = helper.reverseNavigate(place, (EReference) petriNet.eClass().getEStructuralFeature(
                PetriNetPackage.PETRI_NET__ELEMENTS), helper.getQueryContext(rs, IndexFactory.getInstance()), rs, IndexFactory.getInstance());
        assertEquals(petriNet, result.iterator().next());
    }

    @Test
    public void testHiddenOppositeTraverser() {
        EcoreHelper helper = EcoreHelper.getInstance();
        Transition transition = PetriNetFactory.eINSTANCE.createTransition();
        Place place = PetriNetFactory.eINSTANCE.createPlace();
        place.setHiddenOpposite(transition);
        ResourceSet rs = new ResourceSetImpl();
        Resource e = rs.createResource(URI.createURI("http://my.next.resource/somethingElse"));
        e.getContents().add(place);
        e.getContents().add(transition);
        Collection<EObject> result = helper.reverseNavigate(transition, (EReference) place.eClass().getEStructuralFeature(
                PetriNetPackage.PLACE__HIDDEN_OPPOSITE), helper.getQueryContext(rs, IndexFactory.getInstance()), rs, IndexFactory.getInstance());
        assertEquals(place, result.iterator().next());
    }
    
    @Test
    public void testHiddenOppositeOclTraversal() throws ParserException {
        Transition transition = PetriNetFactory.eINSTANCE.createTransition();
        Place place = PetriNetFactory.eINSTANCE.createPlace();
        place.setHiddenOpposite(transition);
        ResourceSet rs = new ResourceSetImpl();
        Resource e = rs.createResource(URI.createURI("http://my.next.resource/somethingElse"));
        e.getContents().add(place);
        e.getContents().add(transition);
        OCL ocl = org.eclipse.ocl.examples.impactanalyzer.util.OCL.newInstance(Query2OppositeEndFinder.getInstance());
        Helper oclHelper = ocl.createOCLHelper();
        oclHelper.setContext(PetriNetPackage.eINSTANCE.getTransition());
        OCLExpression expr = oclHelper.createQuery("self.transition2Place");
        Object result = ocl.evaluate(transition, expr);
        assertTrue(result instanceof Collection<?>);
        assertEquals(place, ((Collection<?>) result).iterator().next());
    }
}
