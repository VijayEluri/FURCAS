/**
 * Generated by the MOIN XM Generator Version 1.0 .
 */

package com.sap.tc.moin.xm.test.ps;

import com.sap.tc.moin.testcases.mc.test.Address;
import com.sap.tc.moin.testcases.mc.test.AddressesOfPerson;
import com.sap.tc.moin.testcases.mc.test.Company;
import com.sap.tc.moin.testcases.mc.test.Customer;
import com.sap.tc.moin.testcases.mc.test.CustomersOrEmployeesOfCompany;
import com.sap.tc.moin.testcases.mc.test.Employee;
import com.sap.tc.moin.testcases.mc.test.Equipment;
import com.sap.tc.moin.testcases.mc.test.EquipmentsOfEmployee;
import com.sap.tc.moin.testcases.mc.test.Street;
import com.sap.tc.moin.testcases.mc.test.StreetOfAddress;

/**
 * XM Serializer for XML documents which are valid to the XML schema
 * "/LocalDevelopment~LocalDevelopment~abc~demo.sap.com/test/testPerson.xsd".
 */
public class PersonSerializer extends com.sap.tc.moin.repository.xm.serializer.XmCustomSerializerAbstract {

    /** Prefix for the no-namespace. */
    protected static final java.lang.String PREFIX_ = ""; //$NON-NLS-1$

    /** Prefix for the namespace "http://sap.com/moin/xm/test/Person". */
    protected static final java.lang.String PREFIX_ns1 = "ns1"; //$NON-NLS-1$


    /* Qualified names of the XML elements. */
    protected static final java.lang.String ELEMENT_ns1_address = PREFIX_ns1 + ":address"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_town = PREFIX_ns1 + ":town"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_street = PREFIX_ns1 + ":street"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_name = PREFIX_ns1 + ":name"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_number = PREFIX_ns1 + ":number"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_company = PREFIX_ns1 + ":company"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_title = PREFIX_ns1 + ":title"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_equipment = PREFIX_ns1 + ":equipment"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_employee = PREFIX_ns1 + ":employee"; //$NON-NLS-1$

    protected static final java.lang.String ELEMENT_ns1_customer = PREFIX_ns1 + ":customer"; //$NON-NLS-1$


    /* Qualified names of the XML attributes. */
    protected static final java.lang.String ATTRIBUTE__id = PREFIX_ + "id"; //$NON-NLS-1$


    /**
     * Constructor. Calls the method {@link #registerPrefixes()}.
     */
    public PersonSerializer( ) {

        super( );
        registerPrefixes( );
    }

    /**
     * Registers the prefixes for the namespaces. For each namespace a prefix
     * must be registered. The registered prefix definitions are written to the
     * output stream by the first call of the method
     * {@link #startTag(java.lang.String)}.
     */
    protected void registerPrefixes( ) {

        registerPrefixForNamespace( "http://sap.com/moin/xm/test/Person", PREFIX_ns1 ); //$NON-NLS-1$    
    }

    @Override
    protected void execute( ) throws com.sap.tc.moin.repository.xm.XmException {

        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement : getModelElements( Company.CLASS_DESCRIPTOR ) ) {
            startTag( ELEMENT_ns1_company );
            writeNs1ECompany( modelElement );
            closeTag( );
        }
    }

//    /**
//     * Writes the content model of the document root
//     * "DocumentRoot (http://sap.com/moin/xm/test/Person)" to the output stream.
//     * 
//     * @param modelElement model element from which attribute values or links
//     * are read
//     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
//     * handling, this implementation does not throw such an exception
//     * @throws NullpointerException if the parameter is <code>null</code>
//     */
//    protected void writeNs1RDocumentRoot( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {
//
//        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, com.sap.moin.xm.test.person.DocumentRootAddress.ASSOCIATION_DESCRIPTOR, "address" ) ) { //$NON-NLS-1$
//            startTag( ELEMENT_ns1_address );
//            writeNs1EAddress( linkedModelElement );
//            closeTag( );
//        }
//        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, com.sap.moin.xm.test.person.DocumentRootCompany.ASSOCIATION_DESCRIPTOR, "company" ) ) { //$NON-NLS-1$
//            startTag( ELEMENT_ns1_company );
//            writeNs1ECompany( linkedModelElement );
//            closeTag( );
//        }
//        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, com.sap.moin.xm.test.person.DocumentRootPerson.ASSOCIATION_DESCRIPTOR, "person" ) ) { //$NON-NLS-1$
//            startTag( ELEMENT_ns1_customer );
//            writeNs1CPerson( linkedModelElement );
//            closeTag( );
//        }
//        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, com.sap.moin.xm.test.person.DocumentRootEmployee.ASSOCIATION_DESCRIPTOR, "employee" ) ) { //$NON-NLS-1$
//            startTag( ELEMENT_ns1_employee );
//            writeNs1EEmployee( linkedModelElement );
//            closeTag( );
//        }
//        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, com.sap.moin.xm.test.person.DocumentRootEquipment.ASSOCIATION_DESCRIPTOR, "equipment" ) ) { //$NON-NLS-1$
//            startTag( ELEMENT_ns1_equipment );
//            writeNs1EEquipment( linkedModelElement );
//            closeTag( );
//        }
//    }

    /**
     * Writes the content model of the global element declaration
     * "address (http://sap.com/moin/xm/test/Person)" to the output stream.
     * 
     * @param modelElement model element from which attribute values or links
     * are read
     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
     * handling, this implementation does not throw such an exception
     * @throws NullpointerException if the parameter is <code>null</code>
     */
    protected void writeNs1EAddress( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {

        addElement( ELEMENT_ns1_town, modelElement, Address.DESCRIPTORS.TOWN( ) );
        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, StreetOfAddress.ASSOCIATION_DESCRIPTOR, "street" ) ) { //$NON-NLS-1$
            startTag( ELEMENT_ns1_street );
            writeLNs1EAddress_L_Ns1Street( linkedModelElement );
            closeTag( );
        }
    }

    /**
     * Writes the content model of the local element declaration
     * "street (http://sap.com/moin/xm/test/Person)" to the output stream.
     * 
     * @param modelElement model element from which attribute values or links
     * are read
     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
     * handling, this implementation does not throw such an exception
     * @throws NullpointerException if the parameter is <code>null</code>
     */
    protected void writeLNs1EAddress_L_Ns1Street( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {

        addElement( ELEMENT_ns1_name, modelElement, Street.DESCRIPTORS.NAME( ) );
        addElement( ELEMENT_ns1_number, modelElement, Street.DESCRIPTORS.NUMBER( ) );
    }

    /**
     * Writes the content model of the global element declaration
     * "company (http://sap.com/moin/xm/test/Person)" to the output stream.
     * 
     * @param modelElement model element from which attribute values or links
     * are read
     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
     * handling, this implementation does not throw such an exception
     * @throws NullpointerException if the parameter is <code>null</code>
     */
    protected void writeNs1ECompany( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {

        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, CustomersOrEmployeesOfCompany.ASSOCIATION_DESCRIPTOR, "persons" ) ) { //$NON-NLS-1$
            if ( Employee.CLASS_DESCRIPTOR.equals( linkedModelElement.getType( ) ) ) {
                startTag( ELEMENT_ns1_employee );
                writeNs1EEmployee( linkedModelElement );
                closeTag( );
            } else {
                startTag( ELEMENT_ns1_customer );
                writeNs1CPerson( linkedModelElement );
                closeTag( );
            }

        }
    }

    /**
     * Writes the content model of the global element declaration
     * "employee (http://sap.com/moin/xm/test/Person)" to the output stream.
     * 
     * @param modelElement model element from which attribute values or links
     * are read
     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
     * handling, this implementation does not throw such an exception
     * @throws NullpointerException if the parameter is <code>null</code>
     */
    protected void writeNs1EEmployee( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {

        addElement( ELEMENT_ns1_name, modelElement, Employee.DESCRIPTORS.NAME( ) );
        addElement( ELEMENT_ns1_title, modelElement, Employee.DESCRIPTORS.TITLE( ) );
        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, AddressesOfPerson.ASSOCIATION_DESCRIPTOR, "addresses" ) ) { //$NON-NLS-1$
            startTag( ELEMENT_ns1_address );
            writeNs1EAddress( linkedModelElement );
            closeTag( );
        }
        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, EquipmentsOfEmployee.ASSOCIATION_DESCRIPTOR, "equipments" ) ) { //$NON-NLS-1$
            startTag( ELEMENT_ns1_equipment );
            writeNs1EEquipment( linkedModelElement );
            closeTag( );
        }
    }

    /**
     * Writes the content model of the global element declaration
     * "equipment (http://sap.com/moin/xm/test/Person)" to the output stream.
     * 
     * @param modelElement model element from which attribute values or links
     * are read
     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
     * handling, this implementation does not throw such an exception
     * @throws NullpointerException if the parameter is <code>null</code>
     */
    protected void writeNs1EEquipment( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {

        addAttribute( ATTRIBUTE__id, modelElement, Equipment.DESCRIPTORS.ID( ) );
    }

    /**
     * Writes the content model of the global complex type definition
     * "person (http://sap.com/moin/xm/test/Person)" to the output stream.
     * 
     * @param modelElement model element from which attribute values or links
     * are read
     * @throws com.sap.tc.moin.repository.xm.XmException can be used for error
     * handling, this implementation does not throw such an exception
     * @throws NullpointerException if the parameter is <code>null</code>
     */
    protected void writeNs1CPerson( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle modelElement ) throws com.sap.tc.moin.repository.xm.XmException {

        addElement( ELEMENT_ns1_name, modelElement, Customer.DESCRIPTORS.NAME( ) );
        addElement( ELEMENT_ns1_title, modelElement, Customer.DESCRIPTORS.TITLE( ) );
        for ( final com.sap.tc.moin.repository.xm.serializer.SModelElementHandle linkedModelElement : getLinks( modelElement, AddressesOfPerson.ASSOCIATION_DESCRIPTOR, "addresses" ) ) { //$NON-NLS-1$
            startTag( ELEMENT_ns1_address );
            writeNs1EAddress( linkedModelElement );
            closeTag( );
        }
    }



}