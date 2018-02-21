package br.edu.ifcvideira.Lista6;

public class Precoluz {
	private double salm=0;
	private double qntk=0;
	private double val=0;
	private double pagar=0;
	private double pagar10=0;
	
	
	public void setSalm(double salm)
	{
		this.salm=salm;
	}
	
	public double getSalm()
	{
		return salm;
	}
	
	public void setQntk(double qntk)
	{
		this.qntk=qntk;
	}
	
	public double getQntk()
	{
		return qntk;
	}
	
	public void  setVal(double salm)
	{
		this.val=salm/7;
	}
	
	public double getVal()
	{
		return val;
	}
	
	public double getPagar()
	{
		return pagar;
	}
	
	public void setPagar(double qnt)
	{
		this.pagar=((qnt/100)*this.getVal());
		
	}
	
	public double getPagar10()
	{
		return pagar10;
	}
	
	public void setPagar10(double qnt)
	{
		this.pagar10=(((qnt/100)*this.getVal())-(((qnt/100)*this.getVal()/100)*10));
	}
}
