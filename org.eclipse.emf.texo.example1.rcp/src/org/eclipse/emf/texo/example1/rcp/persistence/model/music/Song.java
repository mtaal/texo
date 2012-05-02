package org.eclipse.emf.texo.example1.rcp.persistence.model.music;

import javax.persistence.Basic;
import javax.persistence.Entity;

import org.eclipse.emf.texo.example1.rcp.persistence.model.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Song</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Song")
public class Song extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	private int track = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	private String name = null;

	/**
	 * Returns the value of '<em><b>track</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>track</b></em>' feature
	 * @generated
	 */
	public int getTrack() {
		return track;
	}

	/**
	 * Sets the '{@link Song#getTrack() <em>track</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Song#getTrack() track}' feature.
	 * @generated
	 */
	public void setTrack(int newTrack) {
		track = newTrack;
	}

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
	 * Sets the '{@link Song#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Song#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Song " + " [track: " + getTrack() + "]" + " [name: "
				+ getName() + "]";
	}
}
