/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case006;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ReferenceAtComponent extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case006.ReferenceAtComponent> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case006.ReferenceAtComponent>("45F120A5ABFF703758D84FAB0AC9D0A6EE99728A", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case006", "ReferenceAtComponent"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.tc.moin.testcases.case006.C6 _Y, com.sap.tc.moin.testcases.case006.B6 _X) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case006.C6 getY(com.sap.tc.moin.testcases.case006.B6 _X) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case006.B6 getX(com.sap.tc.moin.testcases.case006.C6 _Y) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.testcases.case006.C6 _Y, com.sap.tc.moin.testcases.case006.B6 _X) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.testcases.case006.C6 _Y, com.sap.tc.moin.testcases.case006.B6 _X) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}