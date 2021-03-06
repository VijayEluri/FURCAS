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
package org.eclipse.ocl.examples.impactanalyzer.benchmark.execution;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Queue;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ocl.examples.impactanalyzer.benchmark.postprocessing.BenchmarkResultWriter;
import org.eclipse.ocl.examples.impactanalyzer.benchmark.preparation.tasks.BenchmarkTaskContainer;


public class BenchmarkExecutionJob extends Job {

    private final BenchmarkExecutor executor;
    private final BenchmarkResultWriter writer;
    private final Queue<BenchmarkTaskContainer> containerList;

    private final int containerSizeFull;

    public BenchmarkExecutionJob(String name, BenchmarkExecutor executor, Queue<BenchmarkTaskContainer> containerList,
	    BenchmarkResultWriter writer) {
	super(name);

	this.executor = executor;
	this.containerList = containerList;
	this.writer = writer;

	this.containerSizeFull = containerList.size();
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
	int i = 11;
	while (!containerList.isEmpty()) {
	    if (i++ > 10) {
		printProgress(containerSizeFull, containerList.size());

		i = 0;
	    }

	    BenchmarkTaskContainer container = containerList.remove();

	    container.beforeBenchmark();
	    while (!container.isEmpty()) {
		executor.execute(container.remove(), writer);
	    }
	    container.afterBenchmark();
	}

	return Status.OK_STATUS;
    }

    private void printProgress(int fullSize, int currentSize){
	double percent = ((double)currentSize) / ((double)fullSize);
	int progressBarWidth = 60;

	StringBuffer strBuff = new StringBuffer();
	DecimalFormat f = new DecimalFormat("##0.00");

	strBuff.append("\r");
	strBuff.append(f.format(((1.0 - percent) * 100.0)));
	strBuff.append("% ");
	strBuff.append("[");

	int currentState = progressBarWidth - (int)(percent * progressBarWidth);

	for(int i = 0; i < currentState; i++){
	    strBuff.append("=");
	}
	strBuff.append(">");
	for(int i = 0; i < progressBarWidth - currentState; i++){
	    strBuff.append(" ");
	}

	strBuff.append("]");

	strBuff.append("(");
	strBuff.append(currentSize);
	strBuff.append("/");
	strBuff.append(fullSize);
	strBuff.append(")");

        try {
	    System.out.write(strBuff.toString().getBytes());
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
