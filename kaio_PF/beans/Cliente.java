package br.edu.ifcvideira.beans;

public class Cliente extends Pessoa {
	private String profissao;
	private int id;
	private int id_pessoa;
	
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
	
	
	
}
