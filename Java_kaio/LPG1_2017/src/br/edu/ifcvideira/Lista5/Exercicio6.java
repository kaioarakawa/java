package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase="";
		String mod="";
		
		System.out.println("Digite a frase desejada");
		frase=String.valueOf(in.nextLine());
		
		mod=frase.replace("a", "*");
		
		System.out.println(mod);
		
		in.close();
	}
}
