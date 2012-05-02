package org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.Album;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.MusicModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Album</b></em>'.
 * 
 * @generated
 */
public class AlbumDao extends BaseDao<Album> {

	/**
	 * @generated
	 */
	@Override
	public Class<Album> getEntityClass() {
		return Album.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return MusicModelPackage.INSTANCE.getAlbumEClass();
	}
}
