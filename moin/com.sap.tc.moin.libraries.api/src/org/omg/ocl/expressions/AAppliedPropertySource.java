/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.expressions;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AAppliedPropertySource extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.expressions.AAppliedPropertySource> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.expressions.AAppliedPropertySource>("45ED2E299BB9CF41F9C44C763865EFB27EADFA32", "sap.com/tc/moin/mof_1.4", "OCL", "Expressions", "A_appliedProperty_source"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(org.omg.ocl.expressions.PropertyCallExp _AppliedProperty, org.omg.ocl.expressions.OclExpression _Source) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.PropertyCallExp getAppliedProperty(org.omg.ocl.expressions.OclExpression _Source) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.OclExpression getSource(org.omg.ocl.expressions.PropertyCallExp _AppliedProperty) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(org.omg.ocl.expressions.PropertyCallExp _AppliedProperty, org.omg.ocl.expressions.OclExpression _Source) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(org.omg.ocl.expressions.PropertyCallExp _AppliedProperty, org.omg.ocl.expressions.OclExpression _Source) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}