package br.edu.ifcvideira.Lista10;

public class Azulejoquad extends Azulejos {
	
	public double areap(){
		return this.getLp()*this.getAp()*4;
	}
	
	public double areaq() {
		return this.getAa()*this.getLa();
	}
	
	public double qntazuq() {
		return this.areap()/this.areaq();
	}
}
