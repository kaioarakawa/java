package br.edu.ifcvideira.Lista4;

public class Exercicio14 {
	public static void main(String[] args) {
		int mat[][]= new int[6][6];
		int i=0;
		int j=0;
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				if(i==j)
				{
					mat[i][j]=1;
				}else
				{
					mat[i][j]=0;
				}
			}
		}
		
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{

				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("  ");
		}
	}
}
