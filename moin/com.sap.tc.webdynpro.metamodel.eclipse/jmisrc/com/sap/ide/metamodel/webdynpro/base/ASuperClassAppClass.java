/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.base;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ASuperClassAppClass extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.base.ASuperClassAppClass> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.base.ASuperClassAppClass>("460CC65B2D35356E54C648B42B7EDA62A4E3F0F4", "sap.com/tc/moin/webdynpro", "WebDynpro", "base", "A_SuperClass_appClass"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.base.AppClass _SuperClass, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.base.AppClass getSuperClass(com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.ide.metamodel.webdynpro.base.AppClass> getAppClass(com.sap.ide.metamodel.webdynpro.base.AppClass _SuperClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.base.AppClass _SuperClass, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.base.AppClass _SuperClass, com.sap.ide.metamodel.webdynpro.base.AppClass _AppClass) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}