package org.eclipse.emf.texo.samples.sport.club;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.samples.sport.society.SocietyModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: club. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ClubModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ClubModelPackage.CLUB_CLASSIFIER_ID:
			return createClub();
		case ClubModelPackage.TEAM_CLASSIFIER_ID:
			return createTeam();
		case ClubModelPackage.MEMBER_CLASSIFIER_ID:
			return createMember();
		default:
			throw new IllegalArgumentException("The EClass '"
					+ eClass.getName()
					+ "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case ClubModelPackage.CLUB_CLASSIFIER_ID:
			modelObject = new ClubModelObject();
			break;
		case ClubModelPackage.TEAM_CLASSIFIER_ID:
			modelObject = new TeamModelObject();
			break;
		case ClubModelPackage.MEMBER_CLASSIFIER_ID:
			modelObject = new MemberModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Club
	 * @generated
	 */
	public Club createClub() {
		return new Club();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Team
	 * @generated
	 */
	public Team createTeam() {
		return new Team();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Member
	 * @generated
	 */
	public Member createMember() {
		return new Member();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		case ClubModelPackage.GENDER_CLASSIFIER_ID:
			return createGenderFromString(value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		case ClubModelPackage.GENDER_CLASSIFIER_ID:
			return convertGenderToString((Gender) value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage.");
		}
	}

	/**
	 * Converts the EDataType: Gender to a String. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertGenderToString(Gender value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: Gender from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public Gender createGenderFromString(String value) {
		if (value == null) {
			return null;
		}
		return Gender.get(value);
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Club</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class ClubModelObject<E extends Club> extends
			SocietyModelFactory.SocietyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return ClubModelPackage.INSTANCE.getClubEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return ClubModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case ClubModelPackage.CLUB_NAME_FEATURE_ID:
				return getTarget().getName();
			case ClubModelPackage.CLUB_TEAMS_FEATURE_ID:
				return getTarget().getTeams();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case ClubModelPackage.CLUB_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case ClubModelPackage.CLUB_TEAMS_FEATURE_ID:
				getTarget().setTeams((List<Team>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case ClubModelPackage.CLUB_TEAMS_FEATURE_ID:
				return getTarget().addToTeams((Team) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case ClubModelPackage.CLUB_TEAMS_FEATURE_ID:
				return getTarget().removeFromTeams((Team) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Team</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class TeamModelObject<E extends Team> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return ClubModelPackage.INSTANCE.getTeamEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return ClubModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case ClubModelPackage.TEAM_NAME_FEATURE_ID:
				return getTarget().getName();
			case ClubModelPackage.TEAM_MEMBER_FEATURE_ID:
				return getTarget().getMember();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case ClubModelPackage.TEAM_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case ClubModelPackage.TEAM_MEMBER_FEATURE_ID:
				getTarget().setMember((List<Member>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case ClubModelPackage.TEAM_MEMBER_FEATURE_ID:
				return getTarget().addToMember((Member) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case ClubModelPackage.TEAM_MEMBER_FEATURE_ID:
				return getTarget().removeFromMember((Member) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Member</b></em>'.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param <E>
	 *            the domain model java class
	 * 
	 * @generated
	 */
	public static class MemberModelObject<E extends Member> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return ClubModelPackage.INSTANCE.getMemberEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return ClubModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case ClubModelPackage.MEMBER_NAME_FEATURE_ID:
				return getTarget().getName();
			case ClubModelPackage.MEMBER_LASTNAME_FEATURE_ID:
				return getTarget().getLastName();
			case ClubModelPackage.MEMBER_AGE_FEATURE_ID:
				return getTarget().getAge();
			case ClubModelPackage.MEMBER_GENDER_FEATURE_ID:
				return getTarget().getGender();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case ClubModelPackage.MEMBER_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case ClubModelPackage.MEMBER_LASTNAME_FEATURE_ID:
				getTarget().setLastName((String) value);
				return;
			case ClubModelPackage.MEMBER_AGE_FEATURE_ID:
				getTarget().setAge((Integer) value);
				return;
			case ClubModelPackage.MEMBER_GENDER_FEATURE_ID:
				getTarget().setGender((Gender) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}