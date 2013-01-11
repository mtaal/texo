package org.eclipse.emf.texo.example1.rcp.persistence.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.example1.rcp.persistence.model.music.MusicModelPackage;
import org.eclipse.emf.texo.example1.rcp.persistence.service.PersistenceService;
import org.eclipse.emf.texo.server.store.EPersistenceService;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.osgi.PersistenceProvider;

public class DBPersistenceServiceImpl implements PersistenceService {

	private EPersistenceService ePersistenceService;

	public Boolean isConnected() {
		// we are always connected
		return true;
	}

	@Override
	public boolean connect() {
		// connect means nothing in the rdb world in this scenario
		return true;
	}

	@Override
	public boolean disconnect() {
		// no purpose in the db world
		return true;
	}

	public List<EObject> load() {
		return getEPersistenceService().query("select e from Album e",
				new HashMap<String, Object>(), 0, Integer.MAX_VALUE);
	}

	@Override
	public boolean save(EObject data) {
		save(Collections.singletonList(data));
		return true;
	}

	@Override
	public boolean save(List<EObject> data) {
		getEPersistenceService().persist(Collections.<EObject> emptyList(), data, new ArrayList<EObject>());
		return true;
	}

	@Override
	public EObject get(EClass eClass, Object id) {
		return ePersistenceService.get(eClass, id);
	}

	private synchronized EPersistenceService getEPersistenceService() {
		if (ePersistenceService == null) {
			ePersistenceService = ComponentProvider.getInstance().newInstance(
					EPersistenceService.class);

			// initialize the model package
			// this has to be done other wise the model package is not
			// registered in the ModelResolver
			MusicModelPackage.initialize();

			// Class loading is a big issue in osgi apps
			// we need to use a classloader capable of seeing the persistence xml
			// in this plugin			
			final HashMap<String, Object> properties = new HashMap<String, Object>();
			final ClassLoader classLoader = this.getClass().getClassLoader();
			properties.put(PersistenceUnitProperties.CLASSLOADER, classLoader);
			// the PersistenceProvider needs to be the OSGI jpa persistence 
			// provider. If the normal (non-osgi) eclipselink persistence provider
			// is used then the model classes are found but they are not recognized
			// as entities.
			ePersistenceService
					.setEntityManagerFactory(new PersistenceProvider()
							.createEntityManagerFactory("hsqldb", properties));
		}
		return ePersistenceService;
	}
}