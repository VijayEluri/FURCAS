/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface DtSimpleType extends com.sap.ide.metamodel.dictionary.datatype.DtDataType,com.sap.ide.metamodel.dictionary.datatype.DtScalarType {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.ide.metamodel.dictionary.datatype.DtSimpleType>("45DDACEFCB2918016F94484C1EA6B0CED3D12499", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "DtSimpleType"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 

    
    // attributes
    public java.lang.String getTypeName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTypeName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getTypeNamePrefix() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTypeNamePrefix(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getBaseTypeName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBaseTypeName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getBaseTypePrefix() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBaseTypePrefix(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getBuiltInType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBuiltInType(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean isValid() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setValid(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;

    // references
    public com.sap.ide.metamodel.dictionary.datatype.DtExternalRepresentation getExternalRepresentation() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setExternalRepresentation(com.sap.ide.metamodel.dictionary.datatype.DtExternalRepresentation newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtSimpleType getBaseType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setBaseType(com.sap.ide.metamodel.dictionary.datatype.DtSimpleType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtSchemaType getSchemaType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setSchemaType(com.sap.ide.metamodel.dictionary.datatype.DtSchemaType newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtDbProperty getDbProperty() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setDbProperty(com.sap.ide.metamodel.dictionary.datatype.DtDbProperty newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtHint> getHints() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtTextObject getTexts() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTexts(com.sap.ide.metamodel.dictionary.datatype.DtTextObject newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtTechnicalInfo getTechnicalInfo() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTechnicalInfo(com.sap.ide.metamodel.dictionary.datatype.DtTechnicalInfo newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


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
         * Returns the descriptor for the <code>prefix</code> attribute.
         * @return  the descriptor for the <code>prefix</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtDataType,java.lang.String> PREFIX( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtDataType.DESCRIPTORS.PREFIX( );
        }
        /**
         * Returns the descriptor for the <code>toDeploy</code> attribute.
         * @return  the descriptor for the <code>toDeploy</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtDataType,java.lang.Boolean> TO_DEPLOY( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtDataType.DESCRIPTORS.TO_DEPLOY( );
        }
        /**
         * Returns the descriptor for the <code>backendName</code> attribute.
         * @return  the descriptor for the <code>backendName</code> attribute
         */
        public com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtDataType,java.lang.String> BACKEND_NAME( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtDataType.DESCRIPTORS.BACKEND_NAME( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> __typeName;
        /**
         * Returns the descriptor for the <code>typeName</code> attribute.
         * @return  the descriptor for the <code>typeName</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> TYPE_NAME( ) {
            if ( __typeName == null ) {
                __typeName = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String>( "45DDACEF05819680C1124CF5212BC22BFEE5CCD2", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "typeName" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __typeName;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> __typeNamePrefix;
        /**
         * Returns the descriptor for the <code>typeNamePrefix</code> attribute.
         * @return  the descriptor for the <code>typeNamePrefix</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> TYPE_NAME_PREFIX( ) {
            if ( __typeNamePrefix == null ) {
                __typeNamePrefix = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String>( "45DDACEF54CCD86703CA42532818ED8398D94385", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "typeNamePrefix" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __typeNamePrefix;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> __baseTypeName;
        /**
         * Returns the descriptor for the <code>baseTypeName</code> attribute.
         * @return  the descriptor for the <code>baseTypeName</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> BASE_TYPE_NAME( ) {
            if ( __baseTypeName == null ) {
                __baseTypeName = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String>( "45DDACEFBE81F5FE8C284A751694A854CDA001E3", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "baseTypeName" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __baseTypeName;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> __baseTypePrefix;
        /**
         * Returns the descriptor for the <code>baseTypePrefix</code> attribute.
         * @return  the descriptor for the <code>baseTypePrefix</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> BASE_TYPE_PREFIX( ) {
            if ( __baseTypePrefix == null ) {
                __baseTypePrefix = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String>( "45DDACEF4D96307F5DC248BE1F4DC868495E584F", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "baseTypePrefix" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __baseTypePrefix;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> __builtInType;
        /**
         * Returns the descriptor for the <code>builtInType</code> attribute.
         * @return  the descriptor for the <code>builtInType</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String> BUILT_IN_TYPE( ) {
            if ( __builtInType == null ) {
                __builtInType = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.String>( "45DDACEF3943D755BE2C43DD38ACDDDA8F7EC3F3", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "builtInType" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __builtInType;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.Boolean> __isValid;
        /**
         * Returns the descriptor for the <code>isValid</code> attribute.
         * @return  the descriptor for the <code>isValid</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.Boolean> IS_VALID( ) {
            if ( __isValid == null ) {
                __isValid = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.lang.Boolean>( "45DDACEFCC54D0D52A50464B12B7BA00F8AE916E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "isValid" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __isValid;
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
         * Returns the descriptor for the <code>index</code> reference.
         * @return  the descriptor for the <code>index</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtDataType,com.sap.ide.metamodel.dictionary.datatype.DtIndex> INDEX( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtDataType.DESCRIPTORS.INDEX( );
        }
        /**
         * Returns the descriptor for the <code>logicalDictionary</code> reference.
         * @return  the descriptor for the <code>logicalDictionary</code> reference
         */
        public com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtDataType,com.sap.ide.metamodel.dictionary.datatype.DtLogicalDictionary> LOGICAL_DICTIONARY( ) {
            return com.sap.ide.metamodel.dictionary.datatype.DtDataType.DESCRIPTORS.LOGICAL_DICTIONARY( );
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtExternalRepresentation> __externalRepresentation;
        /**
         * Returns the descriptor for the <code>externalRepresentation</code> reference.
         * @return  the descriptor for the <code>externalRepresentation</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtExternalRepresentation> EXTERNAL_REPRESENTATION( ) {
            if ( __externalRepresentation == null ) {
                __externalRepresentation = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtExternalRepresentation>( "45DDACEFE2AE06ED510E4F0A3210BDEA0F77D258", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "ExternalRepresentation" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __externalRepresentation;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType> __baseType;
        /**
         * Returns the descriptor for the <code>baseType</code> reference.
         * @return  the descriptor for the <code>baseType</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType> BASE_TYPE( ) {
            if ( __baseType == null ) {
                __baseType = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType>( "45DDACEF1923D2D5148B4390132DB34444043B5A", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "BaseType" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __baseType;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtSchemaType> __schemaType;
        /**
         * Returns the descriptor for the <code>schemaType</code> reference.
         * @return  the descriptor for the <code>schemaType</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtSchemaType> SCHEMA_TYPE( ) {
            if ( __schemaType == null ) {
                __schemaType = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtSchemaType>( "45DDACEF96BF09EFD8624E601E8EF131BADE2122", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "SchemaType" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __schemaType;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtDbProperty> __dbProperty;
        /**
         * Returns the descriptor for the <code>dbProperty</code> reference.
         * @return  the descriptor for the <code>dbProperty</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtDbProperty> DB_PROPERTY( ) {
            if ( __dbProperty == null ) {
                __dbProperty = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtDbProperty>( "45DDACEF958D5D27FCC34A4D07079EB11CC35E68", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "DbProperty" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __dbProperty;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtHint>> __hints;
        /**
         * Returns the descriptor for the <code>hints</code> reference.
         * @return  the descriptor for the <code>hints</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtHint>> HINTS( ) {
            if ( __hints == null ) {
                __hints = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,java.util.List<com.sap.ide.metamodel.dictionary.datatype.DtHint>>( "45DDACEF929716DC22944CCA3BD1AB360356732E", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "Hints" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __hints;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtTextObject> __texts;
        /**
         * Returns the descriptor for the <code>texts</code> reference.
         * @return  the descriptor for the <code>texts</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtTextObject> TEXTS( ) {
            if ( __texts == null ) {
                __texts = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtTextObject>( "45DDACEF23858D21CFBD4D7136FBC5EDAA19ED53", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "Texts" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __texts;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalInfo> __technicalInfo;
        /**
         * Returns the descriptor for the <code>technicalInfo</code> reference.
         * @return  the descriptor for the <code>technicalInfo</code> reference
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalInfo> TECHNICAL_INFO( ) {
            if ( __technicalInfo == null ) {
                __technicalInfo = new com.sap.tc.moin.repository.mmi.descriptors.ReferenceDescriptor<com.sap.tc.moin.repository.mmi.model.Reference,com.sap.ide.metamodel.dictionary.datatype.DtSimpleType,com.sap.ide.metamodel.dictionary.datatype.DtTechnicalInfo>( "45DDACEF446B40DA2B5A4E4A3172B4B640B1D2E8", "sap.com/tc/moin/webdynpro", new java.lang.String[] { "Dictionary", "datatype", "DtSimpleType", "TechnicalInfo" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 
            }
            return __technicalInfo;
        }
    }
}    