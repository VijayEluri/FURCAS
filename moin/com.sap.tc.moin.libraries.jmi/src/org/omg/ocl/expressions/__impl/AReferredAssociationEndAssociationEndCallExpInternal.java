/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public interface AReferredAssociationEndAssociationEndCallExpInternal extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // internal association interface
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd _ReferredAssociationEnd, org.omg.ocl.expressions.AssociationEndCallExp _AssociationEndCallExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getReferredAssociationEnd(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.AssociationEndCallExp _AssociationEndCallExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<org.omg.ocl.expressions.AssociationEndCallExp> getAssociationEndCallExp(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd _ReferredAssociationEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd _ReferredAssociationEnd, org.omg.ocl.expressions.AssociationEndCallExp _AssociationEndCallExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd _ReferredAssociationEnd, org.omg.ocl.expressions.AssociationEndCallExp _AssociationEndCallExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}