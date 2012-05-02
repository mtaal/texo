package org.eclipse.emf.texo.example1.rcp.commands;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.example1.rcp.controller.Controller;

public class Load extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (!Controller.isConnected()) {
			Controller.connect();
		}

		// // convert EObjects to Album
		// EList<EObject> objList = Controller.load();
		// EList<Album> albums = new BasicEList<Album>();
		// for (int i = 0; i < objList.size(); i++) {
		// EObject o = objList.get(i);
		// if (o instanceof Album) {
		// albums.add((Album) o);
		// }
		// }
		// Controller.getInstance().getAlbumList().getAlbums().clear();
		// Controller.getInstance().getAlbumList().getAlbums().addAll(albums);
		Controller.getResource().getContents().clear();
		List<EObject> list = Controller.load();
		Controller.getResource().getContents().addAll(list);
		System.out.println("loaded " + list.size() + "albums from XML");
		return null;
	}
}