/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.model;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface ModelPackage extends com.sap.tc.moin.repository.mmi.reflect.RefPackage
{
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<com.sap.ide.metamodel.webdynpro.model.ModelPackage> PACKAGE_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<com.sap.ide.metamodel.webdynpro.model.ModelPackage>("45DDACEFA22A4C4FE77745900F1B9C15CE880A12", "sap.com/tc/moin/webdynpro", "WebDynpro", "model"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModel();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelRelation();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelRelationRole();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMclass();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelSetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelClassSetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAbstractModelSetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelClassProperty();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelClassMethod();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelRelationSetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelRelationRoleSetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelClassPropertySetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelClassMethodSetting();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelClassEventHandler();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getStereotypeDefinition();
    // associations
    public com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelSetting getASettingDefinitionModelSetting();
    public com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelClassSetting getASettingDefinitionModelClassSetting();
    public com.sap.ide.metamodel.webdynpro.model.ASettingsModel getASettingsModel();
    public com.sap.ide.metamodel.webdynpro.model.ASettingsModelClass getASettingsModelClass();
    public com.sap.ide.metamodel.webdynpro.model.AModelTypeModel getAModelTypeModel();
    public com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelation getASettingsModelRelation();
    public com.sap.ide.metamodel.webdynpro.model.ASettingsModelRelationRole getASettingsModelRelationRole();
    public com.sap.ide.metamodel.webdynpro.model.ASettingsModelClassProperty getASettingsModelClassProperty();
    public com.sap.ide.metamodel.webdynpro.model.ASettingsModelClassMethod getASettingsModelClassMethod();
    public com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelRelationSetting getASettingDefinitionModelRelationSetting();
    public com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelRelationRoleSetting getASettingDefinitionModelRelationRoleSetting();
    public com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelClassPropertySetting getASettingDefinitionModelClassPropertySetting();
    public com.sap.ide.metamodel.webdynpro.model.ASettingDefinitionModelClassMethodSetting getASettingDefinitionModelClassMethodSetting();
    public com.sap.ide.metamodel.webdynpro.model.AInterfacesModelClass getAInterfacesModelClass();
    public com.sap.ide.metamodel.webdynpro.model.ALogicalDictionaryModel getALogicalDictionaryModel();
    public com.sap.ide.metamodel.webdynpro.model.AUitextModelClassProperty getAUitextModelClassProperty();
    public com.sap.ide.metamodel.webdynpro.model.AStructureModelClass getAStructureModelClass();
    public com.sap.ide.metamodel.webdynpro.model.AStructureElementModelClassProperty getAStructureElementModelClassProperty();
    public com.sap.ide.metamodel.webdynpro.model.AModelClassesModel getAModelClassesModel();
    public com.sap.ide.metamodel.webdynpro.model.AModelRelationsModel getAModelRelationsModel();
    public com.sap.ide.metamodel.webdynpro.model.AModelClassModelRelationRole getAModelClassModelRelationRole();
    public com.sap.ide.metamodel.webdynpro.model.AModelRelationRolesModelRelation getAModelRelationRolesModelRelation();
    public com.sap.ide.metamodel.webdynpro.model.AUsedModelsModel getAUsedModelsModel();
}