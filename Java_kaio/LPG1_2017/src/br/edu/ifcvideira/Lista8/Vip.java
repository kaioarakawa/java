package br.edu.ifcvideira.Lista8;

public class Vip extends Ingresso {
	private double add;

	public double getAdd() {
		return add;
	}

	public void setAdd(double add) {
		this.add = add;
	}
	
	public double valorvip() {
		return this.getValor()*((this.getAdd()/100)+1);
	}
}
