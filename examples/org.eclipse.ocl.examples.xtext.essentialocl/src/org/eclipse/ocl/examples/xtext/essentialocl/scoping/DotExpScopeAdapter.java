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
 * $Id: DotExpScopeAdapter.java,v 1.4 2010/05/16 19:19:10 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.essentialocl.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.examples.xtext.base.baseCST.ClassifierCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeBindingCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeBindingsCS;
import org.eclipse.ocl.examples.xtext.base.baseCST.TypeCS;
import org.eclipse.ocl.examples.xtext.base.scope.EnvironmentView;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeAdapter;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeView;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.DotExpCS;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.EssentialOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialOCLCST.ExpCS;
import org.eclipse.ocl.examples.xtext.oclstdlib.oclstdlibCST.LibBoundClassCS;


public class DotExpScopeAdapter extends EssentialOCLScopeAdapter<DotExpCS>
{
	public DotExpScopeAdapter(DotExpCS csElement) {
		super(csElement);
	}

	@Override
	public ScopeView computeLookup(EnvironmentView environmentView, ScopeView scopeView) {
		EStructuralFeature containmentFeature = scopeView.getContainmentFeature();
		if (containmentFeature == EssentialOCLCSTPackage.Literals.DOT_EXP_CS__ARGUMENT) {
			ScopeAdapter sourceScope = getScopeAdapter(getTarget().getSource());
			if (sourceScope != null) {
				TypeBindingsCS bindings = scopeView.getBindings();
				TypeCS type = sourceScope.getSynthesizedType(bindings);
				if (type instanceof LibBoundClassCS) {			// Implicit collect
					// FIXME if conformsTo Collection
					TypeBindingsCS boundBindings = ((LibBoundClassCS)type).getBindings();
					List<TypeBindingCS> bindings2 = boundBindings.getBindings();
					type = bindings2.get(0).getTypeArgument();
				}
				ScopeAdapter typeScope = getScopeAdapter(type);
				if (typeScope != null) {
					typeScope.getInnerScopeView(null, bindings).computeLookupWithParents(environmentView);
				}
			}
		}
		return scopeView.getOuterScope();
	}

	@Override
	public ClassifierCS getSynthesizedType(TypeBindingsCS bindings) {
		ExpCS argument = getTarget().getArgument();
		return getScopeAdapter(argument).getSynthesizedType(bindings);
	}
}