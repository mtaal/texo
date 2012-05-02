package org.eclipse.emf.texo.example1.rcp.gui.widgets.edit;

import org.eclipse.emf.texo.example1.rcp.music.MusicFactory;
import org.eclipse.emf.texo.example1.rcp.music.Song;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

public class AddSongDialog extends Dialog {

	protected Object result;
	protected Shell shlCreateNewSong;
	private Text text;
	private Button btnAdd;
	private Spinner spinner;
	private Label lblTrack;
	private Label lblTitle;

	/**
	 * Create the dialog.
	 * 
	 * @param parent
	 * @param style
	 */
	public AddSongDialog(Shell parent, int style) {
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
		Utils.center(shlCreateNewSong);
		shlCreateNewSong.open();
		shlCreateNewSong.layout();
		Display display = getParent().getDisplay();
		while (!shlCreateNewSong.isDisposed()) {
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
		shlCreateNewSong = new Shell(getParent(), getStyle());
		shlCreateNewSong.setSize(450, 104);
		shlCreateNewSong.setText("add a song...");
		shlCreateNewSong.setLayout(new GridLayout(2, false));

		lblTrack = new Label(shlCreateNewSong, SWT.NONE);
		lblTrack.setText("Track #");

		lblTitle = new Label(shlCreateNewSong, SWT.NONE);
		lblTitle.setText("Title");

		spinner = new Spinner(shlCreateNewSong, SWT.BORDER);
		spinner.setSelection(1);
		spinner.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateButton();
			}
		});

		text = new Text(shlCreateNewSong, SWT.BORDER);
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateButton();
			}
		});
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		btnAdd = new Button(shlCreateNewSong, SWT.NONE);
		btnAdd.setEnabled(false);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Song s = MusicFactory.eINSTANCE.createSong();
				s.setName(text.getText().trim());
				s.setTrack(spinner.getSelection());
				result = s;
				shlCreateNewSong.close();
			}
		});
		btnAdd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2,
				1));
		btnAdd.setText("add");
	}

	private void updateButton() {
		btnAdd.setEnabled(!text.getText().trim().isEmpty());
		btnAdd.setText(("add Track #" + spinner.getText() + " - " + text
				.getText()).trim());
	}

//	public static void main(String[] args) {
//		AddSongDialog s = new AddSongDialog(new Shell(Display.getDefault()),
//				SWT.DIALOG_TRIM);
//		System.out.println(s.open());
//	}
}