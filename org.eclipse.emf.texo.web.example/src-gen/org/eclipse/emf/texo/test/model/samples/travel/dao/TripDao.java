package org.eclipse.emf.texo.test.model.samples.travel.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.travel.TravelModelPackage;
import org.eclipse.emf.texo.test.model.samples.travel.Trip;

/**
 * The Dao implementation for the model object '<em><b>Trip</b></em>'.
 * 
 * @generated
 */
public class TripDao extends BaseDao<Trip> {

	/**
	 * @generated
	 */
	@Override
	public Class<Trip> getEntityClass() {
		return Trip.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return TravelModelPackage.INSTANCE.getTripEClass();
	}
}
