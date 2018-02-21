package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1;
		int i=0;
		
		System.out.println("Digite um numero");
		num1=Integer.parseInt(in.nextLine());
		System.out.println("Numero que dividem o proprio e da resto 0");
		for(i=1;i<=num1;i++)
		{
			if((num1%i)==0)
			{
				System.out.println(i);
			}
		}
		in.close();
	}
}
