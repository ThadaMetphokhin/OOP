package exam1;

import org.eclipse.swt.SWT;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.InputStream;
import java.util.Random;

import javax.swing.JOptionPane;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;

public class Exam_1 {

	protected Shell shell;
	private Text text;

	int numclick = 0;
	String rdtext = "";
	private Label label;
	private Button btnNewButton_1;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Exam_1 window = new Exam_1();
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
		shell.setBackground(SWTResourceManager.getColor(204, 153, 204));
		shell.setSize(450, 300);
		shell.setText("\u0E42\u0E1B\u0E23\u0E41\u0E01\u0E23\u0E21\u0E14\u0E39\u0E14\u0E27\u0E07");
		Random rand = new Random();
		String[] luck = {"มีคนหนึ่งที่ตามหลอกหลอนในความทรงจำและชีวิตประจำวันของคุณ", "ปล่อยวางเสียบ้าง คุณไม่ควรแบกรับไว้คนเดียว", "ค่อยๆ ดำเนินการช้าๆ อย่างมั่นใจ คุณอาจจะไม่ได้ผลประโยชน์อะไรเลย", "คุณจะประสบความสำเร็จในหน้าที่การงาน","ระวังเรื่องการเดินทาง ควรมีสติเมื่อจะทำสิ่งใด"};
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(54, 86, 307, 21);
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int luckrandom = rand.nextInt(5);
				text.setText(luck[luckrandom]);
				rdtext=luck[luckrandom];
			}
		});
		btnNewButton.setBounds(95, 134, 75, 25);
		btnNewButton.setText("\u0E2A\u0E38\u0E48\u0E21\u0E14\u0E27\u0E07");
		InputStream input = ClassLoader.getSystemResourceAsStream("horoscope.png");
		label = new Label(shell, SWT.NONE);
		label.setAlignment(SWT.CENTER);
		label.setForeground(SWTResourceManager.getColor(255, 102, 102));
		label.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		label.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label.setBounds(54, 59, 151, 21);
		label.setText("\u0E44\u0E21\u0E48\u0E04\u0E27\u0E23\u0E14\u0E39\u0E40\u0E01\u0E34\u0E19\u0E27\u0E31\u0E19\u0E25\u0E30 3 \u0E04\u0E23\u0E31\u0E49\u0E07");
		
		btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StringSelection stringSelection = new StringSelection(rdtext);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
			}
		});
		btnNewButton_1.setBounds(228, 134, 87, 25);
		btnNewButton_1.setText("\u0E04\u0E31\u0E14\u0E25\u0E2D\u0E01\u0E04\u0E33\u0E17\u0E33\u0E19\u0E32\u0E22");
		
	}
}
