package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio18 {
	public static void main(String[] args) {
		int mat[][]= new int [4][4];
		Random gera= new Random();
		int i=0;
		int j=0;
		int det=0;
		
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				mat[i][j]=gera.nextInt(10);
			}
			
		}
		
		//det A = (a11∙a22∙a33 + a12∙a23∙a31 + a13∙a21∙a32 ) - (a12∙a21∙a33 + a11∙a23∙a32 + a13∙a22∙a31)
		
		det=((mat[1][1]*mat[2][2]*mat[3][3])+(mat[1][2]*mat[2][3]*mat[3][1])+(mat[1][3]*mat[2][1]*mat[3][2]))-((mat[1][2]*mat[2][1]*mat[3][3])+(mat[1][1]*mat[2][3]*mat[3][2])+(mat[1][3]*mat[2][2]*mat[3][1]));
		System.out.println("A matriz:");
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{

				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("  ");
		}
		
		
		System.out.println("A soma da determinante é: "+det);
		
		
		
		
	}
}
