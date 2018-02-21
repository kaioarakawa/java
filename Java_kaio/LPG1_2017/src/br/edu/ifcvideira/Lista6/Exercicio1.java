package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Contador c= new Contador();
		int op;
		
		for(;;)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n"
					+ "1-Encremento \n"
					+ "2-Decremento \n"
					+ "3-Sair \n"));
			
			if(op==1)
			{
				c.encrementa();
				JOptionPane.showMessageDialog(null,"Valor da variavel: "+c.getNumero());
			}else if(op==2)
			{
				c.decrementa();
				JOptionPane.showMessageDialog(null,"Valor da variavel: "+c.getNumero());
			}else if(op==3)
			{
				JOptionPane.showMessageDialog(null,"Finalizando...");
				break;
			}else
			{
				JOptionPane.showMessageDialog(null,"Opção inexistente");
			}
		}
	}
}
