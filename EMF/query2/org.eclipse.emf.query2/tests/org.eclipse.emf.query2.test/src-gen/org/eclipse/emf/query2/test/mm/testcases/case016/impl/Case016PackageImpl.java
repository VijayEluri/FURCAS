/*******************************************************************************
 * Copyright (c) 2006, 2009 SAP AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP AG - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.query2.test.mm.testcases.case016.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case001.Case001Package;

import org.eclipse.emf.query2.test.mm.testcases.case001.impl.Case001PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case002.Case002Package;

import org.eclipse.emf.query2.test.mm.testcases.case002.impl.Case002PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case003.Case003Package;

import org.eclipse.emf.query2.test.mm.testcases.case003.impl.Case003PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case004.Case004Package;

import org.eclipse.emf.query2.test.mm.testcases.case004.impl.Case004PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case005.p1.P1Package;

import org.eclipse.emf.query2.test.mm.testcases.case005.p1.impl.P1PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case005.p1.p2.P2Package;

import org.eclipse.emf.query2.test.mm.testcases.case005.p1.p2.impl.P2PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case005.p3.P3Package;

import org.eclipse.emf.query2.test.mm.testcases.case005.p3.impl.P3PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case005.p3.p4.P4Package;

import org.eclipse.emf.query2.test.mm.testcases.case005.p3.p4.impl.P4PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case006.Case006Package;

import org.eclipse.emf.query2.test.mm.testcases.case006.impl.Case006PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.base.BasePackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.base.impl.BasePackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.cluster.ClusterPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.cluster.impl.ClusterPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.clustered.ClusteredPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.clustered.impl.ClusteredPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.clustered.nestedOfClustered.NestedOfClusteredPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.clustered.nestedOfClustered.impl.NestedOfClusteredPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.importer.ImporterPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.importer.impl.ImporterPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.importer.imported.ImportedPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.importer.imported.impl.ImportedPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.top.TopPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.top.impl.TopPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case007.top.nestedOfTop.NestedOfTopPackage;

import org.eclipse.emf.query2.test.mm.testcases.case007.top.nestedOfTop.impl.NestedOfTopPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case008.Case008Package;

import org.eclipse.emf.query2.test.mm.testcases.case008.impl.Case008PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case008.inheritance.InheritancePackage;

import org.eclipse.emf.query2.test.mm.testcases.case008.inheritance.impl.InheritancePackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case009.Case009Package;

import org.eclipse.emf.query2.test.mm.testcases.case009.impl.Case009PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case010.Case010Package;

import org.eclipse.emf.query2.test.mm.testcases.case010.impl.Case010PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case011.Case011Package;

import org.eclipse.emf.query2.test.mm.testcases.case011.impl.Case011PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case012.Case012Package;

import org.eclipse.emf.query2.test.mm.testcases.case012.impl.Case012PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case013.Case013Package;

import org.eclipse.emf.query2.test.mm.testcases.case013.impl.Case013PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case014.Case014Package;

import org.eclipse.emf.query2.test.mm.testcases.case014.impl.Case014PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case015.Case015Package;

import org.eclipse.emf.query2.test.mm.testcases.case015.impl.Case015PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case016.Case016Factory;
import org.eclipse.emf.query2.test.mm.testcases.case016.Case016Package;

import org.eclipse.emf.query2.test.mm.testcases.case017.Case017Package;

import org.eclipse.emf.query2.test.mm.testcases.case017.impl.Case017PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case018.Case018Package;

import org.eclipse.emf.query2.test.mm.testcases.case018.impl.Case018PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case019.Case019Package;

import org.eclipse.emf.query2.test.mm.testcases.case019.impl.Case019PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case019.serializationcallback.SerializationcallbackPackage;

import org.eclipse.emf.query2.test.mm.testcases.case019.serializationcallback.impl.SerializationcallbackPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case019.translatabletexts.TranslatabletextsPackage;

import org.eclipse.emf.query2.test.mm.testcases.case019.translatabletexts.impl.TranslatabletextsPackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case020.Case020Package;

import org.eclipse.emf.query2.test.mm.testcases.case020.impl.Case020PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case021.Case021Package;

import org.eclipse.emf.query2.test.mm.testcases.case021.impl.Case021PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case022.Case022Package;

import org.eclipse.emf.query2.test.mm.testcases.case022.impl.Case022PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case023.Case023Package;

import org.eclipse.emf.query2.test.mm.testcases.case023.impl.Case023PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case024.Case024Package;

import org.eclipse.emf.query2.test.mm.testcases.case024.impl.Case024PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case025.Case025Package;

import org.eclipse.emf.query2.test.mm.testcases.case025.impl.Case025PackageImpl;

import org.eclipse.emf.query2.test.mm.testcases.case026.Case026Package;

import org.eclipse.emf.query2.test.mm.testcases.case026.impl.Case026PackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case001f.Case001fPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case001f.impl.Case001fPackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case003f.Case003fPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case003f.impl.Case003fPackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case004f.Case004fPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case004f.impl.Case004fPackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.Case005fPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.classbasedtexts.ClassbasedtextsPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.classbasedtexts.impl.ClassbasedtextsPackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.impl.Case005fPackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.structurebasedtexts.StructurebasedtextsPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.structurebasedtexts.impl.StructurebasedtextsPackageImpl;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.textverticalizationf.TextverticalizationfPackage;

import org.eclipse.emf.query2.test.mm.testcasesfoundation.case005f.textverticalizationf.impl.TextverticalizationfPackageImpl;

import org.eclipse.emf.query2.test.mm.textverticalization.TextverticalizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Case016PackageImpl extends EPackageImpl implements Case016Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass a16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass b16EClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.query2.test.mm.testcases.case016.Case016Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Case016PackageImpl() {
		super(eNS_URI, Case016Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Case016Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Case016Package init() {
		if (isInited) return (Case016Package)EPackage.Registry.INSTANCE.getEPackage(Case016Package.eNS_URI);

		// Obtain or create and register package
		Case016PackageImpl theCase016Package = (Case016PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Case016PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Case016PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TextverticalizationPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Case001PackageImpl theCase001Package = (Case001PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case001Package.eNS_URI) instanceof Case001PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case001Package.eNS_URI) : Case001Package.eINSTANCE);
		Case002PackageImpl theCase002Package = (Case002PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case002Package.eNS_URI) instanceof Case002PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case002Package.eNS_URI) : Case002Package.eINSTANCE);
		Case003PackageImpl theCase003Package = (Case003PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case003Package.eNS_URI) instanceof Case003PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case003Package.eNS_URI) : Case003Package.eINSTANCE);
		Case004PackageImpl theCase004Package = (Case004PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case004Package.eNS_URI) instanceof Case004PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case004Package.eNS_URI) : Case004Package.eINSTANCE);
		P1PackageImpl theP1Package = (P1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(P1Package.eNS_URI) instanceof P1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(P1Package.eNS_URI) : P1Package.eINSTANCE);
		P2PackageImpl theP2Package = (P2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(P2Package.eNS_URI) instanceof P2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(P2Package.eNS_URI) : P2Package.eINSTANCE);
		P3PackageImpl theP3Package = (P3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(P3Package.eNS_URI) instanceof P3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(P3Package.eNS_URI) : P3Package.eINSTANCE);
		P4PackageImpl theP4Package = (P4PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(P4Package.eNS_URI) instanceof P4PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(P4Package.eNS_URI) : P4Package.eINSTANCE);
		Case006PackageImpl theCase006Package = (Case006PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case006Package.eNS_URI) instanceof Case006PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case006Package.eNS_URI) : Case006Package.eINSTANCE);
		Case008PackageImpl theCase008Package = (Case008PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case008Package.eNS_URI) instanceof Case008PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case008Package.eNS_URI) : Case008Package.eINSTANCE);
		InheritancePackageImpl theInheritancePackage = (InheritancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) instanceof InheritancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InheritancePackage.eNS_URI) : InheritancePackage.eINSTANCE);
		Case009PackageImpl theCase009Package = (Case009PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case009Package.eNS_URI) instanceof Case009PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case009Package.eNS_URI) : Case009Package.eINSTANCE);
		Case010PackageImpl theCase010Package = (Case010PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case010Package.eNS_URI) instanceof Case010PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case010Package.eNS_URI) : Case010Package.eINSTANCE);
		Case011PackageImpl theCase011Package = (Case011PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case011Package.eNS_URI) instanceof Case011PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case011Package.eNS_URI) : Case011Package.eINSTANCE);
		Case012PackageImpl theCase012Package = (Case012PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case012Package.eNS_URI) instanceof Case012PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case012Package.eNS_URI) : Case012Package.eINSTANCE);
		Case013PackageImpl theCase013Package = (Case013PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case013Package.eNS_URI) instanceof Case013PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case013Package.eNS_URI) : Case013Package.eINSTANCE);
		Case014PackageImpl theCase014Package = (Case014PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case014Package.eNS_URI) instanceof Case014PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case014Package.eNS_URI) : Case014Package.eINSTANCE);
		Case015PackageImpl theCase015Package = (Case015PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case015Package.eNS_URI) instanceof Case015PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case015Package.eNS_URI) : Case015Package.eINSTANCE);
		Case017PackageImpl theCase017Package = (Case017PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case017Package.eNS_URI) instanceof Case017PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case017Package.eNS_URI) : Case017Package.eINSTANCE);
		Case018PackageImpl theCase018Package = (Case018PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case018Package.eNS_URI) instanceof Case018PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case018Package.eNS_URI) : Case018Package.eINSTANCE);
		Case019PackageImpl theCase019Package = (Case019PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case019Package.eNS_URI) instanceof Case019PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case019Package.eNS_URI) : Case019Package.eINSTANCE);
		SerializationcallbackPackageImpl theSerializationcallbackPackage = (SerializationcallbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SerializationcallbackPackage.eNS_URI) instanceof SerializationcallbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SerializationcallbackPackage.eNS_URI) : SerializationcallbackPackage.eINSTANCE);
		TranslatabletextsPackageImpl theTranslatabletextsPackage = (TranslatabletextsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TranslatabletextsPackage.eNS_URI) instanceof TranslatabletextsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TranslatabletextsPackage.eNS_URI) : TranslatabletextsPackage.eINSTANCE);
		Case020PackageImpl theCase020Package = (Case020PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case020Package.eNS_URI) instanceof Case020PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case020Package.eNS_URI) : Case020Package.eINSTANCE);
		Case021PackageImpl theCase021Package = (Case021PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case021Package.eNS_URI) instanceof Case021PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case021Package.eNS_URI) : Case021Package.eINSTANCE);
		Case022PackageImpl theCase022Package = (Case022PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case022Package.eNS_URI) instanceof Case022PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case022Package.eNS_URI) : Case022Package.eINSTANCE);
		ClusteredPackageImpl theClusteredPackage = (ClusteredPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClusteredPackage.eNS_URI) instanceof ClusteredPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClusteredPackage.eNS_URI) : ClusteredPackage.eINSTANCE);
		NestedOfClusteredPackageImpl theNestedOfClusteredPackage = (NestedOfClusteredPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NestedOfClusteredPackage.eNS_URI) instanceof NestedOfClusteredPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NestedOfClusteredPackage.eNS_URI) : NestedOfClusteredPackage.eINSTANCE);
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI) : BasePackage.eINSTANCE);
		TopPackageImpl theTopPackage = (TopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TopPackage.eNS_URI) instanceof TopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TopPackage.eNS_URI) : TopPackage.eINSTANCE);
		NestedOfTopPackageImpl theNestedOfTopPackage = (NestedOfTopPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NestedOfTopPackage.eNS_URI) instanceof NestedOfTopPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NestedOfTopPackage.eNS_URI) : NestedOfTopPackage.eINSTANCE);
		ClusterPackageImpl theClusterPackage = (ClusterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClusterPackage.eNS_URI) instanceof ClusterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClusterPackage.eNS_URI) : ClusterPackage.eINSTANCE);
		ImporterPackageImpl theImporterPackage = (ImporterPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImporterPackage.eNS_URI) instanceof ImporterPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImporterPackage.eNS_URI) : ImporterPackage.eINSTANCE);
		ImportedPackageImpl theImportedPackage = (ImportedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImportedPackage.eNS_URI) instanceof ImportedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImportedPackage.eNS_URI) : ImportedPackage.eINSTANCE);
		Case023PackageImpl theCase023Package = (Case023PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case023Package.eNS_URI) instanceof Case023PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case023Package.eNS_URI) : Case023Package.eINSTANCE);
		Case024PackageImpl theCase024Package = (Case024PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case024Package.eNS_URI) instanceof Case024PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case024Package.eNS_URI) : Case024Package.eINSTANCE);
		Case025PackageImpl theCase025Package = (Case025PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case025Package.eNS_URI) instanceof Case025PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case025Package.eNS_URI) : Case025Package.eINSTANCE);
		Case026PackageImpl theCase026Package = (Case026PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case026Package.eNS_URI) instanceof Case026PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case026Package.eNS_URI) : Case026Package.eINSTANCE);
		Case001fPackageImpl theCase001fPackage = (Case001fPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case001fPackage.eNS_URI) instanceof Case001fPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case001fPackage.eNS_URI) : Case001fPackage.eINSTANCE);
		Case003fPackageImpl theCase003fPackage = (Case003fPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case003fPackage.eNS_URI) instanceof Case003fPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case003fPackage.eNS_URI) : Case003fPackage.eINSTANCE);
		Case004fPackageImpl theCase004fPackage = (Case004fPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case004fPackage.eNS_URI) instanceof Case004fPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case004fPackage.eNS_URI) : Case004fPackage.eINSTANCE);
		Case005fPackageImpl theCase005fPackage = (Case005fPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Case005fPackage.eNS_URI) instanceof Case005fPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Case005fPackage.eNS_URI) : Case005fPackage.eINSTANCE);
		StructurebasedtextsPackageImpl theStructurebasedtextsPackage = (StructurebasedtextsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructurebasedtextsPackage.eNS_URI) instanceof StructurebasedtextsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructurebasedtextsPackage.eNS_URI) : StructurebasedtextsPackage.eINSTANCE);
		ClassbasedtextsPackageImpl theClassbasedtextsPackage = (ClassbasedtextsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassbasedtextsPackage.eNS_URI) instanceof ClassbasedtextsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassbasedtextsPackage.eNS_URI) : ClassbasedtextsPackage.eINSTANCE);
		TextverticalizationfPackageImpl theTextverticalizationfPackage = (TextverticalizationfPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TextverticalizationfPackage.eNS_URI) instanceof TextverticalizationfPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TextverticalizationfPackage.eNS_URI) : TextverticalizationfPackage.eINSTANCE);

		// Create package meta-data objects
		theCase016Package.createPackageContents();
		theCase001Package.createPackageContents();
		theCase002Package.createPackageContents();
		theCase003Package.createPackageContents();
		theCase004Package.createPackageContents();
		theP1Package.createPackageContents();
		theP2Package.createPackageContents();
		theP3Package.createPackageContents();
		theP4Package.createPackageContents();
		theCase006Package.createPackageContents();
		theCase008Package.createPackageContents();
		theInheritancePackage.createPackageContents();
		theCase009Package.createPackageContents();
		theCase010Package.createPackageContents();
		theCase011Package.createPackageContents();
		theCase012Package.createPackageContents();
		theCase013Package.createPackageContents();
		theCase014Package.createPackageContents();
		theCase015Package.createPackageContents();
		theCase017Package.createPackageContents();
		theCase018Package.createPackageContents();
		theCase019Package.createPackageContents();
		theSerializationcallbackPackage.createPackageContents();
		theTranslatabletextsPackage.createPackageContents();
		theCase020Package.createPackageContents();
		theCase021Package.createPackageContents();
		theCase022Package.createPackageContents();
		theClusteredPackage.createPackageContents();
		theNestedOfClusteredPackage.createPackageContents();
		theBasePackage.createPackageContents();
		theTopPackage.createPackageContents();
		theNestedOfTopPackage.createPackageContents();
		theClusterPackage.createPackageContents();
		theImporterPackage.createPackageContents();
		theImportedPackage.createPackageContents();
		theCase023Package.createPackageContents();
		theCase024Package.createPackageContents();
		theCase025Package.createPackageContents();
		theCase026Package.createPackageContents();
		theCase001fPackage.createPackageContents();
		theCase003fPackage.createPackageContents();
		theCase004fPackage.createPackageContents();
		theCase005fPackage.createPackageContents();
		theStructurebasedtextsPackage.createPackageContents();
		theClassbasedtextsPackage.createPackageContents();
		theTextverticalizationfPackage.createPackageContents();

		// Initialize created meta-data
		theCase016Package.initializePackageContents();
		theCase001Package.initializePackageContents();
		theCase002Package.initializePackageContents();
		theCase003Package.initializePackageContents();
		theCase004Package.initializePackageContents();
		theP1Package.initializePackageContents();
		theP2Package.initializePackageContents();
		theP3Package.initializePackageContents();
		theP4Package.initializePackageContents();
		theCase006Package.initializePackageContents();
		theCase008Package.initializePackageContents();
		theInheritancePackage.initializePackageContents();
		theCase009Package.initializePackageContents();
		theCase010Package.initializePackageContents();
		theCase011Package.initializePackageContents();
		theCase012Package.initializePackageContents();
		theCase013Package.initializePackageContents();
		theCase014Package.initializePackageContents();
		theCase015Package.initializePackageContents();
		theCase017Package.initializePackageContents();
		theCase018Package.initializePackageContents();
		theCase019Package.initializePackageContents();
		theSerializationcallbackPackage.initializePackageContents();
		theTranslatabletextsPackage.initializePackageContents();
		theCase020Package.initializePackageContents();
		theCase021Package.initializePackageContents();
		theCase022Package.initializePackageContents();
		theClusteredPackage.initializePackageContents();
		theNestedOfClusteredPackage.initializePackageContents();
		theBasePackage.initializePackageContents();
		theTopPackage.initializePackageContents();
		theNestedOfTopPackage.initializePackageContents();
		theClusterPackage.initializePackageContents();
		theImporterPackage.initializePackageContents();
		theImportedPackage.initializePackageContents();
		theCase023Package.initializePackageContents();
		theCase024Package.initializePackageContents();
		theCase025Package.initializePackageContents();
		theCase026Package.initializePackageContents();
		theCase001fPackage.initializePackageContents();
		theCase003fPackage.initializePackageContents();
		theCase004fPackage.initializePackageContents();
		theCase005fPackage.initializePackageContents();
		theStructurebasedtextsPackage.initializePackageContents();
		theClassbasedtextsPackage.initializePackageContents();
		theTextverticalizationfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCase016Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Case016Package.eNS_URI, theCase016Package);
		return theCase016Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getA16() {
		return a16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getA16_B() {
		return (EReference)a16EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getB16() {
		return b16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case016Factory getCase016Factory() {
		return (Case016Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		a16EClass = createEClass(A16);
		createEReference(a16EClass, A16__B);

		b16EClass = createEClass(B16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(a16EClass, org.eclipse.emf.query2.test.mm.testcases.case016.A16.class, "A16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getA16_B(), this.getB16(), null, "b", null, 0, -1, org.eclipse.emf.query2.test.mm.testcases.case016.A16.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(b16EClass, org.eclipse.emf.query2.test.mm.testcases.case016.B16.class, "B16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://sap.com/MOIN
		createMOINAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://sap.com/MOIN</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMOINAnnotations() {
		String source = "http://sap.com/MOIN"; //$NON-NLS-1$		
		addAnnotation
		  (a16EClass, 
		   source, 
		   new String[] {
			 "metamodels", "test.sap.com/tc/moin/metamodel/testcases[1.0.0]", //$NON-NLS-1$ //$NON-NLS-2$
			 "metaObject", "testcases.case016.A16", //$NON-NLS-1$ //$NON-NLS-2$
			 "metaObjectMofId", "45F120A52999371DD6234FF33831AB42900E8FCD", //$NON-NLS-1$ //$NON-NLS-2$
			 "isStructureType", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getA16_B(), 
		   source, 
		   new String[] {
			 "metamodels", "test.sap.com/tc/moin/metamodel/testcases[1.0.0]", //$NON-NLS-1$ //$NON-NLS-2$
			 "metaObject", "testcases.case016.hasB", //$NON-NLS-1$ //$NON-NLS-2$
			 "metaObjectMofId", "45F120A5CB0F0F8128D349033235AB71545A05E7", //$NON-NLS-1$ //$NON-NLS-2$
			 "storedEnd", "0", //$NON-NLS-1$ //$NON-NLS-2$
			 "compositeEnd", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "orderedEnd", "-1", //$NON-NLS-1$ //$NON-NLS-2$
			 "exposedEndNumber", "1" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (b16EClass, 
		   source, 
		   new String[] {
			 "metamodels", "test.sap.com/tc/moin/metamodel/testcases[1.0.0]", //$NON-NLS-1$ //$NON-NLS-2$
			 "metaObject", "testcases.case016.B16", //$NON-NLS-1$ //$NON-NLS-2$
			 "metaObjectMofId", "45F120A5E03403FE98AB479D2525A747A8DA1599", //$NON-NLS-1$ //$NON-NLS-2$
			 "isStructureType", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //Case016PackageImpl