/**
 * Generated by the MOIN Generator Version 3.0
 **/

package org.omg.ocl.attaching;
/**
 * This interface is not intended to be implemented by clients.
 */
public interface OperationBodyDefinition extends com.sap.tc.moin.repository.mmi.reflect.RefAssociation
{
    // association extent descriptor
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.attaching.OperationBodyDefinition> ASSOCIATION_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.AssociationDescriptor<org.omg.ocl.attaching.OperationBodyDefinition>("45ED2E2931823687B9EA4F3B2FA8D1089389DA6A", "sap.com/tc/moin/mof_1.4", "OCL", "Attaching", "OperationBodyDefinition"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ 


    // association interface
    public boolean exists(org.omg.ocl.expressions.OclExpression _Body, com.sap.tc.moin.repository.mmi.model.Operation _Defines) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public org.omg.ocl.expressions.OclExpression getBody(com.sap.tc.moin.repository.mmi.model.Operation _Defines) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public java.util.Collection<com.sap.tc.moin.repository.mmi.model.Operation> getDefines(org.omg.ocl.expressions.OclExpression _Body) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean add(org.omg.ocl.expressions.OclExpression _Body, com.sap.tc.moin.repository.mmi.model.Operation _Defines) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
    public boolean remove(org.omg.ocl.expressions.OclExpression _Body, com.sap.tc.moin.repository.mmi.model.Operation _Defines) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}