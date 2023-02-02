package LAB5;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class LAB5 {
	protected Shell shell;
	private Text text;
	private Button button_1;
	private Button button_2;
	private Button button_4;
	private Button button_5;
	private Button button_6;
	private Button btnNewButton;
	private Button btnNewButton_1;
	private Button btnNewButton_2;
	private Button btnNewButton_3;
	private Button btnNewButton_4;
	private Button btnNewButton_5;
	private Button btnNewButton_6;
	private Button btnNewButton_7;
	private Button button_3;

	String num1,num2,result;
	int num11,num22,result1;
	char operator;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LAB5 window = new LAB5();
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
		shell.setSize(565, 394);
		shell.setText("SWT Application");
		
		
		Button button = new Button(shell, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 1
				text.setText(text.getText().concat(String.valueOf(1)));
			}
		});
		button.setBounds(18, 192, 75, 25);
		button.setText("1");
		
		text = new Text(shell, SWT.BORDER | SWT.MULTI);
		text.setEditable(false);
		text.setBounds(18, 10, 508, 96);
		
		button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					//If user press number run code below
					num1 = text.getText();
					num11 = Integer.valueOf(num1);
					operator = '+';
					text.setText(text.getText().concat(String.valueOf(operator)));
				}catch(Exception e1) {
					//If user did not press button number do it code below
					JOptionPane.showMessageDialog(null, "Please Insert Number.");
				}
			}
		});
		button_1.setBounds(18, 129, 75, 47);
		button_1.setText("+");
		
		button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					//If user press number run code below
					num1 = text.getText();
					num11 = Integer.valueOf(num1);
					operator = '-';
					text.setText(text.getText().concat(String.valueOf(operator)));
				}catch(Exception e1) {
					//If user did not press button number do it code below
					JOptionPane.showMessageDialog(null, "Please Insert Number.");
				}
			}
		});
		button_2.setBounds(113, 129, 75, 47);
		button_2.setText("-");
		
		button_4 = new Button(shell, SWT.NONE);
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 2
				text.setText(text.getText().concat(String.valueOf(2)));
				
			}
		});
		button_4.setBounds(113, 192, 75, 25);
		button_4.setText("2");
		
		button_5 = new Button(shell, SWT.NONE);
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 3
				text.setText(text.getText().concat(String.valueOf(3)));
			}
		});
		button_5.setBounds(211, 192, 75, 25);
		button_5.setText("3");
		
		button_6 = new Button(shell, SWT.NONE);
		button_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 4
				text.setText(text.getText().concat(String.valueOf(4)));
			}
		});
		button_6.setBounds(18, 230, 75, 25);
		button_6.setText("4");
		
		btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 5
				text.setText(text.getText().concat(String.valueOf(5)));
			}
		});
		btnNewButton.setBounds(113, 230, 75, 25);
		btnNewButton.setText("5");
		
		btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//When user press this button will plus the existing text add 6
				text.setText(text.getText().concat(String.valueOf(6)));
			}
		});
		btnNewButton_1.setBounds(211, 230, 75, 25);
		btnNewButton_1.setText("6");
		
		btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 7
				text.setText(text.getText().concat(String.valueOf(7)));
			}
		});
		btnNewButton_2.setBounds(18, 274, 75, 25);
		btnNewButton_2.setText("7");
		
		btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 8
				text.setText(text.getText().concat(String.valueOf(8)));
			}
		});
		btnNewButton_3.setBounds(113, 274, 75, 25);
		btnNewButton_3.setText("8");
		
		btnNewButton_4 = new Button(shell, SWT.NONE);
		btnNewButton_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 9
				text.setText(text.getText().concat(String.valueOf(9)));
			}
		});
		btnNewButton_4.setBounds(211, 274, 75, 25);
		btnNewButton_4.setText("9");
		
		btnNewButton_5 = new Button(shell, SWT.NONE);
		btnNewButton_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//When user press this button will plus the existing text add 0
				text.setText(text.getText().concat(String.valueOf(0)));
			}
		});
		btnNewButton_5.setBounds(18, 318, 268, 25);
		btnNewButton_5.setText("0");
		
		btnNewButton_6 = new Button(shell, SWT.NONE);
		btnNewButton_6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					//If user press number run code below
					num1 = text.getText();
					num11 = Integer.valueOf(num1);
					operator = '*';
					text.setText(text.getText().concat(String.valueOf(operator)));
				}catch(Exception e1) {
					//If user did not press button number do it code below
					JOptionPane.showMessageDialog(null, "Please Insert Number.");
				}
			}
		});
		btnNewButton_6.setBounds(211, 129, 75, 47);
		btnNewButton_6.setText("*");
		
		btnNewButton_7 = new Button(shell, SWT.NONE);
		btnNewButton_7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					//If user press number run code below
					num1 = text.getText();
					num11 = Integer.valueOf(num1);
					operator = '/';
					text.setText(text.getText().concat(String.valueOf(operator)));
				}catch(Exception e1) {
					//If user did not press button number do it code below
					JOptionPane.showMessageDialog(null, "Please Insert Number.");
				}
			}
		});
		btnNewButton_7.setBounds(313, 129, 90, 47);
		btnNewButton_7.setText("/");
		
		button_3 = new Button(shell, SWT.NONE);
		button_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Check Operator +,-,/,* and set num2 to Operator
				
				if(operator == '+') { //num2 cut +,-,*,/ with num1 is set value null
					
					num2 = text.getText().replace("+", "").replace(num1, "");
				}else if(operator == '-') {
					
					num2 = text.getText().replace("-", "").replace(num1, "");
				}else if(operator == '*') {
					num2 = text.getText().replace("*", "").replace(num1, "");
				}else if(operator == '/') {
					num2 = text.getText().replace("/", "").replace(num1, "");
				}
				num22 = Integer.valueOf(num2);
					Component textArea;
					switch(operator) {	/*
												Choose Operator Correct then think  Calculator and get value 
												and Show output to screen at text object
										*/
					
					case '+':
						result1=num11+num22;
						text.setText(String.valueOf(num11+"+"+num22+"\n = "+result1));
						
						num11=result1;
						break;
					case '-':
						result1=num11-num22;
						text.setText(String.valueOf(num11+"-"+num22+"\n = "+result1));
						
						num11=result1;
						break;
					case '*':
						result1=num11*num22;
						text.setText(String.valueOf(num11+"*"+num22+"\n = "+result1));
						
						num11=result1;
						break;
					case '/':
						if(num22 == 0) {
							text.setText(String.valueOf(num11+"/"+num22+"\n = "+result1));
							JOptionPane.showMessageDialog(null, "Can't calculate the value.");
						}else {
							result1=num11/num22;
							text.setText(String.valueOf(num11+"/"+num22+"\n = "+result1));
							num11=result1;
							
						}
						break;
					}
					
			}
		});
		button_3.setBounds(313, 192, 213, 151);
		button_3.setText("=");
		
		Button btnClear = new Button(shell, SWT.NONE);
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//Button Working in Clear set text = "" or null on screen show 
				text.setText("");
				num1="";
				num2="";
				result = "";
				num22 = 0;
				num11 = 0;
				result1 = 0;
			}
		});
		btnClear.setBounds(409, 129, 117, 47);
		btnClear.setText("Clear");

	}
}
