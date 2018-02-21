package br.edu.ifcvideira.Lista8;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Novo n= new Novo();
		Velho v= new Velho();
		
		int op;
		
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite qual a opção desejada \n"
					+ "1-Comprar Imovel Novo \n"
					+ "2-Comrar Imovel Velhor \n"
					+ "3-Sair"));
			if(op==1) {
				n.setEndereco(String.valueOf(JOptionPane.showInputDialog("Digite o endereço da casa")));
				n.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da casa:")));
				n.setAdd(Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem adicional no preço da casa")));
				
				JOptionPane.showMessageDialog(null, "Casa nova \n"
						+ "Endereço: "+n.getEndereco()+"\n"
								+ "Preço com adiocional: "+n.Imovelnv());
			}else if(op==2) {
				v.setEndereco(String.valueOf(JOptionPane.showInputDialog("Digite o endereço da casa")));
				v.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da casa:")));
				v.setDesc(Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de desconto no preço da casa")));
				
				JOptionPane.showMessageDialog(null, "Casa Velha \n"
						+ "Endereço: "+n.getEndereco()+"\n"
								+ "Preço com Desconto: "+v.Imovelvlh());
			}else if(op==3) {
				JOptionPane.showMessageDialog(null, "Finalizando..");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção errada!! Tente novamente!!");
			}
			
		}
	}
}
