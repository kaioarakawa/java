package br.edu.ifcvideira.controllers.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.edu.ifcvideira.DAOs.ApartamentoDao;
import br.edu.ifcvideira.beans.Apartamento;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CadastroAP extends JFrame {

	private JPanel contentPane;
	private JTextField valor_apt;
	private JTextField tipo_apartamento;
	private JTextField num_apt;
	private JTable table;
	private JTextField num;
	private JTextField tp;
	Apartamento a= new Apartamento();
	ApartamentoDao apDao = new ApartamentoDao();
	private List<Object> ap = new ArrayList<Object>();
	long time = System.currentTimeMillis();
	Timestamp timestamp = new Timestamp(time);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAP frame = new CadastroAP();
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
	public CadastroAP() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
				limpar();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 670, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastroAP.class.getResource("/br/edu/ifcvideira/imgs/fazenda-sakura.png")));
		label.setBounds(143, -29, 144, 124);
		contentPane.add(label);
		
		valor_apt = new JTextField();
		valor_apt.setColumns(10);
		valor_apt.setBounds(153, 170, 248, 20);
		contentPane.add(valor_apt);
		
		JLabel lblValorDoApartamento = new JLabel("Valor do Apartamento");
		lblValorDoApartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDoApartamento.setBounds(10, 170, 133, 20);
		contentPane.add(lblValorDoApartamento);
		
		JLabel lblTipoDoApartamento = new JLabel("Tipo do Apartamento");
		lblTipoDoApartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoDoApartamento.setBounds(10, 137, 133, 20);
		contentPane.add(lblTipoDoApartamento);
		
		tipo_apartamento = new JTextField();
		tipo_apartamento.setColumns(10);
		tipo_apartamento.setBounds(153, 139, 248, 20);
		contentPane.add(tipo_apartamento);
		
		num_apt = new JTextField();
		num_apt.setColumns(10);
		num_apt.setBounds(153, 106, 248, 20);
		contentPane.add(num_apt);
		
		JLabel lblNumeroApartamento = new JLabel("Numero Apartamento");
		lblNumeroApartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroApartamento.setBounds(10, 106, 133, 20);
		contentPane.add(lblNumeroApartamento);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 236, 634, 206);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				setCamposFromTabela();
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Numero do Apartamento", "Tipo Do Apartamento", "Valor"
			}
		));
		scrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(433, 11, 10, 214);
		contentPane.add(separator);
		
		JLabel label_1 = new JLabel("Numero Apartamento");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(460, 79, 161, 20);
		contentPane.add(label_1);
		
		num = new JTextField();
		num.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por codigo
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro);
				
				if (num.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter(num.getText(), 0));  
				}  
			}
		});
		num.setColumns(10);
		num.setBounds(448, 108, 191, 20);
		contentPane.add(num);
		
		JLabel lblTipoApartamento = new JLabel("Tipo Apartamento\r\n");
		lblTipoApartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoApartamento.setBounds(460, 141, 161, 20);
		contentPane.add(lblTipoApartamento);
		
		tp = new JTextField();
		tp.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por codigo
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro);
				
				if (tp.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter(tp.getText(), 0));  
				}  
			}
		});
		tp.setColumns(10);
		tp.setBounds(448, 170, 191, 20);
		contentPane.add(tp);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
					
					a.setNum_apt(Integer.parseInt(num_apt.getText()));
					a.setTipo_apartamento(tipo_apartamento.getText());
					a.setValor_apt(Double.parseDouble(valor_apt.getText()));
					System.out.println(timestamp);
					
					
					apDao.CadastrarAP(a);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				atualizarTabela();
				limpar();
			}
			
		});
		btnNewButton.setBounds(104, 202, 220, 23);
		contentPane.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (table.getSelectedRow() != -1){
				Object[] options3 = {"Excluir", "Cancelar"};
				if(JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o registro:\n>   " 
						+ table.getValueAt(table.getSelectedRow(), 0) + "   -   "
						+ table.getValueAt(table.getSelectedRow(), 1), null,
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]) == 0){
					try {
					
						//atribuição do valor do campo código para o objeto cliente
						a.setNum_apt(Integer.parseInt(num_apt.getText()));
						
						// chamada do método de exclusão na classe Dao passando como parâmetro o código do cliente para ser excluído
						apDao.deletarAp(a);
						
					
						atualizarTabela();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
			}
		}
	});
		btnExcluir.setBounds(448, 202, 191, 23);
		contentPane.add(btnExcluir);
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblBuscar.setBounds(453, 27, 191, 41);
		contentPane.add(lblBuscar);
		
	
	}
	public void setCamposFromTabela() {
		num_apt.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
		valor_apt.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)));
		tipo_apartamento.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 2)));
	}

	public void limpar() {
		num_apt.setText(null);
		valor_apt.setText(null);
		tipo_apartamento.setText(null);


	}

	public void atualizarTabela() {
		try {
			ap = apDao.buscarTodos();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
		for (int x=0; x!=ap.size(); x++)
			{
				model.addRow((Object[]) ap.get(x));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
