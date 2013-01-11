package org.eclipse.emf.texo.test.model.samples.library.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.library.Library;
import org.eclipse.emf.texo.test.model.samples.library.LibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Library</b></em>'.
 * 
 * @generated
 */
public class LibraryDao extends BaseDao<Library> {

	/**
	 * @generated
	 */
	@Override
	public Class<Library> getEntityClass() {
		return Library.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return LibraryModelPackage.INSTANCE.getLibraryEClass();
	}
}
