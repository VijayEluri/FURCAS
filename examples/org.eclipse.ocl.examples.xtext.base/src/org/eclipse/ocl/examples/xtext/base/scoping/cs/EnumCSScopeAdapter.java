/**
 * <copyright>
 *
 * Copyright (c) 2010,2011 E.D.Willink and others.
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
 * $Id: EnumCSScopeAdapter.java,v 1.2 2011/01/24 21:00:31 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scoping.cs;

import org.eclipse.ocl.examples.pivot.Enumeration;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.baseCST.EnumerationCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;

public class EnumCSScopeAdapter extends BaseCSScopeAdapter<EnumerationCS, Enumeration>
{
	public EnumCSScopeAdapter(TypeManager typeManager, EnumerationCS csElement) {
		super(typeManager, csElement, Enumeration.class);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		Enumeration pivot = getPivot();
		if (pivot != null) {
			environmentView.addNamedElements(pivot.getOwnedLiterals());
			environmentView.addElements(PivotUtil.getTemplateParameters(pivot));
		}
		addLibContents(environmentView, typeManager.getOclAnyType(), scopeView);
		return scopeView.getOuterScope();
	}
}