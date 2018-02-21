package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double comprimento;
		double totalV;
		int numrea;
		double consumo;
		double litros;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite o comprimento da pista");
		comprimento=Double.parseDouble(in.nextLine());
		System.out.println("Digite o total de volta");
		totalV=Double.parseDouble(in.nextLine());
		System.out.println("Digite o numero de reabastecimento necessarios:");
		numrea=Integer.parseInt(in.nextLine());
		System.out.println("Digite o consumo do carro:");
		consumo=Double.parseDouble(in.nextLine());
		
		litros=((comprimento*totalV)/(numrea+1))/consumo;
		
		System.out.println("Sera consumido "+df.format(litros)+" até a primeira parada");
		
		in.close();
		df.clone();
	}
}
