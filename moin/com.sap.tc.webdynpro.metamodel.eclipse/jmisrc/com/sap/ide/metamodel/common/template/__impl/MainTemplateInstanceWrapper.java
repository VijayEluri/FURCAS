/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.common.template.__impl;

public class MainTemplateInstanceWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl> implements com.sap.ide.metamodel.common.template.MainTemplateInstance,com.sap.tc.moin.repository.Partitionable {


    static {
    }

    public MainTemplateInstanceWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    @SuppressWarnings("unused")
    private com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl) getWrappedObject();
    }
    
    private com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl) resolved;
    }
    
    public com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl unwrap() {
        return (com.sap.ide.metamodel.common.template.__impl.MainTemplateInstanceImpl) getWrappedObject();
    }
        
    // methods for attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getName();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getName();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getName(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setName(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setName(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

     
    // methods for references
    public java.util.List<com.sap.ide.metamodel.common.template.TemplateSetting> getTemplateSettings() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.ide.metamodel.common.template.TemplateSetting>) wrapResult(getCastWrappedObject().getTemplateSettings(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.ide.metamodel.common.template.TemplateSetting>) wrapResult(getCastWrappedObject().getTemplateSettings(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public java.util.List<com.sap.ide.metamodel.common.template.TemplateMarker> getTemplateMarkers() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.ide.metamodel.common.template.TemplateMarker>) wrapResult(getCastWrappedObject().getTemplateMarkers(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.ide.metamodel.common.template.TemplateMarker>) wrapResult(getCastWrappedObject().getTemplateMarkers(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.common.template.MainTemplateInstance> get___JmiInterface() {
        return com.sap.ide.metamodel.common.template.MainTemplateInstance.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.common.template.MainTemplateInstance (Java Type)\nCommon.template.MainTemplateInstance (MOF Type)"; //$NON-NLS-1$
    }    
}