/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.ide.metamodel.dictionary.datatype;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface AScalarTypeComponent extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.AScalarTypeComponent> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<com.sap.ide.metamodel.dictionary.datatype.AScalarTypeComponent>("45DDACEFD22B5E0AA23D4B4B189ADEC56F90BBEE", "sap.com/tc/moin/webdynpro", "Dictionary", "datatype", "A_ScalarType_Component"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(com.sap.ide.metamodel.dictionary.datatype.DtScalarType _ScalarType, com.sap.ide.metamodel.dictionary.datatype.DtTypeComponent _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtScalarType getScalarType(com.sap.ide.metamodel.dictionary.datatype.DtTypeComponent _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public com.sap.ide.metamodel.dictionary.datatype.DtTypeComponent getComponent(com.sap.ide.metamodel.dictionary.datatype.DtScalarType _ScalarType) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(com.sap.ide.metamodel.dictionary.datatype.DtScalarType _ScalarType, com.sap.ide.metamodel.dictionary.datatype.DtTypeComponent _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(com.sap.ide.metamodel.dictionary.datatype.DtScalarType _ScalarType, com.sap.ide.metamodel.dictionary.datatype.DtTypeComponent _Component) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}