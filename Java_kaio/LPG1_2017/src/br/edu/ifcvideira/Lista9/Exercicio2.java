package br.edu.ifcvideira.Lista9;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		EquipamentoSonoro es = new EquipamentoSonoro();
		int op;
		
		for(;;)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada \n"
					+ "1-Ligar ou Desligar o equipamento 			Atual:"+es.Estado()+"\n"
					+ "2-Alterar Volume				Atual:"+es.getVolume()+"\n"
							+ "3-Ligar Stereo				Atual:"+es.EstadoS()+"\n"
									+ "4-Sair"));
			if(op==1) {
				es.MudaEstado();
				if(es.Estado().equalsIgnoreCase("Ligado")) {
					es.setVolume(5);
				}
			}else if(op==2) {
				es.setVolume(Integer.parseInt(JOptionPane.showInputDialog("Digite o volume:")));
				if(es.getVolume()>10) {
					JOptionPane.showMessageDialog(null, "Valor muito alto, alterando para o maximo do volume");
					es.setVolume(10);
				}
				
			}else if(op==3) {
				es.Mudastereo();
			}else if(op==4) {
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção errada, tente novamente!!");
			}
		}
	}
}
