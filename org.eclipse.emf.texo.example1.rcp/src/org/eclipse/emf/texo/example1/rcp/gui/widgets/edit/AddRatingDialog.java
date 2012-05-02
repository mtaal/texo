package org.eclipse.emf.texo.example1.rcp.gui.widgets.edit;

import org.eclipse.emf.texo.example1.rcp.music.Rating;
import org.eclipse.emf.texo.example1.rcp.util.Utils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AddRatingDialog extends Dialog {

	protected Object result;
	protected Shell shlCreateNewGenre;
	private Button btnAdd;
	private CCombo combo;

	/**
	 * Create the dialog.
	 * 
	 * @param parent
	 * @param style
	 */
	public AddRatingDialog(Shell parent, int style) {
		super(parent, style);
		setText("add a rating...");
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
		shlCreateNewGenre.setSize(450, 84);
		shlCreateNewGenre.setLayout(new GridLayout(1, false));
		
		combo = new CCombo(shlCreateNewGenre, SWT.BORDER);
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		combo.setEditable(false);
		Rating[] values = Rating.values();
		String[] vals = new String[values.length];
		for (int i = 0; i < vals.length; i++) {
		 vals[i] = values[i].name();	
		}
		combo.setItems(vals);
		combo.select(0);

		btnAdd = new Button(shlCreateNewGenre, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Rating r = Enum.valueOf(Rating.class, combo.getText());
				result = r;
				shlCreateNewGenre.close();
			}
		});
		btnAdd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		btnAdd.setText("add");
	}

	public static void main(String[] args) {
		AddRatingDialog d = new AddRatingDialog(new Shell(Display.getDefault()),
				SWT.DIALOG_TRIM);
		Object result = d.open();
		System.out.println(result);
	}
}