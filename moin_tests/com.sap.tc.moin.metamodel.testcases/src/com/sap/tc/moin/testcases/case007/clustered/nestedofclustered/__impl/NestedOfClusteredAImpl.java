/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case007.clustered.nestedofclustered.__impl;

public final class NestedOfClusteredAImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectImpl {

    
    static {
    }
    
    // default constructor
    public NestedOfClusteredAImpl() {
        super();
    }
    
    // specific constructor
    public NestedOfClusteredAImpl(java.lang.Object workspace, String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject, com.sap.tc.moin.repository.mmi.reflect.RefClass refClass) {
        super(workspace, mofId, immediatePackage, metaObject, refClass);
    }
    
    // methods for internal attribute setter

    // reflective methods
        
    


    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case007.clustered.nestedofclustered.NestedOfClusteredA> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case007.clustered.nestedofclustered.NestedOfClusteredA.class;
    }

    // create the wrapper
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.tc.moin.testcases.case007.clustered.nestedofclustered.__impl.NestedOfClusteredAImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.tc.moin.testcases.case007.clustered.nestedofclustered.__impl.NestedOfClusteredAWrapper(conn, this, synchronize);
    }
    
}