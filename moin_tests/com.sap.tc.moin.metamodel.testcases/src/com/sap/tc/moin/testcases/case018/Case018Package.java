/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case018;

/**
 * Test of metamodel federation, i.e. use other metamodels
 * This interface is not intended to be implemented by clients.
 */
public interface Case018Package extends com.sap.tc.moin.repository.mmi.reflect.RefPackage
{
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<com.sap.tc.moin.testcases.case018.Case018Package> PACKAGE_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<com.sap.tc.moin.testcases.case018.Case018Package>("45F120A54B2A4D1EB8C64BA004EDBB6785EB499D", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case018"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getA18();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getB18();
    // associations
    public com.sap.tc.moin.testcases.case018.UsesA1FromFoundation getUsesA1FromFoundation();
}