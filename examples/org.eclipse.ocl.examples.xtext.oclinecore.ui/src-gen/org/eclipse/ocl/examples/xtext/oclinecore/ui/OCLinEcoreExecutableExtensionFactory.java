/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: OCLinEcoreExecutableExtensionFactory.java,v 1.1 2010/04/13 06:41:30 ewillink Exp $
 */
 
package org.eclipse.ocl.examples.xtext.oclinecore.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class OCLinEcoreExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return org.eclipse.ocl.examples.xtext.oclinecore.ui.internal.OCLinEcoreActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return org.eclipse.ocl.examples.xtext.oclinecore.ui.internal.OCLinEcoreActivator.getInstance().getInjector("org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcore");
	}
	
}