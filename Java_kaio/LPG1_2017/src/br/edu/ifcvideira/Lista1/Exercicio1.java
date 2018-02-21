package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int x;
		int y;
		double resto=0;
		double quociente=0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um valor para X:");
		x = Integer.parseInt(in.nextLine());
		
		System.out.println("Digite um valor para Y:");
		y = Integer.parseInt(in.nextLine());
		
		quociente = (double) x/y;
		
		resto = x % y;
		
		System.out.println("A divisão entre x e y é: "+quociente+"\n"
				+ "O resto da divisão entre x e y é: "+resto);
		
		in.close();
	}
}
