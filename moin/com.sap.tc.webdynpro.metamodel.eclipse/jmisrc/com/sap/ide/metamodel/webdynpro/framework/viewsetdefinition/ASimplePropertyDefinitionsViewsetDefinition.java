/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ASimplePropertyDefinitionsViewsetDefinition extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ASimplePropertyDefinitionsViewsetDefinition> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ASimplePropertyDefinitionsViewsetDefinition>("45DDACEEF146D98339AE42561D08F8F141D389B5", "sap.com/tc/moin/webdynpro", "WebDynpro", "framework", "viewsetdefinition", "A_SimplePropertyDefinitions_ViewsetDefinition"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.SimplePropertyDefinition _SimplePropertyDefinitions, com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.SimplePropertyDefinition> getSimplePropertyDefinitions(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition getViewsetDefinition(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.SimplePropertyDefinition _SimplePropertyDefinitions) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.SimplePropertyDefinition _SimplePropertyDefinitions, com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.SimplePropertyDefinition _SimplePropertyDefinitions, com.sap.ide.metamodel.webdynpro.framework.viewsetdefinition.ViewsetDefinition _ViewsetDefinition) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}