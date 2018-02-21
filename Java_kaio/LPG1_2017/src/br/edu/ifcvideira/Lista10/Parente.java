package br.edu.ifcvideira.Lista10;

public class Parente extends Pessoa {
	private String parentesco;
	
	public void setParentesco(String parentesco) {
		this.parentesco=parentesco;
	}
	
	public String getParentesco() {
		return parentesco;
	}
	
	public String msgmail() {
		return "Mensagem de assinatura de e-mail: \n Até mais. "+this.getNome();
	}
}
