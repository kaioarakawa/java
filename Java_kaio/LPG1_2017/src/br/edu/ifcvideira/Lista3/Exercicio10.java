package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double gramas=0;
		double time=0;
		int cont=0;
		int i=0;
		
		System.out.println("Digite a quantidades em gramas do material radioativo");
		gramas=Double.parseDouble(in.nextLine());
		
		while(gramas>=0.5)
		{
			time+=0.5;
			gramas=gramas/2;
		}
		System.out.println(time);
		while(2>1)
		{
			if((time-6)>=0)
			{
				cont++;
				time-=6;
			}
			else if((time-0.6)>=0)
			{
				i++;
				time-=0.6;
			}else {
				break;
			}
		}
		
		
		System.out.println("É necessaio "+cont+" horas "+i+" minutos e "+time+" "
				+ "segundos para a massa ficar menor que 0,5 gramas");
		in.close();
	}
}
