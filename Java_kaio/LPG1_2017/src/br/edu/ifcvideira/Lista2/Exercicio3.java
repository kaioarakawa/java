package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int esc;
		double altura;
		double pesoid=0;
		DecimalFormat df=new DecimalFormat("0.00");
		
		System.out.println("Digite o seu sexo: (1-Masculino e 2-Feminino)");
		esc=Integer.parseInt(in.nextLine());
		System.out.println("Digite a sua altura:");
		altura=Double.parseDouble(in.nextLine());
		if (esc==1){
			pesoid=(72.7*altura)-58;
			System.out.println("O seu peso ideal é de "+ df.format(pesoid)+" KG");
		}else if(esc==2)
		{
			pesoid=(62.1*altura)-44.7;
			System.out.println("O seu peso ideal é de "+ df.format(pesoid)+" KG");
		}
		in.close();
	}
}
