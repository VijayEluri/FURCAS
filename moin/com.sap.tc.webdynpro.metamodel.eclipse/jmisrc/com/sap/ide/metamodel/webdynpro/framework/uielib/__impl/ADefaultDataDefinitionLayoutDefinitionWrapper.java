/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.uielib.__impl;

public class ADefaultDataDefinitionLayoutDefinitionWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition> implements com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ADefaultDataDefinitionLayoutDefinition wrapper
     */
    public ADefaultDataDefinitionLayoutDefinitionWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ADefaultDataDefinitionLayoutDefinitionImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ADefaultDataDefinitionLayoutDefinitionImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ADefaultDataDefinitionLayoutDefinitionImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition unwrap() {
        return (com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultDataDefinition, com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition _LayoutDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition getDefaultDataDefinition(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition _LayoutDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition) wrapResult(getCastWrappedObject().getDefaultDataDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition) wrapResult(getCastWrappedObject().getDefaultDataDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition getLayoutDefinition(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultDataDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition) wrapResult(getCastWrappedObject().getLayoutDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition) wrapResult(getCastWrappedObject().getLayoutDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultDataDefinition, com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition _LayoutDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultDataDefinition, com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDefinition _LayoutDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _LayoutDefinition)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultDataDefinitionLayoutDefinition (Java Type)\nWebDynpro.framework.uielib.A_DefaultDataDefinition_layoutDefinition (MOF Type)"; //$NON-NLS-1$
    }    
}