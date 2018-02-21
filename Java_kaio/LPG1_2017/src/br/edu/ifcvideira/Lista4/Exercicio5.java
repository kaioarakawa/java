package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		int vet[]=new int[40];
		Random gera = new Random();
		int i=0;
		
		
		for(i=0;i<40;i++)
		{
		vet[i]=gera.nextInt(10)-5;
		}
		
		System.out.println("Vetor antes da mudança");
		for(i=0;i<40;i++)
		{
		System.out.print(vet[i]+"   ");
		}
		
		for(i=0;i<40;i++)
		{
		if(vet[i]<0)
		{
			vet[i]=0;
		}
		}
		
		
		System.out.println("\n Valores modificados do vetor:");
		for(i=0;i<40;i++)
		{
		System.out.print(vet[i]+"   ");
		}
		
		
	}
}
