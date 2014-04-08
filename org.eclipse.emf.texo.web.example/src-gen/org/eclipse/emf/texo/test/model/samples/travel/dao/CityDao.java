package org.eclipse.emf.texo.test.model.samples.travel.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.travel.City;
import org.eclipse.emf.texo.test.model.samples.travel.TravelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>City</b></em>'.
 * 
 * @generated
 */
public class CityDao extends BaseDao<City> {

	/**
	 * @generated
	 */
	@Override
	public Class<City> getEntityClass() {
		return City.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return TravelModelPackage.INSTANCE.getCityEClass();
	}
}
