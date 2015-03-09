package org.eclipse.emf.texo.test.model.samples.library;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Writer</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "library_Writer")
public class Writer extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable()
	private List<Book> books = new ArrayList<Book>();

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Writer#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Writer#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>books</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>books</b></em>' feature
	 * @generated
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * Adds to the <em>books</em> feature.
	 * 
	 * @param booksValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToBooks(Book booksValue) {
		if (!books.contains(booksValue)) {
			boolean result = books.add(booksValue);
			booksValue.setAuthor(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>books</em> feature.
	 * 
	 * @param booksValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 * 
	 * @generated
	 */
	public boolean removeFromBooks(Book booksValue) {
		if (books.contains(booksValue)) {
			boolean result = books.remove(booksValue);
			booksValue.setAuthor(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>books</em> feature.
	 * 
	 * @generated
	 */
	public void clearBooks() {
		while (!books.isEmpty()) {
			removeFromBooks(books.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Writer#getBooks() <em>books</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBooks
	 *            the new value of the '{@link Writer#getBooks() books}'
	 *            feature.
	 * @generated
	 */
	public void setBooks(List<Book> newBooks) {
		clearBooks();
		for (Book value : newBooks) {
			addToBooks(value);
		}
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Writer " + " [name: " + getName() + "]" + "{extends: "
				+ super.toString() + "} ";
	}
}
