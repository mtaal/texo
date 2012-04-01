package org.eclipse.emf.texo.test.model.samples.library;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelFactory;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: library. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> This is documentation on package level * <!--
 * end-model-doc -->
 * 
 * @generated
 */
public class LibraryModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LibraryModelPackage.BOOK_CLASSIFIER_ID:
			return createBook();
		case LibraryModelPackage.WRITER_CLASSIFIER_ID:
			return createWriter();
		case LibraryModelPackage.LIBRARY_CLASSIFIER_ID:
			return createLibrary();
		}
		throw new IllegalArgumentException("The EClass '" + eClass.getName()
				+ "' is not a valid EClass for this EPackage");
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case LibraryModelPackage.BOOK_CLASSIFIER_ID:
			modelObject = new BookModelObject();
			break;
		case LibraryModelPackage.WRITER_CLASSIFIER_ID:
			modelObject = new WriterModelObject();
			break;
		case LibraryModelPackage.LIBRARY_CLASSIFIER_ID:
			modelObject = new LibraryModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Book
	 * @generated
	 */
	public Book createBook() {
		return new Book();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Writer
	 * @generated
	 */
	public Writer createWriter() {
		return new Writer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Library
	 * @generated
	 */
	public Library createLibrary() {
		return new Library();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		case LibraryModelPackage.BOOKCATEGORY_CLASSIFIER_ID:
			return createBookCategoryFromString(value);
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage");
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		case LibraryModelPackage.BOOKCATEGORY_CLASSIFIER_ID:
			return convertBookCategoryToString((BookCategory) value);
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage.");
	}

	/**
	 * Converts the EDataType: BookCategory to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertBookCategoryToString(BookCategory value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: BookCategory from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public BookCategory createBookCategoryFromString(String value) {
		if (value == null) {
			return null;
		}
		return BookCategory.get(value);
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Book</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class BookModelObject<E extends Book> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return LibraryModelPackage.INSTANCE.getBookEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return LibraryModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case LibraryModelPackage.BOOK_TITLE_FEATURE_ID:
				return getTarget().getTitle();
			case LibraryModelPackage.BOOK_PAGES_FEATURE_ID:
				return getTarget().getPages();
			case LibraryModelPackage.BOOK_CATEGORY_FEATURE_ID:
				return getTarget().getCategory();
			case LibraryModelPackage.BOOK_AUTHOR_FEATURE_ID:
				return getTarget().getAuthor();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case LibraryModelPackage.BOOK_TITLE_FEATURE_ID:
				getTarget().setTitle((String) value);
				return;
			case LibraryModelPackage.BOOK_PAGES_FEATURE_ID:
				getTarget().setPages((Integer) value);
				return;
			case LibraryModelPackage.BOOK_CATEGORY_FEATURE_ID:
				getTarget().setCategory((BookCategory) value);
				return;
			case LibraryModelPackage.BOOK_AUTHOR_FEATURE_ID:
				getTarget().setAuthor((Writer) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Writer</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class WriterModelObject<E extends Writer> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return LibraryModelPackage.INSTANCE.getWriterEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return LibraryModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case LibraryModelPackage.WRITER_NAME_FEATURE_ID:
				return getTarget().getName();
			case LibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
				return getTarget().getBooks();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case LibraryModelPackage.WRITER_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case LibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
				getTarget().setBooks((List<Book>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case LibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
				getTarget().getBooks().add((Book) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case LibraryModelPackage.WRITER_BOOKS_FEATURE_ID:
				getTarget().getBooks().remove((Book) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Library</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class LibraryModelObject<E extends Library> extends
			IdentifiableModelFactory.IdentifiableModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return LibraryModelPackage.INSTANCE.getLibraryEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return LibraryModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case LibraryModelPackage.LIBRARY_NAME_FEATURE_ID:
				return getTarget().getName();
			case LibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
				return getTarget().getWriters();
			case LibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
				return getTarget().getBooks();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case LibraryModelPackage.LIBRARY_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case LibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
				getTarget().setWriters((List<Writer>) value);
				return;
			case LibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
				getTarget().setBooks((List<Book>) value);
				return;
			}
			super.eSet(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case LibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
				getTarget().getWriters().add((Writer) value);
				return;

			case LibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
				getTarget().getBooks().add((Book) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case LibraryModelPackage.LIBRARY_WRITERS_FEATURE_ID:
				getTarget().getWriters().remove((Writer) value);
				return;

			case LibraryModelPackage.LIBRARY_BOOKS_FEATURE_ID:
				getTarget().getBooks().remove((Book) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

}
