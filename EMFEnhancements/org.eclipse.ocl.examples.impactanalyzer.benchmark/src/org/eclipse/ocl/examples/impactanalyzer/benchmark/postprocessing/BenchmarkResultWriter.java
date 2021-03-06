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
package org.eclipse.ocl.examples.impactanalyzer.benchmark.postprocessing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.ocl.examples.impactanalyzer.benchmark.PathOptions;
import org.eclipse.ocl.examples.impactanalyzer.benchmark.execution.measurements.Measurement;


public class BenchmarkResultWriter extends Writer {
	private boolean withHeadline = true;
	private int lineOffset = 1;

	public BenchmarkResultWriter() throws IOException {
		super(PathOptions.getOutputPath(), false);
	}

    public synchronized void writeDataSet(Map<String, String> additionalInformation, ArrayList<Long> executionTimeList,  ArrayList<Long> evaluationTimeList, ArrayList<Map<String, String>> additionalMeasurementInformationList, HashMap<String, ArrayList<Measurement>>microMeasurementList){
   	 try {
   	 final String TAB = "\t";

	if(withHeadline){

			writer.write(" ");

	    for(String label : additionalInformation.keySet()){
		writer.write(TAB + label);
	    }
	    for(String label : additionalMeasurementInformationList.get(0).keySet()){
		writer.write(TAB + label);
	    }


	    writer.write(TAB + "executionIndex" + TAB + "executionTime" + TAB + "evaluationTime" + BREAK);
	    withHeadline = false;
	}

	int executionIndex = 1;
	for(Long executionTime : executionTimeList){

		StringBuffer row = new StringBuffer();
		row.append(lineOffset++);

		for(String information : additionalInformation.values()){
		    row.append(TAB + information);
		}
		for(String information : additionalMeasurementInformationList.get(executionIndex - 1).values()){
		    row.append(TAB + information);
		}

		row.append(TAB + executionIndex);
		row.append(TAB + executionTime);
		row.append(TAB + evaluationTimeList.get(executionIndex - 1));
		row.append(BREAK);
		writer.write(row.toString());

		executionIndex++;
	}
 		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



}
