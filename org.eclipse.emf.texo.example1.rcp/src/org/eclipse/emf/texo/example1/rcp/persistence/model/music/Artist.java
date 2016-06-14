package org.eclipse.emf.texo.example1.rcp.persistence.model.music;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Artist</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "org_elver_music_Artist")
public class Artist extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String firstName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String lastName = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Temporal(TemporalType.DATE)
	private Date birthDate = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private Country country = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private Genre genre = null;

	/**
	 * Returns the value of '<em><b>firstName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>firstName</b></em>' feature
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the '{@link Artist#getFirstName() <em>firstName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newFirstName
	 *            the new value of the '{@link Artist#getFirstName() firstName}'
	 *            feature.
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Returns the value of '<em><b>lastName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>lastName</b></em>' feature
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the '{@link Artist#getLastName() <em>lastName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newLastName
	 *            the new value of the '{@link Artist#getLastName() lastName}'
	 *            feature.
	 * @generated
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Returns the value of '<em><b>birthDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>birthDate</b></em>' feature
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the '{@link Artist#getBirthDate() <em>birthDate</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBirthDate
	 *            the new value of the '{@link Artist#getBirthDate() birthDate}'
	 *            feature.
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		birthDate = newBirthDate;
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link Artist#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCountry
	 *            the new value of the '{@link Artist#getCountry() country}'
	 *            feature.
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of '<em><b>genre</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>genre</b></em>' feature
	 * @generated
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * Sets the '{@link Artist#getGenre() <em>genre</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newGenre
	 *            the new value of the '{@link Artist#getGenre() genre}'
	 *            feature.
	 * @generated
	 */
	public void setGenre(Genre newGenre) {
		genre = newGenre;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Artist " + " [firstName: " + getFirstName() + "]" + " [lastName: " + getLastName() + "]"
				+ " [birthDate: " + getBirthDate() + "]" + "{extends: " + super.toString() + "} ";
	}
}
