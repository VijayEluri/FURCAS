/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model.__impl;

public class ASettingsModelRelationWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation> implements com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ASettingsModelRelation wrapper
     */
    public ASettingsModelRelationWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.model.__impl.ASettingsModelRelationImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.model.__impl.ASettingsModelRelationImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.model.__impl.ASettingsModelRelationImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation unwrap() {
        return (com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.model.ModelRelationSetting _Settings, com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getSettings(com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getSettings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getSettings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.model.ModelRelation getModelRelation(com.sap.ide.metamodel.webdynpro.model.ModelRelationSetting _Settings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.model.ModelRelation) wrapResult(getCastWrappedObject().getModelRelation(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.model.ModelRelation) wrapResult(getCastWrappedObject().getModelRelation(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.model.ModelRelationSetting _Settings, com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.model.ModelRelationSetting _Settings, com.sap.ide.metamodel.webdynpro.model.ModelRelation _ModelRelation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Settings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelRelation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation (Java Type)\nWebDynpro.model.A_Settings_ModelRelation (MOF Type)"; //$NON-NLS-1$
    }    
}