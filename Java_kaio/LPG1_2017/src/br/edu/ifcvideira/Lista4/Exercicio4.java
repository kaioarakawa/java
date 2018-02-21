package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int vet[]=new int[20];
		int alt[]=new int[20];
		int flag=0;
		Scanner in = new Scanner(System.in);
		Random gera = new Random();
		int i=0;
		int x=0;
		
		for(i=0;i<20;i++)
		{
			vet[i]=gera.nextInt(10);
		}
		System.out.println("Os valores do vetor;");
		for(i=0;i<20;i++)
		{
			System.out.print(vet[i]+"  ");
		}
		System.out.println(" ");
		System.out.println("Digite o numero para pesquisa");
		x=Integer.parseInt(in.nextLine());
		
		for(i=0;i<20;i++)
		{
			if (vet[i]==x)
			{
				alt[i]=i;
				flag++;
			}else
			{
				alt[i]=-12456;
			}
		}
		
		
		
		if(flag==0)
		{
			System.out.println("Não houve nenhum numero correspondente no vetor");
			
		}else
		{
			System.out.println("Posições do numero pesquisado");
			for(i=0;i<20;i++)
			{
				if(alt[i]!=-12456)
				{
					System.out.print((alt[i]+1)+"   ");
				}
				
			}
		}
		
		in.close();
	}
}
