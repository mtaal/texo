/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.music.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.texo.example1.rcp.identifiable.impl.IdentifiableImpl;
import org.eclipse.emf.texo.example1.rcp.music.Album;
import org.eclipse.emf.texo.example1.rcp.music.Artist;
import org.eclipse.emf.texo.example1.rcp.music.Genre;
import org.eclipse.emf.texo.example1.rcp.music.MusicPackage;
import org.eclipse.emf.texo.example1.rcp.music.Rating;
import org.eclipse.emf.texo.example1.rcp.music.Song;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl#getReleaseDate <em>Release Date</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl#getGenres <em>Genres</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl#getSongs <em>Songs</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.impl.AlbumImpl#getRatings <em>Ratings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlbumImpl extends IdentifiableImpl implements Album {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected Artist artist;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected Date releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenres() <em>Genres</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenres()
	 * @generated
	 * @ordered
	 */
	protected EList<Genre> genres;

	/**
	 * The cached value of the '{@link #getSongs() <em>Songs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSongs()
	 * @generated
	 * @ordered
	 */
	protected EList<Song> songs;

	/**
	 * The cached value of the '{@link #getRatings() <em>Ratings</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatings()
	 * @generated
	 * @ordered
	 */
	protected EList<Rating> ratings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MusicPackage.Literals.ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicPackage.ALBUM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist getArtist() {
		if (artist != null && artist.eIsProxy()) {
			InternalEObject oldArtist = (InternalEObject)artist;
			artist = (Artist)eResolveProxy(oldArtist);
			if (artist != oldArtist) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MusicPackage.ALBUM__ARTIST, oldArtist, artist));
			}
		}
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artist basicGetArtist() {
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtist(Artist newArtist) {
		Artist oldArtist = artist;
		artist = newArtist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicPackage.ALBUM__ARTIST, oldArtist, artist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		Date oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MusicPackage.ALBUM__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Genre> getGenres() {
		if (genres == null) {
			genres = new EObjectResolvingEList<Genre>(Genre.class, this, MusicPackage.ALBUM__GENRES);
		}
		return genres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Song> getSongs() {
		if (songs == null) {
			songs = new EObjectResolvingEList<Song>(Song.class, this, MusicPackage.ALBUM__SONGS);
		}
		return songs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rating> getRatings() {
		if (ratings == null) {
			ratings = new EDataTypeEList<Rating>(Rating.class, this, MusicPackage.ALBUM__RATINGS);
		}
		return ratings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MusicPackage.ALBUM__NAME:
				return getName();
			case MusicPackage.ALBUM__ARTIST:
				if (resolve) return getArtist();
				return basicGetArtist();
			case MusicPackage.ALBUM__RELEASE_DATE:
				return getReleaseDate();
			case MusicPackage.ALBUM__GENRES:
				return getGenres();
			case MusicPackage.ALBUM__SONGS:
				return getSongs();
			case MusicPackage.ALBUM__RATINGS:
				return getRatings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MusicPackage.ALBUM__NAME:
				setName((String)newValue);
				return;
			case MusicPackage.ALBUM__ARTIST:
				setArtist((Artist)newValue);
				return;
			case MusicPackage.ALBUM__RELEASE_DATE:
				setReleaseDate((Date)newValue);
				return;
			case MusicPackage.ALBUM__GENRES:
				getGenres().clear();
				getGenres().addAll((Collection<? extends Genre>)newValue);
				return;
			case MusicPackage.ALBUM__SONGS:
				getSongs().clear();
				getSongs().addAll((Collection<? extends Song>)newValue);
				return;
			case MusicPackage.ALBUM__RATINGS:
				getRatings().clear();
				getRatings().addAll((Collection<? extends Rating>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MusicPackage.ALBUM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MusicPackage.ALBUM__ARTIST:
				setArtist((Artist)null);
				return;
			case MusicPackage.ALBUM__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
				return;
			case MusicPackage.ALBUM__GENRES:
				getGenres().clear();
				return;
			case MusicPackage.ALBUM__SONGS:
				getSongs().clear();
				return;
			case MusicPackage.ALBUM__RATINGS:
				getRatings().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MusicPackage.ALBUM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MusicPackage.ALBUM__ARTIST:
				return artist != null;
			case MusicPackage.ALBUM__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
			case MusicPackage.ALBUM__GENRES:
				return genres != null && !genres.isEmpty();
			case MusicPackage.ALBUM__SONGS:
				return songs != null && !songs.isEmpty();
			case MusicPackage.ALBUM__RATINGS:
				return ratings != null && !ratings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(", ratings: ");
		result.append(ratings);
		result.append(')');
		return result.toString();
	}

} //AlbumImpl
