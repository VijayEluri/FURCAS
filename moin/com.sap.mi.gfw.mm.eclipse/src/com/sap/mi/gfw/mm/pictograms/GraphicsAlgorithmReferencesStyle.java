/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.pictograms;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface GraphicsAlgorithmReferencesStyle extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmReferencesStyle> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithmReferencesStyle>("46973F2C80C28094311F11DCB45C001125D59A18", "sap.com/com/sap/mi/gfw/mm", "pictograms", "GraphicsAlgorithmReferencesStyle"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 


    // association interface
    public boolean exists(com.sap.mi.gfw.mm.pictograms.Style _Style, com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm _GraphicsAlgorithm) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.mi.gfw.mm.pictograms.Style getStyle(com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm _GraphicsAlgorithm) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm> getGraphicsAlgorithm(com.sap.mi.gfw.mm.pictograms.Style _Style) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.mi.gfw.mm.pictograms.Style _Style, com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm _GraphicsAlgorithm) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.mi.gfw.mm.pictograms.Style _Style, com.sap.mi.gfw.mm.pictograms.GraphicsAlgorithm _GraphicsAlgorithm) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}