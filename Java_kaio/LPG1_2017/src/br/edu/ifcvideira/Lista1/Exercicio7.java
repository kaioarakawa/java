package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double comprimento;
		double largura;
		double altura;
		double qnt;
		
		System.out.println("Digite o comprimento:");
		comprimento=Double.parseDouble(in.nextLine());
		System.out.println("Digite a largura:");
		largura=Double.parseDouble(in.nextLine());
		System.out.println("Digite a altura:");
		altura=Double.parseDouble(in.nextLine());
		
		qnt=((largura*altura*2)+(comprimento*altura*2))/1.5;
		
		System.out.println("A quantidades de caixar necessarias �:"+qnt);
		in.close();
	}
}
