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
package de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.debug.extraction;

import java.util.HashSet;
import java.util.Set;

import y.base.Node;

import de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.AbstractNavigationStep;
import de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.NavigationStep;

import de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.debug.GraphContext;

public abstract class AbstractGraphExtractor implements GraphExtractor {
    private NavigationStep navigationStepDelegate;

    public AbstractGraphExtractor(NavigationStep delegate) {
	this.navigationStepDelegate = delegate;
    }

    protected NavigationStep getNavigationStepDelegate() {
	return navigationStepDelegate;
    }

    @Override
    public Node buildGraph(GraphContext graphContext) {
	// Create a new root group node
	return buildGraph(graphContext, graphContext.createRootNode(), null);
    }

    @Override
    public boolean hasBeenNavigated() {
	if (((AbstractNavigationStep) getNavigationStepDelegate()).getNavigateCounter() > 0) {
	    return true;
	} else {
	    return false;
	}
    }
    
    public int getSumOfNavigateCounter(){
	Set<NavigationStep> visited = new HashSet<NavigationStep>();
	return visited.contains(this) ? 0 : getSumOfNavigateCounter(visited);
    }
    
    public int getSumOfNavigateCounter(Set<NavigationStep> visited){
	return ((AbstractNavigationStep)getNavigationStepDelegate()).getNavigateCounter();
    }
}