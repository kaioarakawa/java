package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double massa;
		double densidade;
		double preco;
		double vol;
		double val;
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite a massa do leite");
		massa=Double.parseDouble(in.nextLine());
		System.out.println("Digite a densidade do leite");
		densidade=Double.parseDouble(in.nextLine());
		System.out.println("Digite o preço do kilo do leite");
		preco=Double.parseDouble(in.nextLine());
		
		vol=massa/densidade;
		
		val=massa*preco;
		
		System.out.println("A massa do leite é de: "+massa+"\n"
				+ "A densidade do leite é de: "+densidade+ "\n"
						+ "O preço por kilo do leite é de: "+preco+"\n"
								+ "O volume de leite é de: "+df.format(vol)+"\n"
										+ "O valor a ser pago é de: "+df.format(val)+"\n");
		if(densidade<1.14)
		{
			System.out.println("A densidades esta na categoria 1");
		}else if(densidade>=1.14 && densidade<=1.20) {
			System.out.println("A densidades esta na categoria 2");
		}else
		{
			System.out.println("A densidades esta na categoria 3");
		}
		in.close();
		df.clone();
		
		
	}
}
