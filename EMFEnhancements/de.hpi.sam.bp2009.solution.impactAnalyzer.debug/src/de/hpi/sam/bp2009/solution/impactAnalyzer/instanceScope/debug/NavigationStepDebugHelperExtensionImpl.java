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
package de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.debug;

import de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.NavigationStep;
import de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.debug.NavigationStepDebugHelperExtension;

public class NavigationStepDebugHelperExtensionImpl implements NavigationStepDebugHelperExtension {

    public NavigationStepDebugHelperExtensionImpl() {

    }

    @Override
    public void printGraph(NavigationStep step, String path) {
	NavigationStepDebugHelperImpl.printGraphFile(step, path);

    }

}