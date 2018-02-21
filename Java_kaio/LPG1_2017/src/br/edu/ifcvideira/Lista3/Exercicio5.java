package br.edu.ifcvideira.Lista3;

public class Exercicio5 {
	public static void main(String[] args) {
		int i=100;
		int i2=0;
		int p=0;
		
		while(i<=1000)
		{
			for(i2=2;i2<i;i2++)
			{
				if((i%i2)==0)
				{
					p++;
					break;
				}
				
			}
			if(p==0)
			{
				System.out.println(i);
			}
			i++;
			p=0;
		}
	}
}
