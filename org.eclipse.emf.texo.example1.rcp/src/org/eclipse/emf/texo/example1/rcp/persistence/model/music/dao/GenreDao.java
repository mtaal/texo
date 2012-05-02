package org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.Genre;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.MusicModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Genre</b></em>'.
 * 
 * @generated
 */
public class GenreDao extends BaseDao<Genre> {

	/**
	 * @generated
	 */
	@Override
	public Class<Genre> getEntityClass() {
		return Genre.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return MusicModelPackage.INSTANCE.getGenreEClass();
	}
}
