package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random gera = new Random();
		int i=0;
		int vet[]= new int[12];
		int x;
		int y;
		
		
		for(i=0;i<12;i++)
		{
			vet[i]=gera.nextInt(10);
		}
		
		for(i=0;i<12;i++)
		{
			System.out.println(vet[i]);
		}
		System.out.println("\n \n \n");
		System.out.println("Digite a primeira posi��o para soma");
		x=Integer.parseInt(in.nextLine());
		
		System.out.println("Digite a segunda posi��o para a soma");
		y=Integer.parseInt(in.nextLine());
		
		System.out.println("A soma dos numeros da posi��es digitadas �: "+(vet[x-1]+vet[y-1]));
		
		in.close();
	}
}
