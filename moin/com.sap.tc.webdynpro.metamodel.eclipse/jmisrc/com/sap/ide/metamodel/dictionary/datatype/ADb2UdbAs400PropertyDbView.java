/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ADb2UdbAs400PropertyDbView extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbView> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ADb2UdbAs400PropertyDbView>("45DDACEF2203D967E7BB4B9E3500D8048FEBCD84", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "A_Db2UdbAs400Property_DbView"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdbAs400ViewProperty _Db2UdbAs400Property, com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDb2UdbAs400ViewProperty getDb2UdbAs400Property(com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDbView getDbView(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdbAs400ViewProperty _Db2UdbAs400Property) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdbAs400ViewProperty _Db2UdbAs400Property, com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtDb2UdbAs400ViewProperty _Db2UdbAs400Property, com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}