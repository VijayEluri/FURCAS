/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching.__impl;

public final class AttributeDerivationExpressionImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl implements org.omg.ocl.attaching.AttributeDerivationExpression,org.omg.ocl.attaching.__impl.AttributeDerivationExpressionInternal
{
    // default constructor
    public AttributeDerivationExpressionImpl() {
        super();
    }

    // specific constructor
    public AttributeDerivationExpressionImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _DerivationExpression, _AttributeForDerivationExpression);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _DerivationExpression, _AttributeForDerivationExpression, "45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.OclExpression getDerivationExpression(com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getDerivationExpression(get___CurrentConnection(), _AttributeForDerivationExpression);
    }
    public org.omg.ocl.expressions.OclExpression getDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 1 );
        return (org.omg.ocl.expressions.OclExpression) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _AttributeForDerivationExpression, endAndMetaObject );
    }
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForDerivationExpression(org.omg.ocl.expressions.OclExpression _DerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getAttributeForDerivationExpression(get___CurrentConnection(), _DerivationExpression);
    }
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForDerivationExpression(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.model.Attribute) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _DerivationExpression, "45ED2E2956BFBD2D2CDA48C00F8BAB214E917F30"); //$NON-NLS-1$
    }
    public boolean add(org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_DerivationExpression, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AttributeForDerivationExpression);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DerivationExpression, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AttributeForDerivationExpression);
    }
    public boolean remove(org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_DerivationExpression, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AttributeForDerivationExpression);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _DerivationExpression, com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForDerivationExpression) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_DerivationExpression, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_AttributeForDerivationExpression);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (org.omg.ocl.expressions.OclExpression) firstEnd, (com.sap.tc.moin.repository.mmi.model.Attribute) secondEnd );
    }

    public java.lang.Class<org.omg.ocl.attaching.AttributeDerivationExpression> get___JmiInterface() {
        return org.omg.ocl.attaching.AttributeDerivationExpression.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.attaching.AttributeDerivationExpression> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.attaching.__impl.AttributeDerivationExpressionWrapper(conn, this, synchronize);
    }
}