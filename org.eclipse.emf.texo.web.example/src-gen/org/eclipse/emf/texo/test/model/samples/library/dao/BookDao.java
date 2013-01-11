package org.eclipse.emf.texo.test.model.samples.library.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.library.LibraryModelPackage;

/**
 * The Dao implementation for the model object '<em><b>Book</b></em>'.
 * 
 * @generated
 */
public class BookDao extends BaseDao<Book> {

	/**
	 * @generated
	 */
	@Override
	public Class<Book> getEntityClass() {
		return Book.class;
	}

	/**
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return LibraryModelPackage.INSTANCE.getBookEClass();
	}
}
