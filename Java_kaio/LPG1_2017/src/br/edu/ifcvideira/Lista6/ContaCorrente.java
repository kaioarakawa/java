package br.edu.ifcvideira.Lista6;

public class ContaCorrente {
	private double saldo;
	public double getSaldo()
	{
		return saldo;
	}
	public void setSaldo(double saldo)
	{
		this.saldo=saldo;
	}
	public void deposito(double valor)
	{
		this.setSaldo(this.getSaldo()+valor);
	}
	
	public void saque (double valor)
	{
		this.setSaldo(this.getSaldo()-valor);
	}
}
