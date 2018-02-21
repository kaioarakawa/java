package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			double altura;
			int sex;
			int i;
			double M=0;
			double m=9999;
			double media=0;
			int h=0;
			
			
			for(i=0;i<2;i++)
			{
				System.out.println("Digite o sexo da pessoa (1-masculino ou 2-feminino)");
				sex=Integer.parseInt(in.nextLine());
				
				System.out.println("Digite a altura da pessoa");
				altura=Double.parseDouble(in.nextLine());
				
				if (sex==1)
				{
					h++;
				}else if(sex==2)
				{
					media+=altura;
				}
				if(altura>M)
				{
					M=altura;
				}else if(altura<m)
				{
					m=altura;
				}
				
				
			}
			System.out.println("A maior altura é de "+M+ " a menor altura é de "+m+"\n"
					+ "A media das altura femininas é de: "+(media/10)+"\n"
							+ "A porcentagem de homens no todo é de: "+(h/10)*100);
			in.close();
			
	}
}
