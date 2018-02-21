package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		String nome[]=new String[10];
		double pre[]=new double[10];
		int quant[]=new int[10];
		int cod[]=new int[10];
		double total=0;
		Scanner in= new Scanner(System.in);
		int codi=0;
		String opc;
		int qnt;
		int i=0;
		int i2=0;
		
		for(i=0;i<10;i++)
		{
			cod[i]=-5;
		}
		
		
		
		
		for(i=0;i<10;i++)
		{
		System.out.println("Digite o nome do produto");
		nome[i]=String.valueOf(in.nextLine());
		System.out.println("Digite o preço do produto");
		pre[i]=Double.parseDouble(in.nextLine());
		System.out.println("Digite a quantidade do produto");
		quant[i]=Integer.parseInt(in.nextLine());
		System.out.println("Digite o codigo do produto");
		cod[i]=Integer.parseInt(in.nextLine());
		for(i2=0;i2<10;i2++)
		{
			if((cod[i]==cod[i2]) && (i!=i2))
			{
				System.out.println("Codigo ja existente, tente novamente do inicio");
				i--;
				break;
			}
		}
		}
		
		while(2>1)
		{
			System.out.println("Digite o codigo do produto:");
			codi=Integer.parseInt(in.nextLine());
			if(codi<0)
			{
				break;
			}else
			{
				for(i2=0;i2<10;i2++)
				{
					if(codi==cod[i2])
					{
						break;
					}
				}

			}
			System.out.println("Foi venda ou compra do produto?");
			opc=String.valueOf(in.nextLine());
			System.out.println("Qual a quantidade?");
			qnt=Integer.parseInt(in.nextLine());
			if(opc.equalsIgnoreCase("venda"))
			{
				quant[i2]-=qnt;
			}else if(opc.equalsIgnoreCase("compra"))
			{
				quant[i2]+=qnt;
			}
			
		}
		
		for(i=0;i<10;i++)
		{
			System.out.println("Produto: "+nome[i]+"       Codigo: "+cod[i]+"\n"
					+ "Valor unitario: "+pre[i]+"       Quantidade em estoque: "+quant[i]+"\n"
							+ "Valor total: "+(pre[i]*quant[i]));
			total+=(pre[i]*quant[i]);
		}
		System.out.println("O valor total do estoque é de: "+total);
		in.close();
		
	}
}
