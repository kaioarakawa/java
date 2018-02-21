package br.edu.ifcvideira.Lista8;

public class Gato extends Animal {
	private String mia;

	public String getMia() {
		return mia;
	}

	public void setMia(String mia) {
		this.mia = mia;
	}

	public Gato(String mia) {
		super();
		this.mia = mia;
	}
}
