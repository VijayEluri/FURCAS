/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sap.furcas.metamodel.FURCAS.TCS.provider;


import com.sap.furcas.metamodel.FURCAS.TCS.IndentIncrBArg;

import com.sap.furcas.metamodel.FURCAS.TCS.TCSPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.sap.furcas.metamodel.FURCAS.TCS.IndentIncrBArg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IndentIncrBArgItemProvider
        extends BlockArgItemProvider
        implements
                IEditingDomainItemProvider,
                IStructuredItemContentProvider,
                ITreeItemContentProvider,
                IItemLabelProvider,
                IItemPropertySource {
        /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     */
        public IndentIncrBArgItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

        /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     */
        @Override
        public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addValuePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

        /**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_IndentIncrBArg_value_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_IndentIncrBArg_value_feature", "_UI_IndentIncrBArg_type"),
                 TCSPackage.Literals.INDENT_INCR_BARG__VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

        /**
     * This returns IndentIncrBArg.gif.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     */
        @Override
        public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/IndentIncrBArg"));
    }

        /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     */
        @Override
        public String getText(Object object) {
        Integer labelValue = ((IndentIncrBArg)object).getValue();
        String label = labelValue == null ? null : labelValue.toString();
        return label == null || label.length() == 0 ?
            getString("_UI_IndentIncrBArg_type") :
            getString("_UI_IndentIncrBArg_type") + " " + label;
    }

        /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     */
        @Override
        public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(IndentIncrBArg.class)) {
            case TCSPackage.INDENT_INCR_BARG__VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
        }
        super.notifyChanged(notification);
    }

        /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
     * @generated
     */
        @Override
        protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
