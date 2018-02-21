package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		Troca t = new Troca();
		int valor1;
		int valor2;
		
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro numero para N1"));
		t.setN1(valor1);
		
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo numero para N2"));
		t.setN2(valor2);
		
		t.troc();
		
		JOptionPane.showMessageDialog(null, "O N1 fica "+t.getN1()+"\n"
				+ "O N2 fica "+t.getN2());
		
	}
}
