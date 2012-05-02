/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.identifiable.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable;
import org.eclipse.emf.texo.example1.rcp.identifiable.IdentifiablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.identifiable.impl.IdentifiableImpl#getDb_Id <em>Db Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.identifiable.impl.IdentifiableImpl#getDb_version <em>Db version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifiableImpl extends EObjectImpl implements Identifiable {
	/**
	 * The default value of the '{@link #getDb_Id() <em>Db Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb_Id()
	 * @generated
	 * @ordered
	 */
	protected static final Long DB_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDb_Id() <em>Db Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb_Id()
	 * @generated
	 * @ordered
	 */
	protected Long db_Id = DB_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDb_version() <em>Db version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb_version()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DB_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDb_version() <em>Db version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb_version()
	 * @generated
	 * @ordered
	 */
	protected Integer db_version = DB_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdentifiablePackage.Literals.IDENTIFIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getDb_Id() {
		return db_Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDb_Id(Long newDb_Id) {
		Long oldDb_Id = db_Id;
		db_Id = newDb_Id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiablePackage.IDENTIFIABLE__DB_ID, oldDb_Id, db_Id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDb_version() {
		return db_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDb_version(Integer newDb_version) {
		Integer oldDb_version = db_version;
		db_version = newDb_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdentifiablePackage.IDENTIFIABLE__DB_VERSION, oldDb_version, db_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdentifiablePackage.IDENTIFIABLE__DB_ID:
				return getDb_Id();
			case IdentifiablePackage.IDENTIFIABLE__DB_VERSION:
				return getDb_version();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdentifiablePackage.IDENTIFIABLE__DB_ID:
				setDb_Id((Long)newValue);
				return;
			case IdentifiablePackage.IDENTIFIABLE__DB_VERSION:
				setDb_version((Integer)newValue);
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
			case IdentifiablePackage.IDENTIFIABLE__DB_ID:
				setDb_Id(DB_ID_EDEFAULT);
				return;
			case IdentifiablePackage.IDENTIFIABLE__DB_VERSION:
				setDb_version(DB_VERSION_EDEFAULT);
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
			case IdentifiablePackage.IDENTIFIABLE__DB_ID:
				return DB_ID_EDEFAULT == null ? db_Id != null : !DB_ID_EDEFAULT.equals(db_Id);
			case IdentifiablePackage.IDENTIFIABLE__DB_VERSION:
				return DB_VERSION_EDEFAULT == null ? db_version != null : !DB_VERSION_EDEFAULT.equals(db_version);
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
		result.append(" (db_Id: ");
		result.append(db_Id);
		result.append(", db_version: ");
		result.append(db_version);
		result.append(')');
		return result.toString();
	}

} //IdentifiableImpl
