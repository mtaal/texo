/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.identifiable.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable;
import org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiableFactory;
import org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiableInterface;
import org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage;
import org.eclipse.emf.texo.example1.rcp.music.MusicPackage;
import org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiablePackageImpl extends EPackageImpl implements IdentifiablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableInterfaceEClass = null;

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
	 * @see org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdentifiablePackageImpl() {
		super(eNS_URI, IdentifiableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IdentifiablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IdentifiablePackage init() {
		if (isInited) return (IdentifiablePackage)EPackage.Registry.INSTANCE.getEPackage(IdentifiablePackage.eNS_URI);

		// Obtain or create and register package
		IdentifiablePackageImpl theIdentifiablePackage = (IdentifiablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IdentifiablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IdentifiablePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MusicPackageImpl theMusicPackage = (MusicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MusicPackage.eNS_URI) instanceof MusicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MusicPackage.eNS_URI) : MusicPackage.eINSTANCE);

		// Create package meta-data objects
		theIdentifiablePackage.createPackageContents();
		theMusicPackage.createPackageContents();

		// Initialize created meta-data
		theIdentifiablePackage.initializePackageContents();
		theMusicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdentifiablePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IdentifiablePackage.eNS_URI, theIdentifiablePackage);
		return theIdentifiablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Db_Id() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Db_version() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableInterface() {
		return identifiableInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableInterface_Db_Id() {
		return (EAttribute)identifiableInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableInterface_Db_version() {
		return (EAttribute)identifiableInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableFactory getIdentifiableFactory() {
		return (IdentifiableFactory)getEFactoryInstance();
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
		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DB_ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DB_VERSION);

		identifiableInterfaceEClass = createEClass(IDENTIFIABLE_INTERFACE);
		createEAttribute(identifiableInterfaceEClass, IDENTIFIABLE_INTERFACE__DB_ID);
		createEAttribute(identifiableInterfaceEClass, IDENTIFIABLE_INTERFACE__DB_VERSION);
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
		initEClass(identifiableEClass, Identifiable.class, "Identifiable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Db_Id(), ecorePackage.getELongObject(), "db_Id", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Db_version(), ecorePackage.getEIntegerObject(), "db_version", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableInterfaceEClass, IdentifiableInterface.class, "IdentifiableInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableInterface_Db_Id(), ecorePackage.getELongObject(), "db_Id", null, 0, 1, IdentifiableInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiableInterface_Db_version(), ecorePackage.getEIntegerObject(), "db_version", null, 0, 1, IdentifiableInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// org.eclipse.emf.texo
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>org.eclipse.emf.texo</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.eclipse.emf.texo";		
		addAnnotation
		  (getIdentifiable_Db_Id(), 
		   source, 
		   new String[] {
			 "id", "true"
		   });		
		addAnnotation
		  (getIdentifiableInterface_Db_Id(), 
		   source, 
		   new String[] {
			 "id", "true"
		   });
	}

} //IdentifiablePackageImpl
