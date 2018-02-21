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
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.edu.ifcvideira.DAOs.ApartamentoDao;

public class Buscaapt extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private List<Object> apt = new ArrayList<Object>();
	ApartamentoDao ad = new ApartamentoDao();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscaapt frame = new Buscaapt();
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
	public Buscaapt() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
			
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarApartamento = new JLabel("Buscar Apartamento");
		lblBuscarApartamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBuscarApartamento.setBounds(128, 11, 208, 50);
		contentPane.add(lblBuscarApartamento);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTipo.setBounds(57, 59, 61, 17);
		contentPane.add(lblTipo);
		
		textField = new JTextField();
		textField.setBounds(128, 58, 200, 20);
		contentPane.add(textField);
		textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (textField.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + textField.getText(), 1));  
				}  
				
			}
		});
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 83, 414, 167);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero", "Tipo", "Valor"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	public void atualizarTabela() {
		try {
			apt = ad.buscarTodos();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
		for (int x=0; x!=apt.size(); x++)
			{
				model.addRow((Object[]) apt.get(x));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
