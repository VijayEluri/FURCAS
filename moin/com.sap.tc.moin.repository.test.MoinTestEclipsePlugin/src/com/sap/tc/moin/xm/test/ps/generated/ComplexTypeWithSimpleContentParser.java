/**
 * Generated by the MOIN XM Generator Version 1.0 .
 */

package com.sap.tc.moin.xm.test.ps.generated;

/**
 * Parser handler for XML documents valid to the XML schema "bundleresource://149/com/sap/tc/moin/repository/test/extensions/xm/generation/xsd/ComplexTypeWithSimpleContent.xsd".
 */
public class ComplexTypeWithSimpleContentParser extends com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract {

     /** Prefix for the no-namespace.  */
    protected static final java.lang.String PREFIX_ = ""; //$NON-NLS-1$
    
    /** Prefix for the namespace "http://sap.com/moin/test/simpleContent". */
    protected static final java.lang.String PREFIX_ns1 = "ns1"; //$NON-NLS-1$


    /* Local names of the XML elements. */
    protected static final java.lang.String ELEMENT_elementExtension = "elementExtension"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_elementRestriction = "elementRestriction"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_root = "root"; //$NON-NLS-1$


    /*Local names of the XML attributes. */
    protected static final java.lang.String ATTRIBUTE_attr = "attr"; //$NON-NLS-1$

    protected static final java.lang.String ATTRIBUTE_value = "value"; //$NON-NLS-1$


    /**
     * Constructor. Calls the methods {@link #registerPrefixes()} and
     * {@link #registerHandlers()}.
     */
    public ComplexTypeWithSimpleContentParser( ) {
    
        super();
        registerPrefixes( );
        registerHandlers( );   
    }

    /**
     * Registers the prefixes for the namespaces. For each namespace in the
     * source XML document a prefix must be registered.
     */
    protected void registerPrefixes( ) {
    
        registerPrefixForNamespace( "http://sap.com/moin/test/simpleContent", PREFIX_ns1 ); //$NON-NLS-1$    
    }

    /**
     * Registers sub-handler instances to which this handler will dispatch the
     * SAX events. The qualified class name of the sub-handler classes are used
     * as registration IDs.
     * <p>
     * If you want to replace an instance with the registration ID
     * "com.sap.example.NodeTest" by your own implementation "MyNode" then you
     * have to call the method
     * {@link com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract#registerHandler(java.lang.String, com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler)}
     * with id ="com.sap.example.NodeTest" and handler="new MyNode(this)".
     * <p>
     * If you want that a certain XML element with its sub-elements is not
     * mapped to MOIN entities, then you must unregister the corresponding
     * sub-handler; use the method
     * {@link com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract#unregisterHandler(java.lang.String)} .
     */
    protected void registerHandlers( ) {
    
        registerHandler(Ns1CSimpleContentExtension.class.getName( ), new Ns1CSimpleContentExtension( this ) );
        registerHandler(Ns1CSimpleContentRestriction.class.getName( ), new Ns1CSimpleContentRestriction( this ) );
        registerHandler(Ns1ERoot.class.getName( ), new Ns1ERoot( this ) );   
    }
    
    @Override
    protected void rootElementStarted( ) {
    
        createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.test.simplecontent.DocumentRoot.CLASS_DESCRIPTOR, getClass( ).getName( ) );
    }
    
    @Override
    protected com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler getRootComplexTypeHandler( final java.lang.String localName, final java.lang.String prefix ) throws com.sap.tc.moin.repository.xm.XmException {
     
        if ( PREFIX_ns1.equals( prefix ) ) {
            if ( ELEMENT_elementExtension.equals( localName ) ) {
                return getHandler( Ns1CSimpleContentExtension.class.getName( ) );
            }
            if ( ELEMENT_elementRestriction.equals( localName ) ) {
                return getHandler( Ns1CSimpleContentRestriction.class.getName( ) );
            }
            if ( ELEMENT_root.equals( localName ) ) {
                return getHandler( Ns1ERoot.class.getName( ) );
            }
        
        }
     
        return null;
    }

    @Override
    protected void rootElementClosed( final com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler childHandler, final java.lang.String childPrefix, final java.lang.String childLocalName ) throws com.sap.tc.moin.repository.xm.XmException {
    
        if ( PREFIX_ns1.equals( childPrefix ) ) {
            if ( ELEMENT_elementExtension.equals( childLocalName ) ) {
                createLink( getStack( ).getModelElement( childHandler.getClass( ).getName( ) ), getStack( ).getModelElement( getClass( ).getName( ) ), com.sap.moin.test.simplecontent.DocumentRootSimpleContentExtension.ASSOCIATION_DESCRIPTOR, "simpleContentExtension" ); //$NON-NLS-1$
            }
            else if ( ELEMENT_elementRestriction.equals( childLocalName ) ) {
                createLink( getStack( ).getModelElement( childHandler.getClass( ).getName( ) ), getStack( ).getModelElement( getClass( ).getName( ) ), com.sap.moin.test.simplecontent.DocumentRootSimpleContentRestriction.ASSOCIATION_DESCRIPTOR, "simpleContentRestriction" ); //$NON-NLS-1$
            }
            else if ( ELEMENT_root.equals( childLocalName ) ) {
                createLink( getStack( ).getModelElement( childHandler.getClass( ).getName( ) ), getStack( ).getModelElement( getClass( ).getName( ) ), com.sap.moin.test.simplecontent.DocumentRootRoot.ASSOCIATION_DESCRIPTOR, "root" ); //$NON-NLS-1$
            }
        
        }
    }

        
    /* --------------------------- sub-handlers ---------------- */
    
    /**
     * Handler for global complex type definition "simpleContentExtension (http://sap.com/moin/test/simpleContent)".
     */
    public static class Ns1CSimpleContentExtension extends com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler {
    
        public Ns1CSimpleContentExtension( final com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract parser ) {
    
            super( parser );
        }
     
        @Override
        public void elementStarted(final java.lang.String value ) {
         
            final com.sap.tc.moin.repository.xm.parser.PModelElementHandle modelElement = createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.test.simplecontent.SimpleContentExtension.CLASS_DESCRIPTOR, getClass( ).getName( ) );
            // simple content
            modelElement.setOrAddAttribute(com.sap.moin.test.simplecontent.SimpleContentExtension.DESCRIPTORS.VALUE(), value);
        }
     
        @Override
        public boolean addSimpleElementOrAttribute( final java.lang.String localName, final java.lang.String prefix, final com.sap.tc.moin.repository.xm.parser.NodeType type, final java.lang.String value ) throws com.sap.tc.moin.repository.xm.XmException{
        
            if ( com.sap.tc.moin.repository.xm.parser.NodeType.Attribute.equals( type ) ) {
                if ( PREFIX_.equals( prefix ) ) {
                   if ( ATTRIBUTE_attr.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.test.simplecontent.SimpleContentExtension.DESCRIPTORS.ATTR( ), value );
                       return true; 	
                   }
                   if ( ATTRIBUTE_value.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.test.simplecontent.SimpleContentExtension.DESCRIPTORS.VALUE_ATTRIBUTE( ), value );
                       return true; 	
                   }  
                }
                	     
            }
            return false;
        }	
    }
    /**
     * Handler for global complex type definition "simpleContentRestriction (http://sap.com/moin/test/simpleContent)".
     */
    public static class Ns1CSimpleContentRestriction extends com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler {
    
        public Ns1CSimpleContentRestriction( final com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract parser ) {
    
            super( parser );
        }
     
        @Override
        public void elementStarted(final java.lang.String value ) {
         
            final com.sap.tc.moin.repository.xm.parser.PModelElementHandle modelElement = createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.test.simplecontent.SimpleContentRestriction.CLASS_DESCRIPTOR, getClass( ).getName( ) );
            // simple content
            modelElement.setOrAddAttribute(com.sap.moin.test.simplecontent.SimpleContentRestriction.DESCRIPTORS.VALUE(), value);
        }
     
        @Override
        public boolean addSimpleElementOrAttribute( final java.lang.String localName, final java.lang.String prefix, final com.sap.tc.moin.repository.xm.parser.NodeType type, final java.lang.String value ) throws com.sap.tc.moin.repository.xm.XmException{
        
            if ( com.sap.tc.moin.repository.xm.parser.NodeType.Attribute.equals( type ) ) {
                if ( PREFIX_.equals( prefix ) ) {
                   if ( ATTRIBUTE_attr.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.test.simplecontent.SimpleContentRestriction.DESCRIPTORS.ATTR( ), value );
                       return true; 	
                   }
                   if ( ATTRIBUTE_value.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.test.simplecontent.SimpleContentRestriction.DESCRIPTORS.VALUE_ATTRIBUTE( ), value );
                       return true; 	
                   }  
                }
                	     
            }
            return false;
        }	
    }
    /**
     * Handler for global element declaration "root (http://sap.com/moin/test/simpleContent)".
     */
    public static class Ns1ERoot extends com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler {
    
        public Ns1ERoot( final com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract parser ) {
    
            super( parser );
        }
     
        @Override
        public void elementStarted(final java.lang.String value ) {
        
            createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.test.simplecontent.Root.CLASS_DESCRIPTOR, getClass( ).getName( ) );
        }
     
        @Override
        public com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler getChild( final java.lang.String childName, final java.lang.String childPrefix ) {
            
            if ( PREFIX_ns1.equals( childPrefix ) ) {
                if ( ELEMENT_elementExtension.equals( childName ) ) {
                    return getHandler( Ns1CSimpleContentExtension.class.getName( ) );
                }
                if ( ELEMENT_elementRestriction.equals( childName ) ) {
                    return getHandler( Ns1CSimpleContentRestriction.class.getName( ) );
                }
            
            }
        
            return null;
        }
     
        @Override
        public void childClosed( final com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler childHandler, final java.lang.String childPrefix, final java.lang.String childLocalName ) throws com.sap.tc.moin.repository.xm.XmException {
            if ( PREFIX_ns1.equals( childPrefix ) ) {
                if ( ELEMENT_elementExtension.equals( childLocalName ) ) {
                    createLink( childHandler.getClass( ).getName( ), getClass( ).getName( ), com.sap.moin.test.simplecontent.RootSimpleContentExtension.ASSOCIATION_DESCRIPTOR, "simpleContentExtension" ); //$NON-NLS-1$
                }
                else if ( ELEMENT_elementRestriction.equals( childLocalName ) ) {
                    createLink( childHandler.getClass( ).getName( ), getClass( ).getName( ), com.sap.moin.test.simplecontent.RootSimpleContentRestriction.ASSOCIATION_DESCRIPTOR, "simpleContentRestriction" ); //$NON-NLS-1$
                }
            
            }
        }
    }  

}