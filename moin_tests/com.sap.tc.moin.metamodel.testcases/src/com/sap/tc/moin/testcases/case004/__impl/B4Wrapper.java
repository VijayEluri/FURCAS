/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case004.__impl;

public class B4Wrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case004.__impl.B4Impl> implements com.sap.tc.moin.testcases.case004.B4,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public B4Wrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case004.__impl.B4Impl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case004.__impl.B4Impl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case004.__impl.B4Impl) getWrappedObject();
    }
    
    private com.sap.tc.moin.testcases.case004.__impl.B4Impl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.tc.moin.testcases.case004.__impl.B4Impl) resolved;
    }
    
    public com.sap.tc.moin.testcases.case004.__impl.B4Impl unwrap() {
        return (com.sap.tc.moin.testcases.case004.__impl.B4Impl) getWrappedObject();
    }
        
    // methods for attributes
    public java.lang.String getOnePrimitive() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getOnePrimitive();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getOnePrimitive();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getOnePrimitive(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setOnePrimitive(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setOnePrimitive(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setOnePrimitive(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

     
    // methods for references
   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case004.B4> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case004.B4.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case004.B4 (Java Type)\ntestcases.case004.B4 (MOF Type)"; //$NON-NLS-1$
    }    
}