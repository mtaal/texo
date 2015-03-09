package org.eclipse.emf.texo.test.model.samples.travel;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Trip</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "travel_Trip")
public class Trip extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String name2 = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private City destination = null;

	/**
	 * Returns the value of '<em><b>name2</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name2</b></em>' feature
	 * @generated
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * Sets the '{@link Trip#getName2() <em>name2</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName2
	 *            the new value of the '{@link Trip#getName2() name2}' feature.
	 * @generated
	 */
	public void setName2(String newName2) {
		name2 = newName2;
	}

	/**
	 * Returns the value of '<em><b>destination</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>destination</b></em>' feature
	 * @generated
	 */
	public City getDestination() {
		return destination;
	}

	/**
	 * Sets the '{@link Trip#getDestination() <em>destination</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDestination
	 *            the new value of the '{@link Trip#getDestination()
	 *            destination}' feature.
	 * @generated
	 */
	public void setDestination(City newDestination) {
		destination = newDestination;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Trip " + " [name2: " + getName2() + "]" + "{extends: "
				+ super.toString() + "} ";
	}
}
