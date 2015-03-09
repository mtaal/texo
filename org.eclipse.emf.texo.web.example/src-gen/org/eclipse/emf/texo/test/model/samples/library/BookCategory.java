package org.eclipse.emf.texo.test.model.samples.library;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>BookCategory</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum BookCategory {

	/**
	 * The enum: MYSTERY <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MYSTERY(0, "Mystery", "Mystery") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isMystery() {
			return true;
		}
	},
	/**
	 * The enum: SCIENCEFICTION <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SCIENCEFICTION(1, "ScienceFiction", "ScienceFiction") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isScienceFiction() {
			return true;
		}
	},
	/**
	 * The enum: BIOGRAPHY <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BIOGRAPHY(2, "Biography", "Biography") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isBiography() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>BookCategory</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final BookCategory[] VALUES_ARRAY = new BookCategory[] {
			MYSTERY, SCIENCEFICTION, BIOGRAPHY };

	/**
	 * A public read-only list of all the '<em><b>BookCategory</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<BookCategory> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BookCategory</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the BookCategory, the literal enum class
	 * @generated
	 */
	public static BookCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BookCategory</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the BookCategory, the literal enum class
	 * @generated
	 */
	public static BookCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BookCategory</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the BookCategory, the literal enum
	 * @generated
	 */
	public static BookCategory get(int value) {
		for (BookCategory enumInstance : VALUES_ARRAY) {
			if (enumInstance.getValue() == value) {
				return enumInstance;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private BookCategory(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isMystery() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isScienceFiction() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isBiography() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal of this enum instance
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal value of the enumerator, which is its string
	 *         representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
