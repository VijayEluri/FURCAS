/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.__impl;

public class AModelSettingDefinitionsModelTypeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType> implements com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AModelSettingDefinitionsModelType wrapper
     */
    public AModelSettingDefinitionsModelTypeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.framework.__impl.AModelSettingDefinitionsModelTypeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.framework.__impl.AModelSettingDefinitionsModelTypeImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.framework.__impl.AModelSettingDefinitionsModelTypeImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType unwrap() {
        return (com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition _ModelSettingDefinitions, com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getModelSettingDefinitions(com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getModelSettingDefinitions(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getModelSettingDefinitions(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.ModelType getModelType(com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition _ModelSettingDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.ModelType) wrapResult(getCastWrappedObject().getModelType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.ModelType) wrapResult(getCastWrappedObject().getModelType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition _ModelSettingDefinitions, com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ModelSettingDefinition _ModelSettingDefinitions, com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelSettingDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ModelType)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.framework.AModelSettingDefinitionsModelType (Java Type)\nWebDynpro.framework.A_ModelSettingDefinitions_ModelType (MOF Type)"; //$NON-NLS-1$
    }    
}