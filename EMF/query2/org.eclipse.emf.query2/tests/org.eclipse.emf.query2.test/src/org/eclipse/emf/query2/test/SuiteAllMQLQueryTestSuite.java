/*******************************************************************************
 * Copyright (c) 2006, 2009 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.query2.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { IndexQueryServiceTestCase.class, QuerySpreadingTest.class,
		SuiteSyntheticWithNoSchedulingQueryTest.class, // formatting
		SuiteSyntheticInMemoryForCstTest.class, SuiteSyntheticWithSchedulingQueryTest.class, SuiteCompanyQueryTest.class,
		SuiteNegativeQueryTest.class, SuiteSmokeQueryTest.class, //
		//TestHasCrossPartitionLinks.class,
		QueryRegressionTest.class })
public class SuiteAllMQLQueryTestSuite extends QueryTestCase {

}