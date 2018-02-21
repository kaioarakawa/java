package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> alunos=new ArrayList<String>();
		int opc=0;
		int pos=0;
		String aluno;
		
	for(;;)
	{
		
		System.out.println("1-Inserir Aluno \n"
				+ "2-Consultar Aluno \n"
				+ "3-Remover aluno  \n"
				+ "4-Listar \n"
				+ "5-Sair");
		opc=Integer.parseInt(in.nextLine());
		if(opc==1){
			System.out.println("Voce deseja inserir: \n"
					+ "1-final da lista \n"
					+ "2-posição especifica");
			opc=Integer.parseInt(in.nextLine());
			if(opc==1)
			{
				System.out.println("Digite o nome do aluno");
				aluno=String.valueOf(in.nextLine());
				alunos.add(aluno);
			}else if(opc==2)
			{
				System.out.println("Digite o nome do aluno");
				aluno=String.valueOf(in.nextLine());
				
				System.out.println("Digite a posição para colocar o nome");
				pos=Integer.parseInt(in.nextLine());
				if(pos<alunos.size())
				{
					alunos.set(pos, aluno);
				}
				else
				{
					System.out.println("posição inexsistente tente novamente");
				}
				
			}else
			{
				System.out.println("Tente novamente, opção errada");
			}
		}else if(opc==2)
		{
			System.out.println("Digite o nome do aluno");
			aluno=String.valueOf(in.nextLine());
			if(alunos.indexOf(aluno)!=-1)
			{
				System.out.println("Aluno encontrado");
			}else
			{
				System.out.println("Aluno não esta cadastrado");
			}
			
		}else if(opc==3)
		{
			System.out.println("Deseja excluir todos os alunos ou 1 especifico?(1-todos,2-especifico");
			opc=Integer.parseInt(in.nextLine());
			
			if(opc==1)
			{
				alunos.clear();
				System.out.println("Todos os alunos foram excluidos");
			}else if(opc==2)
			{
			System.out.println("Digite o nome do aluno");
			aluno=String.valueOf(in.nextLine());
			
			alunos.remove(aluno);
			
			System.out.println("Alunos Excluido");
			} else
			{
				System.out.println("Opção errada, tente novamente");
			}
			
		}else if(opc==4)
		{
			System.out.println("Lista de alunos \n");
			  while(!alunos.isEmpty()){
		            System.out.println(alunos.remove(0));
		        }
		}else if(opc==5)
		{
			System.out.println("Fianlizando o programa");
			break;
		}else
		{
			System.out.println("Opção errada tente novamente");
		}
		
	
	}
	
	
	in.close();
	
	}
}
