package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Gerente ge = new Gerente();
		Assistente_tecnico at = new Assistente_tecnico();
		Assistente_administrativo ad = new Assistente_administrativo();
		
		int op;
		
		for(;;)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionario que deseja cadastrar? \n"
					+ "1-Gerente \n"
					+ "2-Assistente Tecnico \n"
					+ "3-Assistente Administrativo \n"
					+ "4-Sair"));
			
			if(op==1)
			{
				ge.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do gerente?")));
				ge.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+ge.getNome())));
				ge.setCargo("Gerente");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "Cargo: "+ge.getCargo()+ "\n"
								+ "Nome: "+ge.getNome()+ "\n"
										+ "Salario: "+ge.calculaSalarioGerente());
			}else if(op==2)
			{
				at.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do Assistente Tecnico?")));
				at.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+at.getNome())));
				at.setCargo("Assistente Tecnico");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "Cargo: "+at.getCargo()+ "\n"
								+ "Nome: "+at.getNome()+ "\n"
										+ "Salario: "+at.calculaSalarioAssistTecnico());
			}else if(op==3)
			{
				ad.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do Assistente Administrativo?")));
				ad.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+ad.getNome())));
				ad.setNum_matricula(Integer.parseInt(JOptionPane.showInputDialog("Qual o Numero de matricula? de "+ad.getNome())));
				ad.setTurno(Integer.parseInt(JOptionPane.showInputDialog("Qual o turno? \n"
						+ "1-Noturno \n"
						+ "2-Diurno")));
				ad.setCargo("Assistente Administrativo");
				
				
				if(ad.getTurno()==1){
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "Cargo: "+ad.getCargo()+ "\n"
								+ "Nome: "+ad.getNome()+ "\n"
										+ "Salario: "+ad.calculaSalarioAssitAdm());
				}else{
					JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
							+ "Cargo: "+ad.getCargo()+ "\n"
									+ "Nome: "+ad.getNome()+ "\n"
											+ "Salario: "+ad.getSalario());
				}
			}
			else if(op==4)
			{
				JOptionPane.showMessageDialog(null, "Finalizando!!");
				break;
			}else
			{
				JOptionPane.showMessageDialog(null, "Opção errada!! Tente novamente");
			}
		}
	}
}
