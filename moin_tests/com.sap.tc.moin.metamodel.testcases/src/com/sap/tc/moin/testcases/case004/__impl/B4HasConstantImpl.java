/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case004.__impl;

public final class B4HasConstantImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

    
    static {
    }
    
    // default constructor
    public B4HasConstantImpl() {
        super();
    }
    
    // specific constructor
    public B4HasConstantImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for internal attribute setter

    // reflective methods
        
    


    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case004.B4HasConstant> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case004.B4HasConstant.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case004.__impl.B4HasConstantImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case004.__impl.B4HasConstantWrapper(conn, this, synchronize);
    }
    
}