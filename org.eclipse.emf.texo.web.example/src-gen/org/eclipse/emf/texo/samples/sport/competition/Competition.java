package org.eclipse.emf.texo.samples.sport.competition;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.samples.sport.club.Team;

/**
 * A representation of the model object '<em><b>Competition</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "competition_Competition")
public class Competition {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private List<Team> team = new ArrayList<Team>();

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
	 * Sets the '{@link Competition#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Competition#getName() name}'
	 *            feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>team</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>team</b></em>' feature
	 * @generated
	 */
	public List<Team> getTeam() {
		return team;
	}

	/**
	 * Adds to the <em>team</em> feature.
	 * 
	 * @param teamValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToTeam(Team teamValue) {
		if (!team.contains(teamValue)) {
			boolean result = team.add(teamValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>team</em> feature.
	 * 
	 * @param teamValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromTeam(Team teamValue) {
		if (team.contains(teamValue)) {
			boolean result = team.remove(teamValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>team</em> feature.
	 * 
	 * @generated
	 */
	public void clearTeam() {
		while (!team.isEmpty()) {
			removeFromTeam(team.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Competition#getTeam() <em>team</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTeam
	 *            the new value of the '{@link Competition#getTeam() team}'
	 *            feature.
	 * @generated
	 */
	public void setTeam(List<Team> newTeam) {
		team = newTeam;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Competition " + " [name: " + getName() + "]";
	}
}
