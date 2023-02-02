package LAB6;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Form2 extends LAB6  {
	
	protected static Shell shell;
	 
	
	static Shell open = new Shell();
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Button btnNewButton = new Button(open, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(171, 176, 75, 25);
		btnNewButton.setText("New Button");
		
		try {
			Form2 window = new Form2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
	}

	public static void main() {
		// TODO Auto-generated method stub
		try {
			while(!open.isDisposed()) {
				if(!open.isDisposed()) {
					open.setSize(450, 300);
					open.setText("Factorials Number");
					open.open();
					Text textgetnum = new Text(open, SWT.None);
					textgetnum.setBackground(new Color(167, 216, 99));
					textgetnum.setBounds(165, 50, 90, 20);
					textgetnum.setTextLimit(2);
					Button entersend = new Button(open,SWT.None);
					entersend.setBackground(new Color(216, 99, 108));
					entersend.setBounds(160, 100, 100, 40);
					entersend.setText("Enter");
					
					entersend.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							stack.push(String.valueOf(textgetnum.getText()+"!"));//push stack
							LAB6.main();// Set new Form in LAB6
						}
					});
					break;
				}else {
					MessageDialog.openInformation(null, "Warning", "Forms is running.");
					break;
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			MessageDialog.openInformation(null, "Warning", "Please Close Programe then open new");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
