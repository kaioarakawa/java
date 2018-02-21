package br.edu.ifcvideira.Lista10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex3 extends JFrame {

	private JPanel contentPane;
	private JTextField tfLP;
	private JTextField tfAP;
	private JTextField tfLA;
	private JTextField tfAA;
	private JTextField tfqntazu;
	Azulejoquad aq = new Azulejoquad();
	Azulejoretan ar = new Azulejoretan();
	Azulejotri at = new Azulejotri();
	Azulejotridif atd= new Azulejotridif(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3 frame = new Ex3();
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
	public Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalculoDaQuantidade = new JLabel("Calculo Da Quantidade De Azulejos");
		lblCalculoDaQuantidade.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCalculoDaQuantidade.setBounds(108, 11, 297, 27);
		contentPane.add(lblCalculoDaQuantidade);
		
		JComboBox cbType = new JComboBox();
		cbType.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbType.setModel(new DefaultComboBoxModel(new String[] {"Azulejo Quadrado", "Azulejo Retangular", "Azulejo Triangular", "Azulejo Triangular com lados diferentes"}));
		cbType.setBounds(209, 49, 196, 20);
		contentPane.add(cbType);
		
		JLabel lblEscolhaOTipo = new JLabel("Escolha o tipo do azulejo");
		lblEscolhaOTipo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblEscolhaOTipo.setBounds(10, 49, 162, 17);
		contentPane.add(lblEscolhaOTipo);
		
		JLabel lblLadoDaParede = new JLabel("Lado Da Parede");
		lblLadoDaParede.setBounds(10, 85, 162, 14);
		contentPane.add(lblLadoDaParede);
		
		tfLP = new JTextField();
		tfLP.setBounds(209, 80, 196, 20);
		contentPane.add(tfLP);
		tfLP.setColumns(10);
		
		JLabel lblAlturaDaParede = new JLabel("Altura da Parede");
		lblAlturaDaParede.setBounds(10, 113, 162, 14);
		contentPane.add(lblAlturaDaParede);
		
		tfAP = new JTextField();
		tfAP.setColumns(10);
		tfAP.setBounds(209, 108, 196, 20);
		contentPane.add(tfAP);
		
		JLabel lblLadoDoAzulejo = new JLabel("Lado Do Azulejo");
		lblLadoDoAzulejo.setBounds(10, 143, 162, 14);
		contentPane.add(lblLadoDoAzulejo);
		
		tfLA = new JTextField();
		tfLA.setColumns(10);
		tfLA.setBounds(209, 138, 196, 20);
		contentPane.add(tfLA);
		
		JLabel lblAlturaDoAzulejo = new JLabel("Altura do Azulejo");
		lblAlturaDoAzulejo.setBounds(10, 173, 162, 14);
		contentPane.add(lblAlturaDoAzulejo);
		
		tfAA = new JTextField();
		tfAA.setColumns(10);
		tfAA.setBounds(209, 168, 196, 20);
		contentPane.add(tfAA);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbType.getSelectedIndex()==0) {
					aq.setAa(Double.parseDouble(tfAA.getText()));
					aq.setAp(Double.parseDouble(tfAP.getText()));
					aq.setLa(Double.parseDouble(tfLA.getText()));
					aq.setLp(Double.parseDouble(tfLP.getText()));
					
					tfqntazu.setText(""+aq.qntazuq());
				}else if(cbType.getSelectedIndex()==1) {
					ar.setAa(Double.parseDouble(tfAA.getText()));
					ar.setAp(Double.parseDouble(tfAP.getText()));
					ar.setLa(Double.parseDouble(tfLA.getText()));
					ar.setLp(Double.parseDouble(tfLP.getText()));
					
					tfqntazu.setText(""+ar.qntazur());
				}else if(cbType.getSelectedIndex()==2) {
					at.setAa(Double.parseDouble(tfAA.getText()));
					at.setAp(Double.parseDouble(tfAP.getText()));
					at.setLa(Double.parseDouble(tfLA.getText()));
					at.setLp(Double.parseDouble(tfLP.getText()));
					
					tfqntazu.setText(""+at.qntazut());
				}else  {
					atd.setAa(Double.parseDouble(tfAA.getText()));
					atd.setAp(Double.parseDouble(tfAP.getText()));
					atd.setLa(Double.parseDouble(tfLA.getText()));
					atd.setLp(Double.parseDouble(tfLP.getText()));
					
					tfqntazu.setText(""+atd.qntazutd());
				}
			}
		});
		btnCalcular.setForeground(SystemColor.desktop);
		btnCalcular.setBounds(108, 198, 168, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblQuantidadesDeAzulejos = new JLabel("Quantidades De Azulejos");
		lblQuantidadesDeAzulejos.setBounds(10, 237, 162, 14);
		contentPane.add(lblQuantidadesDeAzulejos);
		
		tfqntazu = new JTextField();
		tfqntazu.setEditable(false);
		tfqntazu.setColumns(10);
		tfqntazu.setBounds(209, 232, 196, 20);
		contentPane.add(tfqntazu);
	}
}
