/**
 * Generated by the MOIN Generator Version 3.0
 **/

package com.sap.tc.moin.repository.mmi.model.__impl;

public interface ModelPackageInternal extends com.sap.tc.moin.repository.mmi.reflect.RefPackage
{
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getModelElement(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getNamespace(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getGeneralizableElement(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getTypedElement(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getClassifier(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMofClass(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getDataType(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getFeature(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getStructuralFeature(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAttribute(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getReference(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getBehavioralFeature(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getOperation(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMofException(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAssociation(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAssociationEnd(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getMofPackage(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getImport(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getParameter(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConstraint(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getConstant(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getTag(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getPrimitiveType(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getStructureType(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getEnumerationType(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAliasType(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getStructureField(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getCollectionType(com.sap.tc.moin.repository.core.CoreConnection connection);
    // associations
    public com.sap.tc.moin.repository.mmi.model.AttachesTo getAttachesTo(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.DependsOn getDependsOn(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.Contains getContains(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.Generalizes getGeneralizes(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.Aliases getAliases(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.Constrains getConstrains(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.CanRaise getCanRaise(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.Exposes getExposes(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.RefersTo getRefersTo(com.sap.tc.moin.repository.core.CoreConnection connection);
    public com.sap.tc.moin.repository.mmi.model.IsOfType getIsOfType(com.sap.tc.moin.repository.core.CoreConnection connection);
    // structure type creators
    public com.sap.tc.moin.repository.mmi.model.MultiplicityType createMultiplicityType(com.sap.tc.moin.repository.core.CoreConnection connection, com.sap.tc.moin.repository.mmi.descriptors.StructureFieldContainer<? super com.sap.tc.moin.repository.mmi.model.MultiplicityType> structureFieldContainer) throws com.sap.tc.moin.repository.mmi.reflect.JmiException;
}