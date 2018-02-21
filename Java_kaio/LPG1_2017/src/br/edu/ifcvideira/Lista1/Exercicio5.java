package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double fare;
		double celsius=0;
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		fare=Double.parseDouble(in.nextLine());
		
		celsius=(fare-32)/1.8;
		
		System.out.println("A temperatura em celsius é: "+celsius);
		
		
		in.close();
	}
}
