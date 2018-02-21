package br.edu.ifcvideira.Lista8;

public class Camarotesuperior extends Vip {
	private double addsup;
	
	
	public double getAddsup() {
		return addsup;
	}
	public void setAddsup(double addsup) {
		this.addsup = addsup;
	}
	
	public double valorsup(){
		return this.getValor()*((this.getAddsup()/100)+1);
	}
	
	
}
