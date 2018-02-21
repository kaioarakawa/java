package br.edu.ifcvideira.Lista10;

public class Amigo extends Pessoa {
	private double telefone_pessoal;
	
	public void setTelefone_pessoal(double telefone_pesssoa) {
		this.telefone_pessoal=telefone_pessoal;
	}
	
	public double getTelefone_pessoal() {
		return telefone_pessoal;
	}
	
	public String msgmail() {
		return "Mensagem de assinatura de e-mail: \n Abraços. "+this.getNome();
	}
}
