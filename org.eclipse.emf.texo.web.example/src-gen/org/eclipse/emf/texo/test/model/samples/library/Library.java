package org.eclipse.emf.texo.test.model.samples.library;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Library</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Library")
public class Library extends Identifiable {

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
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Writer> writers = new ArrayList<Writer>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
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
	 * Sets the '{@link Library#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Library#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>writers</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>writers</b></em>' feature
	 * @generated
	 */
	public List<Writer> getWriters() {
		return writers;
	}

	/**
	 * Adds to the <em>writers</em> feature.
	 *
	 * @param writersValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToWriters(Writer writersValue) {
		if (!writers.contains(writersValue)) {
			boolean result = writers.add(writersValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>writers</em> feature.
	 *
	 * @param writersValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromWriters(Writer writersValue) {
		if (writers.contains(writersValue)) {
			boolean result = writers.remove(writersValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>writers</em> feature.
	 * 
	 * @generated
	 */
	public void clearWriters() {
		while (!writers.isEmpty()) {
			removeFromWriters(writers.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Library#getWriters() <em>writers</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWriters
	 *            the new value of the '{@link Library#getWriters() writers}'
	 *            feature.
	 * @generated
	 */
	public void setWriters(List<Writer> newWriters) {
		clearWriters();
		for (Writer value : newWriters) {
			addToWriters(value);
		}
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
	 * Sets the '{@link Library#getBooks() <em>books</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newBooks
	 *            the new value of the '{@link Library#getBooks() books}'
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
		return "Library " + " [name: " + getName() + "]" + "{extends: " + super.toString() + "} ";
	}
}
