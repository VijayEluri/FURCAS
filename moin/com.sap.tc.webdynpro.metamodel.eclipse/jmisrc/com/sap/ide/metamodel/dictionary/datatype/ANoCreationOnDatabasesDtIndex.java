/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ANoCreationOnDatabasesDtIndex extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ANoCreationOnDatabasesDtIndex> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ANoCreationOnDatabasesDtIndex>("45DDACEFAC5ED70AC3F34BB237F1F3BD5C962F9D", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "A_NoCreationOnDatabases_DtIndex"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtNoCreateCondition _NoCreationOnDatabases, com.sap.ide.metamodel.dictionary.datatype.DtDbIndex _DtIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtNoCreateCondition> getNoCreationOnDatabases(com.sap.ide.metamodel.dictionary.datatype.DtDbIndex _DtIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDbIndex getDtIndex(com.sap.ide.metamodel.dictionary.datatype.DtNoCreateCondition _NoCreationOnDatabases) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtNoCreateCondition _NoCreationOnDatabases, com.sap.ide.metamodel.dictionary.datatype.DtDbIndex _DtIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtNoCreateCondition _NoCreationOnDatabases, com.sap.ide.metamodel.dictionary.datatype.DtDbIndex _DtIndex) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}