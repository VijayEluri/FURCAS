/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.common.template.__impl;

public class ATemplateSettingsTemplateInstanceWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance> implements com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ATemplateSettingsTemplateInstance wrapper
     */
    public ATemplateSettingsTemplateInstanceWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.common.template.__impl.ATemplateSettingsTemplateInstanceImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.common.template.__impl.ATemplateSettingsTemplateInstanceImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.common.template.__impl.ATemplateSettingsTemplateInstanceImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance unwrap() {
        return (com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.common.template.TemplateSetting _TemplateSettings, com.sap.ide.metamodel.common.template.TemplateInstance _TemplateInstance) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getTemplateSettings(com.sap.ide.metamodel.common.template.TemplateInstance _TemplateInstance) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getTemplateSettings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getTemplateSettings(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.common.template.TemplateInstance getTemplateInstance(com.sap.ide.metamodel.common.template.TemplateSetting _TemplateSettings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.common.template.TemplateInstance) wrapResult(getCastWrappedObject().getTemplateInstance(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.common.template.TemplateInstance) wrapResult(getCastWrappedObject().getTemplateInstance(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.common.template.TemplateSetting _TemplateSettings, com.sap.ide.metamodel.common.template.TemplateInstance _TemplateInstance) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.common.template.TemplateSetting _TemplateSettings, com.sap.ide.metamodel.common.template.TemplateInstance _TemplateInstance) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateSettings), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TemplateInstance)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance> get___JmiInterface() {
        return com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.common.template.ATemplateSettingsTemplateInstance (Java Type)\nCommon.template.A_TemplateSettings_TemplateInstance (MOF Type)"; //$NON-NLS-1$
    }    
}