/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype.__impl;

public class DtListWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl> implements com.sap.ide.metamodel.dictionary.datatype.DtList,com.sap.tc.moin.repository.Partitionable {


    static {
    }

    public DtListWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    @SuppressWarnings("unused")
    private com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl) getWrappedObject();
    }
    
    private com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl) resolved;
    }
    
    public com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl unwrap() {
        return (com.sap.ide.metamodel.dictionary.datatype.__impl.DtListImpl) getWrappedObject();
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

    public java.lang.String getPrefix() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getPrefix();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getPrefix();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getPrefix(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setPrefix(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setPrefix(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setPrefix(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public boolean isToDeploy() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).isToDeploy();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().isToDeploy();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().isToDeploy(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setToDeploy(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setToDeploy(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setToDeploy(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.lang.String getBackendName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).getBackendName();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().getBackendName();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().getBackendName(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setBackendName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setBackendName(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setBackendName(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

     
    // methods for references
    public java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance> getTemplateInstances() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>) wrapResult(getCastWrappedObject().getTemplateInstances(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>) wrapResult(getCastWrappedObject().getTemplateInstances(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram> getDiagrams() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>) wrapResult(getCastWrappedObject().getDiagrams(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>) wrapResult(getCastWrappedObject().getDiagrams(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public com.sap.ide.metamodel.common.DocumentationObject getDocumentationObject() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.common.DocumentationObject) wrapResult(getCastWrappedObject().getDocumentationObject(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.common.DocumentationObject) wrapResult(getCastWrappedObject().getDocumentationObject(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setDocumentationObject(com.sap.ide.metamodel.common.DocumentationObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setDocumentationObject(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setDocumentationObject(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.dictionary.datatype.DtIndex getIndex() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtIndex) wrapResult(getCastWrappedObject().getIndex(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtIndex) wrapResult(getCastWrappedObject().getIndex(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setIndex(com.sap.ide.metamodel.dictionary.datatype.DtIndex newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setIndex(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setIndex(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.dictionary.datatype.DtLogicalDictionary getLogicalDictionary() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtLogicalDictionary) wrapResult(getCastWrappedObject().getLogicalDictionary(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtLogicalDictionary) wrapResult(getCastWrappedObject().getLogicalDictionary(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setLogicalDictionary(com.sap.ide.metamodel.dictionary.datatype.DtLogicalDictionary newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setLogicalDictionary(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setLogicalDictionary(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.ide.metamodel.dictionary.datatype.DtDataType getUsedType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.dictionary.datatype.DtDataType) wrapResult(getCastWrappedObject().getUsedType(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.dictionary.datatype.DtDataType) wrapResult(getCastWrappedObject().getUsedType(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setUsedType(com.sap.ide.metamodel.dictionary.datatype.DtDataType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setUsedType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setUsedType(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
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
    public java.lang.Class<com.sap.ide.metamodel.dictionary.datatype.DtList> get___JmiInterface() {
        return com.sap.ide.metamodel.dictionary.datatype.DtList.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.dictionary.datatype.DtList (Java Type)\nDictionary.datatype.DtList (MOF Type)"; //$NON-NLS-1$
    }    
}