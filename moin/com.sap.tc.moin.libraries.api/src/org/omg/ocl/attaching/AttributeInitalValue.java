/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AttributeInitalValue extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.attaching.AttributeInitalValue> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.attaching.AttributeInitalValue>("45ED2E29A286E6ED595D4D21383BDF80C5FFDA11", "sap.com/tc/moin/mof_1.4", "OCL", "Attaching", "AttributeInitalValue"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForInitialValue, org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.Attribute getAttributeForInitialValue(org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.OclExpression getInitialValue(com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForInitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForInitialValue, org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.mmi.model.Attribute _AttributeForInitialValue, org.omg.ocl.expressions.OclExpression _InitialValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}