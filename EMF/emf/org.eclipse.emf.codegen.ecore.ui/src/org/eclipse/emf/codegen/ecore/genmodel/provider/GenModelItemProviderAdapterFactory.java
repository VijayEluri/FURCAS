/**
 * <copyright> 
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: GenModelItemProviderAdapterFactory.java,v 1.8 2008/12/13 15:54:03 emerks Exp $
 */
package org.eclipse.emf.codegen.ecore.genmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.util.GenModelAdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenModelItemProviderAdapterFactory extends GenModelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenModelItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenModelItemProvider genModelItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenModel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenModelAdapter()
  {
    if (genModelItemProvider == null)
    {
      genModelItemProvider = new GenModelItemProvider(this);
    }

    return genModelItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenPackageItemProvider genPackageItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenPackage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenPackageAdapter()
  {
    if (genPackageItemProvider == null)
    {
      genPackageItemProvider = new GenPackageItemProvider(this);
    }

    return genPackageItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenClass} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenClassItemProvider genClassItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenClassAdapter()
  {
    if (genClassItemProvider == null)
    {
      genClassItemProvider = new GenClassItemProvider(this);
    }

    return genClassItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenFeatureItemProvider genFeatureItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenFeature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenFeatureAdapter()
  {
    if (genFeatureItemProvider == null)
    {
      genFeatureItemProvider = new GenFeatureItemProvider(this);
    }

    return genFeatureItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenEnum} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenEnumItemProvider genEnumItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenEnum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenEnumAdapter()
  {
    if (genEnumItemProvider == null)
    {
      genEnumItemProvider = new GenEnumItemProvider(this);
    }

    return genEnumItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenEnumLiteralItemProvider genEnumLiteralItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenEnumLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenEnumLiteralAdapter()
  {
    if (genEnumLiteralItemProvider == null)
    {
      genEnumLiteralItemProvider = new GenEnumLiteralItemProvider(this);
    }

    return genEnumLiteralItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenDataTypeItemProvider genDataTypeItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenDataType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenDataTypeAdapter()
  {
    if (genDataTypeItemProvider == null)
    {
      genDataTypeItemProvider = new GenDataTypeItemProvider(this);
    }

    return genDataTypeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenOperation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenOperationItemProvider genOperationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenOperation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenOperationAdapter()
  {
    if (genOperationItemProvider == null)
    {
      genOperationItemProvider = new GenOperationItemProvider(this);
    }

    return genOperationItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GenAnnotationItemProvider genAnnotationItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.codegen.ecore.genmodel.GenAnnotation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createGenAnnotationAdapter()
  {
    if (genAnnotationItemProvider == null)
    {
      genAnnotationItemProvider = new GenAnnotationItemProvider(this);
    }

    return genAnnotationItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void dispose()
  {
    if (genModelItemProvider != null) genModelItemProvider.dispose();
    if (genPackageItemProvider != null) genPackageItemProvider.dispose();
    if (genClassItemProvider != null) genClassItemProvider.dispose();
    if (genFeatureItemProvider != null) genFeatureItemProvider.dispose();
    if (genEnumItemProvider != null) genEnumItemProvider.dispose();
    if (genEnumLiteralItemProvider != null) genEnumLiteralItemProvider.dispose();
    if (genDataTypeItemProvider != null) genDataTypeItemProvider.dispose();
    if (genOperationItemProvider != null) genOperationItemProvider.dispose();
    if (genAnnotationItemProvider != null) genAnnotationItemProvider.dispose();
  }

}