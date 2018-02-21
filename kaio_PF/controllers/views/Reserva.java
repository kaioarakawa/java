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
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import br.edu.ifcvideira.DAOs.Apartamento_reservaDao;
import br.edu.ifcvideira.DAOs.ClienteDao;
import br.edu.ifcvideira.DAOs.ReservaDao;
import br.edu.ifcvideira.DAOs.ServidorDao;
import br.edu.ifcvideira.beans.Apartamento_reserva;
import br.edu.ifcvideira.beans.Cliente;
import br.edu.ifcvideira.beans.Pessoa;
import br.edu.ifcvideira.beans.Servidor;


import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.RowFilter;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Timestamp;
import java.awt.event.ActionEvent;



public class Reserva extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cpf;
	private JTextField rua;
	private JTextField cidade;
	private JTextField UF;
	private JTextField Pais;
	private JTextField Telefone;
	private JTextField Profissão;
	private JTable table;
	private JTextField atendente;
	private JTextField numresev;
	private JTextField textField_1;
	private JTextField apt;
	private JTextField textField_4;
	private JTextField dtentrada;
	private JTextField textField_5;
	private JTextField dtsaida;
	private JTextField placacar;
	private JFormattedTextField dtnasc;
	private List<Object> reserva = new ArrayList<Object>();
	

	long time = System.currentTimeMillis();
	Timestamp timestamp = new Timestamp(time);
	Cliente c= new Cliente();
	Servidor s= new Servidor();
	ServidorDao sd= new ServidorDao();
	ClienteDao cd= new ClienteDao();
	br.edu.ifcvideira.beans.Reserva r = new br.edu.ifcvideira.beans.Reserva();
	ReservaDao rd= new ReservaDao();
	Apartamento_reserva a = new Apartamento_reserva();
	Apartamento_reservaDao ar = new Apartamento_reservaDao(); 
	JComboBox ref1 = new JComboBox();
	JComboBox sn = new JComboBox();
	BuscaServidor bs = new BuscaServidor();
	Buscaapt ba= new Buscaapt();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserva frame = new Reserva();
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
	public Reserva() {
		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent arg0) {
				atualizarTabela();
			}
		});
		setTitle("Reservas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300,0, 956, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Reserva.class.getResource("/br/edu/ifcvideira/imgs/fazenda-sakura.png")));
		lblNewLabel.setBounds(123, -25, 144, 124);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Reserva.class.getResource("/br/edu/ifcvideira/imgs/Codigo_Promocional_Central_de_Reservas._200x200.jpg")));
		lblNewLabel_1.setBounds(386, 21, 167, 64);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Nome:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 111, 59, 20);
		contentPane.add(label);
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(79, 111, 248, 20);
		contentPane.add(nome);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(79, 142, 248, 20);
		contentPane.add(cpf);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setBounds(0, 142, 59, 20);
		contentPane.add(lblCpf);
		
		rua = new JTextField();
		rua.setColumns(10);
		rua.setBounds(79, 175, 248, 20);
		contentPane.add(rua);
		
		JLabel lblRua = new JLabel("Rua:");
		lblRua.setHorizontalAlignment(SwingConstants.CENTER);
		lblRua.setBounds(0, 175, 59, 20);
		contentPane.add(lblRua);
		
		cidade = new JTextField();
		cidade.setColumns(10);
		cidade.setBounds(79, 207, 248, 20);
		contentPane.add(cidade);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblCidade.setBounds(0, 207, 59, 20);
		contentPane.add(lblCidade);
		
		UF = new JTextField();
		UF.setColumns(10);
		UF.setBounds(426, 110, 248, 20);
		contentPane.add(UF);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setHorizontalAlignment(SwingConstants.CENTER);
		lblUf.setBounds(364, 111, 59, 20);
		contentPane.add(lblUf);
		
		Pais = new JTextField();
		Pais.setColumns(10);
		Pais.setBounds(426, 142, 248, 20);
		contentPane.add(Pais);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setHorizontalAlignment(SwingConstants.CENTER);
		lblPais.setBounds(364, 142, 59, 20);
		contentPane.add(lblPais);
		
		JLabel lblDataNascismento = new JLabel("Data Nascismento:");
		lblDataNascismento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataNascismento.setBounds(364, 175, 120, 20);
		contentPane.add(lblDataNascismento);
		
		Telefone = new JTextField();
		try{ 
			javax.swing.text.MaskFormatter tel= new javax.swing.text.MaskFormatter("(##) #####-####");
			Telefone = new javax.swing.JFormattedTextField(tel);
			}
			catch (Exception e){
			}
		Telefone.setColumns(10);
		Telefone.setBounds(507, 208, 167, 20);
		contentPane.add(Telefone);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelefone.setBounds(364, 207, 81, 20);
		contentPane.add(lblTelefone);
		
		JLabel lblProfisso = new JLabel("Profiss\u00E3o:");
		lblProfisso.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfisso.setBounds(0, 238, 69, 20);
		contentPane.add(lblProfisso);
		
		Profissão = new JTextField();
		Profissão.setColumns(10);
		Profissão.setBounds(79, 238, 249, 20);
		contentPane.add(Profissão);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		try{ 
			javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-##-##");
			dtnasc = new javax.swing.JFormattedTextField(data);
			}
			catch (Exception e){
			}
		
		dtnasc.setToolTipText("");
		dtnasc.setBounds(507, 175, 167, 20);
		contentPane.add(dtnasc);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 445, 909, 265);
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
				"Situação_reserva", "Valor_Total", "Numero_reserva", "Data_Entrada", "Data_saida", "placa_car", "numero_apt", "Tipo_ap", "Nome"
			}
		));
		scrollPane.setViewportView(table);
		
		atendente = new JTextField();
		atendente.setColumns(10);
		atendente.setBounds(426, 312, 248, 19);
		contentPane.add(atendente);
		
		JLabel lblAtendente = new JLabel("Atendente:");
		lblAtendente.setHorizontalAlignment(SwingConstants.CENTER);
		lblAtendente.setBounds(354, 313, 69, 20);
		contentPane.add(lblAtendente);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(684, 30, 7, 345);
		contentPane.add(separator);
		
		JLabel lblNumeroDaReserva = new JLabel("Numero da Reserva");
		lblNumeroDaReserva.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroDaReserva.setBounds(697, 167, 216, 14);
		contentPane.add(lblNumeroDaReserva);
		
		numresev = new JTextField();
		numresev.setColumns(10);
		numresev.setBounds(705, 192, 216, 20);
		numresev.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (numresev.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + numresev.getText(), 1));  
				}  
				
			}
		});
		contentPane.add(numresev);
		
		JLabel lblDataDeEntrada = new JLabel("Data de Entrada\r\n");
		lblDataDeEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeEntrada.setBounds(699, 229, 216, 14);
		contentPane.add(lblDataDeEntrada);
		
		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1 ){
					Object[] options3 = {"Excluir", "Cancelar"};
					if(JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir o registro:\n>   " 
							+ table.getValueAt(table.getSelectedRow(), 2) + "   -   "
							+ table.getValueAt(table.getSelectedRow(), 8), null,
							JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]) == 0){
						try {
						
							//atribuição do valor do campo código para o objeto cliente
							a.setId_apartamento(Integer.parseInt(apt.getText()));
							a.setData_entrada(dtentrada.getText());
							a.setId_reserva(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(),2)));
							
							
							// chamada do método de exclusão na classe Dao passando como parâmetro o código do cliente para ser excluído
							
							ar.deletarCliente(a);
							rd.deletarCliente(a);
							
						
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
		btnNewButton.setBounds(706, 300, 217, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (table.getSelectedRow() != -1){
					try {
						  
						//atribuição dos valores dos campos para o objeto cliente
						a.setData_entrada(dtentrada.getText());
						a.setData_saida(dtsaida.getText());
						a.setId_apartamento(Integer.parseInt(apt.getText()));
						a.setId_ref(ref1.getSelectedIndex());
						a.setSituacao_reserva(sn.getSelectedIndex());
						
						// chamada do método de alteração na classe Dao
						ar.AlterarCliente(a);
						ar.valortotal(a);
						
		
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
		btnAlterar.setBounds(706, 334, 217, 23);
		contentPane.add(btnAlterar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(699, 111, 216, 14);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(707, 136, 216, 20);
		textField_1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (textField_1.getText().length() == 0) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + textField_1.getText(), 1));  
				}  
				
			}
		});
		contentPane.add(textField_1);
		
		JTextField data1 = new JTextField();
		data1.setToolTipText("");
		data1.setBounds(705, 257, 208, 20);
		data1.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				
				//atualizar a tabela apenas com valores correspondentes aos digitados no campo de busca por nome
				TableRowSorter<TableModel> filtro = null;  
				DefaultTableModel model = (DefaultTableModel) table.getModel();  
				filtro = new TableRowSorter<TableModel>(model);  
				table.setRowSorter(filtro); 
				
				if (data1.getText().length() == 3) {
					filtro.setRowFilter(null);
				} else {  
					filtro.setRowFilter(RowFilter.regexFilter("(?i)" + data1.getText(), 1));  
				}  
				
			}
		});
		contentPane.add(data1);
 
		
		JButton btnNewButton_1 = new JButton("Reservar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
					//atribuição dos valores dos campos para o objeto cliente
					c.setNome(nome.getText());
					c.setCpf(cpf.getText());
					c.setTelefone(Telefone.getText());
					c.setEndereco(rua.getText());
					c.setCidade(cidade.getText());
					c.setUf(UF.getText());
					c.setPais(Pais.getText());
					c.setDt_nascimento(dtnasc.getText());
					c.setProfissao(Profissão.getText());
					cd.CadastrarCliente(c);
					r.setId_cliente(rd.RetornarCodigoCliente());
					r.setId_servidor(Integer.parseInt(atendente.getText()));
					rd.CadastrarClienteNV(r);
					a.setId_apartamento(Integer.parseInt(apt.getText()));
					a.setPlaca_car(placacar.getText());
					a.setData_entrada(dtentrada.getText());
					a.setData_saida(dtsaida.getText());
					a.setId_reserva(rd.Retornarreserva());
					a.setId_ref(ref1.getSelectedIndex());
					a.setSituacao_reserva(sn.getSelectedIndex());
					ar.CadastrarCliente(a);
					ar.valortot(a);
			
					
					
					System.out.println(timestamp);
					
					// chamada do método de cadastro na classe Dao
					
					
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				atualizarTabela();
				limpar();
			}
		});
		btnNewButton_1.setBounds(394, 343, 280, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblSituaoReserva = new JLabel("Situa\u00E7\u00E3o Reserva");
		lblSituaoReserva.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituaoReserva.setBounds(0, 355, 113, 20);
		contentPane.add(lblSituaoReserva);
		
		
		sn.setModel(new DefaultComboBoxModel(new String[] {"Pago", "A Pagar"}));
		sn.setBounds(123, 355, 204, 20);
		contentPane.add(sn);
		
		JLabel lblApartamento = new JLabel("Apartamento:");
		lblApartamento.setHorizontalAlignment(SwingConstants.CENTER);
		lblApartamento.setBounds(0, 269, 81, 20);
		contentPane.add(lblApartamento);
		
		apt = new JTextField();
		apt.setColumns(10);
		apt.setBounds(79, 269, 249, 20);
		contentPane.add(apt);
		
		JLabel lblDataDeEntrada_1 = new JLabel("Data de Entrada");
		lblDataDeEntrada_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeEntrada_1.setBounds(364, 238, 120, 20);
		contentPane.add(lblDataDeEntrada_1);
		
		textField_4 = new JTextField();
		try{ 
			javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-##-##");
			dtentrada = new javax.swing.JFormattedTextField(data);
			}
			catch (Exception e){
			}
		dtentrada.setColumns(10);
		dtentrada.setBounds(507, 238, 167, 20);
		contentPane.add(dtentrada);
		
		JLabel lblDataDeSaida = new JLabel("Data de Saida");
		lblDataDeSaida.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataDeSaida.setBounds(364, 273, 120, 20);
		contentPane.add(lblDataDeSaida);
		
		textField_5 = new JTextField();
		try{ 
			javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("####-##-##");
			dtsaida = new javax.swing.JFormattedTextField(data);
			}
			catch (Exception e){
			}
		dtsaida.setColumns(10);
		dtsaida.setBounds(507, 273, 167, 20);
		contentPane.add(dtsaida);
		
		
		ref1.setModel(new DefaultComboBoxModel(new String[] {"Nenhuma", "Meia Pens\u00E3o ", "Pens\u00E3o Completa"}));
		ref1.setBounds(123, 324, 204, 20);
		contentPane.add(ref1);
		
		JLabel lblRefeio = new JLabel("Refei\u00E7\u00E3o");
		lblRefeio.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefeio.setBounds(0, 324, 113, 20);
		contentPane.add(lblRefeio);
		
		JLabel lblPlacaCarro = new JLabel("Placa Carro:");
		lblPlacaCarro.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacaCarro.setBounds(2, 296, 81, 20);
		contentPane.add(lblPlacaCarro);
		
		placacar = new JTextField();
		placacar.setColumns(10);
		placacar.setBounds(81, 296, 249, 20);
		contentPane.add(placacar);
		
		JLabel lblBusca = new JLabel("Busca");
		lblBusca.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(706, 30, 213, 78);
		contentPane.add(lblBusca);
		
		JButton btnNewButton_2 = new JButton("Procurar apartamento\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ba.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(24, 400, 303, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnProcurarIdServidor = new JButton("Procurar id Servidor");
		btnProcurarIdServidor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				bs.setVisible(true);
			}
		});
		btnProcurarIdServidor.setBounds(394, 400, 280, 34);
		contentPane.add(btnProcurarIdServidor);
	}
	

	public void setCamposFromTabela() {
		dtentrada.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 3)));
		dtsaida.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 4)));
		apt.setText(String.valueOf(table.getValueAt(table.getSelectedRow(), 6)));
		JOptionPane.showMessageDialog(null, "Lembre-se só se pode alterar a data de entrada e saida, o apt, a refeição inclusa e a situação da reserva");
	}

	public void limpar() {
		nome.setText(null);
		cpf.setText(null);
		Telefone.setText(null);
		UF.setText(null);
		Pais.setText(null);
		rua.setText(null);
		dtentrada.setText(null);
		dtsaida.setText(null);
		dtnasc.setText(null);
		cidade.setText(null);
		placacar.setText(null);
		Profissão.setText(null);
		apt.setText(null);
		
	}

	public void atualizarTabela() {
		try {
			reserva = ar.buscarTodos();
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

