/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case020.__impl;

public final class HasSuper1Impl extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationImpl
{
    // default constructor
    public HasSuper1Impl() {
        super();
    }

    // specific constructor
    public HasSuper1Impl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    
    public boolean exists(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return exists(get___CurrentConnection(), _S1, _A20);
    }
    public boolean exists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return ___existsMult1( connection, _A20, _S1, "464D79889E3D47C185B049DE1644DE1F901CFDB8"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getS1(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getS1(get___CurrentConnection(), _A20);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getS1(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___getElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _A20, "464D79889E3D47C185B049DE1644DE1F901CFDB8"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getA20(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return getA20(get___CurrentConnection(), _S1);
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefBaseObject getA20(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.EndAndMetaObject endAndMetaObject = get___EndAndMetaObject( 0 );
        return (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) ___queryElementAtOtherLinkEnd( connection, (com.sap.tc.moin.repository.core.CorePartitionable) _S1, endAndMetaObject );
    }
    public boolean add(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_S1, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_A20);
    }
    public boolean add(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
          return refAddLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_S1, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_A20);
    }
    public boolean remove(com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink((com.sap.tc.moin.repository.mmi.reflect.RefObject)_S1, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_A20);
    }
    public boolean remove(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _S1, com.sap.tc.moin.repository.mmi.reflect.RefBaseObject _A20) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        return refRemoveLink(connection, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_S1, (com.sap.tc.moin.repository.mmi.reflect.RefObject)_A20);
    }
    public boolean refLinkExists(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.reflect.RefObject firstEnd, com.sap.tc.moin.repository.mmi.reflect.RefObject secondEnd) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        if ( firstEnd == null || secondEnd == null ) { return false; }
        checkTypesForRefLinkExists( connection, firstEnd, secondEnd );
        return exists( connection, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) firstEnd, (com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) secondEnd );
    }

    public java.lang.Class<com.sap.tc.moin.testcases.case020.HasSuper1> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case020.HasSuper1.class;
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case020.HasSuper1> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case020.__impl.HasSuper1Wrapper(conn, this, synchronize);
    }
}