package org.eclipse.emf.texo.samples.sport.club;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.samples.sport.society.Society;

/**
 * A representation of the model object '<em><b>Club</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "club_Club")
public class Club extends Society {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Team> teams = new ArrayList<Team>();

	/**
	 * Returns the value of '<em><b>teams</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>teams</b></em>' feature
	 * @generated
	 */
	public List<Team> getTeams() {
		return teams;
	}

	/**
	 * Sets the '{@link Club#getTeams() <em>teams</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTeams
	 *            the new value of the '{@link Club#getTeams() teams}' feature.
	 * @generated
	 */
	public void setTeams(List<Team> newTeams) {
		teams = newTeams;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Club " + "{extends: " + super.toString() + "} ";
	}
}
