package org.eclipse.emf.texo.test.model.samples.library;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Library</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "library_Library")
@Table(name = "library_Library")
public class Library extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(name = "name")
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "library_Library_id") })
	private List<Writer> writers = new ArrayList<Writer>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "library_Library_id") })
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
	 * @param the
	 *            new value of the '{@link Library#getName() name}' feature.
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
	 * @generated
	 */
	public void addToWriters(Writer writersValue) {
		if (!writers.contains(writersValue)) {
			writers.add(writersValue);
		}
	}

	/**
	 * Removes from the <em>writers</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromWriters(Writer writersValue) {
		if (writers.contains(writersValue)) {
			writers.remove(writersValue);
		}
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
	 * @param the
	 *            new value of the '{@link Library#getWriters() writers}'
	 *            feature.
	 * @generated
	 */
	public void setWriters(List<Writer> newWriters) {
		writers = newWriters;
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
	 * @generated
	 */
	public void addToBooks(Book booksValue) {
		if (!books.contains(booksValue)) {
			books.add(booksValue);
		}
	}

	/**
	 * Removes from the <em>books</em> feature.
	 * 
	 * @generated
	 */
	public void removeFromBooks(Book booksValue) {
		if (books.contains(booksValue)) {
			books.remove(booksValue);
		}
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
	 * @param the
	 *            new value of the '{@link Library#getBooks() books}' feature.
	 * @generated
	 */
	public void setBooks(List<Book> newBooks) {
		books = newBooks;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Library " + " [name: " + getName() + "]";
	}
}
