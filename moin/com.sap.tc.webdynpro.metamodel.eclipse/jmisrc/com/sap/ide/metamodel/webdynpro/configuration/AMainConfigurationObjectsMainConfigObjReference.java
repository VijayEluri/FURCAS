/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.configuration;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AMainConfigurationObjectsMainConfigObjReference extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.configuration.AMainConfigurationObjectsMainConfigObjReference> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.configuration.AMainConfigurationObjectsMainConfigObjReference>("45DDACEED8CD58C1E2FB4E4735BF867A96DB7D84", "sap.com/tc/moin/webdynpro", "WebDynpro", "configuration", "A_MainConfigurationObjects_mainConfigObjReference"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.configuration.MainConfigObject _MainConfigurationObjects, com.sap.ide.metamodel.webdynpro.configuration.MainConfigObjReference _MainConfigObjReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.configuration.MainConfigObject> getMainConfigurationObjects(com.sap.ide.metamodel.webdynpro.configuration.MainConfigObjReference _MainConfigObjReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.configuration.MainConfigObjReference> getMainConfigObjReference(com.sap.ide.metamodel.webdynpro.configuration.MainConfigObject _MainConfigurationObjects) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.configuration.MainConfigObject _MainConfigurationObjects, com.sap.ide.metamodel.webdynpro.configuration.MainConfigObjReference _MainConfigObjReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.configuration.MainConfigObject _MainConfigurationObjects, com.sap.ide.metamodel.webdynpro.configuration.MainConfigObjReference _MainConfigObjReference) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}