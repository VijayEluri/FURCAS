/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AValuesPoint extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.AValuesPoint> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.webdynpro.component.view.uielement.AValuesPoint>("45DDACEE32E69B847BFD438F361A9DEB612518AD", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "A_Values_Point"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractValue _Values, com.sap.ide.metamodel.webdynpro.component.view.uielement.Point _Point) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractValue> getValues(com.sap.ide.metamodel.webdynpro.component.view.uielement.Point _Point) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.Point getPoint(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractValue _Values) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractValue _Values, com.sap.ide.metamodel.webdynpro.component.view.uielement.Point _Point) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractValue _Values, com.sap.ide.metamodel.webdynpro.component.view.uielement.Point _Point) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}