package br.edu.ifcvideira.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifcvideira.beans.Apartamento_reserva;
import br.edu.ifcvideira.beans.Cliente;
import br.edu.ifcvideira.beans.Reserva;
import br.edu.ifcvideira.utils.Conexao;

public class ReservaDao {
	public void CadastrarClienteNV(Reserva r) throws SQLException, Exception{
		try{
	
			String sql = "INSERT INTO reserva (id_cliente, id_servidor) VALUES (?,?)";
			java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			
			sqlPrep.setInt(1,r.getId_cliente());
			sqlPrep.setInt(2, r.getId_servidor());
			sqlPrep.execute();
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
	}
	
	public void CadastrarCliente(Reserva r) throws SQLException, Exception{
		try{
	
			String sql = "INSERT INTO reserva (id_cliente, id_servidor) VALUES (?,?)";
			java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			sqlPrep.setInt(1,RetornarCodigoCliente());
			sqlPrep.setInt(2, RetornarCodigoServidor());
			
			sqlPrep.execute();
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
	}
	
	
	public void deletarCliente(Apartamento_reserva a) throws Exception{
		try{
			String sql = "DELETE FROM reserva WHERE num_reserva=? ";
			PreparedStatement sqlPrep = (PreparedStatement) Conexao.conectar().prepareStatement(sql);
			sqlPrep.setInt(1, a.getId_reserva());
			sqlPrep.execute();
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public List<Object> buscarTodos() throws SQLException, Exception{
		List<Object> reserva = new ArrayList<Object>();
		try {
			String sql = "select reserva.num_reserva, pessoa.nome, pessoa.cpf from pessoa inner join cliente  on(cliente.id_pessoa=pessoa.id) inner join reserva  on reserva.id_cliente=cliente.id_pessoa;";
			java.sql.Statement state = Conexao.conectar().createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while (rs.next())
			{
				Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3)};
				reserva.add(linha);
			}
			state.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return reserva;
	}
	
	
	
	
	
	public int RetornarCodigoCliente() throws Exception {
		try{
			String sql ="SELECT MAX(id_pessoa) AS codigo FROM cliente";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = sqlPrep.executeQuery();
			
			if (rs.next()){
				return rs.getInt("codigo") ;
			}else{
				return 1;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 1;
		}
	}
	
	public int RetornarCodigoServidor() throws Exception {
		try{
			String sql ="SELECT MAX(id_pessoa) AS codigo FROM servidor";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = sqlPrep.executeQuery();
			
			if (rs.next()){
				return rs.getInt("codigo");
			}else{
				return 1;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 1;
		}
	}
	public int Retornarreserva() throws Exception {
		try{
			String sql ="SELECT MAX(num_reserva) AS numero_reserva FROM reserva";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = sqlPrep.executeQuery();
			
			if (rs.next()){
				return rs.getInt("numero_reserva");
			}else{
				return 1;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 1;
		}
	}
}
