/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class CollectionItemClassImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl implements org.omg.ocl.expressions.CollectionItemClass,org.omg.ocl.expressions.__impl.CollectionItemClassInternal {

    
    static {
    }

    // static variable declarations
    
    // default constructor
    public CollectionItemClassImpl() {
        super();
    }

    // specific constructor
    public CollectionItemClassImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }

    // object creators
    public org.omg.ocl.expressions.CollectionItem createCollectionItem() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.CollectionItem result = (org.omg.ocl.expressions.CollectionItem) refCreateInstance(get___CurrentConnection(), (java.util.List<? extends Object>)null);
        return result;
    }
    public org.omg.ocl.expressions.CollectionItem createCollectionItem(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.CollectionItem result = (org.omg.ocl.expressions.CollectionItem) refCreateInstance(connection, (java.util.List<? extends Object>)null);
        return result;
    }
    public org.omg.ocl.expressions.CollectionItem createCollectionItemInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.CollectionItem result = (org.omg.ocl.expressions.CollectionItem) refCreateInstanceInPartition(get___CurrentConnection(), (java.util.List<? extends Object>)null, partition);
        return result;
    }
    public org.omg.ocl.expressions.CollectionItem createCollectionItemInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.CollectionItem result = (org.omg.ocl.expressions.CollectionItem) refCreateInstanceInPartition(connection, (java.util.List<? extends Object>)null, partition);
        return result;
    }

    // methods for static attributes
    
    
    // methods for modeled static operations
    
    // methods for structure type creators


    // methods for internal modeled operations

    // internal enumeration creators

    // internal structure type creators

    // reflective methods
        
    


    // for performance reasons overwrite method
    public boolean is___Singleton() {
        return false;
    }
    // for performance reasons overwrite method
    public boolean is___Abstract() {
        return false;
    }

    public com.sap.tc.moin.repository.mmi.reflect.RefObject get___Instance() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        return new org.omg.ocl.expressions.__impl.CollectionItemImpl();    
    }

    // get the JMI interface
    public java.lang.Class<org.omg.ocl.expressions.CollectionItemClass> get___JmiInterface() {
        return org.omg.ocl.expressions.CollectionItemClass.class;
    }
        
    
    // reflective methods
    

    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.__impl.CollectionItemClassImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.CollectionItemClassWrapper(conn, this, synchronize);
    }   

}