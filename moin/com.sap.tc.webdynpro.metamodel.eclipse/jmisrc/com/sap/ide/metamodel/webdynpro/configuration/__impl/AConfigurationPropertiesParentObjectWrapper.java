/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration.__impl;

public class AConfigurationPropertiesParentObjectWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject> implements com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AConfigurationPropertiesParentObject wrapper
     */
    public AConfigurationPropertiesParentObjectWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigurationPropertiesParentObjectImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigurationPropertiesParentObjectImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigurationPropertiesParentObjectImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject unwrap() {
        return (com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty _ConfigurationProperties, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getConfigurationProperties(com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getConfigurationProperties(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getConfigurationProperties(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject getParentObject(com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty _ConfigurationProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject) wrapResult(getCastWrappedObject().getParentObject(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject) wrapResult(getCastWrappedObject().getParentObject(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty _ConfigurationProperties, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty _ConfigurationProperties, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ParentObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ConfigurationProperties), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ParentObject)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject (Java Type)\nWebDynpro.configuration.A_ConfigurationProperties_ParentObject (MOF Type)"; //$NON-NLS-1$
    }    
}