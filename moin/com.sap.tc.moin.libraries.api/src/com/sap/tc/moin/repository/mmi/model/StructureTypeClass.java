/**
 * Generated by the MOIN JMI Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model;
/**
 * A StructureType is a data type describing tuples with named fields.  The element contains one or more StructureFields.
 * <p>
 * StructureTypes are generalizable in MOIN.
 * <p>
 * A sub structure inherits all fields of its super structures. It is possible to define initial values for structure fields in the structure where
 * the field belongs to and in a sub structure. In the latter case the initial value overrides the initial value set in the super structure, if defined.
 * <p>
 * In the case of multiple inheritance where every super structure defines an initial value for a field the sub structure has to override the
 * initial value for the field in order to avoid unambiguities.
 * This interface is not intended to be implemented by clients.
 */
@Deprecated
public interface StructureTypeClass extends com.sap.tc.moin.repository.mmi.reflect.RefClass { 

    // class extent descriptor   
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.model.StructureTypeClass, com.sap.tc.moin.repository.mmi.model.StructureType> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.model.StructureTypeClass, com.sap.tc.moin.repository.mmi.model.StructureType>("45ED2E298D5E991960034F400D80DA4E826005D8", "sap.com/tc/moin/mof_1.4", "Model", "StructureType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 

    
    // class creators
    public com.sap.tc.moin.repository.mmi.model.StructureType createStructureType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.StructureType createStructureTypeInPartition(com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.StructureType createStructureType(java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.tc.moin.repository.mmi.model.StructureType createStructureTypeInPartition(java.lang.String name, java.lang.String annotation, boolean isRoot, boolean isLeaf, boolean isAbstract, com.sap.tc.moin.repository.mmi.model.VisibilityKind visibility, com.sap.tc.moin.repository.ModelPartition partition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;    

    

}