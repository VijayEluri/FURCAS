/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.base.__impl;

public class AParametersOwnerWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.base.AParametersOwner> implements com.sap.ide.metamodel.webdynpro.base.AParametersOwner,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AParametersOwner wrapper
     */
    public AParametersOwnerWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.base.__impl.AParametersOwnerImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.base.__impl.AParametersOwnerImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.base.__impl.AParametersOwnerImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.base.AParametersOwner unwrap() {
        return (com.sap.ide.metamodel.webdynpro.base.AParametersOwner) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.base.Parameter _Parameters, com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getParameters(com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getParameters(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getParameters(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature getOwner(com.sap.ide.metamodel.webdynpro.base.Parameter _Parameters) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature) wrapResult(getCastWrappedObject().getOwner(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature) wrapResult(getCastWrappedObject().getOwner(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.base.Parameter _Parameters, com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.base.Parameter _Parameters, com.sap.ide.metamodel.webdynpro.base.ParameterizedFeature _Owner) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Parameters), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Owner)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.base.AParametersOwner> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.base.AParametersOwner.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.base.AParametersOwner (Java Type)\nWebDynpro.base.A_Parameters_Owner (MOF Type)"; //$NON-NLS-1$
    }    
}