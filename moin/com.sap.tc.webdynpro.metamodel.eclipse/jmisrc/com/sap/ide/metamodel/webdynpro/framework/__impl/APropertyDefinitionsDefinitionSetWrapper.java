/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.__impl;

public class APropertyDefinitionsDefinitionSetWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet> implements com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The APropertyDefinitionsDefinitionSet wrapper
     */
    public APropertyDefinitionsDefinitionSetWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.framework.__impl.APropertyDefinitionsDefinitionSetImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.framework.__impl.APropertyDefinitionsDefinitionSetImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.framework.__impl.APropertyDefinitionsDefinitionSetImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet unwrap() {
        return (com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinitions, com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet _DefinitionSet) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getPropertyDefinitions(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet _DefinitionSet) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getPropertyDefinitions(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getPropertyDefinitions(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet getDefinitionSet(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet) wrapResult(getCastWrappedObject().getDefinitionSet(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet) wrapResult(getCastWrappedObject().getDefinitionSet(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinitions, com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet _DefinitionSet) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinition _PropertyDefinitions, com.sap.ide.metamodel.webdynpro.framework.ApplicationPropertyDefinitionSet _DefinitionSet) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _PropertyDefinitions), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefinitionSet)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.framework.APropertyDefinitionsDefinitionSet (Java Type)\nWebDynpro.framework.A_PropertyDefinitions_DefinitionSet (MOF Type)"; //$NON-NLS-1$
    }    
}