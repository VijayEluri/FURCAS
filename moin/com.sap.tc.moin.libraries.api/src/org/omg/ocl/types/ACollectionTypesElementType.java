/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.types;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ACollectionTypesElementType extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.types.ACollectionTypesElementType> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.types.ACollectionTypesElementType>("45ED2E29CE5CF0446B2B400712B1D80EAAB445BB", "sap.com/tc/moin/mof_1.4", "OCL", "Types", "A_collectionTypes_elementType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(org.omg.ocl.types.CollectionType _CollectionTypes, com.sap.tc.moin.repository.mmi.model.Classifier _ElementType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<org.omg.ocl.types.CollectionType> getCollectionTypes(com.sap.tc.moin.repository.mmi.model.Classifier _ElementType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.Classifier getElementType(org.omg.ocl.types.CollectionType _CollectionTypes) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(org.omg.ocl.types.CollectionType _CollectionTypes, com.sap.tc.moin.repository.mmi.model.Classifier _ElementType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(org.omg.ocl.types.CollectionType _CollectionTypes, com.sap.tc.moin.repository.mmi.model.Classifier _ElementType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}