/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.uielib;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface ATaggedValuesViewElementAggregationDef extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesViewElementAggregationDef> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.framework.uielib.ATaggedValuesViewElementAggregationDef>("45DDACEF4C836D94A5FA4B561B2481A794B46DE6", "sap.com/tc/moin/webdynpro", "WebDynpro", "framework", "uielib", "A_TaggedValues_viewElementAggregationDef"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues, com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue> getTaggedValues(com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef getViewElementAggregationDef(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues, com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue _TaggedValues, com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementAggregationDef _ViewElementAggregationDef) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}