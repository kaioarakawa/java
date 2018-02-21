package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		int vet[]=new int[16];
		int alt[]=new int[8];
		Random gera= new Random();
		int i=0;
		int i2=8;
		
		for(i=0;i<16;i++)
		{
			vet[i]=gera.nextInt(10);
		}
		System.out.println("Vetor sem inverter: \n");
		for(i=0;i<16;i++)
		{
			System.out.println(vet[i]+"  ");
		}
		
		for(i=0;i<8;i++)
		{
			alt[i]=vet[i];
		}
		
		for(i=0;i<8;i++)
		{
			vet[i]=vet[i2];
			i2++;
		}
		i2=0;
		for(i=8;i<16;i++)
		{
			vet[i]=alt[i2];
			i2++;
		}
		System.out.println("O vetor invertido: \n");
		for(i=0;i<16;i++)
		{
			System.out.println(vet[i]+"  ");
		}
		
	}
}
