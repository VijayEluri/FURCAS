/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

/**
 * GridData represents the layout data for UI elements managed by a GridLayout.
 * This interface is not intended to be implemented by clients.
 */
public interface GridData extends com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData>("45DDACEE25BF82AED22341D5244083C77A4FDDD3", "sap.com/tc/moin/webdynpro", "WebDynpro", "component", "view", "uielement", "GridData"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 

    
    // attributes
    /**
     * Determines how many columns the element occupies in the grid.
     */
    public int getColSpan() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines how many columns the element occupies in the grid.
     */
    public void setColSpan(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the horizontal alignment of the element in the grid.
     */
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.CellHalign getHAlign() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the horizontal alignment of the element in the grid.
     */
    public void setHAlign(com.sap.ide.metamodel.webdynpro.component.view.uielement.CellHalign newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the vertical alignment of the element in the grid.
     */
    public com.sap.ide.metamodel.webdynpro.component.view.uielement.CellValign getVAlign() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the vertical alignment of the element in the grid.
     */
    public void setVAlign(com.sap.ide.metamodel.webdynpro.component.view.uielement.CellValign newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the height (CSS size) of the element in the grid.
     */
    public java.lang.String getHeight() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the height (CSS size) of the element in the grid.
     */
    public void setHeight(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the width (CSS size) of the element in the grid.
     */
    public java.lang.String getWidth() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the width (CSS size) of the element in the grid.
     */
    public void setWidth(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the top padding (CSS size) of the element in the grid.
     */
    public java.lang.String getPaddingTop() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the top padding (CSS size) of the element in the grid.
     */
    public void setPaddingTop(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the bottom padding (CSS size) of the element in the grid.
     */
    public java.lang.String getPaddingBottom() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the bottom padding (CSS size) of the element in the grid.
     */
    public void setPaddingBottom(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the left padding (CSS size) of the element in the grid.
     */
    public java.lang.String getPaddingLeft() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the left padding (CSS size) of the element in the grid.
     */
    public void setPaddingLeft(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the right padding (CSS size) of the element in the grid.
     */
    public java.lang.String getPaddingRight() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    /**
     * Determines the right padding (CSS size) of the element in the grid.
     */
    public void setPaddingRight(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        /**
         * Returns the descriptor for the <code>name</code> attribute.
         * @return  the descriptor for the <code>name</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.lang.String> NAME( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.NAME( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.Integer> __colSpan;
        /**
         * Returns the descriptor for the <code>colSpan</code> attribute.
         * @return  the descriptor for the <code>colSpan</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.Integer> COL_SPAN( ) {
            if ( __colSpan == null ) {
                __colSpan = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.Integer>( "45DDACEE584CA5FC1888416F0130F0AB2719F7E1", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "colSpan" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __colSpan;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,com.sap.ide.metamodel.webdynpro.component.view.uielement.CellHalign> __hAlign;
        /**
         * Returns the descriptor for the <code>hAlign</code> attribute.
         * @return  the descriptor for the <code>hAlign</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,com.sap.ide.metamodel.webdynpro.component.view.uielement.CellHalign> H_ALIGN( ) {
            if ( __hAlign == null ) {
                __hAlign = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,com.sap.ide.metamodel.webdynpro.component.view.uielement.CellHalign>( "45DDACEE8B6A77A24B6245CB16A2FFB64FDA8876", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "hAlign" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __hAlign;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,com.sap.ide.metamodel.webdynpro.component.view.uielement.CellValign> __vAlign;
        /**
         * Returns the descriptor for the <code>vAlign</code> attribute.
         * @return  the descriptor for the <code>vAlign</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,com.sap.ide.metamodel.webdynpro.component.view.uielement.CellValign> V_ALIGN( ) {
            if ( __vAlign == null ) {
                __vAlign = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,com.sap.ide.metamodel.webdynpro.component.view.uielement.CellValign>( "45DDACEE4D03CCC9FD2C404A3D719368C9866CEB", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "vAlign" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __vAlign;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> __height;
        /**
         * Returns the descriptor for the <code>height</code> attribute.
         * @return  the descriptor for the <code>height</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> HEIGHT( ) {
            if ( __height == null ) {
                __height = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String>( "45DDACEE199D7011AD8D416A274AECC25528F015", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "height" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __height;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> __width;
        /**
         * Returns the descriptor for the <code>width</code> attribute.
         * @return  the descriptor for the <code>width</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> WIDTH( ) {
            if ( __width == null ) {
                __width = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String>( "45DDACEEDEAF1FDF041940452A568DBD424AF97E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "width" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __width;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> __paddingTop;
        /**
         * Returns the descriptor for the <code>paddingTop</code> attribute.
         * @return  the descriptor for the <code>paddingTop</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> PADDING_TOP( ) {
            if ( __paddingTop == null ) {
                __paddingTop = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String>( "45DDACEE34614FE97A4C48233A1D996954508FDA", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "paddingTop" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __paddingTop;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> __paddingBottom;
        /**
         * Returns the descriptor for the <code>paddingBottom</code> attribute.
         * @return  the descriptor for the <code>paddingBottom</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> PADDING_BOTTOM( ) {
            if ( __paddingBottom == null ) {
                __paddingBottom = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String>( "45DDACEE715382EE750C4B081686E96BBE075B28", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "paddingBottom" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __paddingBottom;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> __paddingLeft;
        /**
         * Returns the descriptor for the <code>paddingLeft</code> attribute.
         * @return  the descriptor for the <code>paddingLeft</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> PADDING_LEFT( ) {
            if ( __paddingLeft == null ) {
                __paddingLeft = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String>( "45DDACEEFBDF58A312CD497A294FC3872245C853", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "paddingLeft" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __paddingLeft;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> __paddingRight;
        /**
         * Returns the descriptor for the <code>paddingRight</code> attribute.
         * @return  the descriptor for the <code>paddingRight</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String> PADDING_RIGHT( ) {
            if ( __paddingRight == null ) {
                __paddingRight = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.component.view.uielement.GridData,java.lang.String>( "45DDACEE4C9E4C26021848210CC3F210D45DE501", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "component", "view", "uielement", "GridData", "paddingRight" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ 
            }
            return __paddingRight;
        }
        /**
         * Returns the descriptor for the <code>templateInstances</code> reference.
         * @return  the descriptor for the <code>templateInstances</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>> TEMPLATE_INSTANCES( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.TEMPLATE_INSTANCES( );
        }
        /**
         * Returns the descriptor for the <code>diagrams</code> reference.
         * @return  the descriptor for the <code>diagrams</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>> DIAGRAMS( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.DIAGRAMS( );
        }
        /**
         * Returns the descriptor for the <code>documentationObject</code> reference.
         * @return  the descriptor for the <code>documentationObject</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,com.sap.ide.metamodel.common.DocumentationObject> DOCUMENTATION_OBJECT( ) {
            return com.sap.ide.metamodel.common.CommonDevelopmentObject.DESCRIPTORS.DOCUMENTATION_OBJECT( );
        }
        /**
         * Returns the descriptor for the <code>definition</code> reference.
         * @return  the descriptor for the <code>definition</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement,com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementDefinition> DEFINITION( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement.DESCRIPTORS.DEFINITION( );
        }
        /**
         * Returns the descriptor for the <code>outgoingAggregations</code> reference.
         * @return  the descriptor for the <code>outgoingAggregations</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement,java.util.List<com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElementAggregation>> OUTGOING_AGGREGATIONS( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement.DESCRIPTORS.OUTGOING_AGGREGATIONS( );
        }
        /**
         * Returns the descriptor for the <code>properties</code> reference.
         * @return  the descriptor for the <code>properties</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement,java.util.List<com.sap.ide.metamodel.webdynpro.component.view.uielement.AbstractViewElementProperty>> PROPERTIES( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.ViewElement.DESCRIPTORS.PROPERTIES( );
        }
        /**
         * Returns the descriptor for the <code>uielement</code> reference.
         * @return  the descriptor for the <code>uielement</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData,com.sap.ide.metamodel.webdynpro.component.view.uielement.Uielement> UIELEMENT( ) {
            return com.sap.ide.metamodel.webdynpro.component.view.uielement.LayoutData.DESCRIPTORS.UIELEMENT( );
        }
    }
}    