/**
 * <copyright>
 *
 * Copyright (c) 2009,2011 E.D.Willink and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: IterateIteration.java,v 1.3 2011/02/21 08:37:47 ewillink Exp $
 */
package org.eclipse.ocl.examples.library.iterator;

import org.eclipse.ocl.examples.library.AbstractIteration;
import org.eclipse.ocl.examples.library.IterationManager;
import org.eclipse.ocl.examples.pivot.InvalidValueException;
import org.eclipse.ocl.examples.pivot.IterateExp;
import org.eclipse.ocl.examples.pivot.LoopExp;
import org.eclipse.ocl.examples.pivot.Variable;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.examples.pivot.values.CollectionValue;
import org.eclipse.ocl.examples.pivot.values.Value;

/**
 * IsUniqueIteration realizes the Collection::isUnique() library iteration.
 * 
 * @since 3.1
 */
public class IterateIteration extends AbstractIteration<CollectionValue>
{
	public static final IterateIteration INSTANCE = new IterateIteration();

	public Value evaluate(EvaluationVisitor evaluationVisitor, CollectionValue sourceVal, LoopExp iterateExp) throws InvalidValueException {
		Variable accumulator = ((IterateExp)iterateExp).getResult();
		Value initValue = accumulator.getInitExpression().accept(evaluationVisitor);
		if (initValue.isUndefined()) {
			return evaluationVisitor.throwInvalidEvaluation("undefined initializer", null, iterateExp, initValue);
		}
		CollectionValue accumulatorValue = initValue.asCollectionValue();
		return evaluateIteration(new IterationManager<CollectionValue>(evaluationVisitor,
				iterateExp, sourceVal, accumulatorValue));
	}

	@Override
    protected Value updateAccumulator(IterationManager<CollectionValue> iterationManager) {
		Value bodyVal = iterationManager.getBodyValue();		
		iterationManager.replaceAccumulator((CollectionValue) bodyVal);		
		return null;					// carry on
	}
}