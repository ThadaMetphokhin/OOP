package LAB6;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

import java.util.Stack;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;

public class LAB6 {

	protected static  Shell shell;
	
	static Text text1,text2,text3,text4 ;
	private static  Button btn;
	
	static Stack<String> stack = new Stack<>(); //Create Object Stack for store stack in program
	
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LAB6 window = new LAB6();
			window.open();
		} catch (Exception e) {
			//MessageDialog.openInformation(shell, "Error Warning", String.valueOf(e));
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
		
		btn = new Button(shell,SWT.None|SWT.BORDER_SOLID);
		btn.setBounds(160, 50, 100, 50);
		btn.setBackground(new Color(166, 166, 166));
		btn.setText("ProgramFactorials");
		btn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Form2.main();
			}
		});

	}

	protected void setText(String string) {
		// TODO Auto-generated method stub
		
	}
	//create new form

	public static void main() {
		// TODO Auto-generated method stub
		btn.setVisible(false);
		System.out.println(stack.size());
		text1 = new Text(shell,SWT.None|SWT.BORDER_SOLID);
		text2 = new Text(shell,SWT.None|SWT.BORDER_SOLID);
		text3 = new Text(shell,SWT.None|SWT.BORDER_SOLID);
		text4 = new Text(shell,SWT.None|SWT.BORDER_SOLID);
		
		
		if(stack.size()==1) {
			text1.setBounds(160, 50, 100, 20);
			text1.setBackground(new Color(166, 166, 166));
			text1.setText(String.valueOf(stack.peek()));	
			text2.setBounds(160, 50, 100, 20);
			text2.setBackground(new Color(166, 166, 166));
			text3.setBounds(160, 50, 100, 20);
			text3.setBackground(new Color(166, 166, 166));
			text4.setBounds(160, 50, 100, 20);
			text4.setBackground(new Color(166, 166, 166));
			
		}else if(stack.size()==2) {
			text1.setBounds(160, 50, 100, 20);
			text1.setBackground(new Color(166, 166, 166));
			text1.setText(String.valueOf(stack.peek()));	
			text2.setBounds(160, 50, 100, 20);
			text2.setBackground(new Color(166, 166, 166));
			text1.setText(String.valueOf(stack.get(0)));	
			text3.setBounds(160, 50, 100, 20);
			text3.setBackground(new Color(166, 166, 166));
			text4.setBounds(160, 50, 100, 20);
			text4.setBackground(new Color(166, 166, 166));
		}
		
		
		
		Button Run = new Button(shell,SWT.None|SWT.BORDER_SOLID);
		Run.setBounds(30, 170, 100, 30);
		Run.setText("Run");
		Run.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
	}
	
}
