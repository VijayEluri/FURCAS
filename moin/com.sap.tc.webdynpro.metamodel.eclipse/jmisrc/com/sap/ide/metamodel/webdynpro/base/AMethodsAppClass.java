/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.base;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AMethodsAppClass extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.base.AMethodsAppClass> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.base.AMethodsAppClass>("45DDACEE00738C3E6D7A42B6242DF4523ACF5B3C", "sap.com/tc/moin/webdynpro", "WebDynpro", "base", "A_Methods_appClass"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.base.Method _Methods, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.base.Method> getMethods(com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.base.AppClass getAppClass(com.sap.ide.metamodel.webdynpro.base.Method _Methods) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.base.Method _Methods, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.base.Method _Methods, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}