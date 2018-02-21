package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rcAdicao = new JRadioButton("Adi\u00E7\u00E3o");
	JRadioButton rbsub = new JRadioButton("Subtra\u00E7\u00E3o");
	JRadioButton rbMulti = new JRadioButton("Multiplica\u00E7\u00E3o");
	JRadioButton rbDiv = new JRadioButton("Divis\u00E3o");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 200, 203, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(54, 11, 129, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 1");
		lblNewLabel_1.setBounds(10, 41, 75, 25);
		contentPane.add(lblNewLabel_1);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(74, 43, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero 2");
		lblNumero.setBounds(10, 78, 75, 25);
		contentPane.add(lblNumero);
		
		tfNum2 = new JTextField();
		tfNum2.setColumns(10);
		tfNum2.setBounds(74, 80, 86, 20);
		contentPane.add(tfNum2);
		
		JComboBox cbOperacao = new JComboBox();
		cbOperacao.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent arg0) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent arg0) {
				double num1;
				double num2;
				double result=0;
				
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				
				
				if(cbOperacao.getSelectedIndex()==1){
					result=num1+num2;
				}else if(cbOperacao.getSelectedIndex()==2){
					result=num1-num2;
				}else if(cbOperacao.getSelectedIndex()==3){
					result=num1*num2;
				}else if(cbOperacao.getSelectedIndex()==4){
					result=num1/num2;
				}else{
					JOptionPane.showMessageDialog(null, "Opera��o, N�o Selecionada!!");
				}
				
				tfResult.setText(""+result);
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent arg0) {
			}
		});
		cbOperacao.setModel(new DefaultComboBoxModel(new String[] {"Selecione...", "Adi\u00E7\u00E3o", "Subtra\u00E7\u00E3o", "Multiplica\u00E7\u00E3o", "Divis\u00E3o"}));
		cbOperacao.setBounds(29, 114, 108, 19);
		contentPane.add(cbOperacao);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				double num1;
//				double num2;
//				double result=0;
//				
//				
//				num1 = Double.parseDouble(tfNum1.getText());
//				num2 = Double.parseDouble(tfNum2.getText());
//				
//				
//				
////				if(cbOperacao.getSelectedIndex()==1){
////					result=num1+num2;
////				}else if(cbOperacao.getSelectedIndex()==2){
////					result=num1-num2;
////				}else if(cbOperacao.getSelectedIndex()==3){
////					result=num1*num2;
////				}else if(cbOperacao.getSelectedIndex()==4){
////					result=num1/num2;
////				}else{
////					JOptionPane.showMessageDialog(null, "Opera��o, N�o Selecionada!!");
////				}
//				
//				
////				if(rcAdicao.isSelected()){
////					result=num1+num2;
////				}else if(rbsub.isSelected()){
////					result=num1-num2;
////				}else if(rbMulti.isSelected()){
////					result=num1*num2;
////				}else if(rbDiv.isSelected()){
////					result=num1/num2;
////				}
//				
//
//				
//				tfResult.setText(""+result);
			}
		});
		btnNewButton.setBounds(48, 279, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(10, 313, 75, 25);
		contentPane.add(lblResultado);
		
		tfResult = new JTextField();
		tfResult.setColumns(10);
		tfResult.setBounds(74, 315, 86, 20);
		contentPane.add(tfResult);
		
		buttonGroup.add(rcAdicao);
		rcAdicao.setSelected(true);
		rcAdicao.setBounds(28, 140, 109, 23);
		contentPane.add(rcAdicao);
		
		buttonGroup.add(rbsub);
		rbsub.setBounds(29, 166, 109, 23);
		contentPane.add(rbsub);
		
		buttonGroup.add(rbMulti);
		rbMulti.setBounds(29, 192, 109, 23);
		contentPane.add(rbMulti);
		
		buttonGroup.add(rbDiv);
		rbDiv.setBounds(28, 218, 109, 23);
		contentPane.add(rbDiv);
	}
}
