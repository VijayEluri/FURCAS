/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case013.__impl;

public class C13SubWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.tc.moin.testcases.case013.__impl.C13SubImpl> implements com.sap.tc.moin.testcases.case013.C13Sub,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public C13SubWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case013.__impl.C13SubImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case013.__impl.C13SubImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case013.__impl.C13SubImpl) getWrappedObject();
    }
    
    private com.sap.tc.moin.testcases.case013.__impl.C13SubImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.tc.moin.testcases.case013.__impl.C13SubImpl) resolved;
    }
    
    public com.sap.tc.moin.testcases.case013.__impl.C13SubImpl unwrap() {
        return (com.sap.tc.moin.testcases.case013.__impl.C13SubImpl) getWrappedObject();
    }
        
    // methods for attributes
    public double getAttribute1() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getAttribute1();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getAttribute1();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getAttribute1(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setAttribute1(double newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setAttribute1(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setAttribute1(connection, newValue);
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
    public java.lang.Class<com.sap.tc.moin.testcases.case013.C13Sub> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case013.C13Sub.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case013.C13Sub (Java Type)\ntestcases.case013.C13Sub (MOF Type)"; //$NON-NLS-1$
    }    
}