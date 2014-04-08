package org.eclipse.emf.texo.samples.sport.club.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.samples.sport.club.Club;
import org.eclipse.emf.texo.samples.sport.club.ClubModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Club</b></em>'.
 * 
 * @generated
 */
public class ClubDao extends BaseDao<Club> {

	/**
	 * @generated
	 */
	@Override
	public Class<Club> getEntityClass() {
		return Club.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return ClubModelPackage.INSTANCE.getClubEClass();
	}
}
