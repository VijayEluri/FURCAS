/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl;

public class ADefinitionViewElementAggregationWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation> implements com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ADefinitionViewElementAggregation wrapper
     */
    public ADefinitionViewElementAggregationWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.ADefinitionViewElementAggregationImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.ADefinitionViewElementAggregationImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.view.uielement.__impl.ADefinitionViewElementAggregationImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _Definition, com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElementAggregation _ViewElementAggregation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef getDefinition(com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElementAggregation _ViewElementAggregation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef) wrapResult(getCastWrappedObject().getDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef) wrapResult(getCastWrappedObject().getDefinition(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getViewElementAggregation(com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _Definition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getViewElementAggregation(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getViewElementAggregation(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _Definition, com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElementAggregation _ViewElementAggregation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _Definition, com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElementAggregation _ViewElementAggregation) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Definition), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ViewElementAggregation)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.view.uielement.ADefinitionViewElementAggregation (Java Type)\nWebDynpro.component.view.uielement.A_Definition_viewElementAggregation (MOF Type)"; //$NON-NLS-1$
    }    
}