/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.common;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface CommonDevelopmentObject extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.common.CommonDevelopmentObject> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.common.CommonDevelopmentObject>("45DDACEF34C83518CAFE4E3B277BE5DDD215ECEB", "sap.com/tc/moin/webdynpro", "Common", "CommonDevelopmentObject"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ 

    
    // attributes
    public java.lang.String getName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance> getTemplateInstances() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram> getDiagrams() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.common.DocumentationObject getDocumentationObject() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDocumentationObject(com.sap.ide.metamodel.common.DocumentationObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.lang.String> __name;
        /**
         * Returns the descriptor for the <code>name</code> attribute.
         * @return  the descriptor for the <code>name</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.lang.String> NAME( ) {
            if ( __name == null ) {
                __name = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.lang.String>( "45DDACEF7AD45CA8B4074CC228ACBF28086BB8EF", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "CommonDevelopmentObject", "name" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 
            }
            return __name;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>> __templateInstances;
        /**
         * Returns the descriptor for the <code>templateInstances</code> reference.
         * @return  the descriptor for the <code>templateInstances</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>> TEMPLATE_INSTANCES( ) {
            if ( __templateInstances == null ) {
                __templateInstances = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.template.EmbeddedTemplateInstance>>( "45DDACEF72A33755751245E2354081CE4E44AA0A", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "CommonDevelopmentObject", "TemplateInstances" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 
            }
            return __templateInstances;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>> __diagrams;
        /**
         * Returns the descriptor for the <code>diagrams</code> reference.
         * @return  the descriptor for the <code>diagrams</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>> DIAGRAMS( ) {
            if ( __diagrams == null ) {
                __diagrams = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,java.util.List<com.sap.ide.metamodel.common.diagram.EmbeddedDiagram>>( "45DDACEFF9AB3E07722F469B0041D4302046455F", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "CommonDevelopmentObject", "Diagrams" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 
            }
            return __diagrams;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,com.sap.ide.metamodel.common.DocumentationObject> __documentationObject;
        /**
         * Returns the descriptor for the <code>documentationObject</code> reference.
         * @return  the descriptor for the <code>documentationObject</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,com.sap.ide.metamodel.common.DocumentationObject> DOCUMENTATION_OBJECT( ) {
            if ( __documentationObject == null ) {
                __documentationObject = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.common.CommonDevelopmentObject,com.sap.ide.metamodel.common.DocumentationObject>( "45DDACEFD1979D36777F4DA60404842A9D1D00C1", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Common", "CommonDevelopmentObject", "DocumentationObject" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 
            }
            return __documentationObject;
        }
    }
}    