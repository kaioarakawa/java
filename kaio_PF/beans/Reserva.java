package br.edu.ifcvideira.beans;

public class Reserva {
	private int num_reserva;
	private int id_cliente;
	private int id_servidor;
	private String dt_reserva;
	
	
	public int getNum_reserva() {
		return num_reserva;
	}
	public void setNum_reserva(int num_reserva) {
		this.num_reserva = num_reserva;
	}
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_servidor() {
		return id_servidor;
	}
	public void setId_servidor(int id_servidor) {
		this.id_servidor = id_servidor;
	}
	public String getDt_reserva() {
		return dt_reserva;
	}
	public void setDt_reserva(String dt_reserva) {
		this.dt_reserva = dt_reserva;
	}
	
	
}
