/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ADimensionDefinitionsViewsetDefintion extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ADimensionDefinitionsViewsetDefintion> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ADimensionDefinitionsViewsetDefintion>("45DDACEE6B87AF7C67FE45D63D169CA5D49D305F", "sap.com/tc/moin/webdynpro", "WebDynpro", "framework", "viewsetdefinition", "A_DimensionDefinitions_ViewsetDefintion"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.DimensionDefinition _DimensionDefinitions, com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefintion) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.DimensionDefinition> getDimensionDefinitions(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefintion) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition getViewsetDefintion(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.DimensionDefinition _DimensionDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.DimensionDefinition _DimensionDefinitions, com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefintion) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.DimensionDefinition _DimensionDefinitions, com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefintion) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}