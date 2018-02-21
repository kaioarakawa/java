package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio8 {
	public static void main(String[] args) {
		int vet[]= new int[51];
		Random gera = new Random();
		int i=0;
		int i2=0;
		
		
		for(i=0;i<50;i++)
		{
			vet[i]=gera.nextInt(10);
		}
		
		System.out.println("O vetor sem alteração");
		for(i=0;i<50;i++)
		{
			System.out.print(vet[i]+"   ");
		}
		
		for(i=0;i<50;i++)
		{
			if(vet[i]==0)
			{	
				for(i2=i;i2<50;i2++)
				{
					vet[i2]=vet[i2+1];
					vet[i2+1]=0;
				}
				if(vet[i+1]!=0)
				{
					i--;
				}
			}
		}
		
		System.out.println(" \n Vetor com alteração");
		for(i=0;i<50;i++)
		{
			System.out.print(vet[i]+"   ");
		}
		
		
	}
}
