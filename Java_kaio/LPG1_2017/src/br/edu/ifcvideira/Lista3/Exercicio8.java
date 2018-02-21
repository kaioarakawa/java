package br.edu.ifcvideira.Lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) throws InterruptedException {
		Scanner in= new Scanner(System.in);
		String op;
		double saldo=0;
		double coisas=0;
		DecimalFormat df = new DecimalFormat("0.00");
		
		while(2>1)
		{
			System.out.println("MENU \n"
					+ "a-CONSULTAR SALDO \n"
					+ "b-SAQUE \n"
					+ "c-DEPOSITO \n"
					+ "d-SALDO \n"
					+ "e-SAIR \n"
					+ "Digite a opção:");
			op=String.valueOf(in.nextLine());
			if(op.equalsIgnoreCase("a"))
			{
				System.out.println("O saldo é de "+df.format(saldo));
				Thread.sleep(4000);
			}else if(op.equalsIgnoreCase("b"))
			{
				
				System.out.println("Digite o valor do saque");
				coisas=Double.parseDouble(in.nextLine());
				if((saldo-coisas)<0)
				{
					System.out.println("Voce esta sem saldo no momento");
					Thread.sleep(4000);
				}else{
					saldo-=coisas;
					System.out.println("Saque concluido \n"
							+ "Saldo: "+saldo);
					Thread.sleep(4000);
				}
			}
			else if(op.equalsIgnoreCase("c"))
			{
				System.out.println("Digite o valor para deposito");
				coisas=Double.parseDouble(in.nextLine());
				saldo+=coisas;
				System.out.println("Deposito concluido \n"
						+ "Saldo: "+saldo);
				Thread.sleep(4000);
			}else if(op.equalsIgnoreCase("d"))
			{
				System.out.println("Saldo: "+saldo);
				Thread.sleep(4000);
			}else if(op.equalsIgnoreCase("e"))
			{
				System.out.println("Finalizando...");
				break;
			}
		}
		in.close();
	}
}
