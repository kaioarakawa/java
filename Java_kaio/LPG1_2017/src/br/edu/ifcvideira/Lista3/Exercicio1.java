package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primerio numero");
		num1=Integer.parseInt(in.nextLine());
		System.out.println("Digite o segundo numero");
		num2=Integer.parseInt(in.nextLine());
		
		if (num1<num2)
		{
			System.out.println("Os numeros do intervalo entre eles são:");
			while((num2-1)!=num1)
			{
				num1++;
				System.out.println(num1);
				
			}
		
		}
		in.close();
	}
}
