package com.sap.furcas.runtime.referenceresolving;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCLExpression;
import org.eclipse.ocl.ecore.opposites.OppositeEndFinder;

import com.sap.emf.ocl.trigger.ExpressionWithContext;
import com.sap.furcas.metamodel.FURCAS.TCS.ForeachPredicatePropertyInit;
import com.sap.furcas.metamodel.FURCAS.TCS.InjectorActionsBlock;
import com.sap.furcas.metamodel.FURCAS.TCS.PredicateSemantic;
import com.sap.furcas.metamodel.FURCAS.TCS.SequenceElement;
import com.sap.furcas.runtime.common.util.ContextAndForeachHelper;

/**
 * Updates a model element property by evaluating a so-called <code>foreach</code> OCL expression. Based on the evaluation result,
 * a certain number of elements of a certain type is created and assigned to the property. Of which types those elements are and
 * how may there will be created depends on the parameterization of the updater.
 * <p>
 * 
 * If no further specifications are provided, for each evaluation result one element of corresponding type is created using the
 * respective template with empty (default) mode.
 * <p>
 * 
 * A <code>mode</code> argument may be provided, determining the template mode to use when creating elements.
 * <p>
 * 
 * If a sequence of <code>when/as/mode</code> combinations is provided, each element from the evaluation result is used as context
 * to evaluate the <code>when</code> clauses. The <code>as</code>-type of the first one evaluating to <code>true</code> is used as
 * the type of the corresponding element created, using the template with the mode specified. The mode specification is optional.
 * If not provided, the template with the empty (default) mode will be used. Also, the <code>when</code> clause is optional. If
 * not specified, all elements match. This is useful when used as the last rule in a sequence, as a default rule, used if no other
 * <code>when</code> clause matches.
 * <p>
 * 
 * There may be a single <code>as</code> clause defining the type of all elements to be created.
 * 
 * @author Axel Uhl (D043530)
 * 
 */
public class ForeachPropertyInitUpdater extends AbstractFurcasOCLBasedModelUpdater {
    private final Collection<OCLExpression> triggerExpressionsWithoutContext;
    private final ForeachPredicatePropertyInit foreachPredicatePropertyInit;

    protected ForeachPropertyInitUpdater(ForeachPredicatePropertyInit foreachPredicatePropertyInit, EPackage.Registry metamodelPackageRegistry, OppositeEndFinder oppositeEndFinder)
            throws ParserException {
        super(foreachPredicatePropertyInit.getPropertyReference().getStrucfeature(), metamodelPackageRegistry, oppositeEndFinder,
                        new ExpressionWithContext(
                                createOCLHelper(foreachPredicatePropertyInit.getValue(),
                                        ((InjectorActionsBlock) foreachPredicatePropertyInit.eContainer()).getParentTemplate(), oppositeEndFinder)
                                        .createQuery(ContextAndForeachHelper.prepareOclQuery(foreachPredicatePropertyInit.getValue())),
                                (EClass) ContextAndForeachHelper.getParsingContext(foreachPredicatePropertyInit.getValue(),
                                        ((InjectorActionsBlock) foreachPredicatePropertyInit.eContainer()).getParentTemplate())),
                                        /* notifyNewContextElements */ true, getSelfKind(foreachPredicatePropertyInit.getValue()),
                                        ContextAndForeachHelper.getContextTag(foreachPredicatePropertyInit.getValue()));
        triggerExpressionsWithoutContext = new LinkedList<OCLExpression>();
        this.foreachPredicatePropertyInit = foreachPredicatePropertyInit;
        for (PredicateSemantic whenClause : foreachPredicatePropertyInit.getPredicateSemantic()) {
            if (whenClause.getWhen() != null) {
                triggerExpressionsWithoutContext.add(whenClause.getWhen());
            }
        }
    }

    @Override
    public void notify(OCLExpression expression, Collection<EObject> affectedContextObjects, OppositeEndFinder oppositeEndFinder) {
        // TODO Implement ForeachPropertyInitUpdater.notify(...)

    }

    @Override
    public Collection<OCLExpression> getTriggerExpressionsWithoutContext() {
        return triggerExpressionsWithoutContext;
    }

    @Override
    protected SequenceElement getSequenceElement() {
        return foreachPredicatePropertyInit.getInjectorActionsBlock();
    }

}