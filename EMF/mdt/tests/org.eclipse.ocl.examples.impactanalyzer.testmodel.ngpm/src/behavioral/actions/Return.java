/**
 * <copyright>
 * </copyright>
 *
 * $Id: Return.java,v 1.1 2011/02/07 17:16:09 auhl Exp $
 */
package behavioral.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Returns a value from a block. Must be the last statement of a block.
 * <!-- end-model-doc -->
 *
 *
 * @see behavioral.actions.ActionsPackage#getReturn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ReturnMustBeLastInBlock='self = self.block.statements->last()' ReturnTypeMustMatch='self.argument.getType().conformsTo(self.getOutermostBlock().getImplementedSignature().output)'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReturnMustBeLastInBlock ReturnTypeMustMatch'"
 * @generated
 */
public interface Return extends StatementWithArgument {
} // Return