/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.uielib.__impl;

public class ADefaultLayoutDataDefinitionViewElementAggregationDefWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef> implements com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ADefaultLayoutDataDefinitionViewElementAggregationDef wrapper
     */
    public ADefaultLayoutDataDefinitionViewElementAggregationDefWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ADefaultLayoutDataDefinitionViewElementAggregationDefImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ADefaultLayoutDataDefinitionViewElementAggregationDefImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ADefaultLayoutDataDefinitionViewElementAggregationDefImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef unwrap() {
        return (com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultLayoutDataDefinition, com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition getDefaultLayoutDataDefinition(com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition) wrapResult(getCastWrappedObject().getDefaultLayoutDataDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition) wrapResult(getCastWrappedObject().getDefaultLayoutDataDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef getViewElementAggregationDef(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultLayoutDataDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef) wrapResult(getCastWrappedObject().getViewElementAggregationDef(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef) wrapResult(getCastWrappedObject().getViewElementAggregationDef(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultLayoutDataDefinition, com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.uielib.LayoutDataDefinition _DefaultLayoutDataDefinition, com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _DefaultLayoutDataDefinition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregationDef)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.framework.uielib.ADefaultLayoutDataDefinitionViewElementAggregationDef (Java Type)\nWebDynpro.framework.uielib.A_DefaultLayoutDataDefinition_viewElementAggregationDef (MOF Type)"; //$NON-NLS-1$
    }    
}