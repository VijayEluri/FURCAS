/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case010;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface OneToManyChangeable extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case010.OneToManyChangeable> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case010.OneToManyChangeable>("45F120A549F4BCE8C69B48AB095DC5A6D9B1DA5D", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case010", "oneToManyChangeable"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.tc.moin.testcases.case010.A10 _OneChangeable, com.sap.tc.moin.testcases.case010.B10 _ManyChangeable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case010.A10 getOneChangeable(com.sap.tc.moin.testcases.case010.B10 _ManyChangeable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.tc.moin.testcases.case010.B10> getManyChangeable(com.sap.tc.moin.testcases.case010.A10 _OneChangeable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.testcases.case010.A10 _OneChangeable, com.sap.tc.moin.testcases.case010.B10 _ManyChangeable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.testcases.case010.A10 _OneChangeable, com.sap.tc.moin.testcases.case010.B10 _ManyChangeable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}