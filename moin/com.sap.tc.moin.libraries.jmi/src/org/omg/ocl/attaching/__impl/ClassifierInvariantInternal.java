/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching.__impl;

public interface ClassifierInvariantInternal extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // internal association interface
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.attaching.OclConstraint _Invariants, com.sap.tc.moin.repository.mmi.model.Classifier _InvariantOf) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<org.omg.ocl.attaching.OclConstraint> getInvariants(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.Classifier _InvariantOf) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.Classifier> getInvariantOf(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.attaching.OclConstraint _Invariants) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.attaching.OclConstraint _Invariants, com.sap.tc.moin.repository.mmi.model.Classifier _InvariantOf) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.attaching.OclConstraint _Invariants, com.sap.tc.moin.repository.mmi.model.Classifier _InvariantOf) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}