/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl;

public class AToolBarTrayWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray> implements com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AToolBarTray wrapper
     */
    public AToolBarTrayWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.AToolBarTrayImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.AToolBarTrayImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.AToolBarTrayImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar getToolBar(com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar) wrapResult(getCastWrappedObject().getToolBar(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar) wrapResult(getCastWrappedObject().getToolBar(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray getTray(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray) wrapResult(getCastWrappedObject().getTray(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray) wrapResult(getCastWrappedObject().getTray(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.view.uielement.ToolBar _ToolBar, com.sap.ide.metamodel.webdynpro.component.view.uielement.Tray _Tray) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ToolBar), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Tray)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.view.uielement.AToolBarTray (Java Type)\nWebDynpro.component.view.uielement.A_ToolBar_Tray (MOF Type)"; //$NON-NLS-1$
    }    
}