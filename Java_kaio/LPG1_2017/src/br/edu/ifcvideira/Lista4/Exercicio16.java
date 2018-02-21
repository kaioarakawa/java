package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio16 {
	public static void main(String[] args) {
		int mat[][]=new int [8][8];
		int i=0;
		int j=0;
		Random gera = new Random();
		
		for(i=0;i<8;i++)
		{
			for(j=0;j<8;j++)
			{

				mat[i][j]=gera.nextInt(10)+1;
			}
		}
		
		for(i=0;i<8;i++)
		{
			for(j=0;j<8;j++)
			{

				if(j>i)
				{
					mat[i][j]=0;
				}
			}
		}
		
		for(i=0;i<8;i++)
		{
			for(j=0;j<8;j++)
			{

				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("  ");
		}
		
	}
}
