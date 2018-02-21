package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Ex1Principal extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JCheckBox chCarregador = new JCheckBox("Carregador - R$ 200,00");
	JCheckBox chPasta = new JCheckBox("Pasta - R$ 150,00");		
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador - R$ 150,00");		
	JCheckBox chTeclado = new JCheckBox("Teclado - R$ 50,00");
	private final JLabel lblPlacaMe = new JLabel("Placa M\u00E3e: ");
	private final JLabel lblProcessador = new JLabel("Processador:");
	private final JComboBox cbProcessador = new JComboBox();
	
	Ex1Notebook no = new Ex1Notebook();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Principal frame = new Ex1Principal();
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
	public Ex1Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConfigureSeuComputador = new JLabel("Configure seu computador");
		lblConfigureSeuComputador.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 15));
		lblConfigureSeuComputador.setBounds(113, 11, 248, 21);
		contentPane.add(lblConfigureSeuComputador);
		
		JRadioButton rbNote = new JRadioButton("Notebook");
		rbNote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbNote.isSelected()){
					chCarregador.setEnabled(true);
					chPasta.setEnabled(true);
					chEstabilizador.setEnabled(false);
					chTeclado.setEnabled(false);
					chEstabilizador.setSelected(false);
					chTeclado.setSelected(false);
				}
				
			}
		});
		buttonGroup.add(rbNote);
		rbNote.setSelected(true);
		rbNote.setBounds(42, 49, 109, 23);
		contentPane.add(rbNote);
		
		JRadioButton rbDesk = new JRadioButton("Desktop");
		rbDesk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rbDesk.isSelected()){
					chCarregador.setEnabled(false);
					chPasta.setEnabled(false);
					chEstabilizador.setEnabled(true);
					chTeclado.setEnabled(true);
					chCarregador.setSelected(false);
					chPasta.setSelected(false);
				}
				
			}
		});
		buttonGroup.add(rbDesk);
		rbDesk.setBounds(252, 49, 109, 23);
		contentPane.add(rbDesk);
		
		chCarregador.setBounds(25, 75, 164, 23);
		contentPane.add(chCarregador);

		chPasta.setBounds(25, 101, 164, 23);
		contentPane.add(chPasta);

		chEstabilizador.setEnabled(false);
		chEstabilizador.setBounds(231, 75, 164, 23);
		contentPane.add(chEstabilizador);

		chTeclado.setEnabled(false);
		chTeclado.setBounds(231, 101, 164, 23);
		contentPane.add(chTeclado);
		lblPlacaMe.setBounds(30, 141, 92, 14);
		
		contentPane.add(lblPlacaMe);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 500,00", "Modelo 1 - R$ 700,00", "Modelo 1 - R$ 900,00"}));
		cbPlacaMae.setBounds(107, 138, 154, 20);
		contentPane.add(cbPlacaMae);
		lblProcessador.setBounds(30, 169, 92, 14);
		
		contentPane.add(lblProcessador);
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - R$ 400,00", "Modelo 2 - R$ 500,00", "Modelo 3 - R$ 600,00"}));
		cbProcessador.setBounds(107, 166, 154, 20);
		
		contentPane.add(cbProcessador);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//selecionou que quer comprar um notebook
				if (rbNote.isSelected()){
					if (chCarregador.isSelected()){
						no.setCarregador(200);
						no.setCarregadorDesc(chCarregador.getText()+"\n");
					}else{
						no.setCarregadorDesc("");
					}
					
					if (chPasta.isSelected()){
						no.setPasta(150);
						no.setPastaDesc(chPasta.getText()+"\n");
					}else{
						no.setPastaDesc("");
					}
					
					if (cbPlacaMae.getSelectedIndex()==0){
						no.setPlacaMae(500);
						no.setPlacaMaeDesc("Placa M�e: "+cbPlacaMae.getSelectedItem()+"\n");
					}else if (cbPlacaMae.getSelectedIndex()==1){
						no.setPlacaMae(700);
						no.setPlacaMaeDesc("Placa M�e: "+cbPlacaMae.getSelectedItem()+"\n");
					}else if (cbPlacaMae.getSelectedIndex()==2){
						no.setPlacaMae(900);
						no.setPlacaMaeDesc("Placa M�e: "+cbPlacaMae.getSelectedItem()+"\n");
					}
					
					if (cbProcessador.getSelectedIndex()==0){
						no.setProcessador(400);
						no.setProcessadorDesc("Processador: "+cbProcessador.getSelectedItem()+"\n");
					}else if (cbProcessador.getSelectedIndex()==1){
						no.setProcessador(500);
						no.setProcessadorDesc("Processador: "+cbProcessador.getSelectedItem()+"\n");
					}else if (cbProcessador.getSelectedIndex()==2){
						no.setProcessador(600);
						no.setProcessadorDesc("Processador: "+cbProcessador.getSelectedItem()+"\n");
					}
					
					JOptionPane.showMessageDialog(null, no.notaFiscalNote());
					
				}else{
					//selecionou que quer um desktop
				}
			}
		});
		btnNewButton.setBounds(172, 298, 89, 23);
		contentPane.add(btnNewButton);
	}
}

























