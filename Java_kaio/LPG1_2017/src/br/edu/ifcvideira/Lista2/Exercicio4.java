package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lados;
		int medidaL;
		double area=0;
		double alt=0;
		DecimalFormat df=new DecimalFormat("0.00");
		
		System.out.println("Digite a quantidades de lados do poligono:");
		lados=Integer.parseInt(in.nextLine());
		System.out.println("Digite o tamanho do lado em centimetros");
		medidaL=Integer.parseInt(in.nextLine());
		
		if(lados==3) {
			alt=Math.sqrt(Math.pow(medidaL, 2)-(Math.pow(medidaL/2, 2)));
			area=(medidaL*alt)/2;
			System.out.println("O poligono é um triangulo de area "+df.format(area));
		}else if(lados==4) {
			area=Math.pow(medidaL, 2);
			System.out.println("O poligono é um quadrado de area "+df.format(area));
		}else if(lados==5){
			alt=Math.sqrt(Math.pow(medidaL, 2)-(Math.pow(medidaL/2, 2)));
			area=((medidaL*alt)/2)*5.00;
			System.out.println("O poligono é um pentagono de area "+df.format(area));
			in.close();
		}else {
			System.out.println("Lados Invalidos");
		}
	}
}
