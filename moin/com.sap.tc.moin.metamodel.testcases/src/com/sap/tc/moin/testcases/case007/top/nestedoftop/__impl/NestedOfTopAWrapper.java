/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl;

public class NestedOfTopAWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl.NestedOfTopAImpl> implements com.sap.tc.moin.testcases.case007.top.nestedoftop.NestedOfTopA,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public NestedOfTopAWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl.NestedOfTopAImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl.NestedOfTopAImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl.NestedOfTopAImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl.NestedOfTopAImpl unwrap() {
        return (com.sap.tc.moin.testcases.case007.top.nestedoftop.__impl.NestedOfTopAImpl) getWrappedObject();
    }
        
    // methods for attributes
     
    // methods for references
   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case007.top.nestedoftop.NestedOfTopA> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case007.top.nestedoftop.NestedOfTopA.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case007.top.nestedoftop.NestedOfTopA (Java Type)\ntestcases.case007.top.nestedOfTop.NestedOfTopA (MOF Type)"; //$NON-NLS-1$
    }    
}