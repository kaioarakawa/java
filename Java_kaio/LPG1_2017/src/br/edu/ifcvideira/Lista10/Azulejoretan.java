package br.edu.ifcvideira.Lista10;

public class Azulejoretan extends Azulejos {
	public double areap(){
		return this.getLp()*this.getAp()*4;
	}
	
	public double arear() {
		return this.getAa()*this.getLa();
	}
	
	public double qntazur() {
		return this.areap()/this.arear();
	}
}
