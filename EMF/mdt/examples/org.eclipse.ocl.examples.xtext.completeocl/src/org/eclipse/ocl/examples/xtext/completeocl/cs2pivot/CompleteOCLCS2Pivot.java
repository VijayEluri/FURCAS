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
 * $Id: CompleteOCLCS2Pivot.java,v 1.3 2011/01/30 20:14:26 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.cs2pivot;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.examples.pivot.utilities.TypeManager;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2pivot.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.scope.ScopeCSAdapter;
import org.eclipse.ocl.examples.xtext.base.util.BaseCSVisitor;
import org.eclipse.ocl.examples.xtext.completeocl.completeOCLCST.CompleteOCLCSTPackage;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2pivot.EssentialOCLCS2Pivot;

public class CompleteOCLCS2Pivot extends EssentialOCLCS2Pivot
{	
	private static final class Factory implements CS2Pivot.Factory
	{
		private Factory() {
			EssentialOCLCS2Pivot.FACTORY.getClass();
			CS2Pivot.addFactory(this);
		}

		public CompleteOCLLeft2RightVisitor createLeft2RightVisitor(CS2PivotConversion converter) {
			return new CompleteOCLLeft2RightVisitor(converter);
		}

		public CompleteOCLPostOrderVisitor createPostOrderVisitor(CS2PivotConversion converter) {
			return new CompleteOCLPostOrderVisitor(converter);
		}

		public CompleteOCLPreOrderVisitor createPreOrderVisitor(CS2PivotConversion converter) {
			return new CompleteOCLPreOrderVisitor(converter);
		}

		public BaseCSVisitor<ScopeCSAdapter, TypeManager> createScopeVisitor(TypeManager typeManager) {
			return new CompleteOCLScopeVisitor(typeManager);
		}

		public EPackage getEPackage() {
			return CompleteOCLCSTPackage.eINSTANCE;
		}
	}

	public static CS2Pivot.Factory FACTORY = new Factory();
		
	public CompleteOCLCS2Pivot(Map<? extends Resource, ? extends Resource> cs2pivotResourceMap, TypeManager typeManager) {
		super(cs2pivotResourceMap, typeManager);
	}
}