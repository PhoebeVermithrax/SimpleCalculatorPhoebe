/*
 * Created by: Phoebe Vermithrax
 * Created on: 08-Feb-2018
 * Created for: ICS4U
 * Daily Assignment – Day #5
 * This program calculates the users input with addition, subtraction, multiplication, division, and squared.
*/

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SimpleCalc {

	protected Shell shell;
	private Text txtFirstNum;
	private Text txtSecondNum;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SimpleCalc window = new SimpleCalc();
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
		shell.setText("Simple Calculator");
		
		Label lblIntroText = new Label(shell, SWT.NONE);
		lblIntroText.setBounds(114, 26, 191, 15);
		lblIntroText.setText("Enter the first and second number.");
		
		txtFirstNum = new Text(shell, SWT.BORDER);
		txtFirstNum.setBounds(30, 63, 159, 21);
		
		txtSecondNum = new Text(shell, SWT.BORDER);
		txtSecondNum.setBounds(256, 63, 159, 21);
		
		Label lblAnswer = new Label(shell, SWT.NONE);
		lblAnswer.setBounds(147, 217, 209, 15);
		
		Button btnAdd = new Button(shell, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the variables.
				double firstNum, secondNum, answer;
				
				//Try to catch any invalid input from the user.
				try {
					//Get the first number from the user.
					firstNum = Integer.parseInt(txtFirstNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				try
				{
					//Get the second number from the user.
					secondNum = Integer.parseInt(txtSecondNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				
				//Add the first and second number together.
				answer = firstNum + secondNum;
				
				//Output this to the user.
				lblAnswer.setText(" " + answer);
			}
		});
		btnAdd.setBounds(114, 107, 75, 25);
		btnAdd.setText("+");
		
		Button btnMultiplication = new Button(shell, SWT.NONE);
		btnMultiplication.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the variables.
				double firstNum, secondNum, answer;
				
				//Try to catch any invalid input from the user.
				try {
					//Get the first number from the user.
					firstNum = Integer.parseInt(txtFirstNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				try
				{
					//Get the second number from the user.
					secondNum = Integer.parseInt(txtSecondNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				
				//Add the first and second number together.
				answer = firstNum * secondNum;
				
				//Output this to the user.
				lblAnswer.setText(" " + answer);
			}
		});
		btnMultiplication.setBounds(256, 107, 75, 25);
		btnMultiplication.setText("x");
		
		Button btnSubtract = new Button(shell, SWT.NONE);
		btnSubtract.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the variables.
				double firstNum, secondNum, answer;
				
				//Try to catch any invalid input from the user.
				try {
					//Get the first number from the user.
					firstNum = Integer.parseInt(txtFirstNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				try
				{
					//Get the second number from the user.
					secondNum = Integer.parseInt(txtSecondNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				
				//Add the first and second number together.
				answer = firstNum - secondNum;
				
				//Output this to the user.
				lblAnswer.setText(" " + answer);
			}
		});
		btnSubtract.setBounds(114, 150, 75, 25);
		btnSubtract.setText("-");
		
		Button btnDivide = new Button(shell, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the variables.
				double firstNum, secondNum, answer;
				
				//Try to catch any invalid input from the user.
				try {
					//Get the first number from the user.
					firstNum = Integer.parseInt(txtFirstNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				try
				{
					//Get the second number from the user.
					secondNum = Integer.parseInt(txtSecondNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}
				
				//Add the first and second number together.
				answer = firstNum / secondNum;
				
				//Output this to the user.
				lblAnswer.setText(" " + answer);
			}
		});
		btnDivide.setBounds(256, 150, 75, 25);
		btnDivide.setText("/");
		
		Button btnSquared = new Button(shell, SWT.NONE);
		btnSquared.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//Set the variables.
				double firstNum, answer;
				
				//Try to catch any invalid input from the user.
				try {
					//Get the first number from the user.
					firstNum = Integer.parseInt(txtFirstNum.getText());
				}
				catch (Exception exc)
				{
					MessageDialog.openError(shell, "Error", "Invalid Number");
					return;
				}

				//Add the first and second number together.
				answer = Math.pow(firstNum, 2);
				
				//Output this to the user.
				lblAnswer.setText(" " + answer);
			}
		});
		btnSquared.setBounds(185, 181, 75, 25);
		btnSquared.setText("x^2");
		
		Label lblTextRevealAns = new Label(shell, SWT.NONE);
		lblTextRevealAns.setBounds(30, 217, 113, 15);
		lblTextRevealAns.setText("The answer is: ");
		

	}
}
