/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ASettingDefinitionModelClassPropertySetting extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelClassPropertySetting> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelClassPropertySetting>("45DDACEF447E9B74E58048DF3B92AF0E2D12C19C", "sap.com/tc/moin/webdynpro", "WebDynpro", "model", "A_SettingDefinition_modelClassPropertySetting"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ModelClassPropertySettingDefintion _SettingDefinition, com.sap.ide.metamodel.webdynpro.model.ModelClassPropertySetting _ModelClassPropertySetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.ModelClassPropertySettingDefintion getSettingDefinition(com.sap.ide.metamodel.webdynpro.model.ModelClassPropertySetting _ModelClassPropertySetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.model.ModelClassPropertySetting> getModelClassPropertySetting(com.sap.ide.metamodel.webdynpro.framework.ModelClassPropertySettingDefintion _SettingDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ModelClassPropertySettingDefintion _SettingDefinition, com.sap.ide.metamodel.webdynpro.model.ModelClassPropertySetting _ModelClassPropertySetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ModelClassPropertySettingDefintion _SettingDefinition, com.sap.ide.metamodel.webdynpro.model.ModelClassPropertySetting _ModelClassPropertySetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}