package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		Livro l1 = new Livro("Fundamentos da programação de computadores","Ascencio",2012);
		Livro l2 = new Livro("Programação com C","Professor X",2010);
		Livro l3 = new Livro ("Programação com Java","Professor Y",2013);
		
		JOptionPane.showMessageDialog(null,"Titulo: "+l1.getTitulo()+"\n"
				+ "Autor: "+l1.getAutor()+"\n"
						+ "Ano: "+l1.getAno());
		
		
		JOptionPane.showMessageDialog(null,"Titulo: "+l2.getTitulo()+"\n"
				+ "Autor: "+l2.getAutor()+"\n"
						+ "Ano: "+l2.getAno());
		
		
		
		JOptionPane.showMessageDialog(null,"Titulo: "+l3.getTitulo()+"\n"
				+ "Autor: "+l3.getAutor()+"\n"
						+ "Ano: "+l3.getAno());
	}
}
