/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.__impl;

public class AComponentUsageGroupMembersWrapper extends com.sap.tc.moin.repository.core.jmi.reflect.RefAssociationWrapperImpl<com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers> implements com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers,com.sap.tc.moin.repository.Partitionable
{

    /**
     * The AComponentUsageGroupMembers wrapper
     */
    public AComponentUsageGroupMembersWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, com.sap.ide.metamodel.webdynpro.component.__impl.AComponentUsageGroupMembersImpl baseObject, boolean synchronize) {
        super(conn, baseObject, synchronize);
    }
    
    private com.sap.ide.metamodel.webdynpro.component.__impl.AComponentUsageGroupMembersImpl getCastWrappedObject() {
        return (com.sap.ide.metamodel.webdynpro.component.__impl.AComponentUsageGroupMembersImpl) getWrappedObject();
    }

    public com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers unwrap() {
        return (com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers) getWrappedObject();
    }
    
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup _ComponentUsageGroup, com.sap.ide.metamodel.webdynpro.component.ComponentUsage _Members) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().exists(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup getComponentUsageGroup(com.sap.ide.metamodel.webdynpro.component.ComponentUsage _Members) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup) wrapResult(getCastWrappedObject().getComponentUsageGroup(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup) wrapResult(getCastWrappedObject().getComponentUsageGroup(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public java.util.Collection getMembers(com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup _ComponentUsageGroup) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronizationManager.acquireReadLock();
                try {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return (java.util.Collection) wrapResult(getCastWrappedObject().getMembers(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup)));
                } finally {
                    synchronizationManager.releaseReadLock();
                }
       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return (java.util.Collection) wrapResult(getCastWrappedObject().getMembers(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup))); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean add(com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup _ComponentUsageGroup, com.sap.ide.metamodel.webdynpro.component.ComponentUsage _Members) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().add(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.ComponentUsageGroup _ComponentUsageGroup, com.sap.ide.metamodel.webdynpro.component.ComponentUsage _Members) throws com.sap.tc.moin.repository.mmi.reflect.JmiException
    {
        try {
            if (synchronize) {
                synchronized (synchronizationManager.getProhibitWriteSyncObject()) {
                    assertConnectionAlive();
                    attachConnectionIfRequired();
                    return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members));
                }       
            }
            assertConnectionAlive();
            attachConnectionIfRequired();
            return getCastWrappedObject().remove(connection, unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _ComponentUsageGroup), unwrapArg((com.sap.tc.moin.repository.mmi.reflect.RefBaseObject) _Members)); 
        } catch (com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            wrapJmiExceptionArgs(ex);
            throw ex;
        }
    }   

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers.class;
    }

    protected String metaObjectToString() {
        return "com.sap.ide.metamodel.webdynpro.component.AComponentUsageGroupMembers (Java Type)\nWebDynpro.component.A_componentUsageGroup_Members (MOF Type)"; //$NON-NLS-1$
    }    
}