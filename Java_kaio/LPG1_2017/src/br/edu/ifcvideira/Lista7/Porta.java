package br.edu.ifcvideira.Lista7;

public class Porta {
	private boolean estado;
	private String cor;
	private double dimenx;
	private double dimeny;
	private double dimenz;
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getDimenx() {
		return dimenx;
	}
	public void setDimenx(double dimenx) {
		this.dimenx = dimenx;
	}
	public double getDimeny() {
		return dimeny;
	}
	public void setDimeny(double dimeny) {
		this.dimeny = dimeny;
	}
	public double getDimenz() {
		return dimenz;
	}
	public void setDimenz(double dimenz) {
		this.dimenz = dimenz;
	}
	
	public void mudaEstado(){
		if(this.isEstado()){
			this.setEstado(false);
		}else{
			this.setEstado(true);
		}
	}
	
	public String retornaEstado(){
		if (this.isEstado()){
			return "Aberta";
		}else{
			return "Fechada";
		}
	}
	
	
	public Porta(boolean estado, String cor, double dimenx, double dimeny, double dimenz) {
		this.estado = estado;
		this.cor = cor;
		this.dimenx = dimenx;
		this.dimeny = dimeny;
		this.dimenz = dimenz;
	}
	
	
}
