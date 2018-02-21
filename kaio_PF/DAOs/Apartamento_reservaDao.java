package br.edu.ifcvideira.DAOs;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifcvideira.beans.Apartamento_reserva;
import br.edu.ifcvideira.beans.Cliente;
import br.edu.ifcvideira.utils.Conexao;

public class Apartamento_reservaDao {
	public void CadastrarCliente(Apartamento_reserva ar) throws SQLException, Exception{
		try{
	
			String sql = "INSERT INTO apartamento_reserva (id_apartamento, id_reserva, situacao_reserva, data_entrada, data_saida, placa_car, id_ref) VALUES (?,?,?,?,?,?,?)";
			java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			
			sqlPrep.setInt(1, ar.getId_apartamento());
			sqlPrep.setInt(2, ar.getId_reserva());
			sqlPrep.setInt(3, ar.getSituacao_reserva());
			sqlPrep.setString(4,ar.getData_entrada());
			sqlPrep.setString(5,ar.getData_saida());
			sqlPrep.setString(6,ar.getPlaca_car());
			sqlPrep.setInt(7,ar.getId_ref());
			sqlPrep.execute();
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
	}
	
	public void AlterarCliente(Apartamento_reserva ar) throws Exception {
		try{
			String sql = "UPDATE apartamento_reserva SET  situacao_reserva=?, data_entrada=?, data_saida=?, id_ref=? WHERE id_apartamento=?";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			sqlPrep.setInt(5, ar.getId_apartamento());
			sqlPrep.setInt(1, ar.getSituacao_reserva());
			sqlPrep.setString(2,ar.getData_entrada());
			sqlPrep.setString(3,ar.getData_saida());
			sqlPrep.setInt(4,ar.getId_ref());
			sqlPrep.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public void valortotal(Apartamento_reserva ar) throws Exception {
		try{
			String sql = "UPDATE apartamento_reserva SET  valor_total=? WHERE data_entrada=? and id_apartamento=?";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			sqlPrep.setDouble(1, valor());
			sqlPrep.setString(2, ar.getData_entrada());
			sqlPrep.setInt(3, ar.getId_apartamento());

			sqlPrep.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void valortot(Apartamento_reserva ar) throws Exception {
		try{
			String sql = "UPDATE apartamento_reserva SET  valor_total=? WHERE id_reserva=?";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			sqlPrep.setDouble(1, valor());
			sqlPrep.setInt(2, ar.getId_reserva());

			sqlPrep.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void deletarCliente(Apartamento_reserva ar) throws Exception{
		try{
			String sql = "DELETE FROM apartamento_reserva WHERE id_apartamento=? and data_entrada=?";
			PreparedStatement sqlPrep = (PreparedStatement) Conexao.conectar().prepareStatement(sql);
			sqlPrep.setInt(1, ar.getId_apartamento());
			sqlPrep.setString(2, ar.getData_entrada());
			sqlPrep.execute();
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	public double valor() throws SQLException, Exception{
		try {
			String sql = "SELECT max(apartamento.valor_apt+ref_inclu.valor) as valor from apartamento_reserva inner join ref_inclu on (ref_inclu.id=apartamento_reserva.id_ref)\r\n" + 
					"    inner join apartamento on (apartamento.num_apt=apartamento_reserva.id_apartamento) inner join reserva where (reserva.num_reserva=apartamento_reserva.id_reserva);";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = sqlPrep.executeQuery();
			
			if (rs.next()){
				return rs.getInt("valor");
			}
			else {
				return 0;
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 0;
		}
	}

	
	public List<Object> buscarTodos() throws SQLException, Exception{
		List<Object> apartamento_reserva = new ArrayList<Object>();
		try {
			String sql = "select apartamento_reserva.situacao_reserva, apartamento_reserva.valor_total,apartamento_reserva.id_reserva as numero_da_reserva, apartamento_reserva.data_entrada, apartamento_reserva.data_saida,\r\n" + 
					"apartamento_reserva.placa_car, apartamento.num_apt, apartamento.tipo_apartamento,pessoa.nome  from apartamento_reserva inner join apartamento on (apartamento_reserva.id_apartamento=apartamento.num_apt)\r\n" + 
					"inner join reserva on(apartamento_reserva.id_reserva=reserva.num_reserva) inner join pessoa on reserva.id_cliente=pessoa.id order by nome;";
			java.sql.Statement state = Conexao.conectar().createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while (rs.next())
			{
				Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
				apartamento_reserva.add(linha);
			}
			state.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return apartamento_reserva;
	}
	

}
