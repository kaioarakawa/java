package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Novo n= new Novo();
		Velho v= new Velho();
		
		int op;
		
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite qual a op��o desejada \n"
					+ "1-Comprar Imovel Novo \n"
					+ "2-Comrar Imovel Velhor \n"
					+ "3-Sair"));
			if(op==1) {
				n.setEndereco(String.valueOf(JOptionPane.showInputDialog("Digite o endere�o da casa")));
				n.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o da casa:")));
				n.setAdd(Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem adicional no pre�o da casa")));
				
				JOptionPane.showMessageDialog(null, "Casa nova \n"
						+ "Endere�o: "+n.getEndereco()+"\n"
								+ "Pre�o com adiocional: "+n.Imovelnv());
			}else if(op==2) {
				v.setEndereco(String.valueOf(JOptionPane.showInputDialog("Digite o endere�o da casa")));
				v.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o da casa:")));
				v.setDesc(Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de desconto no pre�o da casa")));
				
				JOptionPane.showMessageDialog(null, "Casa Velha \n"
						+ "Endere�o: "+n.getEndereco()+"\n"
								+ "Pre�o com Desconto: "+v.Imovelvlh());
			}else if(op==3) {
				JOptionPane.showMessageDialog(null, "Finalizando..");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Op��o errada!! Tente novamente!!");
			}
			
		}
	}
}
