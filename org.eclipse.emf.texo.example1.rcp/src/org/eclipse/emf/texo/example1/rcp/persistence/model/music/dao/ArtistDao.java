package org.eclipse.emf.texo.example1.rcp.persistence.model.music.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.Artist;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.MusicModelPackage;
import org.eclipse.emf.texo.server.store.BaseDao;

/**
 * The Dao implementation for the model object '<em><b>Artist</b></em>'.
 * 
 * @generated
 */
public class ArtistDao extends BaseDao<Artist> {

	/**
	 * @generated
	 */
	@Override
	public Class<Artist> getEntityClass() {
		return Artist.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return MusicModelPackage.INSTANCE.getArtistEClass();
	}
}
