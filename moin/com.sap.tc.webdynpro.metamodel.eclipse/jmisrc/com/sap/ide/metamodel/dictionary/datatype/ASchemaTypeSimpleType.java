/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ASchemaTypeSimpleType extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ASchemaTypeSimpleType> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ASchemaTypeSimpleType>("45DDACEF38B433FB2644477D0C4C8BF0E1202A20", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "A_SchemaType_SimpleType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtSchemaType _SchemaType, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtSchemaType getSchemaType(com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtSimpleType getSimpleType(com.sap.ide.metamodel.dictionary.datatype.DtSchemaType _SchemaType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtSchemaType _SchemaType, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtSchemaType _SchemaType, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType _SimpleType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}