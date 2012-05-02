package org.eclipse.emf.texo.example1.rcp.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.example1.rcp.controller.Controller;
import org.eclipse.emf.texo.example1.rcp.music.Album;
import org.eclipse.emf.texo.example1.rcp.music.Artist;

public class Save extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if (!Controller.isConnected()) {
			Controller.connect();
		}
		// move the stuff into the resource
		// add all albums

		EList<EObject> objs = Controller.getResource().getContents();
		System.out.println("Contents are #" + objs.size() + " elements");
		for (int i = 0; i < objs.size(); i++) {
			objs.addAll(getKids(objs.get(i)));
		}
		Controller.save(objs);
		return null;
	}

	private EList<EObject> getKids(EObject eObject) {
		EList<EObject> kids = new BasicEList<EObject>();
		if (eObject instanceof Album) {
			Album a = (Album) eObject;
			kids.add(a.getArtist());
			kids.addAll(a.getGenres());
			kids.addAll(a.getSongs());
		}
		if (eObject instanceof Artist) {
			Artist a = (Artist) eObject;
			kids.add(a.getCountry());
		}
		return kids;
	}
}