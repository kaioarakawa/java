package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner in= new Scanner(System.in);
		int num;
		int tipo=0;
		double local;
		double inte;
		double conta=0;
		double fnt=0;
		double total=0;
		
			System.out.println("Digite o numero de telefone da pessoa:");
			num=Integer.parseInt(in.nextLine());
			System.out.println("Digite o tipo do telefone (1-Residencial 2-Comercial)");
			tipo=Integer.parseInt(in.nextLine());
			if ((tipo!=1) && (tipo!=2))
			{
				System.out.println("O tipo do numero é invalido");
				System.exit(0);
			}
			System.out.println("Digite o numero de minutos registrados em chamadas locais:");
			local=Double.parseDouble(in.nextLine());
			System.out.println("Digite o numero de minutos registrados em chamadas interurbanas:");
			inte=Integer.parseInt(in.nextLine());
			
			if(tipo==1)
			{
				conta=10.20+(local*0.5)+(inte*1.1);
				fnt=(conta*(30.0/100.0));
				total=conta+fnt;
				System.out.println("O numero "+num+" é residencial\n"
						+ "O tempo de uso de chamadas locais foi de: "+local+"\n"
								+ "O tempo de uso de chamadas interurbanas foi de: "+inte+"\n"
										+ "O valor da conta é de: "+df.format(conta)+"\n"
												+ "O valor do FNT é de: "+df.format(fnt)+"\n"
														+ "O valor total é de: "+df.format(total)+"\n");
				
			}else {
				conta=19.50+(local*0.5)+(inte*1.1);
				fnt=(conta*(30.0/100.0));
				total=conta+fnt;
				System.out.println("O numero "+num+" é comercial\n"
						+ "O tempo de uso de chamadas locais foi de: "+local+"\n"
								+ "O tempo de uso de chamadas interurbanas foi de: "+inte+"\n"
										+ "O valor da conta é de: "+df.format(conta)+"\n"
												+ "O valor do FNT é de: "+df.format(fnt)+"\n"
														+ "O valor total é de: "+df.format(total)+"\n");
			}
			
		
		df.clone();
		in.close();
		
	}
}
