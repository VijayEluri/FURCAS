package de.hpi.sam.bp2009.solution.impactAnalyzer.deltaPropagation;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.expressions.VariableExp;

public class VariableValueNotFoundInfoImpl implements VariableValueNotFoundInfo {
    private final String variableName;
    private VariableExp<EClassifier, EParameter> variableExp;

    public VariableValueNotFoundInfoImpl(String variableName, VariableExp<EClassifier, EParameter> variableExp) {
        this.variableName = variableName;
        this.variableExp = variableExp;
    }

    public VariableValueNotFoundInfoImpl(String variableName) {
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }

    /**
     * If the request for the undefined variable was triggered by evaluating a {@link VariableExp}, this
     * expression is returned. In some cases the {@link EvaluationEnvironment#getValueOf(String)} method is called
     * without a particular variable expression at hand, e.g., in order to look up the context object which is the
     * value of the "self" variable for which not always a variable expression is available. In those cases,
     * <code>null</code> will be returned.
     */
    public VariableExp<EClassifier, EParameter> getVariableExp() {
        return variableExp;
    }
}