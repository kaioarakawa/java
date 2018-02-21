package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int qntM;
		double total=0;
		
		System.out.println("Digite a quantidades de maça a ser comprada");
		qntM = Integer.parseInt(in.nextLine());
		DecimalFormat df = new DecimalFormat("0.00");
		
		if (qntM<12)
		{
			total=0.30*qntM;
		}else if(qntM>=12){
			total=0.25*qntM;
		}
		
		System.out.println("O valor total da compra é:"+df.format(total));
		
		in.close();
		df.clone();
	}
}
