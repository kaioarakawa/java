package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double num;
		double num2;
		double num3;
		double media;
		
		System.out.println("Digite o primeiro numero:");
		num = Double.parseDouble(in.nextLine());
		System.out.println("Digite o segundo numero:");
		num2 = Double.parseDouble(in.nextLine());
		System.out.println("Digite o terceiro numero:");
		num3 = Double.parseDouble(in.nextLine());
		
		media=(num+num2+num3)/3;
		
		System.out.println("A media dos 3 numeros é: "+media);
		
		in.close();
		
		
	}
}
