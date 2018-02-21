package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(0,"Kaio");
		Pessoa p2 = new Pessoa(0,"Marcos");
		Pessoa p3 = new Pessoa(0,"Igor");
		int op;
		for(;;)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada \n"
					+ "1-Aniversario do " +p1.getNome()+"   Idade "+p1.getIdade()+" \n"
					+ "2-Aniversario do " +p2.getNome()+"   Idade "+p2.getIdade()+" \n"
							+ "3-Aniversario do " +p3.getNome()+"   Idade "+p3.getIdade()+" \n"
									+ "4-Sair"));
			
			if(op==1)
			{
				p1.fazAniversario();
			}else if(op==2)
			{
				p2.fazAniversario();
				
			}else if(op==3)
			{
				p3.fazAniversario();
			}else if(op==4)
			{
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Opção errada");
			}
		}
		
		JOptionPane.showMessageDialog(null, p1.getNome()+"    Idade:"+p1.getIdade()+"\n"
				+ p2.getNome()+"    Idade:"+p2.getIdade()+"\n"
						+ p3.getNome()+"    Idade:"+p2.getIdade()+"\n");
		
		
		
	}
}
