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
 * $Id: ScopeCSAdapter.java,v 1.2 2011/01/24 21:00:30 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.base.scope;


public interface ScopeCSAdapter extends ScopeAdapter
{	
	RootCSScopeAdapter getRootScopeAdapter();
	
	boolean isUnresolvable();

	void setUnresolvable();
}