package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio9 {
	public static void main(String[] args) {
		Random gera = new Random();
		int vetsal[]= new int[35];
		int vetcod[]= new int[35];
		int i=0;
		
		for(i=0;i<35;i++)
		{
			vetsal[i]=gera.nextInt(2000);
			vetcod[i]=i+1;
		}
		
		for(i=0;i<35;i++)
		{
			System.out.println("Codigo: "+vetsal[i]+"      Salario: "+vetcod[i]);
		}
		
		System.out.println("Codigo dos funcionarios com salrio maior que 880,00 reais");
		for(i=0;i<35;i++)
		{
			if(vetsal[i]>880.00)
			{
				System.out.println(vetcod[i]);
			}
		}
	}
}
