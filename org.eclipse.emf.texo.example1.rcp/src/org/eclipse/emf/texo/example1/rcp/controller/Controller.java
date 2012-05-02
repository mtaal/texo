package org.eclipse.emf.texo.example1.rcp.controller;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.texo.example1.rcp.music.Album;
import org.eclipse.emf.texo.example1.rcp.persistence.service.PersistenceService;
import org.eclipse.emf.texo.example1.rcp.util.Utils;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class Controller {
	private static final boolean DEBUG = false;
	private static Controller instance;
	private static PersistenceService service;
	private static DataCollection<Album> dc;
	private static Resource res;

	private static EContentAdapter adapter;

	public static Resource getResource() {
		getInstance();
		return res;
	}

	public static void addSelectedAlbumAdapter(EContentAdapter a) {
		dc.addSelectionAdapter(a);
	}

	public static void removeSelectedAlbumAdapter(EContentAdapter a) {
		dc.removeSelectionAdapter(a);
	}

	public static Album getSelectedAlbum() {
//		return selectedAlbum;
		return dc.getCurrent();
	}

	public static void add(EContentAdapter adapter) {
		getResource().eAdapters().add(adapter);
	}

	public static void remove(EContentAdapter adapter) {
		getResource().eAdapters().remove(adapter);
	}

	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
			service = getPersistenceService();
			connect();

			dc = new DataCollection<Album>() {

				@Override
				public void setCurrent(Album anAlbum) {
					final Album oldAlbum = ((Album) dc.current);
					if (oldAlbum != null) {
						oldAlbum.eAdapters().removeAll(dc.getCurrentAdapters());
						oldAlbum.getArtist().eAdapters().removeAll(dc.getCurrentAdapters());
						oldAlbum.getArtist().getCountry().eAdapters().removeAll(dc.getCurrentAdapters());
					}
					dc.current = anAlbum;
					dc.current.eAdapters().addAll(dc.getCurrentAdapters());
					dc.current.getArtist().eAdapters().addAll(dc.getCurrentAdapters());
					dc.current.getArtist().getCountry().eAdapters().addAll(dc.getCurrentAdapters());
					
					Controller.getResource().eNotify(new ENotification() {

						@Override
						public Object getOldValue() {
							return oldAlbum;
						}

						@Override
						public Object getNotifier() {
							return Controller.getResource();
						}

						@Override
						public Object getNewValue() {
							return dc.current;
						}

						@Override
						public int getFeatureID(Class<?> expectedClass) {
							return Resource.RESOURCE__CONTENTS;
						}

						@Override
						public Object getFeature() {
							return null;
						}

						@Override
						public int getEventType() {
							return Resource.RESOURCE__CONTENTS;
						}
					});
				}
			};

			// helper = MusicFactory.eINSTANCE.createRCPHelper();
			res = new ResourceImpl();
			adapter = new EContentAdapter() {

				public void notifyChanged(Notification notification) {
					super.notifyChanged(notification);

					if (DEBUG)
						Utils.print("Controller", notification);
					if (notification.getNotifier() instanceof Resource) {
						switch (notification.getFeatureID(Resource.class)) {
						case Resource.RESOURCE__CONTENTS: {
							if (notification.getNewValue() instanceof Album) {
								switch (notification.getEventType()) {
								case Notification.ADD:
									dc.addToList((Album) notification
											.getNewValue());
									break;

								case Notification.REMOVE:
									dc.removeFromList((Album) notification
											.getNewValue());
									break;
								default:
									break;
								}

								return;
							}
						}
						}
					}
				}
			};
			getResource().eAdapters().add(adapter);
		}
		return instance;
	}

	public static boolean connect() {
		getInstance();
		// System.out.println("connected");
		return service.connect();
	}

	public static boolean isConnected() {
		getInstance();
		return service.isConnected();
	}

	public static boolean disconnect() {
		getInstance();
		return service.disconnect();
	}

	public static boolean save(EList<EObject> data) {
		getInstance();
		return service.save(data);
	}

	public static List<EObject> load() {
		getInstance();
		return service.load();
	}

	public static PersistenceService getPersistenceService() {
		try {
			BundleContext context = FrameworkUtil.getBundle(Controller.class)
					.getBundleContext();
			ServiceReference<?> serviceReference = context
					.getServiceReference(PersistenceService.class.getName());
			return (PersistenceService) context.getService(serviceReference);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public static EList<Album> getAlbums() {
		getInstance();
		return dc.getList();
	}

	public static void setSelectedAlbum(final Album newAlbum) {
		dc.setCurrent(newAlbum);
	}

	public static void add(Album a) {
		getResource().getContents().add(a);
	}

	public static void remove(Album a) {
		getResource().getContents().remove(a);
		getAlbums().remove(a);
	}
}