package br.edu.ifcvideira.Lista5;


import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String num;
		Scanner in = new Scanner(System.in);
		int i=0;
		int maior=0;
		int menor=999;
		
		
		
		System.out.println("Digite os numero com o ; como separeção:");
		num=String.valueOf(in.nextLine());
		String con[]= num.split(";");
		for(i=0;i<con.length;i++)
		{
			if(Integer.parseInt(con[i])<menor)
			{
				menor=Integer.parseInt(con[i]);
			}
			
			if(Integer.parseInt(con[i])>maior)
			{
				maior=Integer.parseInt(con[i]);
			}
		}
		
		System.out.println("O maior numero é "+maior+" e o menor numero é "+menor);
		in.close();
	}
}
