package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id;
		String sex;
		double sal;
		double media=0;
		double M=0;
		double m=9999;
		int i=0;
		int cont=0;
		
		while(2>1)
		{
			System.out.println("Digite a idade da pessoa");
			id=Integer.parseInt(in.nextLine());
			if(id<0)
			{
				break;
			}
			System.out.println("Digite o sexo da pessoa(M ou F)");
			sex=String.valueOf(in.nextLine());
			System.out.println("Digite o salario da pessoa");
			sal=Double.parseDouble(in.nextLine());
			
			media+=sal;
			if(id>M)
			{
				M=id;
			}else if(id<m)
			{
				m=id;
			}
			
			if((sal<=2000)&&(sex.equalsIgnoreCase("F")))
			{
				i++;
			}
			cont++;
			
		}
		System.out.println("A media dos salarios é de: "+(media/cont)+"\n"
				+ "A maior idade é de "+M+" e a menor é do "+m+ "\n"
						+ "A Quantidade de mulheres com salario até 2000 é de "+i);
		in.close();
		
	}
}
