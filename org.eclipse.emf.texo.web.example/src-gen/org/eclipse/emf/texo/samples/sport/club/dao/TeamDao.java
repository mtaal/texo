package org.eclipse.emf.texo.samples.sport.club.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.samples.sport.club.ClubModelPackage;
import org.eclipse.emf.texo.samples.sport.club.Team;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Team</b></em>'.
 * 
 * @generated
 */
public class TeamDao extends BaseDao<Team> {

	/**
	 * @generated
	 */
	@Override
	public Class<Team> getEntityClass() {
		return Team.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return ClubModelPackage.INSTANCE.getTeamEClass();
	}
}
