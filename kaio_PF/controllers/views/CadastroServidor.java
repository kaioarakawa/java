package br.edu.ifcvideira.controllers.views;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.edu.ifcvideira.DAOs.ServidorDao;
import br.edu.ifcvideira.beans.Servidor;

import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class CadastroServidor extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField rua;
	private JTextField cidade;
	private JTextField uf;
	private JTextField pais;
	private JTextField carteira;
	private JTextField Dt_nascimento;
	private JTextField dt;
	private JTextField tel;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTable table;
	private JSeparator separator;
	private JLabel label_9;
	private JTextField nom;
	private JLabel lblCarteiraDeTrabalho;
	private JTextField ct;
	private JButton button;
	private JButton button_1;
	private JLabel lblBusca;
	private List<Object> servidor = new ArrayList<Object>();
	Servidor s= new Servidor();
	ServidorDao sd = new ServidorDao();
	long time = System.currentTimeMillis();
	Timestamp timestamp = new Timestamp(time);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroServidor frame = new CadastroServidor();
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
	public CadastroServidor() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
				limpar();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 958, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Nome:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 99, 59, 20);
		contentPane.add(label);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(89, 99, 248, 20);
		contentPane.add(nome);
		
		JLabel label_1 = new JLabel("CPF:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 130, 59, 20);
		contentPane.add(label_1);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(89, 130, 248, 20);
		contentPane.add(cpf);
		
		JLabel label_2 = new JLabel("Rua:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(10, 163, 59, 20);
		contentPane.add(label_2);
		
		rua = new JTextField();
		rua.setColumns(10);
		rua.setBounds(89, 163, 248, 20);
		contentPane.add(rua);
		
		JLabel label_3 = new JLabel("Cidade:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(10, 195, 59, 20);
		contentPane.add(label_3);
		
		cidade = new JTextField();
		cidade.setColumns(10);
		cidade.setBounds(89, 195, 248, 20);
		contentPane.add(cidade);
		
		JLabel label_4 = new JLabel("UF:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(374, 99, 59, 20);
		contentPane.add(label_4);
		
		uf = new JTextField();
		uf.setColumns(10);
		uf.setBounds(436, 98, 248, 20);
		contentPane.add(uf);
		
		JLabel label_5 = new JLabel("Pais:");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(374, 130, 59, 20);
		contentPane.add(label_5);
		
		pais = new JTextField();
		pais.setColumns(10);
		pais.setBounds(436, 130, 248, 20);
		contentPane.add(pais);
		
		JLabel label_6 = new JLabel("Data Nascismento:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(374, 163, 120, 20);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Telefone:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(374, 195, 81, 20);
		contentPane.add(label_7);
		
		JLabel lblNumeroCarteira = new JLabel("Numero Carteira");
		lblNumeroCarteira.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroCarteira.setBounds(10, 226, 112, 20);
		contentPane.add(lblNumeroCarteira);
		
		carteira = new JTextField();
		carteira.setColumns(10);
		carteira.setBounds(132, 226, 206, 20);
		contentPane.add(carteira);
		
		Dt_nascimento = new JTextField();
		try{ 
			javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-##-##");
			dt = new javax.swing.JFormattedTextField(data);
			}
			catch (Exception e){
			}
		dt.setColumns(10);
		dt.setBounds(504, 163, 180, 20);
		contentPane.add(dt);
		
		tel = new JTextField();
		try{ 
			javax.swing.text.MaskFormatter tele= new javax.swing.text.MaskFormatter("(##) #####-####");
			tel = new javax.swing.JFormattedTextField(tele);
			}
			catch (Exception e){
			}
		tel.setColumns(10);
		tel.setBounds(504, 195, 180, 20);
		contentPane.add(tel);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastroServidor.class.getResource("/br/edu/ifcvideira/imgs/fazenda-sakura.png")));
		lblNewLabel.setBounds(289, -37, 144, 124);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					//atribuição dos valores dos campos para o objeto cliente
					//atribuição dos valores dos campos para o objeto cliente
					s.setNome(nome.getText());
					s.setCpf(cpf.getText());
					s.setTelefone(tel.getText());
					s.setEndereco(rua.getText());
					s.setCidade(cidade.getText());
					s.setUf(uf.getText());
					s.setPais(pais.getText());
					s.setDt_nascimento(dt.getText());
					s.setNum_carteiraTrabalho(carteira.getText());
					sd.CadastrarServidor(s);
					System.out.println(timestamp);
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				atualizarTabela();
				limpar();
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(374, 225, 310, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 257, 924, 238);
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
				"id", "CPF", "Nome", "Rua", "cidade", "UF", "País", "Nascimento", "Telefone", "Carteira"
			}
		));
		scrollPane.setViewportView(table);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(701, 2, 7, 239);
		contentPane.add(separator);
		
		label_9 = new JLabel("Nome");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setBounds(707, 73, 216, 14);
		contentPane.add(label_9);
		
		nom = new JTextField();
		nom.setColumns(10);
		nom.setBounds(718, 99, 216, 20);
		nom.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (nom.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + nom.getText(), 1));  
				}  
				
			}
		});
		contentPane.add(nom);
		
		lblCarteiraDeTrabalho = new JLabel("Carteira de Trabalho");
		lblCarteiraDeTrabalho.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarteiraDeTrabalho.setBounds(707, 133, 216, 14);
		contentPane.add(lblCarteiraDeTrabalho);
		
		ct = new JTextField();
		ct.setColumns(10);
		ct.setBounds(718, 163, 216, 20);
		ct.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (ct.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + ct.getText(), 1));  
				}  
				
			}
		});
		contentPane.add(ct);
		
		button = new JButton("Excluir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1){
					Object[] options3 = {"Excluir", "Cancelar"};
					if(JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o registro:\n>   " 
							+ table.getValueAt(table.getSelectedRow(), 0) + "   -   "
							+ table.getValueAt(table.getSelectedRow(), 2), null,
							JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]) == 0){
						try {
						
							//atribuição do valor do campo código para o objeto cliente
							s.setId(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(),0)));
							
							// chamada do método de exclusão na classe Dao passando como parâmetro o código do cliente para ser excluído
							sd.deletarCliente(s);
							
						
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
		button.setBounds(717, 194, 217, 23);
		contentPane.add(button);
		
		button_1 = new JButton("Alterar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1){
					try {
						  
						//atribuição dos valores dos campos para o objeto cliente
						
						s.setId(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(),0)));
						s.setNome(nome.getText());
						s.setCpf(cpf.getText());
						s.setTelefone(tel.getText());
						s.setEndereco(rua.getText());
						s.setCidade(cidade.getText());
						s.setUf(uf.getText());
						s.setPais(pais.getText());
						s.setDt_nascimento(dt.getText());
						s.setNum_carteiraTrabalho(carteira.getText());
						
						s.setId_pessoa(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(),0)));
						sd.AlterarServidor(s);
						System.out.println(timestamp);
						
		
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					atualizarTabela();
					limpar();
				}
				
				else{
					JOptionPane.showMessageDialog(null, "Nenhuma linha selecionada");
				}
			}
		});
		button_1.setBounds(717, 225, 217, 23);
		contentPane.add(button_1);
		
		lblBusca = new JLabel("Busca");
		lblBusca.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(718, 11, 216, 51);
		contentPane.add(lblBusca);
	}
	
	public void setCamposFromTabela() {
		nome.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 2)));
		cpf.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 1)));
		rua.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 4)));
		cidade.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 5)));
		carteira.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 9)));
		dt.setText(String.valueOf(table.getValueAt(table.getSelectedRow(),7)));
		uf.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 5)));
		pais.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 6)));
		tel.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 8)));
		
	}

	public void limpar() {
		nome.setText(null);
		cpf.setText(null);
		rua.setText(null);
		cidade.setText(null);
		carteira.setText(null);
		uf.setText(null);
		pais.setText(null);
		tel.setText(null);
		dt.setText(null);
		nom.setText(null);
		ct.setText(null);
		
	}

	public void atualizarTabela() {
		try {
			servidor = sd.buscarTodos();
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
