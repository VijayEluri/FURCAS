/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case023.__impl;

public class AbWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.tc.moin.testcases.case023.Ab> implements com.sap.tc.moin.testcases.case023.Ab,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The Ab wrapper
     */
    public AbWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case023.__impl.AbImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.tc.moin.testcases.case023.__impl.AbImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case023.__impl.AbImpl) getWrappedObject();
    }

    public com.sap.tc.moin.testcases.case023.Ab unwrap() {
        return (com.sap.tc.moin.testcases.case023.Ab) getWrappedObject();
    }
    
    public boolean exists(com.sap.tc.moin.testcases.case023.B23 _AToB, com.sap.tc.moin.testcases.case023.A23 _BToA) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getAToB(com.sap.tc.moin.testcases.case023.A23 _BToA) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getAToB(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getAToB(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getBToA(com.sap.tc.moin.testcases.case023.B23 _AToB) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getBToA(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getBToA(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.tc.moin.testcases.case023.B23 _AToB, com.sap.tc.moin.testcases.case023.A23 _BToA) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.tc.moin.testcases.case023.B23 _AToB, com.sap.tc.moin.testcases.case023.A23 _BToA) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AToB), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _BToA)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    public java.lang.Class<com.sap.tc.moin.testcases.case023.Ab> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case023.Ab.class;
    }

    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case023.Ab (Java Type)\ntestcases.case023.ab (MOF Type)"; //$NON-NLS-1$
    }    
}