/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.webdynpro.component.view.uielement;

public final class BusinessGraphicsDimensionEnum implements com.sap.ide.metamodel.webdynpro.component.view.uielement.BusinessGraphicsDimension
{
    private static final long serialVersionUID = 1L;
    
    private final static String ENUMLABELNOTFOUNDPATTERN = "Enumeration label \"{0}\" is not defined for enumeration \"{1}\""; //$NON-NLS-1$

    private static final java.util.List<String> __QUALIFIED_NAME = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new String[] { "WebDynpro", "component", "view", "uielement", "BusinessGraphicsDimension" })); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$

    public static final BusinessGraphicsDimensionEnum TWO = new BusinessGraphicsDimensionEnum("two"); //$NON-NLS-1$
    public static final BusinessGraphicsDimensionEnum PSEUDO_THREE = new BusinessGraphicsDimensionEnum("pseudo_three"); //$NON-NLS-1$
    public static final BusinessGraphicsDimensionEnum THREE = new BusinessGraphicsDimensionEnum("three"); //$NON-NLS-1$

    private static java.util.Map<String, BusinessGraphicsDimension> __labelIds = new java.util.HashMap<String, BusinessGraphicsDimension>();
    private java.lang.String __literalName;

    static {
       __labelIds.put("two", TWO); //$NON-NLS-1$
       __labelIds.put("pseudo_three", PSEUDO_THREE); //$NON-NLS-1$
       __labelIds.put("three", THREE); //$NON-NLS-1$
    }

    // constructor is private
    private BusinessGraphicsDimensionEnum(java.lang.String literalName){
        this.__literalName = literalName;
    }

    public static BusinessGraphicsDimension forName(java.lang.String value) {
        BusinessGraphicsDimension result = __labelIds.get(value);
        if(result != null) {
            return result;
        }
        String message = new java.text.MessageFormat( ENUMLABELNOTFOUNDPATTERN ).format( new String[] { value, "BusinessGraphicsDimensionEnum" } ); //$NON-NLS-1$
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