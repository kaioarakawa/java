package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class UsaPessoa {
	public static void main(String[] args) {
		int op;
		Pessoa p= new Pessoa();
		Funcionario f= new Funcionario();
		Professor pr= new Professor();
		
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção de cadastro desejada \n"
					+ "1-Pessoa \n"
					+ "2-Funcionario \n"
					+ "3-Professor \n"
					+ "4-Sair"));
			if(op==1){
				p.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o primeiro nome da pessoa:\n")));
				p.setSobrenome(String.valueOf(JOptionPane.showInputDialog("Digite o segundo nome da pessoa:\n")));
				JOptionPane.showMessageDialog(null, "Nome: "+p.NomeCompleto()+"\n");
			}else if(op==2){
				f.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o primeiro nome da pessoa:\n")));
				f.setSobrenome(String.valueOf(JOptionPane.showInputDialog("Digite o segundo nome da pessoa:\n")));
				f.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de matricula do funcionario:\n")));
				f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario")));
				JOptionPane.showMessageDialog(null, "Nome: "+f.NomeCompleto()+"\n"
						+ "Matricula: "+f.getMatricula()+"\n"
								+ "Salario: "+f.getSalario()+"\n"
										+ "Primeira Parte do Salario: "+f.SalarioPrimeiraParcela()+"\n"
												+ "Segunda Parte do Salario: "+f.SalarioSegundaParcela()+"\n");
			}else if(op==3){

				pr.setNome(String.valueOf(JOptionPane.showInputDialog("Digite o primeiro nome da pessoa:\n")));
				pr.setSobrenome(String.valueOf(JOptionPane.showInputDialog("Digite o segundo nome da pessoa:\n")));
				pr.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de matricula do funcionario:\n")));
				pr.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario")));
				JOptionPane.showMessageDialog(null, "Nome: "+pr.NomeCompleto()+"\n"
						+ "Matricula: "+pr.getMatricula()+"\n"
								+ "Salario: "+pr.getSalario()+"\n"
										+ "Primeira Parte do Salario: "+pr.SalarioPrimeiraParcela()+"\n"
												+ "Segunda Parte do Salario: "+pr.SalarioSegundaParcela()+"\n");
			}else if(op==4){
				JOptionPane.showMessageDialog(null, "Finalizando");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção errada, tente novamente");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Nome: "+p.NomeCompleto()+"\n");
		
		JOptionPane.showMessageDialog(null, "Nome: "+f.NomeCompleto()+"\n"
				+ "Matricula: "+f.getMatricula()+"\n"
						+ "Salario: "+f.getSalario()+"\n"
								+ "Primeira Parte do Salario: "+f.SalarioPrimeiraParcela()+"\n"
										+ "Segunda Parte do Salario: "+f.SalarioSegundaParcela()+"\n");
		
		JOptionPane.showMessageDialog(null, "Nome: "+pr.NomeCompleto()+"\n"
				+ "Matricula: "+pr.getMatricula()+"\n"
						+ "Salario: "+pr.getSalario()+"\n"
								+ "Primeira Parte do Salario: "+pr.SalarioPrimeiraParcela()+"\n"
										+ "Segunda Parte do Salario: "+pr.SalarioSegundaParcela()+"\n");
	}
}
