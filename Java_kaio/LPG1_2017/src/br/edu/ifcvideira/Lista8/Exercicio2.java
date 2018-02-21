package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		
	Cachorro c = new Cachorro("late");
	Gato g= new Gato("mia");
	
	int op;
	
	for(;;)
	{
	op=Integer.parseInt(JOptionPane.showInputDialog("Qual animal deseja inserir dados \n"
			+ "1-Cachorro \n"
			+ "2-Gato \n"
			+ "3-Sair"));
	
	if(op==1) {
		c.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o nome do cachorro:")));
		c.setRaca(String.valueOf(JOptionPane.showInputDialog("Digite a raça do cachorro")));
		JOptionPane.showMessageDialog(null, "Cachorro \n"
				+ "Nome: "+c.getNome()+"\n"
						+ "Raça: "+c.getRaca()+"\n"
								+ "Tipo de som: "+c.getLate());
	}else if(op==2) {
		g.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o nome do gato:")));
		g.setRaca(String.valueOf(JOptionPane.showInputDialog("Digite a raça do gato")));
		JOptionPane.showMessageDialog(null, "Gato \n"
				+ "Nome: "+g.getNome()+"\n"
						+ "Raça: "+g.getRaca()+"\n"
								+ "Tipo de som: "+g.getMia());

	}else if(op==3) {
		JOptionPane.showMessageDialog(null, "Finalizando..");
		break;
	}
	else 
	{
		JOptionPane.showMessageDialog(null, "Opção errada!!, Tente novamente");
	}
	}
	
	
	}
}
