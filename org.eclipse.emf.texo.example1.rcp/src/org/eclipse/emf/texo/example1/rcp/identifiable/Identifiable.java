/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.identifiable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable#getDb_Id <em>Db Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable#getDb_version <em>Db version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage#getIdentifiable()
 * @model
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Id</em>' attribute.
	 * @see #setDb_Id(Long)
	 * @see org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage#getIdentifiable_Db_Id()
	 * @model annotation="org.eclipse.emf.texo id='true'"
	 * @generated
	 */
	Long getDb_Id();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable#getDb_Id <em>Db Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Id</em>' attribute.
	 * @see #getDb_Id()
	 * @generated
	 */
	void setDb_Id(Long value);

	/**
	 * Returns the value of the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Db version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db version</em>' attribute.
	 * @see #setDb_version(Integer)
	 * @see org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage#getIdentifiable_Db_version()
	 * @model
	 * @generated
	 */
	Integer getDb_version();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable#getDb_version <em>Db version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db version</em>' attribute.
	 * @see #getDb_version()
	 * @generated
	 */
	void setDb_version(Integer value);

} // Identifiable
