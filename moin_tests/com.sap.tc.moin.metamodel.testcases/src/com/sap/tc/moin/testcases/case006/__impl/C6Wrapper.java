/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case006.__impl;

public class C6Wrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case006.__impl.C6Impl> implements com.sap.tc.moin.testcases.case006.C6,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public C6Wrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case006.__impl.C6Impl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case006.__impl.C6Impl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case006.__impl.C6Impl) getWrappedObject();
    }
    
    public com.sap.tc.moin.testcases.case006.__impl.C6Impl unwrap() {
        return (com.sap.tc.moin.testcases.case006.__impl.C6Impl) getWrappedObject();
    }
        
    // methods for attributes
     
    // methods for references
    public com.sap.tc.moin.testcases.case006.B6 getX() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.testcases.case006.B6) wrapResult(getCastWrappedObject().getX(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.testcases.case006.B6) wrapResult(getCastWrappedObject().getX(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setX(com.sap.tc.moin.testcases.case006.B6 newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setX(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setX(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.tc.moin.testcases.case006.D6 getW() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.testcases.case006.D6) wrapResult(getCastWrappedObject().getW(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.testcases.case006.D6) wrapResult(getCastWrappedObject().getW(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setW(com.sap.tc.moin.testcases.case006.D6 newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setW(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setW(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case006.C6> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case006.C6.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case006.C6 (Java Type)\ntestcases.case006.C6 (MOF Type)"; //$NON-NLS-1$
    }    
}