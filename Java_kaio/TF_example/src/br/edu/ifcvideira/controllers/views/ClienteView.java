package br.edu.ifcvideira.controllers.views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.edu.ifcvideira.DAOs.ClienteDao;
import br.edu.ifcvideira.beans.Cliente;

public class ClienteView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCpf;
	private JTextField textRenda;
	private JTextField textTelefone;
	private JTextField textPNome;
	private JTextField textPCodigo;
	private JTable table;

	private List<Object> cliente = new ArrayList<Object>();
	
	Cliente cl = new Cliente();
	ClienteDao clDao = new ClienteDao();
	
	long time = System.currentTimeMillis();
	Timestamp timestamp = new Timestamp(time);


	
	private JTextField textCodigo;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteView frame = new ClienteView();
					frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
	}

	public ClienteView() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
				limpar();
			}
		});
		setTitle("Cadastro Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(10, 10, 59, 20);
		contentPane.add(label_1);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(79, 11, 315, 20);
		contentPane.add(textNome);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(79, 121, 147, 20);
		contentPane.add(textCpf);
		
		JLabel label_2 = new JLabel("CPF:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 121, 59, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Renda:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 66, 59, 20);
		contentPane.add(label_3);
		
		textRenda = new JTextField();
		textRenda.setColumns(10);
		textRenda.setBounds(79, 66, 147, 20);
		contentPane.add(textRenda);
		
		JButton alterar = new JButton("Alterar");
		alterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1){
					try {
						  
						//atribui��o dos valores dos campos para o objeto cliente
						cl.setCodigo(Integer.parseInt(textCodigo.getText()));
						cl.setNome(textNome.getText());
						cl.setCpf(textCpf.getText());
						cl.setTelefone(textTelefone.getText());
						cl.setRenda(Double.parseDouble(textRenda.getText()));
						// chamada do m�todo de altera��o na classe Dao
						clDao.AlterarCliente(cl);
						
		
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					atualizarTabela();
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
				}
			}
		});
		alterar.setBackground(SystemColor.controlHighlight);
		alterar.setBounds(247, 93, 147, 21);
		contentPane.add(alterar);
		
		JButton cadastrar = new JButton("Cadastrar");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//atribui��o dos valores dos campos para o objeto cliente
					cl.setNome(textNome.getText());
					cl.setCpf(textCpf.getText());
					cl.setTelefone(textTelefone.getText());
					cl.setRenda(Double.parseDouble(textRenda.getText()));
					cl.setData(timestamp);
					System.out.println(timestamp);
					
					// chamada do m�todo de cadastro na classe Dao
					clDao.CadastrarCliente(cl);
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				atualizarTabela();
				limpar();
			}
		});
		cadastrar.setBackground(SystemColor.controlHighlight);
		cadastrar.setBounds(247, 65, 147, 21);
		contentPane.add(cadastrar);
		
		JLabel label_4 = new JLabel("Telefone:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 94, 59, 20);
		contentPane.add(label_4);
		
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		limpar.setBackground(SystemColor.controlHighlight);
		limpar.setBounds(247, 37, 147, 21);
		contentPane.add(limpar);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(79, 94, 147, 20);
		contentPane.add(textTelefone);
		
		JButton excluir = new JButton("Excluir");
		excluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1){
					Object[] options3 = {"Excluir", "Cancelar"};
					if(JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o registro:\n>   " 
							+ table.getValueAt(table.getSelectedRow(), 0) + "   -   "
							+ table.getValueAt(table.getSelectedRow(), 1), null,
							JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]) == 0){
						try {
						
							//atribui��o do valor do campo c�digo para o objeto cliente
							cl.setCodigo(Integer.parseInt(textCodigo.getText()));
							
							// chamada do m�todo de exclus�o na classe Dao passando como par�metro o c�digo do cliente para ser exclu�do
							clDao.deletarCliente(cl);
							
						
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
		excluir.setBackground(SystemColor.controlHighlight);
		excluir.setBounds(247, 120, 147, 21);
		contentPane.add(excluir);
		
		JLabel label_5 = new JLabel("Busca:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(23, 158, 46, 20);
		contentPane.add(label_5);
		
		JLabel label_8 = new JLabel("Clientes Cadastrados:");
		label_8.setBounds(10, 257, 156, 20);
		contentPane.add(label_8);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sair();
			}
		});
		sair.setBackground(SystemColor.controlHighlight);
		sair.setBounds(117, 445, 173, 39);
		contentPane.add(sair);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 275, 384, 159);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				setCamposFromTabela();
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Codigo", "Nome", "CPF", "Telefone", "Renda"
			}
		));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCodigo.setBounds(10, 38, 59, 20);
		contentPane.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setEditable(false);
		textCodigo.setColumns(10);
		textCodigo.setBounds(79, 38, 147, 20);
		contentPane.add(textCodigo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.LIGHT_GRAY);
		separator_1.setBounds(10, 153, 384, 2);
		contentPane.add(separator_1);
		
		JLabel label_6 = new JLabel("C\u00F3digo:");
		label_6.setBounds(23, 186, 46, 20);
		contentPane.add(label_6);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		textPCodigo = new JTextField();
		textPCodigo.setBounds(79, 186, 315, 20);
		contentPane.add(textPCodigo);
		textPCodigo.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por codigo
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro);
				
				if (textPCodigo.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter(textPCodigo.getText(), 0));  
				}  
			}
		});
		textPCodigo.setColumns(10);
		
		textPNome = new JTextField();
		textPNome.setBounds(79, 213, 315, 20);
		contentPane.add(textPNome);
		textPNome.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (textPNome.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + textPNome.getText(), 1));  
				}  
				
			}
		});
		textPNome.setColumns(10);
		
		JLabel label_7 = new JLabel("Nome:");
		label_7.setBounds(23, 214, 46, 20);
		contentPane.add(label_7);
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(10, 244, 384, 2);
		contentPane.add(separator);
	}

	public void sair() {
		
		System.exit(0);
	}

	public void setCamposFromTabela() {
		textCodigo.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
		textNome.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)));
		textCpf.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 2)));
		textTelefone.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 3)));
		textRenda.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 4)));
	}

	public void limpar() {
		textCpf.setText(null);
		textNome.setText(null);
		textRenda.setText(null);
		textTelefone.setText(null);
		try {
			textCodigo.setText(String.valueOf(clDao.RetornarProximoCodigoCliente()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void atualizarTabela() {
		try {
			cliente = clDao.buscarTodos();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.setNumRows(0);
		for (int x=0; x!=cliente.size(); x++)
			{
				model.addRow((Object[]) cliente.get(x));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}




