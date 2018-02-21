package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio3 {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String nome;
	int idade;
	double salario;
	
	System.out.println("Digite o nome da pessoa");
	nome = String.valueOf(in.nextLine());
	System.out.println("Digite o salario de "+nome);
	salario = Double.parseDouble(in.nextLine());
	System.out.println("Digite a idade de " +nome);
	idade = Integer.parseInt(in.nextLine());
	
	System.out.println("Dados da pessoa: \n"
			+ "Nome:"+nome+"\n"
			+ "Salario:"+salario+"\n"
					+ "Idade:"+idade);
	in.close();
}
}
