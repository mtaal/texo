package org.eclipse.emf.texo.example1.rcp.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.texo.example1.rcp.controller.Controller;
import org.eclipse.emf.texo.example1.rcp.music.Album;
import org.eclipse.emf.texo.example1.rcp.util.Utils;

public class NewAlbum extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Album a = Utils.getNewTestAlbum();
		Controller.add(a);
		System.out.println("added a new album");
		return null;
	}
}