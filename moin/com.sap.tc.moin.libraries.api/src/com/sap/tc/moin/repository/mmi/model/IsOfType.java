/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface IsOfType extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.repository.mmi.model.IsOfType> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.tc.moin.repository.mmi.model.IsOfType>("45ED2E29DA5028C85512452C3856E282A65D065B", "sap.com/tc/moin/mof_1.4", "Model", "IsOfType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 


    // association interface
    public boolean exists(com.sap.tc.moin.repository.mmi.model.Classifier _Type, com.sap.tc.moin.repository.mmi.model.TypedElement _TypedElements) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.Classifier getType(com.sap.tc.moin.repository.mmi.model.TypedElement _TypedElements) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.TypedElement> getTypedElements(com.sap.tc.moin.repository.mmi.model.Classifier _Type) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.tc.moin.repository.mmi.model.Classifier _Type, com.sap.tc.moin.repository.mmi.model.TypedElement _TypedElements) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.tc.moin.repository.mmi.model.Classifier _Type, com.sap.tc.moin.repository.mmi.model.TypedElement _TypedElements) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}