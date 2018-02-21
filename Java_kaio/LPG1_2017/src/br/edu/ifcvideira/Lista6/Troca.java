package br.edu.ifcvideira.Lista6;

public class Troca {
	private int n1=0;
	private int n2=0;
	private int x=0;
	
	public int getN1(){
		return n1;
	}
	
	public void setN1(int n1)
	{
		this.n1=n1;
	}
	
	public int getN2(){
		return n2;
	}
	
	public void setN2(int n2)
	{
		this.n2=n2;
	}
	
	
	public void troc() {
		x=this.getN1();
		this.setN1(this.getN2());
		this.setN2(x);
	}
}
