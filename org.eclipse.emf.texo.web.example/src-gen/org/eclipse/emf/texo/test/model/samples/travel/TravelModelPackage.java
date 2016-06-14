package org.eclipse.emf.texo.test.model.samples.travel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>travel</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class TravelModelPackage extends ModelPackage {

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
	public static final String NS_URI = "org.eclipse.emf.texo.test.model.samples.travel";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final TravelModelFactory MODELFACTORY = new TravelModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNEY_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNEY_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNEY_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNEY_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int JOURNEY_TRIPS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRIP_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRIP_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRIP_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRIP_NAME2_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRIP_DESTINATION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CITY_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CITY_DB_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CITY_DB_VERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CITY_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CITY_REIS_FEATURE_ID = 3;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final TravelModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static TravelModelPackage initialize() {

		if (isInitialized) {
			return (TravelModelPackage) ModelResolver.getInstance().getModelPackage(NS_URI);
		}

		final TravelModelPackage modelPackage = new TravelModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		IdentifiableModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Journey.class, modelPackage.getJourneyEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Trip.class, modelPackage.getTripEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(City.class, modelPackage.getCityEClass(), modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link TravelModelFactory} instance.
	 * @generated
	 */
	@Override
	public TravelModelFactory getModelFactory() {
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
		return "travel.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Journey</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Journey</b></em>'
	 * @generated
	 */
	public EClass getJourneyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(JOURNEY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Journey.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Journey.name</b></em>'.
	 * @generated
	 */
	public EAttribute getJourney_Name() {
		return (EAttribute) getJourneyEClass().getEAllStructuralFeatures().get(JOURNEY_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Journey.trips</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Journey.trips</b></em>'.
	 * @generated
	 */
	public EReference getJourney_Trips() {
		return (EReference) getJourneyEClass().getEAllStructuralFeatures().get(JOURNEY_TRIPS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Trip</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Trip</b></em>'
	 * @generated
	 */
	public EClass getTripEClass() {
		return (EClass) getEPackage().getEClassifiers().get(TRIP_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Trip.name2</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Trip.name2</b></em>'.
	 * @generated
	 */
	public EAttribute getTrip_Name2() {
		return (EAttribute) getTripEClass().getEAllStructuralFeatures().get(TRIP_NAME2_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Trip.destination</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Trip.destination</b></em>'.
	 * @generated
	 */
	public EReference getTrip_Destination() {
		return (EReference) getTripEClass().getEAllStructuralFeatures().get(TRIP_DESTINATION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>City</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>City</b></em>'
	 * @generated
	 */
	public EClass getCityEClass() {
		return (EClass) getEPackage().getEClassifiers().get(CITY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>City.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>City.name</b></em>'.
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute) getCityEClass().getEAllStructuralFeatures().get(CITY_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>City.reis</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>City.reis</b></em>'.
	 * @generated
	 */
	public EAttribute getCity_Reis() {
		return (EAttribute) getCityEClass().getEAllStructuralFeatures().get(CITY_REIS_FEATURE_ID);
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
		case JOURNEY_CLASSIFIER_ID:
			return Journey.class;
		case TRIP_CLASSIFIER_ID:
			return Trip.class;
		case CITY_CLASSIFIER_ID:
			return City.class;
		default:
			throw new IllegalArgumentException("The EClassifier '" + eClassifier + "' is not defined in this EPackage");
		}
	}
}
