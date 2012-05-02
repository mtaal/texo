/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.music;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Album#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Album#getArtist <em>Artist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Album#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Album#getGenres <em>Genres</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Album#getSongs <em>Songs</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Album#getRatings <em>Ratings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum()
 * @model
 * @generated
 */
public interface Album extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artist</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' reference.
	 * @see #setArtist(Artist)
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum_Artist()
	 * @model
	 * @generated
	 */
	Artist getArtist();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getArtist <em>Artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist</em>' reference.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(Artist value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.music.Album#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Genres</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.example1.rcp.music.Genre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genres</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genres</em>' reference list.
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum_Genres()
	 * @model annotation="teneo.jpa value='@ManyToMany'"
	 * @generated
	 */
	EList<Genre> getGenres();

	/**
	 * Returns the value of the '<em><b>Songs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.texo.example1.rcp.music.Song}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Songs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Songs</em>' reference list.
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum_Songs()
	 * @model annotation="teneo.jpa value='@OneToMany'"
	 * @generated
	 */
	EList<Song> getSongs();

	/**
	 * Returns the value of the '<em><b>Ratings</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.texo.example1.rcp.music.Rating}.
	 * The literals are from the enumeration {@link org.eclipse.emf.texo.example1.rcp.music.Rating}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratings</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratings</em>' attribute list.
	 * @see org.eclipse.emf.texo.example1.rcp.music.Rating
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getAlbum_Ratings()
	 * @model unique="false"
	 * @generated
	 */
	EList<Rating> getRatings();

} // Album
