package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Professor p1 = new Professor("Carlos","Fisica",1,"15/04/1999");
		int op;
		for(;;)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada \n"
					+ "1-Mudar nome do professor \n"
					+ "2-Mudar nome do departametno do prefessor \n"
					+ "3-Mudar numero de resgistro do professor \n"
					+ "4-Mudar data de admissão \n"
					+ "5-Sair"));
			if(op==1)
			{
				p1.setNome_do_prof(String.valueOf(JOptionPane.showInputDialog("Digite o nome para alteração")));
			}
			else if(op==2)
			{
				p1.setNome_dept(String.valueOf(JOptionPane.showInputDialog("Digite o novo nome do departamento")));
			}
			else if(op==3)
			{
				p1.setNumreg(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo numero de registo")));
			}
			else if(op==4)
			{
				p1.setData_admiss(String.valueOf(JOptionPane.showInputDialog("Digite a nova data de admissão")));
			}
			else if(op==5)
			{
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Opção Inexistente");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Nome do professor: "+p1.getNome_do_prof()+"\n"
				+ "Nome do departamento: "+p1.getNome_dept()+"\n"
						+ "Numero de registro: "+p1.getNumreg()+"\n"
								+ "Data de admissão: "+p1.getData_admiss()+"\n");
	}
}
