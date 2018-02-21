package br.edu.ifcvideira.beans;

public class Apartamento_reserva {
	private int id_apartamento;
	private int id_reserva;
	private int id_ref;
	private int situacao_reserva;
	private double valor_total;
	private String data_entrada;
	private String data_saida;
	private String placa_car;
	
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	
	public int getId_ref() {
		return id_ref;
	}
	public void setId_ref(int id_ref) {
		this.id_ref = id_ref;
	}
	public int getId_apartamento() {
		return id_apartamento;
	}
	public void setId_apartamento(int id_apartamento) {
		this.id_apartamento = id_apartamento;
	}
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getSituacao_reserva() {
		return situacao_reserva;
	}
	public void setSituacao_reserva(int situacao_reserva) {
		this.situacao_reserva = situacao_reserva;
	}
	public String getData_entrada() {
		return data_entrada;
	}
	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}
	public String getData_saida() {
		return data_saida;
	}
	public void setData_saida(String data_saida) {
		this.data_saida = data_saida;
	}
	public String getPlaca_car() {
		return placa_car;
	}
	public void setPlaca_car(String placa_car) {
		this.placa_car = placa_car;
	}
	
	
}
