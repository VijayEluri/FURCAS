/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.enums;

public final class LabelSupportEnumEnum implements com.sap.ide.metamodel.webdynpro.enums.LabelSupportEnum
{
    private static final long serialVersionUID = 1L;
    
    private final static String ENUMLABELNOTFOUNDPATTERN = "Enumeration label \"{0}\" is not defined for enumeration \"{1}\""; //$NON-NLS-1$

    private static final java.util.List<String> __QUALIFIED_NAME = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] { "WebDynpro", "enums", "LabelSupportEnum" })); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

    public static final LabelSupportEnumEnum NONE = new LabelSupportEnumEnum("none"); //$NON-NLS-1$
    public static final LabelSupportEnumEnum LABEL_ALLOWED = new LabelSupportEnumEnum("label_allowed"); //$NON-NLS-1$
    public static final LabelSupportEnumEnum LABEL_MANDATORY = new LabelSupportEnumEnum("label_mandatory"); //$NON-NLS-1$

    private static java.util.Map<String, LabelSupportEnum> __labelIds = new java.util.HashMap<String, LabelSupportEnum>();
    private java.lang.String __literalName;

    static {
       __labelIds.put("none", NONE); //$NON-NLS-1$
       __labelIds.put("label_allowed", LABEL_ALLOWED); //$NON-NLS-1$
       __labelIds.put("label_mandatory", LABEL_MANDATORY); //$NON-NLS-1$
    }

    // constructor is private
    private LabelSupportEnumEnum(java.lang.String literalName){
        this.__literalName = literalName;
    }

    public static LabelSupportEnum forName(java.lang.String value) {
        LabelSupportEnum result = __labelIds.get(value);
        if(result != null) {
            return result;
        }
        String message = new java.text.MessageFormat( ENUMLABELNOTFOUNDPATTERN ).format( new String[] { value, "LabelSupportEnumEnum" } ); //$NON-NLS-1$
        throw new java.lang.IllegalArgumentException(message);
    }

    public java.util.List<java.lang.String> refTypeName() {
        return __QUALIFIED_NAME;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return this.__literalName;
    }

    /* this is required by the specification */
    protected java.lang.Object readResolve() throws java.io.ObjectStreamException {
        try {
            return forName(__literalName);
        }
        catch(java.lang.IllegalArgumentException iae) {
            java.io.InvalidObjectException ioe = new java.io.InvalidObjectException(iae.getMessage());
            ioe.initCause(iae);
            throw ioe;
        }
    }
}