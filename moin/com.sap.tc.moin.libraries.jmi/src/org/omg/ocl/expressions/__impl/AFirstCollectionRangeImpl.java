/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class AFirstCollectionRangeImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl implements org.omg.ocl.expressions.AFirstCollectionRange,org.omg.ocl.expressions.__impl.AFirstCollectionRangeInternal
{
    // default constructor
    public AFirstCollectionRangeImpl() {
        super();
    }

    // specific constructor
    public AFirstCollectionRangeImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(org.omg.ocl.expressions.OclExpression _First, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _First, _CollectionRange);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _First, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _CollectionRange, _First, "45ED2E29F8DB3A1A66504A3830B7FE90AEF57F3C"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.OclExpression getFirst(org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getFirst(get___CurrentConnection(), _CollectionRange);
    }
    public org.omg.ocl.expressions.OclExpression getFirst(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (org.omg.ocl.expressions.OclExpression) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _CollectionRange, "45ED2E29F8DB3A1A66504A3830B7FE90AEF57F3C"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.CollectionRange getCollectionRange(org.omg.ocl.expressions.OclExpression _First) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getCollectionRange(get___CurrentConnection(), _First);
    }
    public org.omg.ocl.expressions.CollectionRange getCollectionRange(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _First) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (org.omg.ocl.expressions.CollectionRange) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _First, endAndMetaObject );
    }
    public boolean add(org.omg.ocl.expressions.OclExpression _First, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_First, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionRange);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _First, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_First, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionRange);
    }
    public boolean remove(org.omg.ocl.expressions.OclExpression _First, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_First, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionRange);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _First, org.omg.ocl.expressions.CollectionRange _CollectionRange) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_First, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionRange);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (org.omg.ocl.expressions.OclExpression) firstEnd, (org.omg.ocl.expressions.CollectionRange) secondEnd );
    }

    public java.lang.Class<org.omg.ocl.expressions.AFirstCollectionRange> get___JmiInterface() {
        return org.omg.ocl.expressions.AFirstCollectionRange.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.AFirstCollectionRange> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.AFirstCollectionRangeWrapper(conn, this, synchronize);
    }
}