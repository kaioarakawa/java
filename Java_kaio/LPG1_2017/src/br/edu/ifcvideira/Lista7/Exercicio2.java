package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
	Porta p1 = new Porta(false,"Sem cor",10,10,10);
	int opc;
	
	
	for(;;)
	{
		opc=Integer.parseInt(JOptionPane.showInputDialog("Estado da Porta: "+p1.retornaEstado()+"\n"
				+ "Digite a op��o desejada \n"
				+ "1-Abri ou fechar a porta \n"
				+ "2-Mudar a cor   Atual: "+p1.getCor()+"\n"
				+ "3-Mudar a dimens�o x   Atual: "+p1.getDimenx()+"\n"
				+ "4-Mudar dimens�o y    Atual: "+p1.getDimeny()+ "\n"
				+ "5-Mudar dimens�o z    Atual: "+p1.getDimenz()+ "\n"
				+ "6-Sair"));
		
		if(opc==1)
		{
			p1.mudaEstado();
		}
		else if(opc==2)
		{
			p1.setCor(String.valueOf(JOptionPane.showInputDialog("Qual cor voce deseja pintar a sua porta?")));
		}
		else if(opc==3)
		{
		p1.setDimenx(Integer.parseInt(JOptionPane.showInputDialog("Digite a dimens�o x desejada")));	
		}
		else if(opc==4)
		{
		p1.setDimeny(Integer.parseInt(JOptionPane.showInputDialog("Digite a dimens�o y desejada")));	
		}
		else if(opc==5)
		{
		p1.setDimenz(Integer.parseInt(JOptionPane.showInputDialog("Digite a dimens�o z desejada")));	
		}
		else if(opc==6)
		{
			JOptionPane.showMessageDialog(null,"Finalizando");
		break;	
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Op��o inexistente");
		}
	}
	
	JOptionPane.showMessageDialog(null, "A porta esta:"+p1.retornaEstado()+"\n"
			+ "cor: "+p1.getCor()+"\n"
					+ "Dimens�o X: "+p1.getDimenx()+"\n"
							+ "Dimens�o y: "+p1.getDimeny()+"\n"
									+ "Dimens�o Z: "+p1.getDimenz());
	}
	
}
