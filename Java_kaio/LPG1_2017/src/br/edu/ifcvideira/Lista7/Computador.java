package br.edu.ifcvideira.Lista7;

public class Computador {
	private int placa_mae;
	private int tipo_proc;
	private int memeria;
	private int tam_discrig;
	private int pol_moni;
	private int preço;
	
	
	public int getPlaca_mae() {
		return placa_mae;
	}
	public void setPlaca_mae(int placa_mae) {
		this.placa_mae = placa_mae;
	}
	public int getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}

	public int getTipo_proc() {
		return tipo_proc;
	}
	public void setTipo_proc(int tipo_proc) {
		this.tipo_proc = tipo_proc;
	}
	public int getMemeria() {
		return memeria;
	}
	public void setMemeria(int memeria) {
		this.memeria = memeria;
	}
	public int getTam_discrig() {
		return tam_discrig;
	}
	public void setTam_discrig(int tam_discrig) {
		this.tam_discrig = tam_discrig;
	}
	public int getPol_moni() {
		return pol_moni;
	}
	public void setPol_moni(int pol_moni) {
		this.pol_moni = pol_moni;
	}
	
	
	public int calculaPreco()
	{
		//escolha da placa mãe
		if(this.getPlaca_mae()==1)
		{
			this.setPreço(900);
		}
		
		
		// escolha do precessador
		if(this.getTipo_proc()==600)
		{
			this.setPreço(preço+700);
		}else if(this.getTipo_proc()==800)
		{
			this.setPreço(preço+830);
		}else if(this.getTipo_proc()==933)
		{
			this.setPreço(preço+910);
		}
		
		
		//escolha da memoria RAM
		if(this.getMemeria()>=1)
		{
			this.setPreço(preço+(this.getMemeria()*150));
		}
		
		
		//escolha do tamanho do disco rigido
		if(this.getTam_discrig()==500)
		{
			this.setPreço(preço+400);
		}else if(this.getTam_discrig()==1)
		{
			this.setPreço(preço+600);
		}else if(this.getTam_discrig()==2)
		{
			this.setPreço(preço+800);
		}
		
		
		//escolha de polegadas do monito
		if(this.getPol_moni()==17)
		{
			this.setPreço(preço+390);
		}else if(this.getPol_moni()==19)
		{
			this.setPreço(preço+520);
		}
			
			
		return this.preço;
	}
	
	
}
