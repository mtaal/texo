package org.eclipse.emf.texo.samples.sport.competition.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.samples.sport.competition.Competition;
import org.eclipse.emf.texo.samples.sport.competition.CompetitionModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Competition</b></em>'.
 * 
 * @generated
 */
public class CompetitionDao extends BaseDao<Competition> {

	/**
	 * @generated
	 */
	@Override
	public Class<Competition> getEntityClass() {
		return Competition.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return CompetitionModelPackage.INSTANCE.getCompetitionEClass();
	}
}
