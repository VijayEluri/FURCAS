/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface TextF extends com.sap.tc.moin.repository.mmi.reflect.RefObject {

    /**
     * Descriptors for all features of this MofClass and its supertypes.
     */
    public static final Descriptors DESCRIPTORS = new Descriptors( );

    // class extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF> CLASS_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.ClassDescriptor<com.sap.tc.moin.repository.mmi.reflect.RefClass, com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF>("4908664F4300FB55A5BE11DDC041001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", "testcasesfoundation", "case005f", "textverticalizationf", "TextF"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ 

    
    // attributes
    public int getMaxWidth() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setMaxWidth(int newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getOriginalText() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setOriginalText(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getResName() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setResName(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getResType() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setResType(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean isTranslate() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTranslate(boolean newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.lang.String getTransUnitId() throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public void setTransUnitId(java.lang.String newValue) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;


    public static final class Descriptors {
        Descriptors( ) { 
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.Integer> __maxWidth;
        /**
         * Returns the descriptor for the <code>maxWidth</code> attribute.
         * @return  the descriptor for the <code>maxWidth</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.Integer> MAX_WIDTH( ) {
            if ( __maxWidth == null ) {
                __maxWidth = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.Integer>( "4908664F42F9CF60A5BE11DD9247001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", new java.lang.String[] { "testcasesfoundation", "case005f", "textverticalizationf", "TextF", "maxWidth" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __maxWidth;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> __originalText;
        /**
         * Returns the descriptor for the <code>originalText</code> attribute.
         * @return  the descriptor for the <code>originalText</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> ORIGINAL_TEXT( ) {
            if ( __originalText == null ) {
                __originalText = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String>( "4908664F4300FB50A5BE11DDB32B001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", new java.lang.String[] { "testcasesfoundation", "case005f", "textverticalizationf", "TextF", "originalText" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __originalText;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> __resName;
        /**
         * Returns the descriptor for the <code>resName</code> attribute.
         * @return  the descriptor for the <code>resName</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> RES_NAME( ) {
            if ( __resName == null ) {
                __resName = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String>( "4908664F4300FB51A5BE11DD8F57001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", new java.lang.String[] { "testcasesfoundation", "case005f", "textverticalizationf", "TextF", "resName" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __resName;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> __resType;
        /**
         * Returns the descriptor for the <code>resType</code> attribute.
         * @return  the descriptor for the <code>resType</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> RES_TYPE( ) {
            if ( __resType == null ) {
                __resType = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String>( "4908664F4300FB52A5BE11DD9B7C001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", new java.lang.String[] { "testcasesfoundation", "case005f", "textverticalizationf", "TextF", "resType" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __resType;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.Boolean> __translate;
        /**
         * Returns the descriptor for the <code>translate</code> attribute.
         * @return  the descriptor for the <code>translate</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.Boolean> TRANSLATE( ) {
            if ( __translate == null ) {
                __translate = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.Boolean>( "4908664F4300FB53A5BE11DDC561001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", new java.lang.String[] { "testcasesfoundation", "case005f", "textverticalizationf", "TextF", "translate" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __translate;
        }
        private com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> __transUnitId;
        /**
         * Returns the descriptor for the <code>transUnitId</code> attribute.
         * @return  the descriptor for the <code>transUnitId</code> attribute
         */
        public synchronized com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String> TRANS_UNIT_ID( ) {
            if ( __transUnitId == null ) {
                __transUnitId = new com.sap.tc.moin.repository.mmi.descriptors.AttributeDescriptor<com.sap.tc.moin.repository.mmi.model.Attribute,com.sap.tc.moin.testcasesfoundation.case005f.textverticalizationf.TextF,java.lang.String>( "4908664F4300FB54A5BE11DDB603001558C93B47", "test.sap.com/tc/moin/metamodel/testcases/foundation", new java.lang.String[] { "testcasesfoundation", "case005f", "textverticalizationf", "TextF", "transUnitId" } ); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ 
            }
            return __transUnitId;
        }
    }
}    