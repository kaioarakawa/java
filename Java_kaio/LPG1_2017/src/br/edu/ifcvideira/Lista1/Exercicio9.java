package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double ganhoh;
		int numtrab;
		double INSS;
		double SB;
		double sindicato;
		double SL;
		
		System.out.println("Digite quanto é o ganhor por hora em reais");
		ganhoh=Double.parseDouble(in.nextLine());
		System.out.println("Digite a quantidades de horas trabalhadas no mes");
		numtrab=Integer.parseInt(in.nextLine());
		SB=ganhoh*numtrab;
		
		INSS=SB*(8.0/100.0);
		
		sindicato=SB*(5.0/100.0);
		
		SL=SB-INSS-sindicato-(SB*(11.0/100.0));
		
		System.out.println("Os valores de salario e impososto são:\n"
				+ "Salario Bruto: "+SB+ "\n"
						+ "INSS: "+INSS+ "\n"
								+ "Sindicato: "+sindicato+ "\n"
										+ "Salario Liquido: "+SL);
		in.close();
	}
}
