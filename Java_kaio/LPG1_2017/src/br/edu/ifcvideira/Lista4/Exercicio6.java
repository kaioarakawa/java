package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int vet[]= new int[3];
		Scanner in = new Scanner(System.in);
		String msg="";
		int i=0;
		
		for(i=0;i<3;i++)
		{
		System.out.println("Digite o "+(i+1)+" caracter do numero composto:");
		vet[i]=Integer.parseInt(in.nextLine());
		}

		
		if (vet[0]==1 && vet[1]==0 && vet[2]==0)
		{
			msg+="Cem";
		}else if(vet[0]==1)
		{
			msg+="cento ";
		}else if (vet[0]==2)
		{
			msg+="duzentos";
		}else if (vet[0]==3)
		{
			msg+="trezentos";
		}else if (vet[0]==4)
		{
			msg+="quatrocentos";
		}else if (vet[0]==5)
		{
			msg+="quinhentos";
		}else if (vet[0]==6)
		{
			msg+="seiscentos";
		}else if (vet[0]==7)
		{
			msg+="setecentos";
		}else if (vet[0]==8)
		{
			msg+="oitocentos";
		}else if (vet[0]==9)
		{
			msg+="novecentos";
		}
		
		
		
		
		
		if (vet[1]==1 && vet[2]==0)
		{
			msg+=" e dez";
		}else if(vet[1]==1 && vet[2]==1)
		{
			msg+=" e onze ";
		}else if (vet[1]==1 && vet[2]==2)
		{
			msg+=" e doze";
		}else if (vet[1]==1 && vet[2]==3)
		{
			msg+="e treze";
		}else if (vet[1]==1 && vet[2]==4)
		{
			msg+=" e quatorze";
		}else if (vet[1]==1 && vet[2]==5)
		{
			msg+=" e quinze";
		}else if (vet[1]==1 && vet[2]==6)
		{
			msg+=" e dezeseis";
		}else if (vet[1]==1 && vet[2]==7)
		{
			msg+=" e dezesete";
		}else if (vet[1]==1 && vet[2]==8)
		{
			msg+=" e dezoito";
		}else if (vet[1]==1 && vet[2]==9)
		{
			msg+=" e dezenove";
		}
		
	if (vet[1]==2)
	{
		msg+=" e vinte";
	}else if (vet[1]==3)
	{
		msg+=" e trinta";
	}else if (vet[1]==4)
	{
		msg+="e quarenta";
	}else if (vet[1]==5)
	{
		msg+=" e cinquenta";
	}else if (vet[1]==6)
	{
		msg+=" e secenta";
	}else if (vet[1]==7)
	{
		msg+=" e setenta";
	}else if (vet[1]==8)
	{
		msg+=" e oitenta";
	}else if (vet[1]==9)
	{
		msg+=" e noventa";
	}
	
	if(vet[1]!=1 && vet[2]==1)
	{
		msg+=" e um";
	}else if (vet[1]!=1 && vet[2]==2)
	{
		msg+=" e dois";
	}else if (vet[1]!=1 && vet[2]==3)
	{
		msg+="e tres";
	}else if (vet[1]!=1 && vet[2]==4)
	{
		msg+=" e quatro";
	}else if (vet[1]!=1 && vet[2]==5)
	{
		msg+=" e cinco";
	}else if (vet[1]!=1 && vet[2]==6)
	{
		msg+=" e seis";
	}else if (vet[1]!=1 && vet[2]==7)
	{
		msg+=" e sete";
	}else if (vet[1]!=1 && vet[2]==8)
	{
		msg+=" e oito";
	}else if (vet[1]!=1 && vet[2]==9)
	{
		msg+=" e nove";
	}
	
	if(vet[0]==0 && vet[1]==0 && vet[2]==0)
	{
		msg="zero";
	}
	System.out.println("O numero é: "+msg);
	
	
	in.close();	
	}
		
}
