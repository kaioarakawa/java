package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	double potencia;
	double largura;
	double comprimento;
	double potene;
	
	System.out.println("Digite a potencia da lampada;");
	potencia=Double.parseDouble(in.nextLine());
	System.out.println("Digite a largura do comodo;");
	largura=Double.parseDouble(in.nextLine());
	System.out.println("Digite o comprimento do comodo");
	comprimento=Double.parseDouble(in.nextLine());
	
	potene=((comprimento*largura)*18)/potencia;
	
	System.out.println("O Numero de lampadas necessarias é de: "+potene);
	
	in.close();
	
	}
}
