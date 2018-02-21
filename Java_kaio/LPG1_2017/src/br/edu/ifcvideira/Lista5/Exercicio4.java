package br.edu.ifcvideira.Lista5;


import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		String frase;
		Scanner in= new Scanner(System.in);
		int i=0;
		int j=0;
		int de=0;
		char[] letras =null;
		String espa;
		
		System.out.println("Digite a frase:");
		frase=String.valueOf(in.nextLine());
		
		
		espa=frase.trim();
		letras=espa.toCharArray();
		for(i=0;i<letras.length;i++)
		{
			if(letras[i]==letras[(letras.length-1)-j])
			{
				de++;
			}else
			{
				break;
			}
			j++;
		}
		
		if(de!=0)
		{
			System.out.println("É palindromo");
		}else
		{
			System.out.println("Não é um palindromo");
		}
		
		in.close();
		
	}
}
