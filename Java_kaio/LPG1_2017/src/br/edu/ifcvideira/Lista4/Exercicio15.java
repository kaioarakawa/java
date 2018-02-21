package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio15 {
	public static void main(String[] args) {
		int mat[][]=new int [50][2];
		double vet[]= new double[50];
		int i=0;
		int j=0;
		Random gera = new Random();
		
		
		for(i=0;i<50;i++)
		{
			for(j=0;j<2;j++)
			{
				mat[i][j]=gera.nextInt(10)+1;
			}
		}
		System.out.println("A matriz: area");
		for(i=0;i<50;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			vet[i]=(mat[i][0]*mat[i][1])/2;
			System.out.println(": "+vet[i]);
		}
		
			
		
	}
}
