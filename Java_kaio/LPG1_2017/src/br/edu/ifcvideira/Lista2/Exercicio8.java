package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int chave;
		int digitado;
		int distancia=0;
		
		System.out.println("Digite o numero chave:");
		chave=Integer.parseInt(in.nextLine());
		if (chave<0 || chave>100)
		{
			System.out.println("O numero � invalido");
			System.exit(0);
		}
		System.out.println("Digite o numero para compara��o:");
		digitado=Integer.parseInt(in.nextLine());
		if (digitado<0 || digitado>100)
		{
			System.out.println("O numero � invalido");
			System.exit(0);
		}
		if (chave>digitado)
		{
		distancia=chave-digitado;
		}else
		{
			distancia=digitado-chave;
		}
		System.out.println("O numero chave �: "+chave+"\n"
				+ "O numero digitado foi: "+digitado+"\n"
						+ "O resultado: "+distancia);
		in.close();
	}
}
