/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.application;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface ApplicationPackage extends com.sap.tc.moin.repository.mmi.reflect.RefPackage
{
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<com.sap.ide.metamodel.webdynpro.application.ApplicationPackage> PACKAGE_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<com.sap.ide.metamodel.webdynpro.application.ApplicationPackage>("45DDACEF7394F5BC472747AC375FD2732D01DEEF", "sap.com/tc/moin/webdynpro", "WebDynpro", "application"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getApplication();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getApplicationProperty();
    // associations
    public com.sap.ide.metamodel.webdynpro.application.AApplicationPropertiesApplication getAApplicationPropertiesApplication();
    public com.sap.ide.metamodel.webdynpro.application.AStartupPlugApplication getAStartupPlugApplication();
    public com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionSetsApplication getAPropertyDefinitionSetsApplication();
    public com.sap.ide.metamodel.webdynpro.application.APropertyDefinitionApplicationProperty getAPropertyDefinitionApplicationProperty();
    public com.sap.ide.metamodel.webdynpro.application.ARootComponentConfigurationApplication getARootComponentConfigurationApplication();
}