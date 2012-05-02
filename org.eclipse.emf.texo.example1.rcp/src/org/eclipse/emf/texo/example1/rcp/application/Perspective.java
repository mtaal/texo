package org.eclipse.emf.texo.example1.rcp.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.setFixed(false);
		{
			IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.TOP, 0.5f, IPageLayout.ID_EDITOR_AREA);
			folderLayout.addView("org.eclipse.emf.texo.example1.rcp.views.ListView");
		}
		layout.addView("org.eclipse.emf.texo.example1.rcp.views.view", IPageLayout.BOTTOM, 0.18f, "folder");
		layout.addView("org.eclipse.emf.texo.example1.rcp.views.editorview", IPageLayout.RIGHT, 0.5f, "org.eclipse.emf.texo.example1.rcp.views.view");
	}
}