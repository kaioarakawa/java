package br.edu.ifcvideira.controllers.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.edu.ifcvideira.DAOs.ServidorDao;

import javax.swing.JScrollPane;

public class BuscaServidor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	ServidorDao sd = new ServidorDao();
	private List<Object> servidor = new ArrayList<Object>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaServidor frame = new BuscaServidor();
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
	public BuscaServidor() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarServidor = new JLabel("Buscar Servidor");
		lblBuscarServidor.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblBuscarServidor.setBounds(140, 11, 179, 46);
		contentPane.add(lblBuscarServidor);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(64, 60, 67, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(141, 57, 197, 20);
		contentPane.add(textField);
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por codigo
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro);
				
				if (textField.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter(textField.getText(), 0));  
				}  
			}
		});
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(64, 85, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 88, 197, 20);
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por codigo
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro);
				
				if (textField_1.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter(textField_1.getText(), 0));  
				}  
			}
		});
		contentPane.add(textField_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 118, 414, 255);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "CPF", "ID"
			}
		));
	}
	public void atualizarTabela() {
		try {
			servidor = sd.buscarTodos1();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
		for (int x=0; x!=servidor.size(); x++)
			{
				model.addRow((Object[]) servidor.get(x));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
