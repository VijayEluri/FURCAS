/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class AssociationEndCallExpClassImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl implements org.omg.ocl.expressions.AssociationEndCallExpClass,org.omg.ocl.expressions.__impl.AssociationEndCallExpClassInternal {

    
    static {
    }

    // static variable declarations
    
    // default constructor
    public AssociationEndCallExpClassImpl() {
        super();
    }

    // specific constructor
    public AssociationEndCallExpClassImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }

    // object creators
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExp() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.AssociationEndCallExp result = (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstance(get___CurrentConnection(), (java.util.List<? extends Object>)null);
        return result;
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExp(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.AssociationEndCallExp result = (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstance(connection, (java.util.List<? extends Object>)null);
        return result;
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExpInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.AssociationEndCallExp result = (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstanceInPartition(get___CurrentConnection(), (java.util.List<? extends Object>)null, partition);
        return result;
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExpInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        org.omg.ocl.expressions.AssociationEndCallExp result = (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstanceInPartition(connection, (java.util.List<? extends Object>)null, partition);
        return result;
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExp(java.lang.String name) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(1);
        parameterList.add(name);
        return (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstance(get___CurrentConnection(), parameterList);
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExp(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String name) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(1);
        parameterList.add(name);
        return (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstance(connection, parameterList);
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExpInPartition(java.lang.String name, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(1);
        parameterList.add(name);
        return (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstanceInPartition(get___CurrentConnection(), parameterList, partition);
    }
    public org.omg.ocl.expressions.AssociationEndCallExp createAssociationEndCallExpInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String name, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(1);
        parameterList.add(name);
        return (org.omg.ocl.expressions.AssociationEndCallExp) refCreateInstanceInPartition(connection, parameterList, partition);
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
        return new org.omg.ocl.expressions.__impl.AssociationEndCallExpImpl();    
    }

    // get the JMI interface
    public java.lang.Class<org.omg.ocl.expressions.AssociationEndCallExpClass> get___JmiInterface() {
        return org.omg.ocl.expressions.AssociationEndCallExpClass.class;
    }
        
    
    // reflective methods
    

    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.__impl.AssociationEndCallExpClassImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.AssociationEndCallExpClassWrapper(conn, this, synchronize);
    }   

}