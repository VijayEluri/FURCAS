/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcases.case004;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ComposesCsOrdered extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case004.ComposesCsOrdered> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.testcases.case004.ComposesCsOrdered>("45F56B677CF18E3395C244F203B9EB5C2158434A", "test.sap.com/tc/moin/metamodel/testcases", "testcases", "case004", "composesCsOrdered"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.tc.moin.testcases.case004.F4 _MyF, com.sap.tc.moin.testcases.case004.C4 _MyCsOrdered) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.testcases.case004.F4 getMyF(com.sap.tc.moin.testcases.case004.C4 _MyCsOrdered) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.tc.moin.testcases.case004.C4> getMyCsOrdered(com.sap.tc.moin.testcases.case004.F4 _MyF) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.testcases.case004.F4 _MyF, com.sap.tc.moin.testcases.case004.C4 _MyCsOrdered) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.testcases.case004.F4 _MyF, com.sap.tc.moin.testcases.case004.C4 _MyCsOrdered) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}