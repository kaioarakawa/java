package br.edu.ifcvideira.beans;

public class Servidor extends Pessoa {

	private int id;
	private String num_carteiraTrabalho;
	private int id_pessoa;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum_carteiraTrabalho() {
		return num_carteiraTrabalho;
	}
	public void setNum_carteiraTrabalho(String num_carteiraTrabalho) {
		this.num_carteiraTrabalho = num_carteiraTrabalho;
	}
	public int getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	
	
}
