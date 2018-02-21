package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1;
		int fat;
		
		System.out.println("Digite o valor do da constante para o fatorial");
		num1=Integer.parseInt(in.nextLine());
		fat=num1;
		while(num1>1)
		{
			fat=fat*(num1-1);
			num1--;
		}
		System.out.println("O resultado em fatorial fica "+fat);
		in.close();
	}
}
