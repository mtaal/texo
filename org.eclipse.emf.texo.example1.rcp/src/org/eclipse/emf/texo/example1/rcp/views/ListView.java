package org.eclipse.emf.texo.example1.rcp.views;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.texo.example1.rcp.controller.Controller;
import org.eclipse.emf.texo.example1.rcp.music.Album;
import org.eclipse.emf.texo.example1.rcp.music.Artist;
import org.eclipse.emf.texo.example1.rcp.music.Country;
import org.eclipse.emf.texo.example1.rcp.music.Rating;
import org.eclipse.emf.texo.example1.rcp.util.Utils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class ListView extends ViewPart {

	private static final boolean DEBUG = false;
	public static final String ID = "org.eclipse.emf.texo.example1.rcp.views.ListView"; //$NON-NLS-1$
	private Table table;
	private TableViewer tableViewer;
	private EContentAdapter adapter;

	public ListView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {
		adapter = new EContentAdapter() {

			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				if (DEBUG)
					Utils.print("ListView", notification);
				if (notification.getNotifier() instanceof Resource) {
					switch (notification.getFeatureID(Resource.class)) {
					case Resource.RESOURCE__CONTENTS:
						tableViewer.setInput(Controller.getAlbums());
						break;
					case Resource.RESOURCE__IS_MODIFIED:
						System.out.println("res mod.");
						break;
					default:
						break;
					}
				}
				if (notification.getNotifier() instanceof Album
						|| notification.getNotifier() instanceof Artist
						|| notification.getNotifier() instanceof Country) {
					if (!tableViewer.getTable().isDisposed()) {
						tableViewer.refresh(true);
					}
				}
			}
		};
		// register adapter
		Controller.add(adapter);

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(1, false));
		{
			tableViewer = new TableViewer(container, SWT.BORDER
					| SWT.FULL_SELECTION);
			table = tableViewer.getTable();
			table.setHeaderVisible(true);
			table.setLinesVisible(true);
			table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1,
					1));
			{
				// rating
				TableViewerColumn tableViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				TableColumn tblclmnName = tableViewerColumn.getColumn();
				tblclmnName.setWidth(21);
			}
			{
				TableViewerColumn tableViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				TableColumn tblclmnName = tableViewerColumn.getColumn();
				tblclmnName.setWidth(100);
				tblclmnName.setText("Name");
			}
			{
				TableViewerColumn tableViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				TableColumn tblclmnArtist = tableViewerColumn.getColumn();
				tblclmnArtist.setWidth(148);
				tblclmnArtist.setText("Artist");
			}
			{
				TableViewerColumn tableViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				TableColumn tblclmnArtist = tableViewerColumn.getColumn();
				tblclmnArtist.setWidth(150);
				tblclmnArtist.setText("Country");
			}
			{
				TableViewerColumn tableViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				TableColumn tblclmnReleasedIn = tableViewerColumn.getColumn();
				tblclmnReleasedIn.setWidth(40);
				tblclmnReleasedIn.setText("Year");
			}
			{
				TableViewerColumn tableViewerColumn = new TableViewerColumn(
						tableViewer, SWT.NONE);
				TableColumn tblclmnSongs = tableViewerColumn.getColumn();
				tblclmnSongs.setWidth(70);
				tblclmnSongs.setText("Titles");
			}

			// ObservableListContentProvider contentProvider = new
			// ObservableListContentProvider();
			ArrayContentProvider contentProvider = new ArrayContentProvider();
			tableViewer.setContentProvider(contentProvider);
			tableViewer.getTable().addKeyListener(new KeyListener() {

				@SuppressWarnings("unchecked")
				@Override
				public void keyReleased(KeyEvent e) {
					if (e.keyCode == SWT.DEL) {
						StructuredSelection structuredSelection = (StructuredSelection) tableViewer
								.getSelection();
						// or iterate over all elements
						for (Iterator<Album> iterator = structuredSelection
								.iterator(); iterator.hasNext();) {
							Album a = iterator.next();
							Controller.remove(a);
						}
						tableViewer.refresh(true);
					}
				}

				@Override
				public void keyPressed(KeyEvent e) {
				}
			});

			tableViewer.setLabelProvider(new AlbumListLabelProvider());
			tableViewer
					.addSelectionChangedListener(new ISelectionChangedListener() {

						@Override
						public void selectionChanged(SelectionChangedEvent event) {
							StructuredSelection selection = (StructuredSelection) tableViewer
									.getSelection();
							final Album oldAlbum = Controller
									.getSelectedAlbum();
							final Album newAlbum = (Album) selection
									.getFirstElement();
							if (oldAlbum != null) {
								oldAlbum.eAdapters().remove(adapter);
								oldAlbum.getArtist().eAdapters()
										.remove(adapter);
								oldAlbum.getArtist().getCountry().eAdapters()
										.remove(adapter);
							}

							Controller.setSelectedAlbum(newAlbum);
						}
					});
		}
	}

	public void dispose() {
		Controller.remove(adapter);
		Controller.removeSelectedAlbumAdapter(adapter);
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	class AlbumListLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			Album a = (Album) obj;
			switch (index) {
			case 0:
				// RATING
				int high = 0;
				for (Iterator<Rating> iterator = a.getRatings().iterator(); iterator
						.hasNext();) {
					Rating r = iterator.next();
					if (r.equals(Rating.HIGH)) {
						high++;
					}
				}
				int total = a.getRatings().size();
				double rating = (double) high / (double) total;
				DecimalFormat f = new DecimalFormat("#0.00");
				return f.format(rating);
			case 1:
				// NAME
				return a.getName();
			case 2:
				// ARTIST
				return String.format("%s %s", a.getArtist().getFirstName(), a
						.getArtist().getLastName());
			case 3:
				// FLAG
				return a.getArtist().getCountry().getName();
			case 4:
				// RELEASE DATE
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
				return sdf.format(a.getReleaseDate());
			case 5:
				// SONG COUNT
				return String.format("%d", a.getSongs().size());

			default:
				break;
			}
			return index + " " + obj.toString();
		}

		public Image getColumnImage(Object obj, int index) {
			Album a = (Album) obj;
			switch (index) {
			case 0:
				// rating
				int high = 0;
				for (Iterator<Rating> iterator = a.getRatings().iterator(); iterator
						.hasNext();) {
					Rating r = iterator.next();
					if (r.equals(Rating.HIGH)) {
						high++;
					}
				}
				int total = a.getRatings().size();
				Rating r = Rating.LOW;
				if (high > total - high) {
					r = Rating.HIGH;
				}
				return Utils.getImage(Utils.getRating(r));

			case 3:
				String code = a.getArtist().getCountry().getCode();
				return Utils.getImage(Utils.getCountryCodeFlag(code));
			default:
				return null;
			}
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}
}