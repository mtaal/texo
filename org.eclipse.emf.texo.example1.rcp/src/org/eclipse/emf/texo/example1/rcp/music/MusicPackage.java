/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.music;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.example1.rcp.music.MusicFactory
 * @model kind="package"
 * @generated
 */
public interface MusicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "music";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/music";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.elver.music";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MusicPackage eINSTANCE = org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.ArtistImpl <em>Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.ArtistImpl
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getArtist()
	 * @generated
	 */
	int ARTIST = 0;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__FIRST_NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__LAST_NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__BIRTH_DATE = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__COUNTRY = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST__GENRE = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIST_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl <em>Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getAlbum()
	 * @generated
	 */
	int ALBUM = 1;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__ARTIST = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__RELEASE_DATE = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__GENRES = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Songs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__SONGS = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ratings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM__RATINGS = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALBUM_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.CountryImpl
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 2;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CODE = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.GenreImpl <em>Genre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.GenreImpl
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getGenre()
	 * @generated
	 */
	int GENRE = 3;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Genre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.SongImpl <em>Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.SongImpl
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getSong()
	 * @generated
	 */
	int SONG = 4;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__DB_ID = IdentifiablePackage.IDENTIFIABLE__DB_ID;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__DB_VERSION = IdentifiablePackage.IDENTIFIABLE__DB_VERSION;

	/**
	 * The feature id for the '<em><b>Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__TRACK = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG__NAME = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_FEATURE_COUNT = IdentifiablePackage.IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.texo.example1.rcp.music.Rating <em>Rating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.texo.example1.rcp.music.Rating
	 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.example1.rcp.music.Artist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artist</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Artist
	 * @generated
	 */
	EClass getArtist();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Artist#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Artist#getFirstName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Artist#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Artist#getLastName()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_LastName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Artist#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Artist#getBirthDate()
	 * @see #getArtist()
	 * @generated
	 */
	EAttribute getArtist_BirthDate();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.example1.rcp.music.Artist#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Artist#getCountry()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Country();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.example1.rcp.music.Artist#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Genre</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Artist#getGenre()
	 * @see #getArtist()
	 * @generated
	 */
	EReference getArtist_Genre();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.example1.rcp.music.Album <em>Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Album</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album
	 * @generated
	 */
	EClass getAlbum();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album#getName()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artist</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album#getArtist()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Artist();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album#getReleaseDate()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_ReleaseDate();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Genres</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album#getGenres()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Genres();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getSongs <em>Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Songs</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album#getSongs()
	 * @see #getAlbum()
	 * @generated
	 */
	EReference getAlbum_Songs();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getRatings <em>Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ratings</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Album#getRatings()
	 * @see #getAlbum()
	 * @generated
	 */
	EAttribute getAlbum_Ratings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.example1.rcp.music.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Country#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Country#getCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.example1.rcp.music.Genre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genre</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Genre
	 * @generated
	 */
	EClass getGenre();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Genre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Genre#getName()
	 * @see #getGenre()
	 * @generated
	 */
	EAttribute getGenre_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.texo.example1.rcp.music.Song <em>Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Song
	 * @generated
	 */
	EClass getSong();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Song#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Song#getTrack()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_Track();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.example1.rcp.music.Song#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Song#getName()
	 * @see #getSong()
	 * @generated
	 */
	EAttribute getSong_Name();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.texo.example1.rcp.music.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rating</em>'.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Rating
	 * @generated
	 */
	EEnum getRating();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MusicFactory getMusicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.ArtistImpl <em>Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.ArtistImpl
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getArtist()
		 * @generated
		 */
		EClass ARTIST = eINSTANCE.getArtist();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__FIRST_NAME = eINSTANCE.getArtist_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__LAST_NAME = eINSTANCE.getArtist_LastName();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIST__BIRTH_DATE = eINSTANCE.getArtist_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__COUNTRY = eINSTANCE.getArtist_Country();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIST__GENRE = eINSTANCE.getArtist_Genre();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl <em>Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getAlbum()
		 * @generated
		 */
		EClass ALBUM = eINSTANCE.getAlbum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__NAME = eINSTANCE.getAlbum_Name();

		/**
		 * The meta object literal for the '<em><b>Artist</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__ARTIST = eINSTANCE.getAlbum_Artist();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__RELEASE_DATE = eINSTANCE.getAlbum_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Genres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__GENRES = eINSTANCE.getAlbum_Genres();

		/**
		 * The meta object literal for the '<em><b>Songs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALBUM__SONGS = eINSTANCE.getAlbum_Songs();

		/**
		 * The meta object literal for the '<em><b>Ratings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALBUM__RATINGS = eINSTANCE.getAlbum_Ratings();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.CountryImpl
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__CODE = eINSTANCE.getCountry_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.GenreImpl <em>Genre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.GenreImpl
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getGenre()
		 * @generated
		 */
		EClass GENRE = eINSTANCE.getGenre();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENRE__NAME = eINSTANCE.getGenre_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.example1.rcp.music.impl.SongImpl <em>Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.SongImpl
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getSong()
		 * @generated
		 */
		EClass SONG = eINSTANCE.getSong();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__TRACK = eINSTANCE.getSong_Track();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG__NAME = eINSTANCE.getSong_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.texo.example1.rcp.music.Rating <em>Rating</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.texo.example1.rcp.music.Rating
		 * @see org.eclipse.emf.texo.example1.rcp.music.impl.MusicPackageImpl#getRating()
		 * @generated
		 */
		EEnum RATING = eINSTANCE.getRating();

	}

} //MusicPackage
