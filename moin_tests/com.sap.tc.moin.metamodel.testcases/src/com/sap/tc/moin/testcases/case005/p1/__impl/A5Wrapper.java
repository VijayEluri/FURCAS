/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case005.p1.__impl;

public class A5Wrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl> implements com.sap.tc.moin.testcases.case005.p1.A5,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public A5Wrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl) getWrappedObject();
    }
    
    public com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl unwrap() {
        return (com.sap.tc.moin.testcases.case005.p1.__impl.A5Impl) getWrappedObject();
    }
        
    // methods for attributes
     
    // methods for references
    public com.sap.tc.moin.testcases.case005.p1.p2.B5 getX() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.testcases.case005.p1.p2.B5) wrapResult(getCastWrappedObject().getX(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.testcases.case005.p1.p2.B5) wrapResult(getCastWrappedObject().getX(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setX(com.sap.tc.moin.testcases.case005.p1.p2.B5 newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
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

   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<com.sap.tc.moin.testcases.case005.p1.A5> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case005.p1.A5.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case005.p1.A5 (Java Type)\ntestcases.case005.p1.A5 (MOF Type)"; //$NON-NLS-1$
    }    
}