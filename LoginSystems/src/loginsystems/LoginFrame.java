package loginsystems;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;

/*
 * author: andreea
 * July 31, 2021
 * 
 */
public class LoginFrame {

	private JFrame frame;
	private JTextField txtusername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
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
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Systems");
		lblNewLabel.setBounds(203, 10, 142, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(58, 70, 80, 13);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(58, 141, 80, 16);
		frame.getContentPane().add(lblPassword);
		
		txtusername = new JTextField();
		txtusername.setBounds(165, 67, 217, 19);
		frame.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(165, 140, 217, 19);
		frame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				@SuppressWarnings("deprecation")
				String password=txtPassword.getText();
				String username = txtusername.getText();
				
				if(password.contains("automatica") && username.contains("andreea")) {
					
					txtPassword.setText(null);
					txtusername.setText(null);
					
					JOptionPane.showMessageDialog(null, "Yor are connect now!");
					
					
				} else {
					
					JOptionPane.showMessageDialog(null, "Login Systems Error",
							"Invalid Login User Name or Password",JOptionPane.ERROR_MESSAGE);
					
					txtPassword.setText(null);
					txtusername.setText(null);
				}
				
			}
		});
		btnLogin.setBounds(40, 210, 85, 21);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton(" Reset All");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtusername.setText(null);
				txtPassword.setText(null);
				
				JOptionPane.showMessageDialog(null, "Login Systems is reset!");
			}
		});
		btnReset.setBounds(191, 210, 105, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame= new JFrame("Exit");
				
				if(JOptionPane.showConfirmDialog(frame, " Confirm if you want to exit! ",
						"Exit from Login Systems", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(366, 210, 85, 21);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 181, 411, 7);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 48, 411, 2);
		frame.getContentPane().add(separator_1);
	}
}
