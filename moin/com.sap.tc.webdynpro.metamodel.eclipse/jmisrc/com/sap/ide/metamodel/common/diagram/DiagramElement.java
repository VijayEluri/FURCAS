/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.common.diagram;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface DiagramElement extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.common.diagram.DiagramElement> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.common.diagram.DiagramElement>("45DDACEF895F77BDDEE742131C48A98D9F126193", "sap.com/tc/moin/webdynpro", "Common", "diagram", "DiagramElement"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getGeometry() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setGeometry(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getStyle() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setStyle(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.common.CommonDevelopmentObject getReferencedObject() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setReferencedObject(com.sap.ide.metamodel.common.CommonDevelopmentObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String> __name;
        /**
         * Returns the descriptor for the <code>name</code> attribute.
         * @return  the descriptor for the <code>name</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String> NAME( ) {
            if ( __name == null ) {
                __name = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String>( "45DDACEF57EE7FF94B4C4BF82D61D162EFFA1E9F", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "diagram", "DiagramElement", "name" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __name;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String> __geometry;
        /**
         * Returns the descriptor for the <code>geometry</code> attribute.
         * @return  the descriptor for the <code>geometry</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String> GEOMETRY( ) {
            if ( __geometry == null ) {
                __geometry = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String>( "45DDACEF8FC40A2BDBF14D0D197AA65B3A4C20C1", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "diagram", "DiagramElement", "geometry" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __geometry;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String> __style;
        /**
         * Returns the descriptor for the <code>style</code> attribute.
         * @return  the descriptor for the <code>style</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String> STYLE( ) {
            if ( __style == null ) {
                __style = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.diagram.DiagramElement,java.lang.String>( "45DDACEF0A3CF3520B8840A82D52EACAC98574A2", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "diagram", "DiagramElement", "style" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __style;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.diagram.DiagramElement,com.sap.ide.metamodel.common.CommonDevelopmentObject> __referencedObject;
        /**
         * Returns the descriptor for the <code>referencedObject</code> reference.
         * @return  the descriptor for the <code>referencedObject</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.diagram.DiagramElement,com.sap.ide.metamodel.common.CommonDevelopmentObject> REFERENCED_OBJECT( ) {
            if ( __referencedObject == null ) {
                __referencedObject = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.diagram.DiagramElement,com.sap.ide.metamodel.common.CommonDevelopmentObject>( "460CC65C5E02690EC18C45752D21C21D7F1DC075", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "diagram", "DiagramElement", "ReferencedObject" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __referencedObject;
        }
    }
}    