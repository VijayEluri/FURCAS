/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.project;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AServiceReferencesProjectProperties extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.project.AServiceReferencesProjectProperties> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.project.AServiceReferencesProjectProperties>("45DDACEFB4D0EEC067FA4A991E739D3F9F1866FD", "sap.com/tc/moin/webdynpro", "WebDynpro", "project", "A_ServiceReferences_projectProperties"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.project.LibraryReference _ServiceReferences, com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.project.LibraryReference> getServiceReferences(com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.project.ProjectProperties getProjectProperties(com.sap.ide.metamodel.webdynpro.project.LibraryReference _ServiceReferences) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.project.LibraryReference _ServiceReferences, com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.project.LibraryReference _ServiceReferences, com.sap.ide.metamodel.webdynpro.project.ProjectProperties _ProjectProperties) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}