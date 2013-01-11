package org.eclipse.emf.texo.test.model.base.identifiable.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Identifiable</b></em>'.
 * 
 * @generated
 */
public class IdentifiableDao extends BaseDao<Identifiable> {

	/**
	 * @generated
	 */
	@Override
	public Class<Identifiable> getEntityClass() {
		return Identifiable.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return IdentifiableModelPackage.INSTANCE.getIdentifiableEClass();
	}
}
