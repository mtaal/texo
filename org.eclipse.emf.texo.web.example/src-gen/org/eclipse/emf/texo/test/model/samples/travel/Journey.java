package org.eclipse.emf.texo.test.model.samples.travel;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Journey</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Reis")
public class Journey {

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
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Trip> trips = new ArrayList<Trip>();

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
	 * Sets the '{@link Journey#getName() <em>name</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Journey#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>trips</b></em>' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>trips</b></em>' feature
	 * @generated
	 */
	public List<Trip> getTrips() {
		return trips;
	}

	/**
	 * Adds to the <em>trips</em> feature.
	 * 
	 * @param tripsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToTrips(Trip tripsValue) {
		if (!trips.contains(tripsValue)) {
			boolean result = trips.add(tripsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>trips</em> feature.
	 * 
	 * @param tripsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromTrips(Trip tripsValue) {
		if (trips.contains(tripsValue)) {
			boolean result = trips.remove(tripsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>trips</em> feature.
	 * 
	 * @generated
	 */
	public void clearTrips() {
		while (!trips.isEmpty()) {
			removeFromTrips(trips.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Journey#getTrips() <em>trips</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTrips
	 *            the new value of the '{@link Journey#getTrips() trips}'
	 *            feature.
	 * @generated
	 */
	public void setTrips(List<Trip> newTrips) {
		trips = newTrips;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Journey " + " [name: " + getName() + "]";
	}
}
