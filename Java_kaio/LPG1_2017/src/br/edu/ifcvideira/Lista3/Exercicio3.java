package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1;
		int i=0;
		double media=0;
		
		while(2>1)
		{
			System.out.println("Digite a primeira idade (0 para finalizar)");
			num1=Double.parseDouble(in.nextLine());
			if(num1==0)
			{
				break;
			}
			media+=num1;
			i++;
		}
		if (media>0)
		{
		System.out.println("Foram dadas "+i+" idades e a media das idades foi "+(media/i));
		}else 
		{
			System.out.println("Não foi dada nenhuma idade");
		}
		
		in.close();
		}
	
}
