package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String senha="1234";
		String senhaDigitada;
		
		System.out.println("Digite a senha:");
		senhaDigitada=String.valueOf(in.nextLine());
		
		if (senha.equalsIgnoreCase(senhaDigitada))
		{
			System.out.println("Acesso permitido");
		}else
		{
			System.out.println("Acesso Negado!!");
		}
		in.close();
	}
}
