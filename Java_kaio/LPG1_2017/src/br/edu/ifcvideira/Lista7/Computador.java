package br.edu.ifcvideira.Lista7;

public class Computador {
	private int placa_mae;
	private int tipo_proc;
	private int memeria;
	private int tam_discrig;
	private int pol_moni;
	private int pre�o;
	
	
	public int getPlaca_mae() {
		return placa_mae;
	}
	public void setPlaca_mae(int placa_mae) {
		this.placa_mae = placa_mae;
	}
	public int getPre�o() {
		return pre�o;
	}
	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
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
		//escolha da placa m�e
		if(this.getPlaca_mae()==1)
		{
			this.setPre�o(900);
		}
		
		
		// escolha do precessador
		if(this.getTipo_proc()==600)
		{
			this.setPre�o(pre�o+700);
		}else if(this.getTipo_proc()==800)
		{
			this.setPre�o(pre�o+830);
		}else if(this.getTipo_proc()==933)
		{
			this.setPre�o(pre�o+910);
		}
		
		
		//escolha da memoria RAM
		if(this.getMemeria()>=1)
		{
			this.setPre�o(pre�o+(this.getMemeria()*150));
		}
		
		
		//escolha do tamanho do disco rigido
		if(this.getTam_discrig()==500)
		{
			this.setPre�o(pre�o+400);
		}else if(this.getTam_discrig()==1)
		{
			this.setPre�o(pre�o+600);
		}else if(this.getTam_discrig()==2)
		{
			this.setPre�o(pre�o+800);
		}
		
		
		//escolha de polegadas do monito
		if(this.getPol_moni()==17)
		{
			this.setPre�o(pre�o+390);
		}else if(this.getPol_moni()==19)
		{
			this.setPre�o(pre�o+520);
		}
			
			
		return this.pre�o;
	}
	
	
}
