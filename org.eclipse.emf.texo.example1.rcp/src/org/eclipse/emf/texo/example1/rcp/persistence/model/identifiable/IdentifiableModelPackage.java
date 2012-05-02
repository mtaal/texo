package org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable.dao.IdentifiableDao;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>identifiable</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class IdentifiableModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/base/identifiable";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final IdentifiableModelFactory MODELFACTORY = new IdentifiableModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLE_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLE_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLE_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLEINTERFACE_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLEINTERFACE_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IDENTIFIABLEINTERFACE_DB_VERSION_FEATURE_ID = 1;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final IdentifiableModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static IdentifiableModelPackage initialize() {

		if (isInitialized) {
			return (IdentifiableModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final IdentifiableModelPackage modelPackage = new IdentifiableModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		isInitialized = true;

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				Identifiable.class, modelPackage.getIdentifiableEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				IdentifiableInterface.class,
				modelPackage.getIdentifiableInterfaceEClass(), modelPackage);

		DaoRegistry.getInstance().registerDao(Identifiable.class,
				IdentifiableDao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link IdentifiableModelFactory} instance.
	 * @generated
	 */
	@Override
	public IdentifiableModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "identifiable.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Identifiable</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Identifiable</b></em>'
	 * @generated
	 */
	public EClass getIdentifiableEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				IDENTIFIABLE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Identifiable.db_Id</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Identifiable.db_Id</b></em>'.
	 * @generated
	 */
	public EAttribute getIdentifiable_Db_Id() {
		return (EAttribute) getIdentifiableEClass().getEAllStructuralFeatures()
				.get(IDENTIFIABLE_DB_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Identifiable.db_version</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Identifiable.db_version</b></em>'.
	 * @generated
	 */
	public EAttribute getIdentifiable_Db_version() {
		return (EAttribute) getIdentifiableEClass().getEAllStructuralFeatures()
				.get(IDENTIFIABLE_DB_VERSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>IdentifiableInterface</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>IdentifiableInterface</b></em>'
	 * @generated
	 */
	public EClass getIdentifiableInterfaceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				IDENTIFIABLEINTERFACE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>IdentifiableInterface.db_Id</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>IdentifiableInterface.db_Id</b></em>'.
	 * @generated
	 */
	public EAttribute getIdentifiableInterface_Db_Id() {
		return (EAttribute) getIdentifiableInterfaceEClass()
				.getEAllStructuralFeatures().get(
						IDENTIFIABLEINTERFACE_DB_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>IdentifiableInterface.db_version</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>IdentifiableInterface.db_version</b></em>'.
	 * @generated
	 */
	public EAttribute getIdentifiableInterface_Db_version() {
		return (EAttribute) getIdentifiableInterfaceEClass()
				.getEAllStructuralFeatures().get(
						IDENTIFIABLEINTERFACE_DB_VERSION_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case IDENTIFIABLE_CLASSIFIER_ID:
			return Identifiable.class;
		case IDENTIFIABLEINTERFACE_CLASSIFIER_ID:
			return IdentifiableInterface.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
