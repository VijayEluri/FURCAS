/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface GraphicsAlgorithmHasBackgroundColor extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasBackgroundColor> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmHasBackgroundColor>("45E806E39B5A5621D3A049D41BDCF825E4F1DFCD", "sap.com/com/sap/mi/gfw/mm", "pictograms", "GraphicsAlgorithmHasBackgroundColor"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 


    // association interface
    public boolean exists(com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle, com.sap.mi.gfw.mm.datatypes.Color _Background) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.mi.gfw.mm.pictograms.AbstractStyle> getAbstractStyle(com.sap.mi.gfw.mm.datatypes.Color _Background) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.mi.gfw.mm.datatypes.Color getBackground(com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle, com.sap.mi.gfw.mm.datatypes.Color _Background) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.mi.gfw.mm.pictograms.AbstractStyle _AbstractStyle, com.sap.mi.gfw.mm.datatypes.Color _Background) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}