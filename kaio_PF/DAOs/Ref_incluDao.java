package br.edu.ifcvideira.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifcvideira.beans.ref_inclu;
import br.edu.ifcvideira.utils.Conexao;

public class Ref_incluDao {
	public void CadastrarCliente(ref_inclu ri) throws SQLException, Exception{
		try{
	
			String sql = "INSERT INTO ref_inclu (tipo,valor) VALUES (?,?)";
			java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			
			sqlPrep.setString(1, ri.getTipo());
			sqlPrep.setDouble(2, ri.getValor());
			sqlPrep.execute();
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
			
		}
	}
	
	public void deletarCliente(ref_inclu ri) throws Exception{
		try{
			String sql = "DELETE FROM ref_inclu WHERE id=? ";
			PreparedStatement sqlPrep = (PreparedStatement) Conexao.conectar().prepareStatement(sql);
			sqlPrep.setInt(1, ri.getId());
			sqlPrep.execute();
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public List<Object> buscarTodos() throws SQLException, Exception{
		List<Object> ref_inclu = new ArrayList<Object>();
		try {
			String sql = "SELECT * FROM ref_inclu";
			java.sql.Statement state = Conexao.conectar().createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while (rs.next())
			{
				Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3)};
				ref_inclu.add(linha);
			}
			state.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return ref_inclu;
	}
	
}
