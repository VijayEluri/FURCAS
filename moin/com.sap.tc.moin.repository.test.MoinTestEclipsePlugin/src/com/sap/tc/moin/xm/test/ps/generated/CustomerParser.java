/**
 * Generated by the MOIN XM Generator Version 1.0 .
 */

package com.sap.tc.moin.xm.test.ps.generated;

/**
 * Parser handler for XML documents valid to the XML schema "bundleresource://149/com/sap/tc/moin/repository/test/extensions/xm/generation/xsd/customer.xsd".
 */
public class CustomerParser extends com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract {

     /** Prefix for the no-namespace.  */
    protected static final java.lang.String PREFIX_ = ""; //$NON-NLS-1$
    
    /** Prefix for the namespace "http://www.sap.com/moin/xm/test/customer". */
    protected static final java.lang.String PREFIX_ns1 = "ns1"; //$NON-NLS-1$


    /* Local names of the XML elements. */
    protected static final java.lang.String ELEMENT_Customer = "Customer"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_name = "name"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_Address = "Address"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_street = "street"; //$NON-NLS-1$


    /*Local names of the XML attributes. */
    protected static final java.lang.String ATTRIBUTE_ID = "ID"; //$NON-NLS-1$


    /**
     * Constructor. Calls the methods {@link #registerPrefixes()} and
     * {@link #registerHandlers()}.
     */
    public CustomerParser( ) {
    
        super();
        registerPrefixes( );
        registerHandlers( );   
    }

    /**
     * Registers the prefixes for the namespaces. For each namespace in the
     * source XML document a prefix must be registered.
     */
    protected void registerPrefixes( ) {
    
        registerPrefixForNamespace( "http://www.sap.com/moin/xm/test/customer", PREFIX_ns1 ); //$NON-NLS-1$    
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
    
        registerHandler(Ns1CCustomer.class.getName( ), new Ns1CCustomer( this ) );
        registerHandler(LNs1CCustomer_L_Address.class.getName( ), new LNs1CCustomer_L_Address( this ) );   
    }
    
    @Override
    protected void rootElementStarted( ) {
    
        createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.xm.test.customer.DocumentRoot.CLASS_DESCRIPTOR, getClass( ).getName( ) );
    }
    
    @Override
    protected com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler getRootComplexTypeHandler( final java.lang.String localName, final java.lang.String prefix ) throws com.sap.tc.moin.repository.xm.XmException {
     
        if ( PREFIX_ns1.equals( prefix ) ) {
            if ( ELEMENT_Customer.equals( localName ) ) {
                return getHandler( Ns1CCustomer.class.getName( ) );
            }
        
        }
     
        return null;
    }

    @Override
    protected void rootElementClosed( final com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler childHandler, final java.lang.String childPrefix, final java.lang.String childLocalName ) throws com.sap.tc.moin.repository.xm.XmException {
    
        if ( PREFIX_ns1.equals( childPrefix ) ) {
            if ( ELEMENT_Customer.equals( childLocalName ) ) {
                createLink( getStack( ).getModelElement( childHandler.getClass( ).getName( ) ), getStack( ).getModelElement( getClass( ).getName( ) ), com.sap.moin.xm.test.customer.DocumentRootCustomer.ASSOCIATION_DESCRIPTOR, "customer" ); //$NON-NLS-1$
            }
        }
    }

        
    /* --------------------------- sub-handlers ---------------- */
    
    /**
     * Handler for global complex type definition "Customer (http://www.sap.com/moin/xm/test/customer)".
     */
    public static class Ns1CCustomer extends com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler {
    
        public Ns1CCustomer( final com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract parser ) {
    
            super( parser );
        }
     
        @Override
        public void elementStarted(final java.lang.String value ) {
        
            createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.xm.test.customer.Customer.CLASS_DESCRIPTOR, getClass( ).getName( ) );
        }
     
        @Override
        public com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler getChild( final java.lang.String childName, final java.lang.String childPrefix ) {
            
            if ( PREFIX_.equals( childPrefix ) ) {
                if ( ELEMENT_Address.equals( childName ) ) {
                    return getHandler( LNs1CCustomer_L_Address.class.getName( ) );
                }
            
            }
        
            return null;
        }
     
        @Override
        public boolean addSimpleElementOrAttribute( final java.lang.String localName, final java.lang.String prefix, final com.sap.tc.moin.repository.xm.parser.NodeType type, final java.lang.String value ) throws com.sap.tc.moin.repository.xm.XmException{
        
            if ( com.sap.tc.moin.repository.xm.parser.NodeType.Element.equals( type ) ) {
                if ( PREFIX_.equals( prefix ) ) {
                   if ( ELEMENT_name.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.xm.test.customer.Customer.DESCRIPTORS.NAME( ), value );
                       return true; 	
                   }  
                }
                	
            }
            if ( com.sap.tc.moin.repository.xm.parser.NodeType.Attribute.equals( type ) ) {
                if ( PREFIX_.equals( prefix ) ) {
                   if ( ATTRIBUTE_ID.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.xm.test.customer.Customer.DESCRIPTORS.I_D( ), value );
                       return true; 	
                   }  
                }
                	     
            }
            return false;
        }	
     
        @Override
        public void childClosed( final com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler childHandler, final java.lang.String childPrefix, final java.lang.String childLocalName ) throws com.sap.tc.moin.repository.xm.XmException {
            if ( PREFIX_.equals( childPrefix ) ) {
                if ( ELEMENT_Address.equals( childLocalName ) ) {
                    createLink( childHandler.getClass( ).getName( ), getClass( ).getName( ), com.sap.moin.xm.test.customer.PersonAddress.ASSOCIATION_DESCRIPTOR, "address" ); //$NON-NLS-1$
                }
            }
        }
    }
    /**
     * Handler for local element declaration "Address".
     */
    public static class LNs1CCustomer_L_Address extends com.sap.tc.moin.repository.xm.parser.ComplexTypeHandler {
    
        public LNs1CCustomer_L_Address( final com.sap.tc.moin.repository.xm.parser.XmParserHandlerAbstract parser ) {
    
            super( parser );
        }
     
        @Override
        public void elementStarted(final java.lang.String value ) {
        
            createOrGetModelElementAndPutToTopStackEntry( com.sap.moin.xm.test.customer.Address.CLASS_DESCRIPTOR, getClass( ).getName( ) );
        }
     
        @Override
        public boolean addSimpleElementOrAttribute( final java.lang.String localName, final java.lang.String prefix, final com.sap.tc.moin.repository.xm.parser.NodeType type, final java.lang.String value ) throws com.sap.tc.moin.repository.xm.XmException{
        
            if ( com.sap.tc.moin.repository.xm.parser.NodeType.Element.equals( type ) ) {
                if ( PREFIX_.equals( prefix ) ) {
                   if ( ELEMENT_street.equals( localName ) ) {
                       setOrAddAttributeValue( getClass( ).getName( ), com.sap.moin.xm.test.customer.Address.DESCRIPTORS.STREET( ), value );
                       return true; 	
                   }  
                }
                	
            }
            return false;
        }	
    }  

}