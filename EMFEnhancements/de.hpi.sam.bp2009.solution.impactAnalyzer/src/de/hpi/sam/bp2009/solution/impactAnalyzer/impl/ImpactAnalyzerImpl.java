package de.hpi.sam.bp2009.solution.impactAnalyzer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ecore.OCLExpression;

import com.sap.emf.ocl.hiddenopposites.DefaultOppositeEndFinder;
import com.sap.emf.ocl.hiddenopposites.OppositeEndFinder;

import de.hpi.sam.bp2009.solution.eventManager.filters.EventFilter;
import de.hpi.sam.bp2009.solution.impactAnalyzer.ImpactAnalyzer;
import de.hpi.sam.bp2009.solution.impactAnalyzer.configuration.ActivationOption;
import de.hpi.sam.bp2009.solution.impactAnalyzer.filterSynthesis.FilterSynthesisImpl;
import de.hpi.sam.bp2009.solution.impactAnalyzer.instanceScope.InstanceScopeAnalysis;

/**
 * Implementation of the {@link ImpactAnalyzer}
 */
public class ImpactAnalyzerImpl implements ImpactAnalyzer {

    private final OCLExpression expression;
    private FilterSynthesisImpl filtersyn;
    private InstanceScopeAnalysis instanceScopeAnalysis;
    private final EClass context;
    private final OppositeEndFinder oppositeEndFinder;
    private final ActivationOption configuration;
    private final boolean notifyOnNewContextElements;

    /**
     * Creates a new impact analyzer for the OCL expression given. For event filter synthesis (see
     * {@link #createFilterForExpression()}) no context type is required. Should {@link #getContextObjects(Notification)}
     * be called later, a context type may be needed. When this constructor is used, it is inferred on demand using the
     * {@link ContextTypeRetriever}, visiting all subexpressions looking for <code>self</code> occurrences and picking their type.
     * <p>
     * 
     * Should you conveniently have the context type available, consider using
     * {@link #ImpactAnalyzerImpl(OCLExpression, EClass, boolean, ActivationOption)} instead.
     * 
     * @param notifyNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     */
    public ImpactAnalyzerImpl(OCLExpression expression, boolean notifyOnNewContextElements, ActivationOption configuration) {
        this(expression, notifyOnNewContextElements, DefaultOppositeEndFinder.getInstance(), configuration);
    }

    public ImpactAnalyzerImpl(OCLExpression expression, EClass context, boolean notifyOnNewContextElements, ActivationOption configuration) {
        this(expression, context, notifyOnNewContextElements, DefaultOppositeEndFinder.getInstance(), configuration);
    }

    /**
     * @param notifyNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     * @param oppositeEndFinder
     *            used during partial navigation and for metamodel queries
     */
    public ImpactAnalyzerImpl(OCLExpression expression, boolean notifyOnNewContextElements, OppositeEndFinder oppositeEndFinder, ActivationOption configuration) {
        this.expression = expression;
        this.context = expression.accept(new ContextTypeRetriever());
        if (this.context == null) {
            throw new IllegalArgumentException("Expression "+expression+" does not contain a \"self\" variable reference. "+
                    "Therefore, its context type cannot be inferred and needs to be provided explicitly. Consider using "+
                    getClass().getName()+"(OCLExpression, EClass, OppositeEndFinder) instead.");
        }
        this.oppositeEndFinder = oppositeEndFinder;
        this.configuration = configuration;
        this.notifyOnNewContextElements = notifyOnNewContextElements;
    }

    /**
     * @param notifyNewContextElements
     *            The analyzer can be parameterized during construction such that it either registers for creation events on the
     *            context type or not. Registering for element creation on the context type is useful for invariants / constraints
     *            because when a new element is created, validating the constraint may be useful. For other use cases, registering
     *            for element creation may not be so useful. For example, when a type inferencer defines its rules using OCL, it
     *            only wants to receive <em>update</em> events after the element has been fully initialized from those OCL
     *            expressions. In those cases, some framework may be responsible for the initial evaluation of those OCL
     *            expressions on new element, and therefore, context element creation events are not of interest.
     * @param oppositeEndFinder
     *            used during partial navigation and for metamodel queries
     */
    public ImpactAnalyzerImpl(OCLExpression expression, EClass context, boolean notifyOnNewContextElements, OppositeEndFinder oppositeEndFinder, ActivationOption configuration) {
        this.expression = expression;
        this.context = context;
        EClass inferredContext = expression.accept(new ContextTypeRetriever());
        if (inferredContext != null && inferredContext != context) {
            throw new IllegalArgumentException("Redundant, incorrect context type specification. Expression has "+inferredContext+
                    " as context type, but explicitly-provided context type was "+context);
        }
        this.oppositeEndFinder = oppositeEndFinder;
        this.configuration = configuration;
        this.notifyOnNewContextElements = notifyOnNewContextElements;
    }

    public EventFilter createFilterForExpression() {
        filtersyn = new FilterSynthesisImpl(expression, notifyOnNewContextElements);
        return filtersyn.getSynthesisedFilter();
    }

    public Collection<EObject> getContextObjects(Notification event) {
        if (instanceScopeAnalysis == null) {
            if (filtersyn == null) {
                createFilterForExpression();
            }
            instanceScopeAnalysis = new InstanceScopeAnalysis(expression, context, filtersyn, oppositeEndFinder, configuration);
        }
        return instanceScopeAnalysis.getContextObjects(event);
    }

    protected OCLExpression getExpression() {
        return expression;
    }

} // ImpactAnalyzerImpl