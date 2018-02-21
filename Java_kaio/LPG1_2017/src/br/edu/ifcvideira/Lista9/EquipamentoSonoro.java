package br.edu.ifcvideira.Lista9;

public class EquipamentoSonoro extends Equipamento{
	private int volume;
	private boolean stereo;
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isStereo() {
		return stereo;
	}
	public void setStereo(boolean stereo) {
		this.stereo = stereo;
	}
	
	
	public String EstadoS(){
		if(this.isStereo()) {
			return "Ligado";
		}else
		{
			return "Desligado";
		}
	}
	
	public void Mudastereo(){
		if(this.isStereo()){
			this.setStereo(false);
		}else{
			this.setStereo(true);
		}
	}
	
}
