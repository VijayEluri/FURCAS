package com.sap.tc.moin.ocl.ia.result;

import java.util.Set;

import com.sap.tc.moin.ocl.utils.OclStatement;

/**
 * An EvaluationUnit is basicly a tuple of a OclStatement and a Set of descriptions of how to compute the instances for
 * which the OclStatement has to be re-evaluated.
 * 
 * @author Thomas Hettel (D039141)
 */
public interface EvaluationUnit {

    /**
     * Returns the affected OclStatement which has to be reevaluated.
     * 
     * @return the affected OclStatement which has to be reevaluated.
     */
    public OclStatement getAffectedStatement( );

    /**
     * Returns a Set of InstanceSets describing how to compute the set of affected instances
     * 
     * @return the Set of InstanceSets
     */
    public Set<InstanceSet> getInstanceSets( );

}