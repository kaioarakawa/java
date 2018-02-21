package br.edu.ifcvideira.Lista8;

public class Velho extends Imovel {
	private double desc;

	public double getDesc() {
		return desc;
	}

	public void setDesc(double desc) {
		this.desc = desc;
	}
	
	public double Imovelvlh(){
		return this.getPreco()*this.getDesc();
	}
}
