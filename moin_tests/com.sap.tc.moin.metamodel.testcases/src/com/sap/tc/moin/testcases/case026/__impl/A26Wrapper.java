/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case026.__impl;

public class A26Wrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case026.__impl.A26Impl> implements com.sap.tc.moin.testcases.case026.A26,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public A26Wrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case026.__impl.A26Impl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case026.__impl.A26Impl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case026.__impl.A26Impl) getWrappedObject();
    }
    
    private com.sap.tc.moin.testcases.case026.__impl.A26Impl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.tc.moin.testcases.case026.__impl.A26Impl) resolved;
    }
    
    public com.sap.tc.moin.testcases.case026.__impl.A26Impl unwrap() {
        return (com.sap.tc.moin.testcases.case026.__impl.A26Impl) getWrappedObject();
    }
        
    // methods for attributes
    public com.sap.tc.moin.repository.mmi.reflect.RefObject getReflectToOne() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefObject) wrapResult(getCastWrappedObject().getReflectToOne(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefObject) wrapResult(getCastWrappedObject().getReflectToOne(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setReflectToOne(com.sap.tc.moin.repository.mmi.reflect.RefObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setReflectToOne(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setReflectToOne(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefObject> getReflectToMany() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefObject>) wrapResult(getCastWrappedObject().getReflectToMany(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.tc.moin.repository.mmi.reflect.RefObject>) wrapResult(getCastWrappedObject().getReflectToMany(connection)); 
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
    public java.lang.Class<com.sap.tc.moin.testcases.case026.A26> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case026.A26.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case026.A26 (Java Type)\ntestcases.case026.A26 (MOF Type)"; //$NON-NLS-1$
    }    
}