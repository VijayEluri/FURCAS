/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class AItemCollectionItemImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl implements org.omg.ocl.expressions.AItemCollectionItem,org.omg.ocl.expressions.__impl.AItemCollectionItemInternal
{
    // default constructor
    public AItemCollectionItemImpl() {
        super();
    }

    // specific constructor
    public AItemCollectionItemImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(org.omg.ocl.expressions.OclExpression _Item, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _Item, _CollectionItem);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _Item, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _CollectionItem, _Item, "45ED2E29C730C2822897437834B38837FB7B6244"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.OclExpression getItem(org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getItem(get___CurrentConnection(), _CollectionItem);
    }
    public org.omg.ocl.expressions.OclExpression getItem(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (org.omg.ocl.expressions.OclExpression) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _CollectionItem, "45ED2E29C730C2822897437834B38837FB7B6244"); //$NON-NLS-1$
    }
    public org.omg.ocl.expressions.CollectionItem getCollectionItem(org.omg.ocl.expressions.OclExpression _Item) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getCollectionItem(get___CurrentConnection(), _Item);
    }
    public org.omg.ocl.expressions.CollectionItem getCollectionItem(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _Item) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (org.omg.ocl.expressions.CollectionItem) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _Item, endAndMetaObject );
    }
    public boolean add(org.omg.ocl.expressions.OclExpression _Item, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Item, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionItem);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _Item, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Item, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionItem);
    }
    public boolean remove(org.omg.ocl.expressions.OclExpression _Item, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_Item, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionItem);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, org.omg.ocl.expressions.OclExpression _Item, org.omg.ocl.expressions.CollectionItem _CollectionItem) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_Item, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_CollectionItem);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (org.omg.ocl.expressions.OclExpression) firstEnd, (org.omg.ocl.expressions.CollectionItem) secondEnd );
    }

    public java.lang.Class<org.omg.ocl.expressions.AItemCollectionItem> get___JmiInterface() {
        return org.omg.ocl.expressions.AItemCollectionItem.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.AItemCollectionItem> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.AItemCollectionItemWrapper(conn, this, synchronize);
    }
}