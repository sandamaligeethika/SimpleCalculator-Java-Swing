package calculator;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField_num1;
	private JTextField textField_num2;
    private JLabel lblAnswer;
    private JTextField textField_answer;
    private JButton btnAdd,btnSubtract,btnMultiplication,btnDivision;
    private double no1,no2,ans;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setForeground(Color.RED);
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 359, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField_num1 = new JTextField();
		textField_num1.setBounds(118, 31, 190, 20);
		frmCalculator.getContentPane().add(textField_num1);
		textField_num1.setColumns(10);
		
		textField_num2 = new JTextField();
		textField_num2.setBounds(118, 77, 190, 20);
		frmCalculator.getContentPane().add(textField_num2);
		textField_num2.setColumns(10);
		
		btnAdd = new JButton("+");
		btnAdd.setBackground(SystemColor.activeCaption);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
					checkFields();
					no1 = Double.parseDouble(textField_num1.getText());
					no2 = Double.parseDouble(textField_num2.getText());
					
					ans = no1 + no2;
					
					textField_answer.setText(Double.toString(ans));
					
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number!");
				}
			}
		});
		btnAdd.setBounds(39, 143, 46, 31);
		frmCalculator.getContentPane().add(btnAdd);
		
		btnSubtract = new JButton("-");
		btnSubtract.setBackground(SystemColor.activeCaption);
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				checkFields();
				
				try {
					no1 = Double.parseDouble(textField_num1.getText());
					no2 = Double.parseDouble(textField_num2.getText());
					
					ans = no1 - no2;
					
					textField_answer.setText(Double.toString(ans));
					
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number!");
				}
			}
		});
		btnSubtract.setBounds(112, 143, 46, 31);
		frmCalculator.getContentPane().add(btnSubtract);

		
		lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblAnswer.setBounds(51, 209, 71, 20);
		frmCalculator.getContentPane().add(lblAnswer);
		
		JLabel lblNumber1 = new JLabel("Number 1");
		lblNumber1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNumber1.setBounds(39, 29, 69, 14);
		frmCalculator.getContentPane().add(lblNumber1);
		
		JLabel lblNumber2 = new JLabel("Number 2");
		lblNumber2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNumber2.setBounds(39, 83, 69, 14);
		frmCalculator.getContentPane().add(lblNumber2);
		
		btnMultiplication = new JButton("*");
		btnMultiplication.setBackground(SystemColor.activeCaption);
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkFields();
				try {
					no1 = Double.parseDouble(textField_num1.getText());
					no2 = Double.parseDouble(textField_num2.getText());
					
					ans = no1 * no2;
					
					textField_answer.setText(Double.toString(ans));
					
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number!");
				}
							
			}
		});
		btnMultiplication.setBounds(189, 143, 46, 31);
		frmCalculator.getContentPane().add(btnMultiplication);
		
		btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkFields();
				try {
					no1 = Double.parseDouble(textField_num1.getText());
					no2 = Double.parseDouble(textField_num2.getText());
					
					ans = no1 / no2;
					
					textField_answer.setText(Double.toString(ans));
					
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "Enter Valid Number!");
				}
				
			}
		});
		btnDivision.setBackground(SystemColor.activeCaption);
		btnDivision.setBounds(262, 143, 46, 31);
		frmCalculator.getContentPane().add(btnDivision);
		
		textField_answer = new JTextField();
		textField_answer.setEditable(false);
		textField_answer.setBounds(118, 209, 190, 20);
		frmCalculator.getContentPane().add(textField_answer);
		textField_answer.setColumns(10);
	}
	
	public void checkFields() {
		if(textField_num1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Enter a value for number 1!");
		}else if(textField_num2.getText().isEmpty()){
			if(textField_num1.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Enter a value for number 1!");
			}
			JOptionPane.showMessageDialog(null, "Enter a value for number 2!");
		}
	}
}
