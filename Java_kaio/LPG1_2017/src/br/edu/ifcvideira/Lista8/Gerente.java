package br.edu.ifcvideira.Lista8;

public class Gerente extends Funcionario{
	public double calculaSalarioGerente()
	{
		return this.getSalario()*1.5;
	}
}
