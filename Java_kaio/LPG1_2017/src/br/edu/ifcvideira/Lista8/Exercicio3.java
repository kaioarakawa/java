package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		

	Normal n= new Normal();
	Vip v = new Vip();
	Camarotesuperior cm= new Camarotesuperior();
	Camaroteinferior ci= new Camaroteinferior();
	
	
	int op;
	
	n.setValor(100);
	v.setValor(100);
	cm.setValor(100);
	ci.setValor(100);
	
	for(;;)
	{
		
		
		op=Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de ingresso requerido? \n"
				+ "1-Normal \n"
				+ "2-VIP \n"
				+ "3-Camarote Inferior \n"
				+ "4-Camarote Superior \n"
				+ "5-Sair"));
		
		if(op==1){
			
			JOptionPane.showMessageDialog(null, n.Tipo()+"\n"
					+ "Valor: "+n.getValor());
		}else if(op==2){
			v.setAdd(Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem adicional?")));
			JOptionPane.showMessageDialog(null,"Ingresso Vip \n"
					+ "Valor: "+v.valorvip());
		}else if(op==3){
			ci.setAdd(Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem adicional do VIP")));
			op=Integer.parseInt(JOptionPane.showInputDialog("Qual a opção desejada? \n"
					+ "1-Cadastrar a localização \n"
					+ "2-Imprimir Localização"));
					if(op==1){
							ci.setLocal(String.valueOf(JOptionPane.showInputDialog("Qual a localização do camarote?")));
							JOptionPane.showMessageDialog(null, "Localização: "+ci.getLocal()+"\n"
									+ "Valor: "+ci.valorvip());
					}else if(op==2){
							JOptionPane.showMessageDialog(null, "Localização: "+ci.getLocal()+"\n"
									+ "Valor: "+ci.valorvip());
					}else{
						JOptionPane.showMessageDialog(null, "Opção Inesxistente, Saindo...");
					}
		}else if(op==4){
			cm.setAddsup(Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem adicional?")));
			JOptionPane.showInputDialog("Ingresso Para Camarote Superior \n"
					+ "Valor: "+cm.valorsup());
		}else if(op==5){
			JOptionPane.showMessageDialog(null, "Finalizando...");
			break;
		}else{
			JOptionPane.showMessageDialog(null, "Opção Inesxistente");
		}
	}
	}
}
