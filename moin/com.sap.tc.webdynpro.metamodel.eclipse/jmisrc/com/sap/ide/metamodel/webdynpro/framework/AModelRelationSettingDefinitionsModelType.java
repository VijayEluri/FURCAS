/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AModelRelationSettingDefinitionsModelType extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.AModelRelationSettingDefinitionsModelType> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.AModelRelationSettingDefinitionsModelType>("45DDACEFD6A29B4AB68D4E1211AE83FAEC440E32", "sap.com/tc/moin/webdynpro", "WebDynpro", "framework", "A_ModelRelationSettingDefinitions_ModelType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.ModelRelationSettingDefinition _ModelRelationSettingDefinitions, com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.framework.ModelRelationSettingDefinition> getModelRelationSettingDefinitions(com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.ModelType getModelType(com.sap.ide.metamodel.webdynpro.framework.ModelRelationSettingDefinition _ModelRelationSettingDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.ModelRelationSettingDefinition _ModelRelationSettingDefinitions, com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.ModelRelationSettingDefinition _ModelRelationSettingDefinitions, com.sap.ide.metamodel.webdynpro.framework.ModelType _ModelType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}