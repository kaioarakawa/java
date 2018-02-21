package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String frase;
		String espa[];
		String mod="";
		int i=0;
		
		System.out.println("Digite a frase");
		frase=String.valueOf(in.nextLine());
		
		espa=frase.split(" ");
		
		for(i=(espa.length-1);i>=0;i--)
		{
			mod+=espa[i];
			mod+=" ";
		}
		
		System.out.println(mod);
	
		in.close();
	}
}
