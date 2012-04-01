package org.eclipse.emf.texo.test.model.samples.library;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Writer</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Writer")
public class Writer extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = true)
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Book.class)
	@OrderColumn()
	@JoinTable(name = "Writer_books")
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
	 * @param the
	 *            new value of the '{@link Writer#getName() name}' feature.
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
	 * Sets the '{@link Writer#getBooks() <em>books</em>}' feature.
	 * 
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param the
	 *            new value of the '{@link Writer#getBooks() books}' feature.
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
		return "Writer " + " [name: " + getName() + "]";
	}
}
