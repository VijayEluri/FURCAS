/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.base.__impl;

public class AValidatorsAppClassWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass> implements com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AValidatorsAppClass wrapper
     */
    public AValidatorsAppClassWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.base.__impl.AValidatorsAppClassImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.base.__impl.AValidatorsAppClassImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.base.__impl.AValidatorsAppClassImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass unwrap() {
        return (com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.base.Validator _Validators, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getValidators(com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getValidators(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getValidators(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.base.AppClass getAppClass(com.sap.ide.metamodel.webdynpro.base.Validator _Validators) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.base.AppClass) wrapResult(getCastWrappedObject().getAppClass(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.base.AppClass) wrapResult(getCastWrappedObject().getAppClass(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.base.Validator _Validators, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.base.Validator _Validators, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Validators), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AppClass)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.base.AValidatorsAppClass (Java Type)\nWebDynpro.base.A_Validators_appClass (MOF Type)"; //$NON-NLS-1$
    }    
}