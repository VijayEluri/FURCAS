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
package org.eclipse.ocl.examples.impactanalyzer.benchmark.preparation.tasks;

import java.util.concurrent.ConcurrentLinkedQueue;


public abstract class BenchmarkTaskContainer extends ConcurrentLinkedQueue<BenchmarkTask> {
	private static final long serialVersionUID = 1L;

	public abstract void beforeBenchmark();
	public abstract void afterBenchmark();	
}
