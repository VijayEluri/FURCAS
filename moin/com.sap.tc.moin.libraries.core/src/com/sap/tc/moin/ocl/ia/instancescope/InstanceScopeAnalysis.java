package com.sap.tc.moin.ocl.ia.instancescope;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.omg.ocl.expressions.AssociationEndCallExp;
import org.omg.ocl.expressions.AttributeCallExp;
import org.omg.ocl.expressions.BooleanLiteralExp;
import org.omg.ocl.expressions.IntegerLiteralExp;
import org.omg.ocl.expressions.ModelPropertyCallExp;
import org.omg.ocl.expressions.OclExpression;
import org.omg.ocl.expressions.OperationCallExp;
import org.omg.ocl.expressions.PrimitiveLiteralExp;
import org.omg.ocl.expressions.PropertyCallExp;
import org.omg.ocl.expressions.RealLiteralExp;
import org.omg.ocl.expressions.StringLiteralExp;
import org.omg.ocl.expressions.__impl.AssociationEndCallExpInternal;
import org.omg.ocl.expressions.__impl.AttributeCallExpInternal;
import org.omg.ocl.expressions.__impl.ModelPropertyCallExpInternal;
import org.omg.ocl.expressions.__impl.OclExpressionInternal;
import org.omg.ocl.expressions.__impl.OperationCallExpInternal;
import org.omg.ocl.expressions.__impl.PrimitiveLiteralExpInternal;

import com.sap.tc.moin.ocl.evaluator.stdlib.impl.OclTypeImpl;
import com.sap.tc.moin.ocl.ia.ClassScopeAnalyzer;
import com.sap.tc.moin.ocl.ia.relevance.NavigationPath;
import com.sap.tc.moin.ocl.utils.OclConstants;
import com.sap.tc.moin.repository.Connection;
import com.sap.tc.moin.repository.MRI;
import com.sap.tc.moin.repository.core.ConnectionWrapper;
import com.sap.tc.moin.repository.core.CoreConnection;
import com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl;
import com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl;
import com.sap.tc.moin.repository.core.links.JmiListImpl;
import com.sap.tc.moin.repository.events.type.AttributeValueChangeEvent;
import com.sap.tc.moin.repository.events.type.ChangeEvent;
import com.sap.tc.moin.repository.events.type.ElementLifeCycleEvent;
import com.sap.tc.moin.repository.events.type.LinkChangeEvent;
import com.sap.tc.moin.repository.events.type.ModelChangeEvent;
import com.sap.tc.moin.repository.mmi.model.AssociationEnd;
import com.sap.tc.moin.repository.mmi.model.Classifier;
import com.sap.tc.moin.repository.mmi.model.MofClass;
import com.sap.tc.moin.repository.mmi.model.Operation;
import com.sap.tc.moin.repository.mmi.model.PrimitiveType;
import com.sap.tc.moin.repository.mmi.model.__impl.AssociationWrapper;
import com.sap.tc.moin.repository.mmi.model.__impl.ClassifierInternal;
import com.sap.tc.moin.repository.mmi.model.__impl.MofClassImpl;
import com.sap.tc.moin.repository.mmi.model.__impl.OperationImpl;
import com.sap.tc.moin.repository.mmi.reflect.RefObject;
import com.sap.tc.moin.repository.shared.util.Tuple.Pair;
import com.sap.tc.moin.repository.spi.core.SpiJmiHelper;
import com.sap.tc.moin.repository.spi.core.Wrapper;

/**
 * Supports a lookup from a source model element of either an attribute value change event or a link add/remove event
 * together with an {@link OclExpression} to a set of context objects for which the expression may return a value
 * different from the one it returned before the change event occurred. An instance of this class manages the analysis
 * for all expression occuring within one root OCL expression, including the expressions reachable in operation body
 * expressions where the operation may be called directly of indirectly by the root expression.
 * 
 * @author Axel Uhl D043530
 * 
 */
public class InstanceScopeAnalysis {
    private final Logger logger = Logger.getLogger(InstanceScopeAnalysis.class.getName());
    private final AssociationEndAndAttributeCallFinder associationEndAndAttributeCallFinder;
    private final Map<OclExpression, NavigationStep> expressionToStep;
    private final PathCache pathCache;
    private final ClassScopeAnalyzer classScopeAnalyzer;

    /**
     * @param expression
     * 		  the OCL expression for which to perform instance scope impact analysis
     * @param conn
     *            the connection used to walk the expression tree
     * @param pathCache
     *            caches {@link NavigationPath} traceback navigations to the possible contexts for a given expression
     *            that can be invoked for model elements; using this cache avoids redundant path calculations for common
     *            subexpressions, such as operation bodies called by several expressions.
     * @param classScopeAnalyzer
     *            makes available the operation call relations reachable from the root expression that was analyzed by
     *            the class scope analyzer.
     */
    public InstanceScopeAnalysis(OclExpression expression, CoreConnection conn, PathCache pathCache, ClassScopeAnalyzer classScopeAnalyzer) {
	associationEndAndAttributeCallFinder = new AssociationEndAndAttributeCallFinder(conn);
	expressionToStep = new HashMap<OclExpression, NavigationStep>();
	this.pathCache = pathCache;
	this.classScopeAnalyzer = classScopeAnalyzer;
	associationEndAndAttributeCallFinder.walk((OclExpressionInternal) expression);
    }
    
    /**
     * Looks up <tt>exp</tt> in {@link #expressionToStep}. If not found, the respective {@link Tracer} is created and
     * used to compute and then cache the required {@link NavigationStep}.
     * 
     * @param context
     *            the overall context for the entire expression of which <tt>exp</tt> is a subexpression; this context
     *            type defines the type for <tt>self</tt> if used outside of operation bodies.
     */
    private NavigationStep getNavigationStepsToSelfForExpression(CoreConnection conn, OclExpression exp,
	    MofClass context) {
	NavigationStep result = expressionToStep.get(exp);
	if (result == null) {
	    result = getTracer(conn, exp).traceback(context, pathCache, classScopeAnalyzer);
	    expressionToStep.put(exp, result);
	}
	return result;
    }
    
    public Set<MRI> getAffectedElements(MofClass context, Collection<? extends ChangeEvent> changeEvents) {
	return getAffectedElements((MofClassImpl) ((RefObjectWrapperImpl<?>) context).unwrap(),
		changeEvents);
    }

    public Set<MRI> getAffectedElements(MofClassImpl context, Collection<? extends ChangeEvent> changeEvents) {
	Map<Pair<NavigationStep, RefObjectImpl>, Set<RefObjectImpl>> cache = new HashMap<Pair<NavigationStep, RefObjectImpl>, Set<RefObjectImpl>>();
	Set<MRI> result = new HashSet<MRI>();
	for (ChangeEvent ce : changeEvents) {
	    if (ce instanceof ModelChangeEvent) {
		result.addAll(getAffectedElements(context, (ModelChangeEvent) ce, cache));
	    }
	}
	return result;
    }

    /**
     * Tells the context model elements on which <tt>expression</tt> may now return a result different from
     * before the <tt>changeEvent</tt> occurred.
     */
    public Set<MRI> getAffectedElements(MofClassImpl context, ModelChangeEvent changeEvent,
	    Map<Pair<NavigationStep, RefObjectImpl>, Set<RefObjectImpl>> cache) {
	if (changeEvent instanceof ElementLifeCycleEvent) {
	    // create and delete of elements only affects the allInstances expressions;
	    // for those, however, no "self" context can easily be determined and therefore
	    // the expression may change value on all possible context instances:
	    RefObject metaObject = ((ElementLifeCycleEvent) changeEvent).getMetaObject(changeEvent.getEventTriggerConnection());
	    // If package extents are created (RefPackage), those may also trigger ElementLifeCycleEvents.
	    // However, their meta object would not be a Classifier but rather a package. Filter this case:
	    if (metaObject instanceof Classifier && expressionContainsAllInstancesCallForType((ClassifierInternal) ((Wrapper<?>) metaObject).unwrap())) {
		return getAllPossibleContextInstancesMris(((ConnectionWrapper) changeEvent.getEventTriggerConnection())
			.unwrap(), context);
	    } else {
		return Collections.emptySet();
	    }
	} else {
	    Set<MRI> result = new LinkedHashSet<MRI>();
	    for (ModelPropertyCallExp attributeOrAssociationEndCall : getAttributeOrAssociationEndCalls(changeEvent)) {
		RefObjectImpl sourceElement = getSourceElement(changeEvent,
			(ModelPropertyCallExpInternal) attributeOrAssociationEndCall);
		if (sourceElement != null) {
		    // the source element may have been deleted already by subsequent events; at this point,
		    // this makes it impossible to trace the change event back to a context; all we have is
		    // the LRI of a no longer existing model element...
		    for (RefObjectImpl roi : self(attributeOrAssociationEndCall, sourceElement, context,
			    ((ConnectionWrapper) changeEvent.getEventTriggerConnection()).unwrap(), cache)) {
			result.add(roi.get___Mri());
		    }
		}
	    }
	    return result;
	}
    }

    /**
     * Checks if all {@link ModelChangeEvent}s contained in <tt>events</tt> are attribute changes and the expressions
     * affected by the change event are all attribute call expressions for an attribute of primitive type that is used
     * in a direct comparison with a constant literal. If this is the case, compares the old and new value with the
     * literal's value, considering the comparison operator. If no change occurs in comparison result for any of the
     * events, <tt>true</tt> is returned because then the expression value didn't change based on the change event. If
     * any of the events is an event of different type or the attribute is not of primitive type or its value is not
     * compared to a constant, <tt>false</tt> is returned.
     * <p>
     * 
     * Note that further performance improvements are conceivable but not yet implemented. For example, the attribute
     * call expression may be used in a <tt>let</tt>-expression and then the variable may be compared to a primitive
     * literal.
     * 
     * @param replacementFor__TEMP__
     *            as a special case, expressions can contain the special string literal "__TEMP__" (see
     *            GlobalDelayedReferenceResolver.TEMPORARY_QUERY_PARAM_REPLACEMENT). Those will be replaced by the value
     *            of a lexical token. This value can be passed here so that the comparison does not happen with the
     *            special "__TEMP__" constant but with the parameter value instead in case the comparison argument is a
     *            string literal with value "__TEMP__".
     */
    public boolean isUnaffectedDueToPrimitiveAttributeValueComparisonWithLiteralOnly(List<ChangeEvent> events,
	    String replacementFor__TEMP__) {
	for (ChangeEvent ce : events) {
	    if (ce instanceof ModelChangeEvent) {
		ModelChangeEvent changeEvent = (ModelChangeEvent) ce;
		Set<? extends ModelPropertyCallExp> calls = getAttributeOrAssociationEndCalls(changeEvent);
		if (calls.size() == 0) {
		    return false; // probably an allInstances-triggered element creation/deletion event
		}
		for (ModelPropertyCallExp attributeOrAssociationEndCall : calls) {
		    if (changeEvent instanceof AttributeValueChangeEvent) {
			AttributeValueChangeEvent avce = (AttributeValueChangeEvent) changeEvent;
			if (attributeOrAssociationEndCall instanceof AttributeCallExp) {
			    AttributeCallExpInternal ace = (AttributeCallExpInternal) attributeOrAssociationEndCall;
			    CoreConnection conn = ((ConnectionWrapper) changeEvent.getEventTriggerConnection()).unwrap();
			    if (ace.getType(conn) instanceof PrimitiveType) {
				if (ace.getReferredAttribute(conn).get___Mri().equals(avce.getAffectedMetaObjectMri())) {
				    OclExpressionInternal otherArgument = null;
				    OperationCallExpInternal op;
				    boolean attributeIsParameter = false;
				    op = (OperationCallExpInternal) ace.getParentOperation(conn); // argument of a comparison operation?
				    if (op != null && isComparisonOperation(op, conn)) {
					otherArgument = (OclExpressionInternal) op.getSource(conn);
					attributeIsParameter = true;
				    } else {
					PropertyCallExp propertyCallExp = ace.getAppliedProperty(conn); // source of a comparison operation?
					if (propertyCallExp != null
						&& propertyCallExp instanceof OperationCallExp
						&& isComparisonOperation(((OperationCallExpInternal) propertyCallExp),
							conn)) {
					    op = ((OperationCallExpInternal) propertyCallExp);
					    otherArgument = (OclExpressionInternal) ((JmiListImpl<?>) op
						    .getArguments(conn)).iterator(conn).next();
					    attributeIsParameter = false;
					}
				    }
				    if (otherArgument != null && otherArgument instanceof PrimitiveLiteralExp) {
					if (doesComparisonResultChange(
						avce, (PrimitiveLiteralExpInternal) otherArgument,
						replacementFor__TEMP__, op.getReferredOperation(conn).getName(), attributeIsParameter)) {
					    return false;
					}
				    } else {
					// attribute not used in comparison operation; we assume a change
					return false;
				    }
				}
			    }
			} else {
			    // not an attribute call expression; strange, but then we don't know anything
			    return false;
			}
		    } else {
			// not an attribute change event; consider changed
			return false;
		    }
		}
	    }
	}
	return true;
    }

    @SuppressWarnings("unchecked") // due to Comparable<Object> casts
    private boolean doesComparisonResultChange(AttributeValueChangeEvent avce, PrimitiveLiteralExpInternal otherArgument,
	    String replacementFor__TEMP__, String operationName, boolean attributeIsParameter) {
	Object value;
	// As a change event should only have occurred if something actually changed, if one of old and new
	// value is null, this always represents a change because when compared to either the null literal
	// or a constant, this would change, perhaps from/to an OclInvalid value:
	boolean result = avce.getOldValue() == null || avce.getNewValue() == null;
	if (!result) {
	    if (otherArgument instanceof StringLiteralExp) {
		value = ((StringLiteralExp) otherArgument).getStringSymbol();
		if (value.equals("__TEMP__")) {
		    value = replacementFor__TEMP__;
		}
	    } else if (otherArgument instanceof BooleanLiteralExp) {
		value = ((BooleanLiteralExp) otherArgument).isBooleanSymbol();
	    } else if (otherArgument instanceof IntegerLiteralExp) {
		value = ((IntegerLiteralExp) otherArgument).getIntegerSymbol();
	    } else if (otherArgument instanceof RealLiteralExp) {
		value = ((RealLiteralExp) otherArgument).getRealSymbol();
	    } else {
		throw new RuntimeException("Internal error. Unknown OCL primitive literal expression " + otherArgument);
	    }
	    int oldComparison = (attributeIsParameter ? ((Comparable<Object>) value).compareTo(avce.getOldValue())
		    : ((Comparable<Object>) avce.getOldValue()).compareTo(value));
	    int newComparison = (attributeIsParameter ? ((Comparable<Object>) value).compareTo(avce.getNewValue())
		    : ((Comparable<Object>) avce.getNewValue()).compareTo(value));
	    if (operationName.equals(OclConstants.OP_EQSTDLIB)) {
		result = (oldComparison == 0) != (newComparison == 0);
	    } else if (operationName.equals(OclConstants.OP_NOTEQSTDLIB)) {
		result = (oldComparison != 0) != (newComparison != 0);
	    } else if (operationName.equals(OclConstants.OP_LTSTDLIB)) {
		result = oldComparison < 0 != newComparison < 0;
	    } else if (operationName.equals(OclConstants.OP_LTEQSTDLIB)) {
		result = oldComparison <= 0 != newComparison <= 0;
	    } else if (operationName.equals(OclConstants.OP_GTSTDLIB)) {
		result = oldComparison > 0 != newComparison > 0;
	    } else if (operationName.equals(OclConstants.OP_GTEQSTDLIB)) {
		result = oldComparison >= 0 != newComparison >= 0;
	    } else {
		logger.info("operator " + operationName
			+ " not supported in impact analysis performance improvement; assuming a change");
		result = true;
	    }
	}
	return result;
    }

    private static final Set<String> comparisonOpNames = new HashSet<String>(Arrays.asList(
	    new String[] { OclConstants.OP_EQSTDLIB, OclConstants.OP_LTSTDLIB, OclConstants.OP_LTEQSTDLIB,
		    OclConstants.OP_GTSTDLIB, OclConstants.OP_GTEQSTDLIB, OclConstants.OP_NOTEQSTDLIB }));
    private boolean isComparisonOperation(OperationCallExpInternal op, CoreConnection conn) {
	return comparisonOpNames.contains(op.getReferredOperation(conn).getName());
    }

    private boolean expressionContainsAllInstancesCallForType(ClassifierInternal classifier) {
	return !associationEndAndAttributeCallFinder.getAllInstancesCallsFor(classifier).isEmpty();
    }

    protected static Set<MRI> getAllPossibleContextInstancesMris(CoreConnection conn, MofClass context) {
	return OclTypeImpl.getAllInstancesMris(conn, context.getQualifiedName());
    }

    protected static Set<RefObjectImpl> getAllPossibleContextInstances(CoreConnection conn, MofClass context) {
	return OclTypeImpl.getAllInstances(conn, context.getQualifiedName());
    }

    /**
     * For attribute call expressions or association end call expressions determines for which context elements used for
     * the global <tt>self</tt> (not to confuse with the <tt>self</tt> value that applies for an operation body and
     * which is set to the value of the source expression on which the operation is invoked) the property call's
     * {@link ModelPropertyCallExp#getSource() source expression} may evaluate to <tt>sourceElement</tt>. This is a
     * conservative estimate which means that for some elements of the result set, when used as element for the global
     * <tt>self</tt> variable, the source expression may not necessarily evaluate to <tt>sourceElement</tt>. However,
     * there are no other {@link RefObject} elements that are not part of the result and for which the source expression
     * evaluates to <tt>sourceElement</tt>. This means, all contexts for which the source expression evaluates to
     * <tt>sourceElement</tt> are guaranteed to be found.
     * @param cache TODO
     */
    private Set<RefObjectImpl> self(ModelPropertyCallExp attributeOrAssociationEndCall, RefObjectImpl sourceElement,
	    MofClass context, CoreConnection connection, Map<Pair<NavigationStep, RefObjectImpl>, Set<RefObjectImpl>> cache) {
	NavigationStep step = getNavigationStepsToSelfForExpression(connection, attributeOrAssociationEndCall
		.getSource(), context);
	Set<RefObjectImpl> sourceElementAsSet = Collections.singleton(sourceElement);
	Set<RefObjectImpl> result = step.navigate(connection, sourceElementAsSet, cache);
	return result;
    }
    
    /**
     * Factory method that creatss an instance of some {@link Tracer}-implementing class specific to the
     * type of the OCL <tt>expression</tt>.
     */
    protected static Tracer getTracer(CoreConnection conn, OclExpression expression) {
	try {
	    Class<?> tracerClass = InstanceScopeAnalysis.class.getClassLoader().loadClass(
		    InstanceScopeAnalysis.class.getPackage().getName() + "." +
		    ((MofClass) expression.refMetaObject()).getName() + "Tracer");
	    return (Tracer) tracerClass.getConstructor(CoreConnection.class,
		    expression.getClass()).newInstance(conn, expression);
	} catch (Exception e) {
	    throw new RuntimeException("Internal error; probably the Tracer implementation class for OCL expression type "+
		    expression.getClass().getName()+" was not found", e);
	}
    }

    /**
     * @param changeEvent
     *            either an {@link AttributeValueChangeEvent} or a {@link LinkChangeEvent}.
     * @param attributeOrAssociationEndCall
     *            a (sub-)expression originally affected by <tt>changeEvent</tt>. For {@link LinkChangeEvent}s it
     *            depends on which end the expression uses what will be considered the source element of the change
     *            which will then be returned by this method. The source is the element at the end of the link changed
     *            that is the opposite end of the end used by the {@link AssociationEndCallExp}.
     *            <tt>attributeOrAssociationEndCall</tt> has to be of type {@link AttributeCallExp} in case
     *            <tt>changeEvent</tt> is an {@link AttributeValueChangeEvent}, and of type
     *            {@link AssociationEndCallExp} in case <tt>changeEvent</tt> is of type {@link LinkChangeEvent}.
     * @return <tt>null</tt> in case the source element indicated by the change event does not conform to the static
     *         attribute or association call's source expression type. <tt>null</tt> may also result if the element
     *         indicated by the event cannot be resolved (anymore). This is still an open issue. See the to-do marker
     *         below. In all other cases, the source element on which the event occured, is returned.
     */
    private RefObjectImpl getSourceElement(ModelChangeEvent changeEvent, ModelPropertyCallExpInternal attributeOrAssociationEndCall) {
	Connection conn = changeEvent.getEventTriggerConnection();
	CoreConnection coreConn = ((ConnectionWrapper) conn).unwrap();
	assert changeEvent instanceof AttributeValueChangeEvent || changeEvent instanceof LinkChangeEvent;
	RefObjectImpl result;
	if (changeEvent instanceof AttributeValueChangeEvent) {
	    Wrapper<?> sourceElement = (Wrapper<?>) ((AttributeValueChangeEvent) changeEvent).getAffectedElement(conn);
	    if (sourceElement != null) {
		result = (RefObjectImpl) sourceElement.unwrap();
	    } else {
		result = null;
	    }
	} else {
	    AssociationEndCallExpInternal aece = (AssociationEndCallExpInternal) attributeOrAssociationEndCall;
	    SpiJmiHelper jmiHelper = coreConn.getCoreJmiHelper();
	    int aeceEndNumber = jmiHelper.getAssociationEndNumber(coreConn.getSession(), aece.getReferredAssociationEnd(coreConn));
	    LinkChangeEvent lce = (LinkChangeEvent) changeEvent;
	    RefObject refObjectResult;
	    if (aeceEndNumber == 0) {
		refObjectResult = lce.getSecondLinkEnd(conn);
	    } else {
		refObjectResult = lce.getFirstLinkEnd(conn);
	    }
	    if (refObjectResult != null) {
		result = (RefObjectImpl) ((Wrapper<?>) refObjectResult).unwrap();
	    } else {
		// TODO clarify if this is a severe problem; deletes may have occurred; how does this impact the impact analysis?
		result = null;
	    }
	}
	if (result != null
		&& !result.refIsInstanceOf(coreConn.getSession(),
			((OclExpressionInternal) attributeOrAssociationEndCall.getSource(coreConn)).getType(coreConn),
			/* considerSubtypes */ true)) {
	    result = null; // can't be source element of attributeOrAssociationEndCall because of incompatible type
	    // also see the ASCII arts in AssociationEndCallExpTracer.traceback
	}
	return result;
    }
    /**
     * Finds all attribute and association end call expressions in <tt>expression</tt> that are affected by the
     * <tt>changeEvent</tt>. The result is always non-<tt>null</tt> but may be empty.
     */
    private Set<? extends ModelPropertyCallExp> getAttributeOrAssociationEndCalls(ModelChangeEvent changeEvent) {
	CoreConnection conn = ((ConnectionWrapper) changeEvent.getEventTriggerConnection()).unwrap();
	Set<? extends ModelPropertyCallExp> result;
	if (changeEvent instanceof AttributeValueChangeEvent) {
	    result = associationEndAndAttributeCallFinder.getAttributeCallExpressions(
		    ((AttributeValueChangeEvent) changeEvent).getAffectedMetaObject(conn));
	} else if (changeEvent instanceof LinkChangeEvent) {
	    Set<AssociationEndCallExp> localResult = new HashSet<AssociationEndCallExp>();
	    AssociationWrapper assoc = (AssociationWrapper) ((LinkChangeEvent) changeEvent).getAffectedMetaObject(conn.getWrapper());
	    SpiJmiHelper jmiHelper = conn.getCoreJmiHelper();
	    List<AssociationEnd> ends = jmiHelper.getAssociationEnds(conn.getSession(), assoc.unwrap());
	    localResult.addAll(associationEndAndAttributeCallFinder.getAssociationEndCallExpressions(ends.get(0)));
	    localResult.addAll(associationEndAndAttributeCallFinder.getAssociationEndCallExpressions(ends.get(1)));
	    result = localResult;
	} else {
	    result = Collections.emptySet();
	}
	return result;
    }
    
    /**
     * For an "impl" object representing an OCL expression, obtains the {@link Operation} for which it is the body.
     * {@link OclExpressionInternal#getDefines()} is used because on "impl" objects the getters that receive the
     * {@link CoreConnection} need to be called. If the expression is not a body of an
     * operation, <tt>null</tt> is returned. Otherwise, the first operation (usually there would be
     * at most one) for which <tt>expression</tt> is the operation body is returned.
     */
    protected static OperationImpl getDefines(CoreConnection conn, OclExpression expression) {
	JmiListImpl<?> operationList = (JmiListImpl<?>) ((OclExpressionInternal) expression).getDefines(conn);
	OperationImpl result;
	if (operationList.size(conn.getSession()) > 0) {
	    result = (OperationImpl) operationList.iterator(conn).next();
	} else {
	    result = null;
	}
	return result;
    }

}