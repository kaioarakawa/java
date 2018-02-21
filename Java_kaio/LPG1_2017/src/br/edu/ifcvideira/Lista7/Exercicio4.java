package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Computador c= new Computador();
		
	
			c.setPlaca_mae(Integer.parseInt(JOptionPane.showInputDialog("Escolha se deseja placa mãe!! \n"
					+ "1-SIM \n"
					+ "2-NÃO")));
			
			c.setTipo_proc(Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho do se processador ou qualquer numero para nada!! \n"
					+ "Temos de 600Mhz, 800Mhz e 933Mhz  (Digite apenas o tamanho em numero)")));
			
			c.setMemeria(Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanha da memoria ou qualquer numero para nada!! \n"
					+ "Temos de 1,2,4 e 8Gb (Digite apenas o tamano em numeros)")));
			
			c.setTam_discrig(Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamanho do disco rigido ou qualquer numero para nada!! \n"
					+ "Temos de 500Gb, 1Tb e 2Tb")));
	
			c.setPol_moni(Integer.parseInt(JOptionPane.showInputDialog("Escolha o tamano do monitor ou qualquer numero para nada!! \n"
					+ "Temos de 17 polegadas e de 19 polegadas")));
			
			JOptionPane.showMessageDialog(null, "O valor ficou de "+c.calculaPreco()+"\n");
			
	}
	
}
