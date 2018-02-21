package br.edu.ifcvideira.Lista7;

public class Professor {
	private String nome_do_prof;
	private String nome_dept;
	private int numreg;
	private String data_admiss;
	
	
	public Professor(String nome_do_prof, String nome_dept, int numreg, String data_admiss) {
		this.nome_do_prof = nome_do_prof;
		this.nome_dept = nome_dept;
		this.numreg = numreg;
		this.data_admiss = data_admiss;
	}
	public String getNome_do_prof() {
		return nome_do_prof;
	}
	public void setNome_do_prof(String nome_do_prof) {
		this.nome_do_prof = nome_do_prof;
	}
	public String getNome_dept() {
		return nome_dept;
	}
	public void setNome_dept(String nome_dept) {
		this.nome_dept = nome_dept;
	}
	public int getNumreg() {
		return numreg;
	}
	public void setNumreg(int numreg) {
		this.numreg = numreg;
	}
	public String getData_admiss() {
		return data_admiss;
	}
	public void setData_admiss(String data_admiss) {
		this.data_admiss = data_admiss;
	}
	
	
}
