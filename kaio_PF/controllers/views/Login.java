package br.edu.ifcvideira.controllers.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String login="sakura";
	private String senha="1234";
	private JPasswordField se;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(500, 200, 323, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/br/edu/ifcvideira/imgs/fazenda-sakura.png")));
		lblNewLabel.setBounds(81, -26, 144, 124);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:\r\n");
		lblNewLabel_1.setBounds(37, 124, 65, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(99, 121, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:\r\n");
		lblSenha.setBounds(37, 170, 65, 14);
		contentPane.add(lblSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals(login) && se.getText().equals(senha)) {

					Login.this.dispose();
					TelaAdmin ta= new TelaAdmin();
					ta.setVisible(true);	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Login ou Senha errados tente novamente");
					limpar();
				}
			}
		});
		btnNewButton.setBounds(81, 201, 144, 23);
		contentPane.add(btnNewButton);
		
		se = new JPasswordField();
		se.setBounds(99, 167, 166, 20);
		contentPane.add(se);
		

	}
	public void limpar() {
		textField.setText("");
		se.setText("");
		
	}
	
}
