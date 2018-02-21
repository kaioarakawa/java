package br.edu.ifcvideira.controllers.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import br.edu.ifcvideira.DAOs.ReservaDao;
import br.edu.ifcvideira.utils.Conexao;

import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	ReservaDao rd= new ReservaDao();
	Conexao c = new Conexao();
	private List<Object> reserva = new ArrayList<Object>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setTitle("Menu");
		setBounds(100, 100, 619, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c.fechar();
				System.exit(0);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/br/edu/ifcvideira/imgs/fechar-p.png")));
		btnNewButton.setBounds(31, 309, 83, 59);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 38, 440, 330);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero da Reserva", "Cliente", "CPF"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Ultimas Reservas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(267, 11, 187, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblReservas = new JLabel("Reservas");
		lblReservas.setHorizontalAlignment(SwingConstants.CENTER);
		lblReservas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblReservas.setBounds(10, 23, 133, 14);
		contentPane.add(lblReservas);
		
		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAdministrador.setBounds(10, 164, 133, 14);
		contentPane.add(lblAdministrador);
		
		JLabel lblFechar = new JLabel("Fechar");
		lblFechar.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFechar.setBounds(10, 294, 133, 14);
		contentPane.add(lblFechar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Reserva r= new Reserva();
				
				r.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(Principal.class.getResource("/br/edu/ifcvideira/imgs/hoteis.png")));
		button.setBounds(10, 38, 133, 109);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l= new Login();
				l.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(Principal.class.getResource("/br/edu/ifcvideira/imgs/login.png")));
		button_1.setBounds(10, 177, 133, 109);
		contentPane.add(button_1);
	}
	
	public void atualizarTabela() {
		try {
			reserva = rd.buscarTodos();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
		for (int x=0; x!=reserva.size(); x++)
			{
				model.addRow((Object[]) reserva.get(x));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}

