package org.eclipse.emf.texo.example1.rcp.persistence.service;


import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * IMPORTANT:<br>
 * the service is only starting if<br>
 * Service-Component: OSGI-INF/PersistenceService.xml<br>
 * Bundle-ActivationPolicy: lazy<br>
 * is in your MANIFEST.MF
 * 
 * @author lumo
 * 
 */
public interface PersistenceService {

	public boolean connect();

	public boolean disconnect();

	public Boolean isConnected();

	// MT: why this method, it is as easy to call the next one
	public boolean save(EObject data);

	// MT: a simple example, no deletion possible, all data is loaded
	// and saved in one shot
	public boolean save(List<EObject> data);

	// MT: changed the api
	public EObject get(EClass eClass, Object id);

	// MT: a simple example, no deletion possible, all data is loaded
	// and saved in one shot
	public List<EObject> load();
}