/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface StyleContainerContainsStyles extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.pictograms.StyleContainerContainsStyles> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.pictograms.StyleContainerContainsStyles>("46973F2C80C28091311F11DCAD2F001125D59A18", "sap.com/com/sap/mi/gfw/mm", "pictograms", "StyleContainerContainsStyles"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 


    // association interface
    public boolean exists(com.sap.mi.gfw.mm.pictograms.Style _Styles, com.sap.mi.gfw.mm.pictograms.StyleContainer _StyleContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.mi.gfw.mm.pictograms.Style> getStyles(com.sap.mi.gfw.mm.pictograms.StyleContainer _StyleContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.mi.gfw.mm.pictograms.StyleContainer getStyleContainer(com.sap.mi.gfw.mm.pictograms.Style _Styles) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.mi.gfw.mm.pictograms.Style _Styles, com.sap.mi.gfw.mm.pictograms.StyleContainer _StyleContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.mi.gfw.mm.pictograms.Style _Styles, com.sap.mi.gfw.mm.pictograms.StyleContainer _StyleContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}