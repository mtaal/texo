package org.eclipse.emf.texo.example1.rcp.gui.widgets.edit;

import org.eclipse.emf.texo.example1.rcp.music.Genre;
import org.eclipse.emf.texo.example1.rcp.music.MusicFactory;
import org.eclipse.emf.texo.example1.rcp.util.Utils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class AddGenreDialog extends Dialog {

	protected Object result;
	protected Shell shlCreateNewGenre;
	private Text text;
	private Button btnAdd;

	/**
	 * Create the dialog.
	 * 
	 * @param parent
	 * @param style
	 */
	public AddGenreDialog(Shell parent, int style) {
		super(parent, style);
		setText("SWT Dialog");
	}

	/**
	 * Open the dialog.
	 * 
	 * @return the result
	 */
	public Object open() {
		createContents();
		Utils.center(shlCreateNewGenre);
		shlCreateNewGenre.open();
		shlCreateNewGenre.layout();
		Display display = getParent().getDisplay();
		while (!shlCreateNewGenre.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlCreateNewGenre = new Shell(getParent(), getStyle());
		shlCreateNewGenre.setSize(450, 83);
		shlCreateNewGenre.setText("add a genre...");
		shlCreateNewGenre.setLayout(new GridLayout(1, false));

		text = new Text(shlCreateNewGenre, SWT.BORDER);
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				btnAdd.setText(("add " + text.getText()).trim());
				btnAdd.setEnabled(getText().trim().length()>0);
			}
		});
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		btnAdd = new Button(shlCreateNewGenre, SWT.NONE);
		btnAdd.setEnabled(false);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Genre g = MusicFactory.eINSTANCE.createGenre();
				g.setName(text.getText().trim());
				result = g;
				shlCreateNewGenre.close();
			}
		});
		btnAdd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		btnAdd.setText("add");
	}

//	public static void main(String[] args) {
//		AddGenreDialog d = new AddGenreDialog(new Shell(Display.getDefault()),
//				SWT.DIALOG_TRIM);
//		Object result = d.open();
//	}
}