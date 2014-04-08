package org.eclipse.emf.texo.samples.sport.club;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * A representation of the model object '<em><b>Team</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "club_Team")
public class Team {

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
	private List<Member> member = new ArrayList<Member>();

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
	 * Sets the '{@link Team#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Team#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>member</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>member</b></em>' feature
	 * @generated
	 */
	public List<Member> getMember() {
		return member;
	}

	/**
	 * Adds to the <em>member</em> feature.
	 * 
	 * @param memberValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToMember(Member memberValue) {
		if (!member.contains(memberValue)) {
			boolean result = member.add(memberValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>member</em> feature.
	 * 
	 * @param memberValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromMember(Member memberValue) {
		if (member.contains(memberValue)) {
			boolean result = member.remove(memberValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>member</em> feature.
	 * 
	 * @generated
	 */
	public void clearMember() {
		while (!member.isEmpty()) {
			removeFromMember(member.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Team#getMember() <em>member</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMember
	 *            the new value of the '{@link Team#getMember() member}'
	 *            feature.
	 * @generated
	 */
	public void setMember(List<Member> newMember) {
		member = newMember;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Team " + " [name: " + getName() + "]";
	}
}
