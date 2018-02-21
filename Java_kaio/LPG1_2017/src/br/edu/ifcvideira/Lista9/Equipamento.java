package br.edu.ifcvideira.Lista9;

public class Equipamento {
	private boolean ligado;

	
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	
	public String Estado(){
		if(this.isLigado()) {
			return "Ligado";
		}else
		{
			return "Desligado";
		}
	}
	
	
	
	public void MudaEstado(){
		if(this.isLigado()){
			this.setLigado(false);
		}else{
			this.setLigado(true);
		}
	}
}
