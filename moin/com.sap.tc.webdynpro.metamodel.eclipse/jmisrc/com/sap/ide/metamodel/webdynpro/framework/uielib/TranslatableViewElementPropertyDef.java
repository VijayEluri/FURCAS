/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.framework.uielib;

/**
 * Represents the definition of a view element property that may contain translatable text content.
 * This interface is not intended to be implemented by clients.
 */
public interface TranslatableViewElementPropertyDef extends com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef>("45DDACEF61DC58AAAA51429D20B9CC78CA1D1C75", "sap.com/tc/moin/webdynpro", "WebDynpro", "framework", "uielib", "TranslatableViewElementPropertyDef"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 

    
    // attributes
    public com.sap.ide.metamodel.common.TranslatableText getInitialValue() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setInitialValue(com.sap.ide.metamodel.common.TranslatableText newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public int getDefaultMaxLength() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDefaultMaxLength(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.webdynpro.enums.TextTypeEnum getTextType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTextType(com.sap.ide.metamodel.webdynpro.enums.TextTypeEnum newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
        /**
         * Returns the descriptor for the <code>bindable</code> attribute.
         * @return  the descriptor for the <code>bindable</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,com.sap.ide.metamodel.webdynpro.enums.BindableEnum> BINDABLE( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.BINDABLE( );
        }
        /**
         * Returns the descriptor for the <code>primary</code> attribute.
         * @return  the descriptor for the <code>primary</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> PRIMARY( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.PRIMARY( );
        }
        /**
         * Returns the descriptor for the <code>required</code> attribute.
         * @return  the descriptor for the <code>required</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> REQUIRED( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.REQUIRED( );
        }
        /**
         * Returns the descriptor for the <code>apiVisible</code> attribute.
         * @return  the descriptor for the <code>apiVisible</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> API_VISIBLE( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.API_VISIBLE( );
        }
        /**
         * Returns the descriptor for the <code>readonly</code> attribute.
         * @return  the descriptor for the <code>readonly</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> READONLY( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.READONLY( );
        }
        /**
         * Returns the descriptor for the <code>dependencySupported</code> attribute.
         * @return  the descriptor for the <code>dependencySupported</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> DEPENDENCY_SUPPORTED( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.DEPENDENCY_SUPPORTED( );
        }
        /**
         * Returns the descriptor for the <code>documentation</code> attribute.
         * @return  the descriptor for the <code>documentation</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,com.sap.ide.metamodel.common.TranslatableText> DOCUMENTATION( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.DOCUMENTATION( );
        }
        /**
         * Returns the descriptor for the <code>ddicBindable</code> attribute.
         * @return  the descriptor for the <code>ddicBindable</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,com.sap.ide.metamodel.webdynpro.enums.DdicBindableEnum> DDIC_BINDABLE( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.DDIC_BINDABLE( );
        }
        /**
         * Returns the descriptor for the <code>convertible</code> attribute.
         * @return  the descriptor for the <code>convertible</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> CONVERTIBLE( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.CONVERTIBLE( );
        }
        /**
         * Returns the descriptor for the <code>deprecatedSince</code> attribute.
         * @return  the descriptor for the <code>deprecatedSince</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Integer> DEPRECATED_SINCE( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.DEPRECATED_SINCE( );
        }
        /**
         * Returns the descriptor for the <code>deprecatedDescription</code> attribute.
         * @return  the descriptor for the <code>deprecatedDescription</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,com.sap.ide.metamodel.common.TranslatableText> DEPRECATED_DESCRIPTION( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.DEPRECATED_DESCRIPTION( );
        }
        /**
         * Returns the descriptor for the <code>advanced</code> attribute.
         * @return  the descriptor for the <code>advanced</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.lang.Boolean> ADVANCED( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.ADVANCED( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,com.sap.ide.metamodel.common.TranslatableText> __initialValue;
        /**
         * Returns the descriptor for the <code>initialValue</code> attribute.
         * @return  the descriptor for the <code>initialValue</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,com.sap.ide.metamodel.common.TranslatableText> INITIAL_VALUE( ) {
            if ( __initialValue == null ) {
                __initialValue = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,com.sap.ide.metamodel.common.TranslatableText>( "45DDACEF587FEDD6B5844E890736FC38C73893A0", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "uielib", "TranslatableViewElementPropertyDef", "initialValue" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __initialValue;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,java.lang.Integer> __defaultMaxLength;
        /**
         * Returns the descriptor for the <code>defaultMaxLength</code> attribute.
         * @return  the descriptor for the <code>defaultMaxLength</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,java.lang.Integer> DEFAULT_MAX_LENGTH( ) {
            if ( __defaultMaxLength == null ) {
                __defaultMaxLength = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,java.lang.Integer>( "45DDACEFBEF1462C937540F71C7BA6E12B909CFC", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "uielib", "TranslatableViewElementPropertyDef", "defaultMaxLength" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __defaultMaxLength;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,com.sap.ide.metamodel.webdynpro.enums.TextTypeEnum> __textType;
        /**
         * Returns the descriptor for the <code>textType</code> attribute.
         * @return  the descriptor for the <code>textType</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,com.sap.ide.metamodel.webdynpro.enums.TextTypeEnum> TEXT_TYPE( ) {
            if ( __textType == null ) {
                __textType = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.webdynpro.framework.uielib.TranslatableViewElementPropertyDef,com.sap.ide.metamodel.webdynpro.enums.TextTypeEnum>( "45DDACEF898C4C9E78A946753076DF41AA0489DF", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "WebDynpro", "framework", "uielib", "TranslatableViewElementPropertyDef", "textType" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __textType;
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
         * Returns the descriptor for the <code>viewElementDefinition</code> reference.
         * @return  the descriptor for the <code>viewElementDefinition</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,com.sap.ide.metamodel.webdynpro.framework.uielib.ViewElementDefinition> VIEW_ELEMENT_DEFINITION( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.VIEW_ELEMENT_DEFINITION( );
        }
        /**
         * Returns the descriptor for the <code>taggedValues</code> reference.
         * @return  the descriptor for the <code>taggedValues</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,java.util.List<com.sap.ide.metamodel.webdynpro.framework.uielib.TaggedValue>> TAGGED_VALUES( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.TAGGED_VALUES( );
        }
        /**
         * Returns the descriptor for the <code>type</code> reference.
         * @return  the descriptor for the <code>type</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef,com.sap.ide.metamodel.dictionary.datatype.DtScalarType> TYPE( ) {
            return com.sap.ide.metamodel.webdynpro.framework.uielib.AbstractViewElementPropertyDef.DESCRIPTORS.TYPE( );
        }
    }
}    