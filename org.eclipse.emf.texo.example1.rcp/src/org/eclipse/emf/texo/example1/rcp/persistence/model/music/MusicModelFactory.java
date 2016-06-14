package org.eclipse.emf.texo.example1.rcp.persistence.model.music;

import java.util.Date;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable.IdentifiableModelFactory;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: music. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MusicModelFactory implements ModelFactory {

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
		case MusicModelPackage.ARTIST_CLASSIFIER_ID:
			return createArtist();
		case MusicModelPackage.COUNTRY_CLASSIFIER_ID:
			return createCountry();
		case MusicModelPackage.GENRE_CLASSIFIER_ID:
			return createGenre();
		case MusicModelPackage.ALBUM_CLASSIFIER_ID:
			return createAlbum();
		case MusicModelPackage.SONG_CLASSIFIER_ID:
			return createSong();
		default:
			throw new IllegalArgumentException(
					"The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
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
	public <T> ModelObject<T> createModelObject(EClass eClass, T adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case MusicModelPackage.ARTIST_CLASSIFIER_ID:
			modelObject = new ArtistModelObject();
			break;
		case MusicModelPackage.COUNTRY_CLASSIFIER_ID:
			modelObject = new CountryModelObject();
			break;
		case MusicModelPackage.GENRE_CLASSIFIER_ID:
			modelObject = new GenreModelObject();
			break;
		case MusicModelPackage.ALBUM_CLASSIFIER_ID:
			modelObject = new AlbumModelObject();
			break;
		case MusicModelPackage.SONG_CLASSIFIER_ID:
			modelObject = new SongModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return (ModelObject<T>) modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException(
				"The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException(
				"The EStructuralFeature '" + eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Artist
	 * @generated
	 */
	public Artist createArtist() {
		return new Artist();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Country
	 * @generated
	 */
	public Country createCountry() {
		return new Country();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Genre
	 * @generated
	 */
	public Genre createGenre() {
		return new Genre();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Album
	 * @generated
	 */
	public Album createAlbum() {
		return new Album();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Song
	 * @generated
	 */
	public Song createSong() {
		return new Song();
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
		case MusicModelPackage.RATING_CLASSIFIER_ID:
			return createRatingFromString(value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
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
		case MusicModelPackage.RATING_CLASSIFIER_ID:
			return convertRatingToString((Rating) value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
		}
	}

	/**
	 * Converts the EDataType: Rating to a String. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertRatingToString(Rating value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: Rating from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public Rating createRatingFromString(String value) {
		if (value == null) {
			return null;
		}
		return Rating.get(value);
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Artist</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ArtistModelObject<E extends Artist>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return MusicModelPackage.INSTANCE.getArtistEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return MusicModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Artist.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case MusicModelPackage.ARTIST_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case MusicModelPackage.ARTIST_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case MusicModelPackage.ARTIST_FIRSTNAME_FEATURE_ID:
				return getTarget().getFirstName();
			case MusicModelPackage.ARTIST_LASTNAME_FEATURE_ID:
				return getTarget().getLastName();
			case MusicModelPackage.ARTIST_BIRTHDATE_FEATURE_ID:
				return getTarget().getBirthDate();
			case MusicModelPackage.ARTIST_COUNTRY_FEATURE_ID:
				return getTarget().getCountry();
			case MusicModelPackage.ARTIST_GENRE_FEATURE_ID:
				return getTarget().getGenre();
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
			case MusicModelPackage.ARTIST_FIRSTNAME_FEATURE_ID:
				getTarget().setFirstName((String) value);
				return;
			case MusicModelPackage.ARTIST_LASTNAME_FEATURE_ID:
				getTarget().setLastName((String) value);
				return;
			case MusicModelPackage.ARTIST_BIRTHDATE_FEATURE_ID:
				getTarget().setBirthDate((Date) value);
				return;
			case MusicModelPackage.ARTIST_COUNTRY_FEATURE_ID:
				getTarget().setCountry((Country) value);
				return;
			case MusicModelPackage.ARTIST_GENRE_FEATURE_ID:
				getTarget().setGenre((Genre) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
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
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Country</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class CountryModelObject<E extends Country>
			extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return MusicModelPackage.INSTANCE.getCountryEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return MusicModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Country.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case MusicModelPackage.COUNTRY_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case MusicModelPackage.COUNTRY_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case MusicModelPackage.COUNTRY_CODE_FEATURE_ID:
				return getTarget().getCode();
			case MusicModelPackage.COUNTRY_NAME_FEATURE_ID:
				return getTarget().getName();
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
			case MusicModelPackage.COUNTRY_CODE_FEATURE_ID:
				getTarget().setCode((String) value);
				return;
			case MusicModelPackage.COUNTRY_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
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
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Genre</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class GenreModelObject<E extends Genre> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return MusicModelPackage.INSTANCE.getGenreEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return MusicModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Genre.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case MusicModelPackage.GENRE_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case MusicModelPackage.GENRE_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case MusicModelPackage.GENRE_NAME_FEATURE_ID:
				return getTarget().getName();
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
			case MusicModelPackage.GENRE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
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
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Album</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AlbumModelObject<E extends Album> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return MusicModelPackage.INSTANCE.getAlbumEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return MusicModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Album.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case MusicModelPackage.ALBUM_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case MusicModelPackage.ALBUM_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case MusicModelPackage.ALBUM_NAME_FEATURE_ID:
				return getTarget().getName();
			case MusicModelPackage.ALBUM_ARTIST_FEATURE_ID:
				return getTarget().getArtist();
			case MusicModelPackage.ALBUM_RELEASEDATE_FEATURE_ID:
				return getTarget().getReleaseDate();
			case MusicModelPackage.ALBUM_GENRES_FEATURE_ID:
				return getTarget().getGenres();
			case MusicModelPackage.ALBUM_SONGS_FEATURE_ID:
				return getTarget().getSongs();
			case MusicModelPackage.ALBUM_RATINGS_FEATURE_ID:
				return getTarget().getRatings();
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
			case MusicModelPackage.ALBUM_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case MusicModelPackage.ALBUM_ARTIST_FEATURE_ID:
				getTarget().setArtist((Artist) value);
				return;
			case MusicModelPackage.ALBUM_RELEASEDATE_FEATURE_ID:
				getTarget().setReleaseDate((Date) value);
				return;
			case MusicModelPackage.ALBUM_GENRES_FEATURE_ID:
				getTarget().setGenres((List<Genre>) value);
				return;
			case MusicModelPackage.ALBUM_SONGS_FEATURE_ID:
				getTarget().setSongs((List<Song>) value);
				return;
			case MusicModelPackage.ALBUM_RATINGS_FEATURE_ID:
				getTarget().setRatings((List<Rating>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case MusicModelPackage.ALBUM_GENRES_FEATURE_ID:
				return getTarget().getGenres().add((Genre) value);

			case MusicModelPackage.ALBUM_SONGS_FEATURE_ID:
				return getTarget().getSongs().add((Song) value);

			case MusicModelPackage.ALBUM_RATINGS_FEATURE_ID:
				return getTarget().getRatings().add((Rating) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case MusicModelPackage.ALBUM_GENRES_FEATURE_ID:
				return getTarget().getGenres().remove(value);

			case MusicModelPackage.ALBUM_SONGS_FEATURE_ID:
				return getTarget().getSongs().remove(value);

			case MusicModelPackage.ALBUM_RATINGS_FEATURE_ID:
				return getTarget().getRatings().remove(value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Song</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class SongModelObject<E extends Song> extends IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return MusicModelPackage.INSTANCE.getSongEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return MusicModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Class<?> getTargetClass() {
			return Song.class;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case MusicModelPackage.SONG_DB_ID_FEATURE_ID:
				return getTarget().getDb_Id();
			case MusicModelPackage.SONG_DB_VERSION_FEATURE_ID:
				return getTarget().getDb_version();
			case MusicModelPackage.SONG_TRACK_FEATURE_ID:
				return getTarget().getTrack();
			case MusicModelPackage.SONG_NAME_FEATURE_ID:
				return getTarget().getName();
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
			case MusicModelPackage.SONG_TRACK_FEATURE_ID:
				getTarget().setTrack((Integer) value);
				return;
			case MusicModelPackage.SONG_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature, Object value) {
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
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

}
