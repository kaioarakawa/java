package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a;
		String b=null;
		int i=0;
		
		while(2>1)
		{
			System.out.println("Digite uma letra");
			a=String.valueOf(in.nextLine());
			if(a.equalsIgnoreCase("x"))
			{
				break;
			}
			else if(a.equalsIgnoreCase(b))
			{
				i++;
			}
			b=a;
			
			
		}
		System.out.println("Foi digitado "+i+" letras iguais em sequencia");
		in.close();
	}
}
