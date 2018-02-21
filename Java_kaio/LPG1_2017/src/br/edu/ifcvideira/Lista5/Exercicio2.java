package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int i;
		int j=0;
		int ind=0;
		int num=0;
		int menor=9999;
		Scanner in = new Scanner(System.in);
		
		
		for(i=numeros.size();i<20;i++)
		{
			System.out.println("Digite o nuemro para colocar na lista");
			num=Integer.parseInt(in.nextLine());
			numeros.add(num);
		}
		
		
		
		for(i=0;i<numeros.size();i++)
		{
			for(j=i;j<numeros.size();j++)
			{
			if(numeros.get(j)<menor)
			{
				menor=numeros.get(j);
				ind=j;
			}
			}
			num=numeros.get(i);
			numeros.set(i,menor);
			numeros.set(ind,num);
			menor=9999;
		}
		
		for(i=0;i<numeros.size();i++)
		{
			System.out.print(numeros.get(i)+"\t");
			
		}
		in.close();
	}
}
