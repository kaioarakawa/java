package br.edu.ifcvideira.Lista4;

public class Exercicio12 {
	public static void main(String[] args) {
		int soma[][]= new int[11][11];
		int mult[][]= new int [11][11];
		int i=0;
		int j=0;
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				soma[i][j]=i+j;
			}
		}
		
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				mult[i][j]=i*j;
			}
		}
		
		System.out.println("Matriz soma:");
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{

				System.out.print(soma[i][j]+"\t");
			}
			System.out.println("  ");
		}
		
		System.out.println("Matriz multiplica:");
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{

				System.out.print(mult[i][j]+"\t");
			}
			System.out.println("  ");
		}
	}
}
