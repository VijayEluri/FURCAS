/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.mi.gfw.mm.links;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface DiagramLinkReferencesPictogramLinks extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.links.DiagramLinkReferencesPictogramLinks> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.mi.gfw.mm.links.DiagramLinkReferencesPictogramLinks>("45E806E369DC288747324E4122F8E53651800C8C", "sap.com/com/sap/mi/gfw/mm", "links", "DiagramLinkReferencesPictogramLinks"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 


    // association interface
    public boolean exists(com.sap.mi.gfw.mm.links.PictogramLink _PictogramLinks, com.sap.mi.gfw.mm.links.DiagramLink _DiagramLink) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.mi.gfw.mm.links.PictogramLink> getPictogramLinks(com.sap.mi.gfw.mm.links.DiagramLink _DiagramLink) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.mi.gfw.mm.links.DiagramLink getDiagramLink(com.sap.mi.gfw.mm.links.PictogramLink _PictogramLinks) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.mi.gfw.mm.links.PictogramLink _PictogramLinks, com.sap.mi.gfw.mm.links.DiagramLink _DiagramLink) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.mi.gfw.mm.links.PictogramLink _PictogramLinks, com.sap.mi.gfw.mm.links.DiagramLink _DiagramLink) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}