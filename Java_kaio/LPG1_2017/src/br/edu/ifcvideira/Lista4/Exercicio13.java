package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio13 {
	public static void main(String[] args) {
		int mat[][]=new int[10][10];
		Random gera = new Random();
		int i;
		int j;
		int maior=0;
		int lat=0;
		int lon=0;
		
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{
				mat[i][j]=gera.nextInt(100);
				if(maior<mat[i][j])
				{
					lat=i;
					lon=j;
					maior=mat[i][j];
				}
			}
		}
		System.out.println("Matriz");
		for(i=0;i<10;i++)
		{
			for(j=0;j<10;j++)
			{

				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("  ");
		}
		
		System.out.println("A posição do maior valor é no i igual a "+lat+"\n"
				+ "no j igual a "+lon+"\n"
						+ "e o valor é "+maior);
		
	}
}
