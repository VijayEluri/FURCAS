/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ASettingDefinitionModelRelationRoleSetting extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelRelationRoleSetting> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelRelationRoleSetting>("45DDACEFA75DF23368564E2C149D95882A99AB20", "sap.com/tc/moin/webdynpro", "WebDynpro", "model", "A_SettingDefinition_modelRelationRoleSetting"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ModelRelationRoleSettingDefinition _SettingDefinition, com.sap.ide.metamodel.webdynpro.model.ModelRelationRoleSetting _ModelRelationRoleSetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.ModelRelationRoleSettingDefinition getSettingDefinition(com.sap.ide.metamodel.webdynpro.model.ModelRelationRoleSetting _ModelRelationRoleSetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.model.ModelRelationRoleSetting> getModelRelationRoleSetting(com.sap.ide.metamodel.webdynpro.framework.ModelRelationRoleSettingDefinition _SettingDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ModelRelationRoleSettingDefinition _SettingDefinition, com.sap.ide.metamodel.webdynpro.model.ModelRelationRoleSetting _ModelRelationRoleSetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ModelRelationRoleSettingDefinition _SettingDefinition, com.sap.ide.metamodel.webdynpro.model.ModelRelationRoleSetting _ModelRelationRoleSetting) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}