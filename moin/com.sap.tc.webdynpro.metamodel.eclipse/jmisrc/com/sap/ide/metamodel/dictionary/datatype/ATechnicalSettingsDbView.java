/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ATechnicalSettingsDbView extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbView> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.ATechnicalSettingsDbView>("45DDACEFAE5136D1871D484201BDCF7B0C46DB19", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "A_TechnicalSettings_DbView"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings, com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings getTechnicalSettings(com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDbView getDbView(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings, com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalSettings _TechnicalSettings, com.sap.ide.metamodel.dictionary.datatype.DtDbView _DbView) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}