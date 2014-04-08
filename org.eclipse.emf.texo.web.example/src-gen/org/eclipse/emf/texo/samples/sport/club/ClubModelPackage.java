package org.eclipse.emf.texo.samples.sport.club;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.samples.sport.club.dao.ClubDao;
import org.eclipse.emf.texo.samples.sport.club.dao.MemberDao;
import org.eclipse.emf.texo.samples.sport.club.dao.TeamDao;
import org.eclipse.emf.texo.samples.sport.society.SocietyModelPackage;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>club</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClubModelPackage extends ModelPackage {

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
	public static final String NS_URI = "org.eclipse.emf.texo.samples.sport.club";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final ClubModelFactory MODELFACTORY = new ClubModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENDER_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLUB_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLUB_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLUB_TEAMS_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TEAM_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TEAM_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TEAM_MEMBER_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEMBER_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEMBER_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEMBER_LASTNAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEMBER_AGE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEMBER_GENDER_FEATURE_ID = 3;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final ClubModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an initialized instance of this class
	 * 
	 * @generated
	 */
	public static ClubModelPackage initialize() {

		if (isInitialized) {
			return (ClubModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final ClubModelPackage modelPackage = new ClubModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		SocietyModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Club.class,
				modelPackage.getClubEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Team.class,
				modelPackage.getTeamEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Member.class,
				modelPackage.getMemberEClass(), modelPackage);

		ModelResolver.getInstance().registerClassModelMapping(Gender.class,
				modelPackage.getGenderEEnum(), modelPackage);

		DaoRegistry.getInstance().registerDao(Club.class, ClubDao.class);
		DaoRegistry.getInstance().registerDao(Team.class, TeamDao.class);
		DaoRegistry.getInstance().registerDao(Member.class, MemberDao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link ClubModelFactory} instance.
	 * @generated
	 */
	@Override
	public ClubModelFactory getModelFactory() {
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
		return "club.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Club</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Club</b></em>'
	 * @generated
	 */
	public EClass getClubEClass() {
		return (EClass) getEPackage().getEClassifiers().get(CLUB_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Club.teams</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Club.teams</b></em>'.
	 * @generated
	 */
	public EReference getClub_Teams() {
		return (EReference) getClubEClass().getEAllStructuralFeatures().get(
				CLUB_TEAMS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Team</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Team</b></em>'
	 * @generated
	 */
	public EClass getTeamEClass() {
		return (EClass) getEPackage().getEClassifiers().get(TEAM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Team.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Team.name</b></em>'.
	 * @generated
	 */
	public EAttribute getTeam_Name() {
		return (EAttribute) getTeamEClass().getEAllStructuralFeatures().get(
				TEAM_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Team.member</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Team.member</b></em>'.
	 * @generated
	 */
	public EReference getTeam_Member() {
		return (EReference) getTeamEClass().getEAllStructuralFeatures().get(
				TEAM_MEMBER_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Member</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Member</b></em>'
	 * @generated
	 */
	public EClass getMemberEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				MEMBER_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Member.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Member.name</b></em>'.
	 * @generated
	 */
	public EAttribute getMember_Name() {
		return (EAttribute) getMemberEClass().getEAllStructuralFeatures().get(
				MEMBER_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Member.lastName</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Member.lastName</b></em>'.
	 * @generated
	 */
	public EAttribute getMember_LastName() {
		return (EAttribute) getMemberEClass().getEAllStructuralFeatures().get(
				MEMBER_LASTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Member.age</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Member.age</b></em>'.
	 * @generated
	 */
	public EAttribute getMember_Age() {
		return (EAttribute) getMemberEClass().getEAllStructuralFeatures().get(
				MEMBER_AGE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Member.gender</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Member.gender</b></em>'.
	 * @generated
	 */
	public EAttribute getMember_Gender() {
		return (EAttribute) getMemberEClass().getEAllStructuralFeatures().get(
				MEMBER_GENDER_FEATURE_ID);
	}

	/**
	 * Returns the EEnum '<em><b>Gender</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>Gender</b></em>'
	 * @generated
	 */
	public EEnum getGenderEEnum() {
		return (EEnum) getEPackage().getEClassifiers()
				.get(GENDER_CLASSIFIER_ID);
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
		case CLUB_CLASSIFIER_ID:
			return Club.class;
		case TEAM_CLASSIFIER_ID:
			return Team.class;
		case MEMBER_CLASSIFIER_ID:
			return Member.class;
		case GENDER_CLASSIFIER_ID:
			return Gender.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
