package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio11 {
	public static void main(String[] args) {
		int m1[][]= new int[12][10];
		Random gera= new Random();
		int sem1[]= new int[10];
		int sem2[]= new int[10];;
		int i=0;
		int i2=0;
		
		
		for(i=0;i<12;i++)
		{
			for(i2=0;i2<10;i2++)
			{
				m1[i][i2]=gera.nextInt(10);
			}
		}
		
		
		
		
		for(i=0;i<6;i++)
		{
			for(i2=0;i2<10;i2++)
			{
				sem1[i2]+=m1[i][i2];
			}
		}
		
		for(i=6;i<12;i++)
		{
			for(i2=0;i2<10;i2++)
			{
				sem2[i2]+=m1[i][i2];
			}
		}
		
		System.out.println("A quantidade de venda do primeiro semestre foi de: ");
		for(i=0;i<10;i++)
		{
			System.out.println((i+1)+" produto: "+sem1[i]);
		}
		
		
		System.out.println("A quantidade de venda do segundo semestre foi de: ");
		for(i=0;i<10;i++)
		{
			System.out.println((i+1)+" produto: "+sem2[i]);
		}
		
	}
}
