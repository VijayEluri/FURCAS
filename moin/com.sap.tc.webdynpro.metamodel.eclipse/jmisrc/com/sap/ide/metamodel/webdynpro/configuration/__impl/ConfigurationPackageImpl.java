/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration.__impl;

public final class ConfigurationPackageImpl extends com.sap.tc.moin.repository.core.jmi.reflect.RefPackageImpl
{
        
    public static final java.util.Map<java.lang.String, java.lang.Integer> FEATURE_IDS;

    static {
        
        FEATURE_IDS = new java.util.HashMap<java.lang.String, java.lang.Integer>(52);
        FEATURE_IDS.put("ComponentConfiguration", Integer.valueOf(0)); //$NON-NLS-1$
        FEATURE_IDS.put("CompUsgConfiguration", Integer.valueOf(1)); //$NON-NLS-1$
        FEATURE_IDS.put("ConfigurationObject", Integer.valueOf(2)); //$NON-NLS-1$
        FEATURE_IDS.put("ConfigRelation", Integer.valueOf(3)); //$NON-NLS-1$
        FEATURE_IDS.put("ConfigAggregation", Integer.valueOf(4)); //$NON-NLS-1$
        FEATURE_IDS.put("ConfigAssociation", Integer.valueOf(5)); //$NON-NLS-1$
        FEATURE_IDS.put("ConfigProperty", Integer.valueOf(6)); //$NON-NLS-1$
        FEATURE_IDS.put("SimpleConfigProperty", Integer.valueOf(7)); //$NON-NLS-1$
        FEATURE_IDS.put("TranslatableConfigProperty", Integer.valueOf(8)); //$NON-NLS-1$
        FEATURE_IDS.put("MainConfigObject", Integer.valueOf(9)); //$NON-NLS-1$
        FEATURE_IDS.put("LocalConfigObject", Integer.valueOf(10)); //$NON-NLS-1$
        FEATURE_IDS.put("LocalComponentConfig", Integer.valueOf(11)); //$NON-NLS-1$
        FEATURE_IDS.put("MainComponentConfig", Integer.valueOf(12)); //$NON-NLS-1$
        FEATURE_IDS.put("ConfigurationObjectReference", Integer.valueOf(13)); //$NON-NLS-1$
        FEATURE_IDS.put("LocalConfigObjReference", Integer.valueOf(14)); //$NON-NLS-1$
        FEATURE_IDS.put("ForeignConfigObjReference", Integer.valueOf(15)); //$NON-NLS-1$
        FEATURE_IDS.put("MainConfigObjReference", Integer.valueOf(16)); //$NON-NLS-1$
        FEATURE_IDS.put("CompUsgConfigurationMapping", Integer.valueOf(17)); //$NON-NLS-1$
        FEATURE_IDS.put("A_CompUsgConfigurations_componentConfiguration", Integer.valueOf(18)); //$NON-NLS-1$
        FEATURE_IDS.put("A_ConfigurationObjectReferences_Configuration", Integer.valueOf(19)); //$NON-NLS-1$
        FEATURE_IDS.put("A_MainComponentConfiguration_compUsgConfiguration", Integer.valueOf(20)); //$NON-NLS-1$
        FEATURE_IDS.put("A_ComponentUsage_compUsgConfiguration", Integer.valueOf(21)); //$NON-NLS-1$
        FEATURE_IDS.put("A_Component_componentConfiguration", Integer.valueOf(22)); //$NON-NLS-1$
        FEATURE_IDS.put("A_ConfigModelTargetRole_configRelation", Integer.valueOf(23)); //$NON-NLS-1$
        FEATURE_IDS.put("A_ConfigModelProperty_configProperty", Integer.valueOf(24)); //$NON-NLS-1$
        FEATURE_IDS.put("A_ConfigModelClass_configurationObject", Integer.valueOf(25)); //$NON-NLS-1$
        FEATURE_IDS.put("A_ConfigurationProperties_ParentObject", Integer.valueOf(26)); //$NON-NLS-1$
        FEATURE_IDS.put("A_OutgoingAssociations_ParentObject", Integer.valueOf(27)); //$NON-NLS-1$
        FEATURE_IDS.put("A_OutgoingAggregations_ParentObject", Integer.valueOf(28)); //$NON-NLS-1$
        FEATURE_IDS.put("A_AggregatedConfigObjects_IncomingAggregation", Integer.valueOf(29)); //$NON-NLS-1$
        FEATURE_IDS.put("A_AssociatedConfigObjects_configAssociation", Integer.valueOf(30)); //$NON-NLS-1$
        FEATURE_IDS.put("A_MainConfigurationObjects_mainConfigObjReference", Integer.valueOf(31)); //$NON-NLS-1$
        FEATURE_IDS.put("A_LocalComponentConfiguration_compUsgConfiguration", Integer.valueOf(32)); //$NON-NLS-1$
        FEATURE_IDS.put("A_LocalConfigurationObjects_localConfigObjReference", Integer.valueOf(33)); //$NON-NLS-1$
        FEATURE_IDS.put("A_CompUsgConfigurationMappings_componentConfiguration", Integer.valueOf(34)); //$NON-NLS-1$
        FEATURE_IDS.put("A_Source_compUsgConfigurationMapping", Integer.valueOf(35)); //$NON-NLS-1$
        FEATURE_IDS.put("A_Target_compUsgConfigurationMapping", Integer.valueOf(36)); //$NON-NLS-1$
        FEATURE_IDS.put("A_AccessibilityInfo_componentConfiguration", Integer.valueOf(37)); //$NON-NLS-1$
        FEATURE_IDS.put("A_UsedBackendResources_componentConfiguration", Integer.valueOf(38)); //$NON-NLS-1$
    }

    // constructors    
    public ConfigurationPackageImpl()
    {
        super();
    }
    public ConfigurationPackageImpl(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject)
    {
        super(workspace, mofId, immediatePackage, metaObject);
    }
    // internal enumeration creators
    // internal structure type creators
    // nested packages
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ComponentConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getCompUsgConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "CompUsgConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConfigurationObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ConfigurationObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConfigRelation(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ConfigRelation"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConfigAggregation(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ConfigAggregation"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConfigAssociation(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ConfigAssociation"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConfigProperty(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ConfigProperty"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getSimpleConfigProperty(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "SimpleConfigProperty"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getTranslatableConfigProperty(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "TranslatableConfigProperty"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMainConfigObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "MainConfigObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getLocalConfigObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "LocalConfigObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getLocalComponentConfig(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "LocalComponentConfig"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMainComponentConfig(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "MainComponentConfig"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConfigurationObjectReference(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ConfigurationObjectReference"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getLocalConfigObjReference(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "LocalConfigObjReference"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getForeignConfigObjReference(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "ForeignConfigObjReference"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMainConfigObjReference(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "MainConfigObjReference"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getCompUsgConfigurationMapping(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refClass(connection, "CompUsgConfigurationMapping"); //$NON-NLS-1$
    }
    // associations
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getACompUsgConfigurationsComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_CompUsgConfigurations_componentConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAConfigurationObjectReferencesConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_ConfigurationObjectReferences_Configuration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAMainComponentConfigurationCompUsgConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_MainComponentConfiguration_compUsgConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAComponentUsageCompUsgConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_ComponentUsage_compUsgConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAComponentComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_Component_componentConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAConfigModelTargetRoleConfigRelation(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_ConfigModelTargetRole_configRelation"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAConfigModelPropertyConfigProperty(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_ConfigModelProperty_configProperty"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAConfigModelClassConfigurationObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_ConfigModelClass_configurationObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAConfigurationPropertiesParentObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_ConfigurationProperties_ParentObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAOutgoingAssociationsParentObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_OutgoingAssociations_ParentObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAOutgoingAggregationsParentObject(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_OutgoingAggregations_ParentObject"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAAggregatedConfigObjectsIncomingAggregation(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_AggregatedConfigObjects_IncomingAggregation"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAAssociatedConfigObjectsConfigAssociation(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_AssociatedConfigObjects_configAssociation"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAMainConfigurationObjectsMainConfigObjReference(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_MainConfigurationObjects_mainConfigObjReference"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getALocalComponentConfigurationCompUsgConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_LocalComponentConfiguration_compUsgConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getALocalConfigurationObjectsLocalConfigObjReference(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_LocalConfigurationObjects_localConfigObjReference"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getACompUsgConfigurationMappingsComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_CompUsgConfigurationMappings_componentConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getASourceCompUsgConfigurationMapping(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_Source_compUsgConfigurationMapping"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getATargetCompUsgConfigurationMapping(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_Target_compUsgConfigurationMapping"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAAccessibilityInfoComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_AccessibilityInfo_componentConfiguration"); //$NON-NLS-1$
    }
    public com.sap.tc.moin.repository.mmi.reflect.RefAssociation getAUsedBackendResourcesComponentConfiguration(com.sap.tc.moin.repository.core.CoreConnection connection) {
        return  refAssociation(connection, "A_UsedBackendResources_componentConfiguration"); //$NON-NLS-1$
    }
    // structure type creators

    protected java.lang.Object create___Extent(java.lang.Object workspace, java.lang.String mofId, com.sap.tc.moin.repository.mmi.reflect.RefPackage immediatePackage, com.sap.tc.moin.repository.mmi.reflect.RefObject metaObject) {
        java.lang.String name = ((com.sap.tc.moin.repository.mmi.model.ModelElement) metaObject).getName();
        com.sap.tc.moin.repository.mmi.reflect.RefBaseObject result = null;
        try {
            switch (FEATURE_IDS.get(name)) {
                case 0:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject);
                case 1:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.CompUsgConfigurationImpl")); //$NON-NLS-1$
                case 2:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject);
                case 3:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject);
                case 4:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.ConfigAggregationImpl")); //$NON-NLS-1$
                case 5:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.ConfigAssociationImpl")); //$NON-NLS-1$
                case 6:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject);
                case 7:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.SimpleConfigPropertyImpl")); //$NON-NLS-1$
                case 8:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.TranslatableConfigPropertyImpl")); //$NON-NLS-1$
                case 9:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.MainConfigObjectImpl")); //$NON-NLS-1$
                case 10:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.LocalConfigObjectImpl")); //$NON-NLS-1$
                case 11:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.LocalComponentConfigImpl")); //$NON-NLS-1$
                case 12:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.MainComponentConfigImpl")); //$NON-NLS-1$
                case 13:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject);
                case 14:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.LocalConfigObjReferenceImpl")); //$NON-NLS-1$
                case 15:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.ForeignConfigObjReferenceImpl")); //$NON-NLS-1$
                case 16:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.MainConfigObjReferenceImpl")); //$NON-NLS-1$
                case 17:
                    return new com.sap.tc.moin.repository.core.jmi.reflect.RefClassImpl(workspace, mofId, immediatePackage, metaObject, Class.forName("com.sap.ide.metamodel.webdynpro.configuration.__impl.CompUsgConfigurationMappingImpl")); //$NON-NLS-1$
                case 18:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ACompUsgConfigurationsComponentConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 19:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigurationObjectReferencesConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 20:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AMainComponentConfigurationCompUsgConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 21:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AComponentUsageCompUsgConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 22:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AComponentComponentConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 23:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigModelTargetRoleConfigRelationImpl(workspace, mofId, immediatePackage, metaObject);
                case 24:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigModelPropertyConfigPropertyImpl(workspace, mofId, immediatePackage, metaObject);
                case 25:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigModelClassConfigurationObjectImpl(workspace, mofId, immediatePackage, metaObject);
                case 26:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AConfigurationPropertiesParentObjectImpl(workspace, mofId, immediatePackage, metaObject);
                case 27:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AOutgoingAssociationsParentObjectImpl(workspace, mofId, immediatePackage, metaObject);
                case 28:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AOutgoingAggregationsParentObjectImpl(workspace, mofId, immediatePackage, metaObject);
                case 29:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AAggregatedConfigObjectsIncomingAggregationImpl(workspace, mofId, immediatePackage, metaObject);
                case 30:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AAssociatedConfigObjectsConfigAssociationImpl(workspace, mofId, immediatePackage, metaObject);
                case 31:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AMainConfigurationObjectsMainConfigObjReferenceImpl(workspace, mofId, immediatePackage, metaObject);
                case 32:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ALocalComponentConfigurationCompUsgConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 33:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ALocalConfigurationObjectsLocalConfigObjReferenceImpl(workspace, mofId, immediatePackage, metaObject);
                case 34:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ACompUsgConfigurationMappingsComponentConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 35:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ASourceCompUsgConfigurationMappingImpl(workspace, mofId, immediatePackage, metaObject);
                case 36:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ATargetCompUsgConfigurationMappingImpl(workspace, mofId, immediatePackage, metaObject);
                case 37:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AAccessibilityInfoComponentConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                case 38:
                    return new com.sap.ide.metamodel.webdynpro.configuration.__impl.AUsedBackendResourcesComponentConfigurationImpl(workspace, mofId, immediatePackage, metaObject);
                default:
                    throw new com.sap.tc.moin.repository.mmi.reflect.InvalidCallException(name, null, "create___Extent()"); //$NON-NLS-1$
        }
        }
        catch(com.sap.tc.moin.repository.mmi.reflect.JmiException ex) {
            throw ex;
        }
        catch(java.lang.Exception ex) {
            throw new com.sap.tc.moin.repository.mmi.reflect.JmiException(ex);
        }        
    }

    @SuppressWarnings("unchecked")
    public java.lang.Class<com.sap.ide.metamodel.webdynpro.configuration.ConfigurationPackage> get___JmiInterface() {
        return com.sap.ide.metamodel.webdynpro.configuration.ConfigurationPackage.class;
    }
    
    protected void initialize() {
        if (___refPackages == null) {
            ___refPackages = new java.util.ArrayList<RefPackageAndName>(0);
            ___refPackagesByName = new java.util.HashMap<String, RefPackageAndName>();
            @SuppressWarnings("unused")
            java.lang.String name = ""; //$NON-NLS-1$
            @SuppressWarnings("unused")
            RefPackageAndName rpan = null;
        }
  
        if (___refClasses == null) {
            ___refClasses = new java.util.ArrayList<RefClassAndName>(18);
            ___refClassesByName = new java.util.HashMap<String, RefClassAndName>();
            java.lang.String name = ""; //$NON-NLS-1$
            RefClassAndName rcan = null;
            name = "ComponentConfiguration"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ComponentConfiguration"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "CompUsgConfiguration"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.CompUsgConfiguration"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ConfigurationObject"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ConfigRelation"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ConfigRelation"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ConfigAggregation"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ConfigAggregation"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ConfigAssociation"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ConfigAssociation"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ConfigProperty"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ConfigProperty"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "SimpleConfigProperty"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.SimpleConfigProperty"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "TranslatableConfigProperty"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.TranslatableConfigProperty"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "MainConfigObject"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.MainConfigObject"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "LocalConfigObject"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.LocalConfigObject"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "LocalComponentConfig"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.LocalComponentConfig"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "MainComponentConfig"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.MainComponentConfig"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ConfigurationObjectReference"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObjectReference"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "LocalConfigObjReference"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.LocalConfigObjReference"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "ForeignConfigObjReference"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ForeignConfigObjReference"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "MainConfigObjReference"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.MainConfigObjReference"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
            name = "CompUsgConfigurationMapping"; //$NON-NLS-1$
            rcan = new RefClassAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.CompUsgConfigurationMapping"); //$NON-NLS-1$
            ___refClasses.add(rcan);
            ___refClassesByName.put(name, rcan);
        }
  
        if (___refAssociations == null) {
            ___refAssociations = new java.util.ArrayList<RefAssociationAndName>(21);
            ___refAssociationsByName = new java.util.HashMap<String, RefAssociationAndName>();
            @SuppressWarnings("unused")
            java.lang.String name = ""; //$NON-NLS-1$
            @SuppressWarnings("unused")
            RefAssociationAndName raan = null;
            name = "A_CompUsgConfigurations_componentConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ACompUsgConfigurationsComponentConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_ConfigurationObjectReferences_Configuration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AConfigurationObjectReferencesConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_MainComponentConfiguration_compUsgConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AMainComponentConfigurationCompUsgConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_ComponentUsage_compUsgConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AComponentUsageCompUsgConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_Component_componentConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AComponentComponentConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_ConfigModelTargetRole_configRelation"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AConfigModelTargetRoleConfigRelation"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_ConfigModelProperty_configProperty"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AConfigModelPropertyConfigProperty"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_ConfigModelClass_configurationObject"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AConfigModelClassConfigurationObject"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_ConfigurationProperties_ParentObject"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AConfigurationPropertiesParentObject"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_OutgoingAssociations_ParentObject"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AOutgoingAssociationsParentObject"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_OutgoingAggregations_ParentObject"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AOutgoingAggregationsParentObject"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_AggregatedConfigObjects_IncomingAggregation"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AAggregatedConfigObjectsIncomingAggregation"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_AssociatedConfigObjects_configAssociation"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AAssociatedConfigObjectsConfigAssociation"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_MainConfigurationObjects_mainConfigObjReference"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AMainConfigurationObjectsMainConfigObjReference"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_LocalComponentConfiguration_compUsgConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ALocalComponentConfigurationCompUsgConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_LocalConfigurationObjects_localConfigObjReference"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ALocalConfigurationObjectsLocalConfigObjReference"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_CompUsgConfigurationMappings_componentConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ACompUsgConfigurationMappingsComponentConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_Source_compUsgConfigurationMapping"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ASourceCompUsgConfigurationMapping"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_Target_compUsgConfigurationMapping"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.ATargetCompUsgConfigurationMapping"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_AccessibilityInfo_componentConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AAccessibilityInfoComponentConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
            name = "A_UsedBackendResources_componentConfiguration"; //$NON-NLS-1$
            raan = new RefAssociationAndName(name, "com.sap.ide.metamodel.webdynpro.configuration.AUsedBackendResourcesComponentConfiguration"); //$NON-NLS-1$
            ___refAssociations.add(raan);
            ___refAssociationsByName.put(name, raan);
        }
    }
    
    @Override
    public com.sap.tc.moin.repository.spi.core.Wrapper<com.sap.ide.metamodel.webdynpro.configuration.__impl.ConfigurationPackageImpl> createWrapper(com.sap.tc.moin.repository.core.CoreConnection conn, boolean synchronize) {
        return new com.sap.ide.metamodel.webdynpro.configuration.__impl.ConfigurationPackageWrapper(conn, this, synchronize);
    }

}