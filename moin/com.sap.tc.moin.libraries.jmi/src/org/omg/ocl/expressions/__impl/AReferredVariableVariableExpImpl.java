/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class AReferredVariableVariableExpImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl implements org.omg.ocl.expressions.AReferredVariableVariableExp,org.omg.ocl.expressions.__impl.AReferredVariableVariableExpInternal
{
    // default constructor
    public AReferredVariableVariableExpImpl() {
        super();
    }

    // specific constructor
    public AReferredVariableVariableExpImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(org.omg.ocl.expressions.VariableDeclaration _ReferredVariable, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _ReferredVariable, _VariableExp);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _ReferredVariable, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _VariableExp, _ReferredVariable, "45ED2E291B7A252AD172477E3044AB330D12F7E3"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.VariableDeclaration getReferredVariable(org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getReferredVariable(get___CurrentConnection(), _VariableExp);
    }
    public org.omg.ocl.expressions.VariableDeclaration getReferredVariable(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (org.omg.ocl.expressions.VariableDeclaration) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _VariableExp, "45ED2E291B7A252AD172477E3044AB330D12F7E3"); //$NON-NLS-1$
    }
    public java.util.Collection<org.omg.ocl.expressions.VariableExp> getVariableExp(org.omg.ocl.expressions.VariableDeclaration _ReferredVariable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getVariableExp(get___CurrentConnection(), _ReferredVariable);
    }
    public java.util.Collection<org.omg.ocl.expressions.VariableExp> getVariableExp(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _ReferredVariable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (java.util.Collection<org.omg.ocl.expressions.VariableExp>) ___queryElementsAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _ReferredVariable, get___EndAndMetaObject( 0 ) );
    }
    public boolean add(org.omg.ocl.expressions.VariableDeclaration _ReferredVariable, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferredVariable, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_VariableExp);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _ReferredVariable, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferredVariable, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_VariableExp);
    }
    public boolean remove(org.omg.ocl.expressions.VariableDeclaration _ReferredVariable, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferredVariable, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_VariableExp);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.VariableDeclaration _ReferredVariable, org.omg.ocl.expressions.VariableExp _VariableExp) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_ReferredVariable, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_VariableExp);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (org.omg.ocl.expressions.VariableDeclaration) firstEnd, (org.omg.ocl.expressions.VariableExp) secondEnd );
    }

    public java.lang.Class<org.omg.ocl.expressions.AReferredVariableVariableExp> get___JmiInterface() {
        return org.omg.ocl.expressions.AReferredVariableVariableExp.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.AReferredVariableVariableExp> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.AReferredVariableVariableExpWrapper(conn, this, synchronize);
    }
}