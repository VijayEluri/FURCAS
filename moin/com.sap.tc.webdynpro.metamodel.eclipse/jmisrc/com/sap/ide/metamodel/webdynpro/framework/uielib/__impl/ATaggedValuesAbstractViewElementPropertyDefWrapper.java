/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.uielib.__impl;

public class ATaggedValuesAbstractViewElementPropertyDefWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef> implements com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The ATaggedValuesAbstractViewElementPropertyDef wrapper
     */
    public ATaggedValuesAbstractViewElementPropertyDefWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ATaggedValuesAbstractViewElementPropertyDefImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ATaggedValuesAbstractViewElementPropertyDefImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.framework.uielib.__impl.ATaggedValuesAbstractViewElementPropertyDefImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef unwrap() {
        return (com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues, com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef _AbstractViewElementPropertyDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getTaggedValues(com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef _AbstractViewElementPropertyDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getTaggedValues(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getTaggedValues(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef getAbstractViewElementPropertyDef(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef) wrapResult(getCastWrappedObject().getAbstractViewElementPropertyDef(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef) wrapResult(getCastWrappedObject().getAbstractViewElementPropertyDef(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues, com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef _AbstractViewElementPropertyDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues, com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef _AbstractViewElementPropertyDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _TaggedValues), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _AbstractViewElementPropertyDef)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesAbstractViewElementPropertyDef (Java Type)\nWebDynpro.framework.uielib.A_TaggedValues_abstractViewElementPropertyDef (MOF Type)"; //$NON-NLS-1$
    }    
}