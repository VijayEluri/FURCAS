/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.application.__impl;

public class APropertyDefinitionApplicationPropertyWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty> implements com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The APropertyDefinitionApplicationProperty wrapper
     */
    public APropertyDefinitionApplicationPropertyWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.application.__impl.APropertyDefinitionApplicationPropertyImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.application.__impl.APropertyDefinitionApplicationPropertyImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.application.__impl.APropertyDefinitionApplicationPropertyImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty unwrap() {
        return (com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinition, com.sap.ide.metamodel.webdynpro.application.ApplicationProperty _ApplicationProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition getPropertyDefinition(com.sap.ide.metamodel.webdynpro.application.ApplicationProperty _ApplicationProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition) wrapResult(getCastWrappedObject().getPropertyDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition) wrapResult(getCastWrappedObject().getPropertyDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getApplicationProperty(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getApplicationProperty(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getApplicationProperty(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinition, com.sap.ide.metamodel.webdynpro.application.ApplicationProperty _ApplicationProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinition, com.sap.ide.metamodel.webdynpro.application.ApplicationProperty _ApplicationProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ApplicationProperty)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty (Java Type)\nWebDynpro.application.A_PropertyDefinition_applicationProperty (MOF Type)"; //$NON-NLS-1$
    }    
}