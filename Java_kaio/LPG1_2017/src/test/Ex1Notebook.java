package test;


public class Ex1Notebook extends Ex1Computador{
	
	private double carregador;
	private double pasta;
	private String carregadorDesc;
	private String pastaDesc;
	
	public double getCarregador() {
		return carregador;
	}
	public void setCarregador(double carregador) {
		this.carregador = carregador;
	}
	public double getPasta() {
		return pasta;
	}
	public void setPasta(double pasta) {
		this.pasta = pasta;
	}
	public String getCarregadorDesc() {
		return carregadorDesc;
	}
	public void setCarregadorDesc(String carregadorDesc) {
		this.carregadorDesc = carregadorDesc;
	}
	public String getPastaDesc() {
		return pastaDesc;
	}
	public void setPastaDesc(String pastaDesc) {
		this.pastaDesc = pastaDesc;
	}
	
	public double calculaNote(){
		return this.getCarregador() + this.getPasta() + this.getHd() + this.getMemoria() + this.getPlacaMae() + this.getProcessador();
	}
	
	public String notaFiscalNote(){
		return "Dados do Notebook escolhido:\n\n"
				+ this.getCarregadorDesc()
				+ this.getPastaDesc()
				+ this.getPlacaMaeDesc()
				+ this.getProcessadorDesc()
				+ this.getHdDesc()
				+ this.getMemoriaDesc()
				+ "Quantidade de volumes: 1\n"
				+ "Valor total: R$"+calculaNote();
	}
	
	
}




























































