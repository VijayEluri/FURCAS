/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case008.inheritance.__impl;

public class InheritancePackageWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageWrapperImpl<com.sap.tc.moin.testcases.case008.inheritance.__impl.InheritancePackageImpl> implements com.sap.tc.moin.testcases.case008.inheritance.InheritancePackage,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The InheritancePackage wrapper
     */
    public InheritancePackageWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.tc.moin.testcases.case008.inheritance.__impl.InheritancePackageImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }

    private com.sap.tc.moin.testcases.case008.inheritance.__impl.InheritancePackageImpl getCastWrappedObject() {
        return (com.sap.tc.moin.testcases.case008.inheritance.__impl.InheritancePackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.testcases.case008.inheritance.__impl.InheritancePackageImpl unwrap() {
        return (com.sap.tc.moin.testcases.case008.inheritance.__impl.InheritancePackageImpl) getWrappedObject();
    }
    
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getA8Inheritance()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getA8Inheritance(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getA8Inheritance(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getB8Inheritance()
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getB8Inheritance(connection));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.tc.moin.repository.mmi.reflect.RefClass) wrapResult(getCastWrappedObject().getB8Inheritance(connection)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    // methods for structure type creators
    public com.sap.tc.moin.testcases.case008.inheritance.SuperStructure1 createSuperStructure1(com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.tc.moin.testcases.case008.inheritance.SuperStructure1> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return wrapResult(getCastWrappedObject().createSuperStructure1(connection, structureFieldContainer));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return wrapResult(getCastWrappedObject().createSuperStructure1(connection, structureFieldContainer));
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.tc.moin.testcases.case008.inheritance.SubStructure1 createSubStructure1(com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.tc.moin.testcases.case008.inheritance.SubStructure1> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return wrapResult(getCastWrappedObject().createSubStructure1(connection, structureFieldContainer));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return wrapResult(getCastWrappedObject().createSubStructure1(connection, structureFieldContainer));
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.tc.moin.testcases.case008.inheritance.SubStructure2 createSubStructure2(com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.tc.moin.testcases.case008.inheritance.SubStructure2> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return wrapResult(getCastWrappedObject().createSubStructure2(connection, structureFieldContainer));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return wrapResult(getCastWrappedObject().createSubStructure2(connection, structureFieldContainer));
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.tc.moin.testcases.case008.inheritance.SuperStructure2 createSuperStructure2(com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.tc.moin.testcases.case008.inheritance.SuperStructure2> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return wrapResult(getCastWrappedObject().createSuperStructure2(connection, structureFieldContainer));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return wrapResult(getCastWrappedObject().createSuperStructure2(connection, structureFieldContainer));
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    public com.sap.tc.moin.testcases.case008.inheritance.SubStructureWithoutFields createSubStructureWithoutFields(com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.tc.moin.testcases.case008.inheritance.SubStructureWithoutFields> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return wrapResult(getCastWrappedObject().createSubStructureWithoutFields(connection, structureFieldContainer));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return wrapResult(getCastWrappedObject().createSubStructureWithoutFields(connection, structureFieldContainer));
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }

    
    public java.lang.Class<com.sap.tc.moin.testcases.case008.inheritance.InheritancePackage> get___JmiInterface() {
        return com.sap.tc.moin.testcases.case008.inheritance.InheritancePackage.class;
    }
    
    protected String metaObjectToString() {
        return "com.sap.tc.moin.testcases.case008.inheritance.InheritancePackage (Java Type)\ntestcases.case008.inheritance (MOF Type)"; //$NON-NLS-1$
    }
}