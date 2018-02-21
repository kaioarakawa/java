package br.edu.ifcvideira.controllers.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAdmin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAdmin frame = new TelaAdmin();
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
	public TelaAdmin() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaAdmin.class.getResource("/br/edu/ifcvideira/imgs/fazenda-sakura.png")));
		lblNewLabel.setBounds(148, -28, 144, 124);
		contentPane.add(lblNewLabel);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo");
		lblBemVindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBemVindo.setBounds(148, 107, 134, 48);
		contentPane.add(lblBemVindo);
		
		JButton btnCadastrarApartamento = new JButton("Cadastrar Apartamento");
		btnCadastrarApartamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAP c= new CadastroAP();
				
				c.setVisible(true);
			}
		});
		btnCadastrarApartamento.setBounds(235, 179, 189, 48);
		contentPane.add(btnCadastrarApartamento);
		
		JButton btnCadastrarServidor = new JButton("Cadastrar Servidor");
		btnCadastrarServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroServidor ca = new CadastroServidor();
				
				ca.setVisible(true);
			}
		});
		btnCadastrarServidor.setBounds(10, 179, 189, 48);
		contentPane.add(btnCadastrarServidor);
	}

}
