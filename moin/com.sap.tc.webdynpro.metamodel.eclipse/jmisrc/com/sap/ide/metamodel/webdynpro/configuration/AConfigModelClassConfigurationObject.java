/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AConfigModelClassConfigurationObject extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.configuration.AConfigModelClassConfigurationObject> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.configuration.AConfigModelClassConfigurationObject>("45DDACEEE6C124058FEB428F23DCE42B6EFE0D33", "sap.com/tc/moin/webdynpro", "WebDynpro", "configuration", "A_ConfigModelClass_configurationObject"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.model.Mclass _ConfigModelClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ConfigurationObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.model.Mclass getConfigModelClass(com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ConfigurationObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject> getConfigurationObject(com.sap.ide.metamodel.webdynpro.model.Mclass _ConfigModelClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.model.Mclass _ConfigModelClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ConfigurationObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.model.Mclass _ConfigModelClass, com.sap.ide.metamodel.webdynpro.configuration.ConfigurationObject _ConfigurationObject) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}