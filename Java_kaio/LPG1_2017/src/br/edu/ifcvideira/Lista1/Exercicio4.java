package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double raio;
		double area=0;
		
		System.out.println("Digite o raio:");
		raio = Double.parseDouble(in.nextLine());
		
		area=Math.PI*Math.pow(raio, 2);
		
		System.out.println("A Area do circulo é: "+area);
		
		in.close();
		
	}
}
