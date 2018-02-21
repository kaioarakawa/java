package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		int vet[] = new int[10];
		int iguais[] = new int[10];
		Random gera= new Random();
		Scanner in = new Scanner(System.in);
		int i=0;
		int x=0;
		int flag=0;
		
		for(i=0;i<10;i++)
		{
			vet[i]=gera.nextInt(10);
		}
		
		System.out.println("Vetor:");
		for(i=0;i<10;i++)
		{
			System.out.print(vet[i]+"   ");
		}
		
		for(i=0;i<10;i++)
		{
			for(x=i+1;x<10;x++)
			{
				if(vet[i]==vet[x])
				{
					iguais[i]=vet[i];
					break;
				}else 
				{
					iguais[i]=0;
				}
			}
		}
		
		
		
		
		System.out.println("Verificação de valores iguais");
		
		for(i=0;i<10;i++)
		{
			if(iguais[i]!=0)
			{
				System.out.println("valor:  "+iguais[i]);
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Não houve nenhum valor");
		}
		
		in.close();
	}
}
