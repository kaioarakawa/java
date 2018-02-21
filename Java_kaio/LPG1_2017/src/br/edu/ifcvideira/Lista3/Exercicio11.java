package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cont50=0;
		int cont10=0;
		int cont5=0;
		int cont2=0;
		int saque;
		int op;
		
		System.out.println("Digite o valor de saque(Minimo 4 reais e somente saque inteiro)");
		saque=Integer.parseInt(in.next());
		op=saque;
		if(saque<4)
		{
			System.out.println("O saque não é possivel");
			System.exit(0);
		}
		
		while(2>1)
		{
			if((saque-50)>=0)
			{
				cont50++;
				saque-=50;
			}else if(((saque-10)>=0))
			{
				cont10++;
				saque-=10;
			}else if(((saque-5)>=0))
			{
				cont5++;
				saque-=5;
			}else if((saque-2)>=0)
			{
				cont2++;
				saque-=2;
			}else if(saque==1)
			{
				cont50=0;
				cont10=0;
				cont5=0;
				cont2=0;
				while(2>1)
				{
				if((op-50)>=0)
				{
					cont50++;
					op-=50;
				}else if(((op-10)>=0)&&((op-10)>3))
				{
					cont10++;
					op-=10;
				}else if(((op-5)>=0) && ((op-5)>3))
				{
					cont5++;
					op-=5;
				}else if((op-2)>=0)
				{
					cont2++;
					op-=2;
				}else {
					break;
				}
				}
				break;
			}
			else {
				break;
			}
		}
		System.out.println("O saque sera de "+cont50+" nota de 50 \n"
				+cont10+" nota de 10 \n"
						+cont5+" nota de 5 \n"
								+cont2+" nota de 2");
		in.close();
	}
}
