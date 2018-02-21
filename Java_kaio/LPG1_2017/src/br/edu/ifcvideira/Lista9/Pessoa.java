package br.edu.ifcvideira.Lista9;

public class Pessoa {
	private String nome;
	private String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	public String NomeCompleto(){
		return nome.concat(" "+sobrenome);
	}
	
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	
	
}
