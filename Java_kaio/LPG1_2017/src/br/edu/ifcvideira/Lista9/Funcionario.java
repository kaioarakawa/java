package br.edu.ifcvideira.Lista9;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double SalarioPrimeiraParcela(){
		return this.getSalario()*0.6;
	}
	
	public double SalarioSegundaParcela(){
		return this.getSalario()*0.4;
	}
	
	
	
}
