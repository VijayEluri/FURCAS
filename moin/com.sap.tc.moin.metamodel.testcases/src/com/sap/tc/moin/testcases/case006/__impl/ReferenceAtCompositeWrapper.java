/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case006.__impl;

public class ReferenceAtCompositeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.tc.moin.testcases.case006.ReferenceAtComposite> implements com.sap.tc.moin.testcases.case006.ReferenceAtComposite,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ReferenceAtComposite wrapper
     */
    public ReferenceAtCompositeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case006.__impl.ReferenceAtCompositeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.tc.moin.testcases.case006.__impl.ReferenceAtCompositeImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case006.__impl.ReferenceAtCompositeImpl) getWrappedObject();
    }

    public com.sap.tc.moin.testcases.case006.ReferenceAtComposite unwrap() {
        return (com.sap.tc.moin.testcases.case006.ReferenceAtComposite) getWrappedObject();
    }
    
    public boolean exists(com.sap.tc.moin.testcases.case006.D6 _W, com.sap.tc.moin.testcases.case006.C6 _V) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.testcases.case006.D6 getW(com.sap.tc.moin.testcases.case006.C6 _V) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.testcases.case006.D6) wrapResult(getCastWrappedObject().getW(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.testcases.case006.D6) wrapResult(getCastWrappedObject().getW(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.testcases.case006.C6 getV(com.sap.tc.moin.testcases.case006.D6 _W) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.testcases.case006.C6) wrapResult(getCastWrappedObject().getV(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.testcases.case006.C6) wrapResult(getCastWrappedObject().getV(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.tc.moin.testcases.case006.D6 _W, com.sap.tc.moin.testcases.case006.C6 _V) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.tc.moin.testcases.case006.D6 _W, com.sap.tc.moin.testcases.case006.C6 _V) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _W), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _V)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.tc.moin.testcases.case006.ReferenceAtComposite> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case006.ReferenceAtComposite.class;
    }

    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case006.ReferenceAtComposite (Java Type)\ntestcases.case006.ReferenceAtComposite (MOF Type)"; //$NON-NLS-1$
    }    
}