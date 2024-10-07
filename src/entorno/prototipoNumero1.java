package entorno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.Caret;

import java.awt.BorderLayout;
import java.awt.Desktop.Action;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class prototipoNumero1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prototipoNumero1 window = new prototipoNumero1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prototipoNumero1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 558, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		
		JButton btnNewButton = new JButton("NOMBRE COMPLETO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				
				
				
				
		String nombre= textField.getText();
		String apellido1 = textField.getText();
		String apellido2 = textField.getText();		
				
				
		
		
		
		
			}
		
		});
		btnNewButton.setBounds(260, 184, 157, 23);
		frame.getContentPane().add(btnNewButton);
		String nombre = " ";
		String apellido1=" ";
		String apellido2= " ";
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 11, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(33, 14, 78, 14);
		frame.getContentPane().add(lblNewLabel);
	
		
		JLabel lblNewLabel_1 = new JLabel("apellido1");
		lblNewLabel_1.setBounds(33, 46, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("apellido2");
		lblNewLabel_2.setBounds(33, 83, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(121, 42, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 80, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_3 = new JLabel("nombre");
		lblNewLabel_3.setBounds(50, 125, 382, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
	
	
	}
}
