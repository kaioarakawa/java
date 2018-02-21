package br.edu.ifcvideira.Lista6;

public class Contador {
	private int numero=0;
	
	public int getNumero()
	{
		return numero;
	}
	
	public void setNumero(int numero)
	{
		this.numero=numero;
	}
	
	public void encrementa ()
	{
		this.setNumero(this.getNumero()+1);
	}
	
	public void decrementa ()
	{
		this.setNumero(this.getNumero()-1);
	}
}