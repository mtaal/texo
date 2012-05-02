package org.eclipse.emf.texo.example1.rcp.persistence.model.music;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Album</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Album")
public class Album extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = true, targetEntity = Artist.class)
	@JoinColumns({ @JoinColumn() })
	private Artist artist = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	@Temporal(TemporalType.DATE)
	private Date releaseDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Genre.class)
	@OrderColumn()
	@JoinTable(name = "Album_genres")
	private List<Genre> genres = new ArrayList<Genre>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Song.class)
	@OrderColumn()
	@JoinTable(name = "Album_songs")
	private List<Song> songs = new ArrayList<Song>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ElementCollection()
	@OrderColumn()
	@CollectionTable(name = "Album_ratings")
	private List<Rating> ratings = new ArrayList<Rating>();

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Album#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>artist</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>artist</b></em>' feature
	 * @generated
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * Sets the '{@link Album#getArtist() <em>artist</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getArtist() artist}' feature.
	 * @generated
	 */
	public void setArtist(Artist newArtist) {
		artist = newArtist;
	}

	/**
	 * Returns the value of '<em><b>releaseDate</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>releaseDate</b></em>' feature
	 * @generated
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Sets the '{@link Album#getReleaseDate() <em>releaseDate</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getReleaseDate() releaseDate}'
	 *            feature.
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		releaseDate = newReleaseDate;
	}

	/**
	 * Returns the value of '<em><b>genres</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>genres</b></em>' feature
	 * @generated
	 */
	public List<Genre> getGenres() {
		return genres;
	}

	/**
	 * Adds to the <em>genres</em> feature.
	 * 
	 * @generated
	 */
	public void addToGenres(Genre genresValue) {
		if (!genres.contains(genresValue)) {
			genres.add(genresValue);
		}
	}

	/**
	 * Removes from the <em>genres</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromGenres(Genre genresValue) {
		if (genres.contains(genresValue)) {
			genres.remove(genresValue);
		}
	}

	/**
	 * Clears the <em>genres</em> feature.
	 * 
	 * @generated
	 */
	public void clearGenres() {
		while (!genres.isEmpty()) {
			removeFromGenres(genres.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Album#getGenres() <em>genres</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getGenres() genres}' feature.
	 * @generated
	 */
	public void setGenres(List<Genre> newGenres) {
		genres = newGenres;
	}

	/**
	 * Returns the value of '<em><b>songs</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>songs</b></em>' feature
	 * @generated
	 */
	public List<Song> getSongs() {
		return songs;
	}

	/**
	 * Adds to the <em>songs</em> feature.
	 * 
	 * @generated
	 */
	public void addToSongs(Song songsValue) {
		if (!songs.contains(songsValue)) {
			songs.add(songsValue);
		}
	}

	/**
	 * Removes from the <em>songs</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromSongs(Song songsValue) {
		if (songs.contains(songsValue)) {
			songs.remove(songsValue);
		}
	}

	/**
	 * Clears the <em>songs</em> feature.
	 * 
	 * @generated
	 */
	public void clearSongs() {
		while (!songs.isEmpty()) {
			removeFromSongs(songs.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Album#getSongs() <em>songs</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getSongs() songs}' feature.
	 * @generated
	 */
	public void setSongs(List<Song> newSongs) {
		songs = newSongs;
	}

	/**
	 * Returns the value of '<em><b>ratings</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>ratings</b></em>' feature
	 * @generated
	 */
	public List<Rating> getRatings() {
		return ratings;
	}

	/**
	 * Sets the '{@link Album#getRatings() <em>ratings</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Album#getRatings() ratings}' feature.
	 * @generated
	 */
	public void setRatings(List<Rating> newRatings) {
		ratings = newRatings;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Album " + " [name: " + getName() + "]" + " [releaseDate: "
				+ getReleaseDate() + "]";
	}
}
