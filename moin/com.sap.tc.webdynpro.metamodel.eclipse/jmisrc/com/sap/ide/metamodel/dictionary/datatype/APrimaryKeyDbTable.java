/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface APrimaryKeyDbTable extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.APrimaryKeyDbTable> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.APrimaryKeyDbTable>("45DDACEF4EBE6F77AD7C42821184EB51E659AD21", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "A_PrimaryKey_DbTable"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtPrimaryKey _PrimaryKey, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtPrimaryKey getPrimaryKey(com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDbTable getDbTable(com.sap.ide.metamodel.dictionary.datatype.DtPrimaryKey _PrimaryKey) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtPrimaryKey _PrimaryKey, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtPrimaryKey _PrimaryKey, com.sap.ide.metamodel.dictionary.datatype.DtDbTable _DbTable) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}