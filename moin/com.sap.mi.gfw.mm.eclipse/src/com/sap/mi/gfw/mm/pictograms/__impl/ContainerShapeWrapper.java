/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms.__impl;

public class ContainerShapeWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefObjectWrapperImpl<com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl> implements com.sap.mi.gfw.mm.pictograms.ContainerShape,com.sap.tc.moin.repository.Partitionable {

    
    static {
    }

    public ContainerShapeWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl getCastWrappedObject() {
        return (com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl) getWrappedObject();
    }
    
    private com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl getCastWrappedObject(com.sap.tc.moin.repository.core.CorePartitionable resolved) {
        return (com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl) resolved;
    }
    
    public com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl unwrap() {
        return (com.sap.mi.gfw.mm.pictograms.__impl.ContainerShapeImpl) getWrappedObject();
    }
        
    // methods for attributes
    public java.util.Collection<com.sap.mi.gfw.mm.pictograms.Property> getProperties() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection<com.sap.mi.gfw.mm.pictograms.Property>) wrapResult(getCastWrappedObject().getProperties(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection<com.sap.mi.gfw.mm.pictograms.Property>) wrapResult(getCastWrappedObject().getProperties(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public boolean isVisible() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).isVisible();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().isVisible();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().isVisible(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setVisible(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setVisible(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setVisible(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public boolean isActive() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        com.sap.tc.moin.repository.core.CorePartitionable resolved = mriReference.getIfResolved();
        if (resolved != null) {
            return getCastWrappedObject(resolved).isActive();
        }
            try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().isActive();
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().isActive(); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public void setActive(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setActive(connection, newValue);
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setActive(connection, newValue);
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

     
    // methods for references
    public com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm getGraphicsAlgorithm() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm) wrapResult(getCastWrappedObject().getGraphicsAlgorithm(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm) wrapResult(getCastWrappedObject().getGraphicsAlgorithm(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setGraphicsAlgorithm(com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setGraphicsAlgorithm(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setGraphicsAlgorithm(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.mi.gfw.mm.links.PictogramLink getLink() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.links.PictogramLink) wrapResult(getCastWrappedObject().getLink(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.links.PictogramLink) wrapResult(getCastWrappedObject().getLink(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setLink(com.sap.mi.gfw.mm.links.PictogramLink newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setLink(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setLink(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.util.Collection<com.sap.mi.gfw.mm.pictograms.Anchor> getAnchors() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection<com.sap.mi.gfw.mm.pictograms.Anchor>) wrapResult(getCastWrappedObject().getAnchors(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection<com.sap.mi.gfw.mm.pictograms.Anchor>) wrapResult(getCastWrappedObject().getAnchors(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



    public com.sap.mi.gfw.mm.pictograms.ContainerShape getContainer() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.mi.gfw.mm.pictograms.ContainerShape) wrapResult(getCastWrappedObject().getContainer(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.mi.gfw.mm.pictograms.ContainerShape) wrapResult(getCastWrappedObject().getContainer(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public void setContainer(com.sap.mi.gfw.mm.pictograms.ContainerShape newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    getCastWrappedObject().setContainer(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
                }       
            }
            else {
                assertConnectionAlive();
                attachConnectionIfRequired();
                getCastWrappedObject().setContainer(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) newValue));
            } 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public java.util.List<com.sap.mi.gfw.mm.pictograms.Shape> getChildren() throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.List<com.sap.mi.gfw.mm.pictograms.Shape>) wrapResult(getCastWrappedObject().getChildren(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.List<com.sap.mi.gfw.mm.pictograms.Shape>) wrapResult(getCastWrappedObject().getChildren(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }



   
    // methods for modeled operations
    
    // methods for internal modeled operations

    // reflective methods
    

    // get the JMI interface
    public java.lang.Class<com.sap.mi.gfw.mm.pictograms.ContainerShape> get___JmiInterface() {
        return com.sap.mi.gfw.mm.pictograms.ContainerShape.class;
    }

    // to String
    protected String metaObjectToString() {
        return "com.sap.mi.gfw.mm.pictograms.ContainerShape (Java Type)\npictograms.ContainerShape (MOF Type)"; //$NON-NLS-1$
    }    
}