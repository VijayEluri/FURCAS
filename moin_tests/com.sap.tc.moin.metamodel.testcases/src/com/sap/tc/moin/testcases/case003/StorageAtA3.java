/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case003;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface StorageAtA3 extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case003.StorageAtA3> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case003.StorageAtA3>("45F120A511DCF8957F674BCA1874EEC8A71CBFF1", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case003", "StorageAtA3"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.tc.moin.testcases.case003.A3 _Z, com.sap.tc.moin.testcases.case003.B3 _B3) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case003.A3 getZ(com.sap.tc.moin.testcases.case003.B3 _B3) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case003.B3 getB3(com.sap.tc.moin.testcases.case003.A3 _Z) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.testcases.case003.A3 _Z, com.sap.tc.moin.testcases.case003.B3 _B3) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.testcases.case003.A3 _Z, com.sap.tc.moin.testcases.case003.B3 _B3) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}