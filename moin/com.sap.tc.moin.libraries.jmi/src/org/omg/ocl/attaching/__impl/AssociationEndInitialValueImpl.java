/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching.__impl;

public final class AssociationEndInitialValueImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl implements org.omg.ocl.attaching.AssociationEndInitialValue,org.omg.ocl.attaching.__impl.AssociationEndInitialValueInternal
{
    // default constructor
    public AssociationEndInitialValueImpl() {
        super();
    }

    // specific constructor
    public AssociationEndInitialValueImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _InitialValue, _AssociationEndForInitialValue);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _InitialValue, _AssociationEndForInitialValue, "45ED2E29040E888560A24E823A4A8D633D3ED3B8"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.OclExpression getInitialValue(com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getInitialValue(get___CurrentConnection(), _AssociationEndForInitialValue);
    }
    public org.omg.ocl.expressions.OclExpression getInitialValue(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 1 );
        return (org.omg.ocl.expressions.OclExpression) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _AssociationEndForInitialValue, endAndMetaObject );
    }
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForInitialValue(org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getAssociationEndForInitialValue(get___CurrentConnection(), _InitialValue);
    }
    public com.sap.tc.moin.repository.mmi.model.AssociationEnd getAssociationEndForInitialValue(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.AssociationEnd) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _InitialValue, "45ED2E29040E888560A24E823A4A8D633D3ED3B8"); //$NON-NLS-1$
    }
    public boolean add(org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_InitialValue, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AssociationEndForInitialValue);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_InitialValue, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AssociationEndForInitialValue);
    }
    public boolean remove(org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_InitialValue, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AssociationEndForInitialValue);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _InitialValue, com.sap.tc.moin.repository.mmi.model.AssociationEnd _AssociationEndForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_InitialValue, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AssociationEndForInitialValue);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (org.omg.ocl.expressions.OclExpression) firstEnd, (com.sap.tc.moin.repository.mmi.model.AssociationEnd) secondEnd );
    }

    public java.lang.Class<org.omg.ocl.attaching.AssociationEndInitialValue> get___JmiInterface() {
        return org.omg.ocl.attaching.AssociationEndInitialValue.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.attaching.AssociationEndInitialValue> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.attaching.__impl.AssociationEndInitialValueWrapper(conn, this, synchronize);
    }
}