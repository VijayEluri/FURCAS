/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model.__impl;

public final class MofClassClassImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl implements com.sap.tc.moin.repository.mmi.model.MofClassClass,com.sap.tc.moin.repository.mmi.model.__impl.MofClassClassInternal {

    
    static {
    }

    // static variable declarations
    
    // default constructor
    public MofClassClassImpl() {
        super();
    }

    // specific constructor
    public MofClassClassImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }

    // object creators
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClass() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.MofClass result = (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstance(get___CurrentConnection(), (java.util.List<? extends Object>)null);
        ((com.sap.tc.moin.repository.mmi.model.__impl.MofClassImpl) result).initialize___Values(get___CurrentConnection());
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClass(com.sap.tc.moin.repository.core.CoreConnection connection) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.MofClass result = (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstance(connection, (java.util.List<? extends Object>)null);
        ((com.sap.tc.moin.repository.mmi.model.__impl.MofClassImpl) result).initialize___Values(connection);
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClassInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.MofClass result = (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstanceInPartition(get___CurrentConnection(), (java.util.List<? extends Object>)null, partition);
        ((com.sap.tc.moin.repository.mmi.model.__impl.MofClassImpl) result).initialize___Values(get___CurrentConnection());
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClassInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
    
        com.sap.tc.moin.repository.mmi.model.MofClass result = (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstanceInPartition(connection, (java.util.List<? extends Object>)null, partition);
        ((com.sap.tc.moin.repository.mmi.model.__impl.MofClassImpl) result).initialize___Values(connection);
        return result;
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClass(java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility, boolean isSingleton) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(7);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(isRoot);
        parameterList.add(isLeaf);
        parameterList.add(isAbstract);
        parameterList.add(visibility);
        parameterList.add(isSingleton);
        return (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstance(get___CurrentConnection(), parameterList);
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClass(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility, boolean isSingleton) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(7);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(isRoot);
        parameterList.add(isLeaf);
        parameterList.add(isAbstract);
        parameterList.add(visibility);
        parameterList.add(isSingleton);
        return (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstance(connection, parameterList);
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClassInPartition(java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility, boolean isSingleton, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(7);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(isRoot);
        parameterList.add(isLeaf);
        parameterList.add(isAbstract);
        parameterList.add(visibility);
        parameterList.add(isSingleton);
        return (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstanceInPartition(get___CurrentConnection(), parameterList, partition);
    }
    public com.sap.tc.moin.repository.mmi.model.MofClass createMofClassInPartition(com.sap.tc.moin.repository.core.CoreConnection connection, java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility, boolean isSingleton, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        java.util.List<java.lang.Object> parameterList = new java.util.ArrayList<java.lang.Object>(7);
        parameterList.add(name);
        parameterList.add(annotation);
        parameterList.add(isRoot);
        parameterList.add(isLeaf);
        parameterList.add(isAbstract);
        parameterList.add(visibility);
        parameterList.add(isSingleton);
        return (com.sap.tc.moin.repository.mmi.model.MofClass) refCreateInstanceInPartition(connection, parameterList, partition);
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
        return new com.sap.tc.moin.repository.mmi.model.__impl.MofClassImpl();    
    }

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.repository.mmi.model.MofClassClass> get___JmiInterface() {
        return com.sap.tc.moin.repository.mmi.model.MofClassClass.class;
    }
        
    
    // reflective methods
    

    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.repository.mmi.model.__impl.MofClassClassImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.repository.mmi.model.__impl.MofClassClassWrapper(conn, this, synchronize);
    }   

}