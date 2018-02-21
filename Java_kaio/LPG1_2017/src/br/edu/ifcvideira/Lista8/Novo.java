package br.edu.ifcvideira.Lista8;

public class Novo extends Imovel{
	private double add;

	public double getAdd() {
		return add;
	}

	public void setAdd(double add) {
		this.add = add;
	}	
	
	public double Imovelnv(){
		return this.getPreco()*((this.getAdd()/100)+1);
	}
}
