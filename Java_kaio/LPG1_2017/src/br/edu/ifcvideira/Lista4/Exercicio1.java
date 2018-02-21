package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vet[]=new int[5];
		int i;
		
		for(i=0; i<5;i++)
		{
			System.out.println("Digite um valor para a posição "+(i+1)+" do vetor:");
			vet[i]=Integer.parseInt(in.nextLine());
			
		}
		
		//impressão na ordem inversa
		for (i=4;i>=0;i--)
		{
			System.out.println("vet "+(i+1)+": "+vet[i]);
		}
		in.close();
	}
}
