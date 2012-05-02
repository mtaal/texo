package org.eclipse.emf.texo.example1.rcp.persistence.model.music;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao.AlbumDao;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao.ArtistDao;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao.CountryDao;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao.GenreDao;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao.SongDao;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>music</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class MusicModelPackage extends ModelPackage {

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
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/music";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final MusicModelFactory MODELFACTORY = new MusicModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RATING_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ARTIST_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ARTIST_FIRSTNAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ARTIST_LASTNAME_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ARTIST_BIRTHDATE_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ARTIST_COUNTRY_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ARTIST_GENRE_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COUNTRY_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COUNTRY_CODE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COUNTRY_NAME_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENRE_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GENRE_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_ARTIST_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_RELEASEDATE_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_GENRES_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_SONGS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ALBUM_RATINGS_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SONG_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SONG_TRACK_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SONG_NAME_FEATURE_ID = 3;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final MusicModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static MusicModelPackage initialize() {

		if (isInitialized) {
			return (MusicModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final MusicModelPackage modelPackage = new MusicModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		isInitialized = true;

		IdentifiableModelPackage.initialize();

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Artist.class,
				modelPackage.getArtistEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Country.class,
				modelPackage.getCountryEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Genre.class,
				modelPackage.getGenreEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Album.class,
				modelPackage.getAlbumEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Song.class,
				modelPackage.getSongEClass(), modelPackage);

		ModelResolver.getInstance().registerClassModelMapping(Rating.class,
				modelPackage.getRatingEEnum(), modelPackage);

		DaoRegistry.getInstance().registerDao(Artist.class, ArtistDao.class);

		DaoRegistry.getInstance().registerDao(Country.class, CountryDao.class);

		DaoRegistry.getInstance().registerDao(Genre.class, GenreDao.class);

		DaoRegistry.getInstance().registerDao(Album.class, AlbumDao.class);

		DaoRegistry.getInstance().registerDao(Song.class, SongDao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link MusicModelFactory} instance.
	 * @generated
	 */
	@Override
	public MusicModelFactory getModelFactory() {
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
		return "music.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Artist</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Artist</b></em>'
	 * @generated
	 */
	public EClass getArtistEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ARTIST_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Artist.firstName</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Artist.firstName</b></em>'.
	 * @generated
	 */
	public EAttribute getArtist_FirstName() {
		return (EAttribute) getArtistEClass().getEAllStructuralFeatures().get(
				ARTIST_FIRSTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Artist.lastName</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Artist.lastName</b></em>'.
	 * @generated
	 */
	public EAttribute getArtist_LastName() {
		return (EAttribute) getArtistEClass().getEAllStructuralFeatures().get(
				ARTIST_LASTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Artist.birthDate</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Artist.birthDate</b></em>'.
	 * @generated
	 */
	public EAttribute getArtist_BirthDate() {
		return (EAttribute) getArtistEClass().getEAllStructuralFeatures().get(
				ARTIST_BIRTHDATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Artist.country</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Artist.country</b></em>'.
	 * @generated
	 */
	public EReference getArtist_Country() {
		return (EReference) getArtistEClass().getEAllStructuralFeatures().get(
				ARTIST_COUNTRY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Artist.genre</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Artist.genre</b></em>'.
	 * @generated
	 */
	public EReference getArtist_Genre() {
		return (EReference) getArtistEClass().getEAllStructuralFeatures().get(
				ARTIST_GENRE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Country</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Country</b></em>'
	 * @generated
	 */
	public EClass getCountryEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				COUNTRY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Country.code</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Country.code</b></em>'.
	 * @generated
	 */
	public EAttribute getCountry_Code() {
		return (EAttribute) getCountryEClass().getEAllStructuralFeatures().get(
				COUNTRY_CODE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Country.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Country.name</b></em>'.
	 * @generated
	 */
	public EAttribute getCountry_Name() {
		return (EAttribute) getCountryEClass().getEAllStructuralFeatures().get(
				COUNTRY_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Genre</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Genre</b></em>'
	 * @generated
	 */
	public EClass getGenreEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(GENRE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Genre.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Genre.name</b></em>'.
	 * @generated
	 */
	public EAttribute getGenre_Name() {
		return (EAttribute) getGenreEClass().getEAllStructuralFeatures().get(
				GENRE_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Album</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Album</b></em>'
	 * @generated
	 */
	public EClass getAlbumEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(ALBUM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Album.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Album.name</b></em>'.
	 * @generated
	 */
	public EAttribute getAlbum_Name() {
		return (EAttribute) getAlbumEClass().getEAllStructuralFeatures().get(
				ALBUM_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Album.artist</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Album.artist</b></em>'.
	 * @generated
	 */
	public EReference getAlbum_Artist() {
		return (EReference) getAlbumEClass().getEAllStructuralFeatures().get(
				ALBUM_ARTIST_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Album.releaseDate</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Album.releaseDate</b></em>'.
	 * @generated
	 */
	public EAttribute getAlbum_ReleaseDate() {
		return (EAttribute) getAlbumEClass().getEAllStructuralFeatures().get(
				ALBUM_RELEASEDATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Album.genres</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Album.genres</b></em>'.
	 * @generated
	 */
	public EReference getAlbum_Genres() {
		return (EReference) getAlbumEClass().getEAllStructuralFeatures().get(
				ALBUM_GENRES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Album.songs</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Album.songs</b></em>'.
	 * @generated
	 */
	public EReference getAlbum_Songs() {
		return (EReference) getAlbumEClass().getEAllStructuralFeatures().get(
				ALBUM_SONGS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Album.ratings</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Album.ratings</b></em>'.
	 * @generated
	 */
	public EAttribute getAlbum_Ratings() {
		return (EAttribute) getAlbumEClass().getEAllStructuralFeatures().get(
				ALBUM_RATINGS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Song</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Song</b></em>'
	 * @generated
	 */
	public EClass getSongEClass() {
		return (EClass) getEPackage().getEClassifiers().get(SONG_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Song.track</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Song.track</b></em>'.
	 * @generated
	 */
	public EAttribute getSong_Track() {
		return (EAttribute) getSongEClass().getEAllStructuralFeatures().get(
				SONG_TRACK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Song.name</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Song.name</b></em>'.
	 * @generated
	 */
	public EAttribute getSong_Name() {
		return (EAttribute) getSongEClass().getEAllStructuralFeatures().get(
				SONG_NAME_FEATURE_ID);
	}

	/**
	 * Returns the EEnum '<em><b>Rating</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>Rating</b></em>'
	 * @generated
	 */
	public EEnum getRatingEEnum() {
		return (EEnum) getEPackage().getEClassifiers()
				.get(RATING_CLASSIFIER_ID);
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
		case ARTIST_CLASSIFIER_ID:
			return Artist.class;
		case COUNTRY_CLASSIFIER_ID:
			return Country.class;
		case GENRE_CLASSIFIER_ID:
			return Genre.class;
		case ALBUM_CLASSIFIER_ID:
			return Album.class;
		case SONG_CLASSIFIER_ID:
			return Song.class;
		case RATING_CLASSIFIER_ID:
			return Rating.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
