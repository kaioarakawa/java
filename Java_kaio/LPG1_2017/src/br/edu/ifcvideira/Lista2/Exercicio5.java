package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lado1;
		int lado2;
		int lado3;
		
		System.out.println("Digite o comprimento do primeiro lado:");
		lado1=Integer.parseInt(in.nextLine());
		System.out.println("Digite o comprimento do segundo lado:");
		lado2=Integer.parseInt(in.nextLine());
		System.out.println("Digite o comprimento do terceiro lado:");
		lado3=Integer.parseInt(in.nextLine());
		
		if((lado1==lado2) && (lado1==lado3))
		{
			System.out.println("O triangulo é equilatero");
		}else if((lado1==lado2 && lado1!=lado3) || (lado1!=lado2 && lado1==lado3)||(lado2==lado3 && lado2!=lado1)) {
		System.out.println("O triangulo é Isosceles");
	}else
	{
		System.out.println("O triangulo é Escaleno");
	}
		in.close();
}
}
