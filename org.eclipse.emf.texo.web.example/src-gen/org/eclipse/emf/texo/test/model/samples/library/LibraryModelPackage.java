package org.eclipse.emf.texo.test.model.samples.library;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.server.store.DaoRegistry;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.emf.texo.test.model.samples.library.dao.BookDao;
import org.eclipse.emf.texo.test.model.samples.library.dao.LibraryDao;
import org.eclipse.emf.texo.test.model.samples.library.dao.WriterDao;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>library</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
 * is documentation on package level <!-- end-model-doc -->
 * 
 * @generated
 */
public class LibraryModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/samples/library";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final LibraryModelFactory MODELFACTORY = new LibraryModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOKCATEGORY_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOK_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOK_TITLE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOK_PAGES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOK_CATEGORY_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOK_AUTHOR_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WRITER_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WRITER_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int WRITER_BOOKS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LIBRARY_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LIBRARY_NAME_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LIBRARY_WRITERS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LIBRARY_BOOKS_FEATURE_ID = 4;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final LibraryModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an initialized instance of this class
	 * 
	 * @generated
	 */
	public static LibraryModelPackage initialize() {

		if (isInitialized) {
			return (LibraryModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final LibraryModelPackage modelPackage = new LibraryModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		IdentifiableModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Book.class,
				modelPackage.getBookEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Writer.class,
				modelPackage.getWriterEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Library.class,
				modelPackage.getLibraryEClass(), modelPackage);

		ModelResolver.getInstance().registerClassModelMapping(
				BookCategory.class, modelPackage.getBookCategoryEEnum(),
				modelPackage);

		DaoRegistry.getInstance().registerDao(Book.class, BookDao.class);
		DaoRegistry.getInstance().registerDao(Writer.class, WriterDao.class);
		DaoRegistry.getInstance().registerDao(Library.class, LibraryDao.class);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link LibraryModelFactory} instance.
	 * @generated
	 */
	@Override
	public LibraryModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "library.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Book</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Book</b></em>'
	 * @generated
	 */
	public EClass getBookEClass() {
		return (EClass) getEPackage().getEClassifiers().get(BOOK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Book.title</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Book.title</b></em>'.
	 * @generated
	 */
	public EAttribute getBook_Title() {
		return (EAttribute) getBookEClass().getEAllStructuralFeatures().get(
				BOOK_TITLE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Book.pages</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Book.pages</b></em>'.
	 * @generated
	 */
	public EAttribute getBook_Pages() {
		return (EAttribute) getBookEClass().getEAllStructuralFeatures().get(
				BOOK_PAGES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Book.category</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Book.category</b></em>'.
	 * @generated
	 */
	public EAttribute getBook_Category() {
		return (EAttribute) getBookEClass().getEAllStructuralFeatures().get(
				BOOK_CATEGORY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Book.author</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Book.author</b></em>'.
	 * @generated
	 */
	public EReference getBook_Author() {
		return (EReference) getBookEClass().getEAllStructuralFeatures().get(
				BOOK_AUTHOR_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Writer</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Writer</b></em>'
	 * @generated
	 */
	public EClass getWriterEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				WRITER_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Writer.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Writer.name</b></em>'.
	 * @generated
	 */
	public EAttribute getWriter_Name() {
		return (EAttribute) getWriterEClass().getEAllStructuralFeatures().get(
				WRITER_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Writer.books</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Writer.books</b></em>'.
	 * @generated
	 */
	public EReference getWriter_Books() {
		return (EReference) getWriterEClass().getEAllStructuralFeatures().get(
				WRITER_BOOKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Library</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Library</b></em>'
	 * @generated
	 */
	public EClass getLibraryEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LIBRARY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Library.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Library.name</b></em>'.
	 * @generated
	 */
	public EAttribute getLibrary_Name() {
		return (EAttribute) getLibraryEClass().getEAllStructuralFeatures().get(
				LIBRARY_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Library.writers</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Library.writers</b></em>'.
	 * @generated
	 */
	public EReference getLibrary_Writers() {
		return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(
				LIBRARY_WRITERS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Library.books</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Library.books</b></em>'.
	 * @generated
	 */
	public EReference getLibrary_Books() {
		return (EReference) getLibraryEClass().getEAllStructuralFeatures().get(
				LIBRARY_BOOKS_FEATURE_ID);
	}

	/**
	 * Returns the EEnum '<em><b>BookCategory</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>BookCategory</b></em>'
	 * @generated
	 */
	public EEnum getBookCategoryEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				BOOKCATEGORY_CLASSIFIER_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case BOOK_CLASSIFIER_ID:
			return Book.class;
		case WRITER_CLASSIFIER_ID:
			return Writer.class;
		case LIBRARY_CLASSIFIER_ID:
			return Library.class;
		case BOOKCATEGORY_CLASSIFIER_ID:
			return BookCategory.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
