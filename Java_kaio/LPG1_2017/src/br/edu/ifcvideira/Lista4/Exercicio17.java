package br.edu.ifcvideira.Lista4;

import java.util.Random;

public class Exercicio17 {
	public static void main(String[] args) {
		String mat[][]= new String [100][10];
		String vet[]= new String [10];
		int i=0;
		int j=0;
		int nota[]=new int [100];
		Random gera= new Random();
		int x;
		
		for(i=0;i<10;i++)
		{
			x=gera.nextInt(4)+1;
			if(x==1)
			{
				vet[i]="A";
			}else if(x==2)
			{
				vet[i]="B";
			}else if(x==3)
			{
				vet[i]="C";
			}else if(x==4)
			{
				vet[i]="D";
			}
		}
		
		
		for(i=0;i<100;i++)
		{
			for(j=0;j<10;j++)
			{
				x=gera.nextInt(4)+1;
				if(x==1)
				{
					mat[i][j]="A";
				}else if(x==2)
				{
					mat[i][j]="B";
				}else if(x==3)
				{
					mat[i][j]="C";
				}else if(x==4)
				{
					mat[i][j]="D";
				}
			}
		}
		
		for(i=0;i<100;i++)
		{
			for(j=0;j<10;j++)
			{
				if(mat[i][j].equalsIgnoreCase(vet[j]))
				{
					nota[i]++;
				}
			}
		}		
		
		
		System.out.println("Notas dos alunos");
		for(i=0;i<100;i++)
		{
		System.out.println("Aluno "+(i+1)+": "+nota[i]);
		}
		
	}
}
