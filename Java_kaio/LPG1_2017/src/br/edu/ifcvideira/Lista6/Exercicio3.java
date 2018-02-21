package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Precoluz p= new Precoluz();
		
		p.setSalm(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salario minimo")));
		p.setQntk(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de kilowats utilizada")));
		
		p.setVal(p.getSalm());
		p.setPagar(p.getQntk());
		p.setPagar10(p.getQntk());
		
		JOptionPane.showMessageDialog(null, "O valor de cada kilowats é de "+p.getVal()+"\n"
				+ "O valor do salario minimo foi de: "+p.getSalm()+"\n"
						+ "O consumo de kilowats foi de: "+p.getQntk()+"\n"
								+ "O valor para pagar sem desconto é de: "+p.getPagar()+"\n"
										+ "O valor para pagar com desconto é de: "+p.getPagar10());
		
	}
}
