/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.project.__impl;

public class AInterfaceReferencesProjectPropertiesWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties> implements com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AInterfaceReferencesProjectProperties wrapper
     */
    public AInterfaceReferencesProjectPropertiesWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.project.__impl.AInterfaceReferencesProjectPropertiesImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.project.__impl.AInterfaceReferencesProjectPropertiesImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.project.__impl.AInterfaceReferencesProjectPropertiesImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties unwrap() {
        return (com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.project.LibraryReference _InterfaceReferences, com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.List getInterfaceReferences(com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List) wrapResult(getCastWrappedObject().getInterfaceReferences(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List) wrapResult(getCastWrappedObject().getInterfaceReferences(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.project.ProjectProperties getProjectProperties(com.sap.ide.metamodel.webdynpro.project.LibraryReference _InterfaceReferences) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.project.ProjectProperties) wrapResult(getCastWrappedObject().getProjectProperties(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.project.ProjectProperties) wrapResult(getCastWrappedObject().getProjectProperties(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.project.LibraryReference _InterfaceReferences, com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.project.LibraryReference _InterfaceReferences, com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _InterfaceReferences), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ProjectProperties)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.project.AInterfaceReferencesProjectProperties (Java Type)\nWebDynpro.project.A_InterfaceReferences_projectProperties (MOF Type)"; //$NON-NLS-1$
    }    
}