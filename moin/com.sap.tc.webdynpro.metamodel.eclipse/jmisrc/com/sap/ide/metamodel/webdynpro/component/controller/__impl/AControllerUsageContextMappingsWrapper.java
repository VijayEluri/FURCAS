/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.controller.__impl;

public class AControllerUsageContextMappingsWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings> implements com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AControllerUsageContextMappings wrapper
     */
    public AControllerUsageContextMappingsWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.controller.__impl.AControllerUsageContextMappingsImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.controller.__impl.AControllerUsageContextMappingsImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.controller.__impl.AControllerUsageContextMappingsImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage _ControllerUsage, com.sap.ide.metamodel.webdynpro.component.controller.ContextElementMapping _ContextMappings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage getControllerUsage(com.sap.ide.metamodel.webdynpro.component.controller.ContextElementMapping _ContextMappings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage) wrapResult(getCastWrappedObject().getControllerUsage(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage) wrapResult(getCastWrappedObject().getControllerUsage(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getContextMappings(com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage _ControllerUsage) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getContextMappings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getContextMappings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage _ControllerUsage, com.sap.ide.metamodel.webdynpro.component.controller.ContextElementMapping _ContextMappings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.controller.ControllerUsage _ControllerUsage, com.sap.ide.metamodel.webdynpro.component.controller.ContextElementMapping _ContextMappings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ControllerUsage), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ContextMappings)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.controller.AControllerUsageContextMappings (Java Type)\nWebDynpro.component.controller.A_ControllerUsage_ContextMappings (MOF Type)"; //$NON-NLS-1$
    }    
}