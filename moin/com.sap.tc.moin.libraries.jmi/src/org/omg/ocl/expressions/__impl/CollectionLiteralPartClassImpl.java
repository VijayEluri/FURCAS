/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package org.omg.ocl.expressions.__impl;

public final class CollectionLiteralPartClassImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl implements org.omg.ocl.expressions.CollectionLiteralPartClass,org.omg.ocl.expressions.__impl.CollectionLiteralPartClassInternal {

    
    static {
    }

    // static variable declarations
    
    // default constructor
    public CollectionLiteralPartClassImpl() {
        super();
    }

    // specific constructor
    public CollectionLiteralPartClassImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
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
    public java.lang.Class<org.omg.ocl.expressions.CollectionLiteralPartClass> get___JmiInterface() {
        return org.omg.ocl.expressions.CollectionLiteralPartClass.class;
    }
        
    
    // reflective methods
    

    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<org.omg.ocl.expressions.__impl.CollectionLiteralPartClassImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new org.omg.ocl.expressions.__impl.CollectionLiteralPartClassWrapper(conn, this, synchronize);
    }   

}