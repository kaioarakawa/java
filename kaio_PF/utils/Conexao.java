package br.edu.ifcvideira.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {	
	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String usuario = "root";
	private final static String mydatabase = "hotel";
	private final static String senha = "";
	private final static String serverName = "localhost";
	private final static String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	private static Connection conexao = null;
	    
	public static Connection conectar(){
		 try {
			 Class.forName(driver);
			 conexao = DriverManager.getConnection(url, usuario, senha);
			 System.out.println("Conexão efetuada com sucesso");
	       
		 } catch (Exception ex) {
			 ex.printStackTrace();
		 }
		return conexao; 
	}

	public void fechar() {
		try {
			conexao.close();
			System.out.println("Conexão encerrada");
		} 
	        
		catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}