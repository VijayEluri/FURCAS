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
package org.eclipse.ocl.examples.impactanalyzer.editor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.delegate.ValidationBehavior;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;
import org.eclipse.ocl.examples.eventmanager.EventManager;
import org.eclipse.ocl.examples.eventmanager.EventManagerFactory;
import org.eclipse.ocl.examples.impactanalyzer.ImpactAnalyzer;
import org.eclipse.ocl.examples.impactanalyzer.ImpactAnalyzerFactory;
import org.eclipse.ocl.examples.impactanalyzer.OCLFactory;


public class Revalidator {
    private final EventManager eventManager;
    @SuppressWarnings("unused")
    // needed to hold on to event adapters to avoid their being GC'ed
    private final Collection<Adapter> adapters;
    private final OCLFactory oclFactory;
    private final OppositeEndFinder oppositeEndFinder;

    /**
     * @param pkg the metamodel package whose invariants to observe
     * @param oclFactory used to create {@link OCL} instances
     * @param oppositeEndFinder used to instantiate an {@link OCL} object using
     * {@link OCLFactory#createOCL(OppositeEndFinder)}, and used for the {@link ImpactAnalyzer} when
     * retrieving and navigating hidden opposite references as well as for evaluating
     * <code>allInstances()</code> expressions
     */
    public Revalidator(AdapterFactoryEditingDomain editingDomain, EPackage pkg, OCLFactory oclFactory,
            OppositeEndFinder oppositeEndFinder) {
        eventManager = EventManagerFactory.eINSTANCE.createEventManagerFor(editingDomain.getResourceSet());
        this.oclFactory = oclFactory;
        this.oppositeEndFinder = oppositeEndFinder;
        adapters = registerInvariants(pkg);
    }

    private Collection<Adapter> registerInvariants(EPackage pkg) {
        Collection<Adapter> result = new LinkedList<Adapter>();
        for (final EClassifier cls : pkg.getEClassifiers()) {
            EAnnotation ann = cls.getEAnnotation(EcorePackage.eNS_URI);
            if (ann != null) {
                String spaceSeparatedConstraintNames = ann.getDetails().get("constraints");
                if (spaceSeparatedConstraintNames != null) {
                    String[] constraintNames = spaceSeparatedConstraintNames.split(" ");
                    for (final String constraintName : constraintNames) {
                        // TODO this is slightly unclean; what if a non-standard validation domain has been used? But
                        // there is no common base interface above ValidationBehavior that lets us extract the invariant
                        final OCLExpression invariant = ValidationBehavior.INSTANCE.getInvariant(cls, constraintName,
                                oclFactory.createOCL(oppositeEndFinder));
                        final ImpactAnalyzer impactAnalyzer = ImpactAnalyzerFactory.INSTANCE
                                .createImpactAnalyzer(invariant,
                                /* notifyOnNewContextElements */true, oppositeEndFinder, oclFactory);
                        Adapter adapter = new AdapterImpl() {
                            @Override
                            public void notifyChanged(Notification msg) {
                                // revalidate invariant on context objects that impact analysis will produce:
                                Collection<EObject> revalidateOn = impactAnalyzer.getContextObjects(msg);
                                if (revalidateOn != null && !revalidateOn.isEmpty()) {
                                    new RevalidateAction(constraintName, revalidateOn, invariant, oclFactory, oppositeEndFinder)
                                            .run();
                                }
                            }
                        };
                        result.add(adapter);
                        eventManager.subscribe(impactAnalyzer.createFilterForExpression(), adapter);
                    }
                }
            }
        }
        return result;
    }

}