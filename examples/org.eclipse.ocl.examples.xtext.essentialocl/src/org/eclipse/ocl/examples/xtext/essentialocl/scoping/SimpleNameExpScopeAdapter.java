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
 * $Id: SimpleNameExpScopeAdapter.java,v 1.4 2010/05/16 19:19:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.NamedElementCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeBindingsCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.SimpleNameExpCS;

public class SimpleNameExpScopeAdapter extends EssentialOCLScopeAdapter<SimpleNameExpCS>
{
	public SimpleNameExpScopeAdapter(SimpleNameExpCS csElement) {
		super(csElement);
	}

	@Override
	public ClassifierCS getSynthesizedType(TypeBindingsCS bindings) {
		SimpleNameExpCS target = getTarget();
		NamedElementCS element = target.getElement();
		return getLibraryType(element, bindings);
	}
}