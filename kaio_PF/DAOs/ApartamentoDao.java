package br.edu.ifcvideira.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifcvideira.beans.Apartamento;
import br.edu.ifcvideira.utils.Conexao;

public class ApartamentoDao {
	public void CadastrarAP(Apartamento a) throws SQLException, Exception{
		try{
	
			String sql = "INSERT INTO apartamento (num_apt, tipo_apartamento, valor_apt) VALUES (?,?,?)";
			java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			
			sqlPrep.setInt(1, a.getNum_apt());
			sqlPrep.setString(2, a.getTipo_apartamento());
			sqlPrep.setDouble(3, a.getValor_apt());
			sqlPrep.execute();
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
	}
	
	public void deletarAp(Apartamento a) throws Exception{
		try{
			String sql = "DELETE FROM apartamento WHERE num_apt=? ";
			PreparedStatement sqlPrep = (PreparedStatement) Conexao.conectar().prepareStatement(sql);
			sqlPrep.setInt(1, a.getNum_apt());
			sqlPrep.execute();
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public List<Object> buscarTodos() throws SQLException, Exception{
		List<Object> apartamento = new ArrayList<Object>();
		try {
			String sql = "SELECT * FROM apartamento";
			java.sql.Statement state = Conexao.conectar().createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while (rs.next())
			{
				Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3)};
				apartamento.add(linha);
			}
			state.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return apartamento;
	}

}
