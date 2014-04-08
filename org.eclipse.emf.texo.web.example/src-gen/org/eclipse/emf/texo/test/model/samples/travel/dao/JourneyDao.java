package org.eclipse.emf.texo.test.model.samples.travel.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.travel.Journey;
import org.eclipse.emf.texo.test.model.samples.travel.TravelModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Journey</b></em>'.
 * 
 * @generated
 */
public class JourneyDao extends BaseDao<Journey> {

	/**
	 * @generated
	 */
	@Override
	public Class<Journey> getEntityClass() {
		return Journey.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return TravelModelPackage.INSTANCE.getJourneyEClass();
	}
}
