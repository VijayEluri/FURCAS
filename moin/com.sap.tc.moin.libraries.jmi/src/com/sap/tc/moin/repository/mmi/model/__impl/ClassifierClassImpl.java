/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model.__impl;

public final class ClassifierClassImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl implements com.sap.tc.moin.repository.mmi.model.ClassifierClass,com.sap.tc.moin.repository.mmi.model.__impl.ClassifierClassInternal {

    
    static {
    }

    // static variable declarations
    
    // default constructor
    public ClassifierClassImpl() {
        super();
    }

    // specific constructor
    public ClassifierClassImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        super(workspace, mofId, immediatePackage, metaObject);
    }

    // object creators

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
        return true;
    }

    public com.sap.tc.moin.repository.mmi.reflect.RefObject get___Instance() throws com.sap.tc.moin.repository.mmi.reflect.JmiException {
        // abstract class
        return null;    
    }

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.repository.mmi.model.ClassifierClass> get___JmiInterface() {
        return com.sap.tc.moin.repository.mmi.model.ClassifierClass.class;
    }
        
    
    // reflective methods
    

    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.repository.mmi.model.__impl.ClassifierClassImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.repository.mmi.model.__impl.ClassifierClassWrapper(conn, this, synchronize);
    }   

}