package br.edu.ifcvideira.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifcvideira.beans.Servidor;
import br.edu.ifcvideira.utils.Conexao;

public class ServidorDao {
	public void CadastrarServidor(Servidor s) throws SQLException, Exception{
		try {
			String sql= "INSERT INTO pessoa (nome, cpf, endereco, cidade, uf, pais, dt_nascimento,telefone) VALUES (?,?,?,?,?,?,?,?)";
			java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			
			String sql2="INSERT INTO servidor (num_carteiraTrabalho, id_pessoa) VALUES (?,?)";
			java.sql.PreparedStatement sqlPrep2 = Conexao.conectar().prepareStatement(sql2);
			
			
			sqlPrep.setString(1, s.getNome());
			sqlPrep.setString(2, s.getCpf());
			sqlPrep.setString(3, s.getEndereco());
			sqlPrep.setString(4, s.getCidade());
			sqlPrep.setString(5, s.getUf());
			sqlPrep.setString(6,s.getPais());
			sqlPrep.setString(7, s.getDt_nascimento());
			sqlPrep.setString(8, s.getTelefone());
			sqlPrep.execute();
			sqlPrep2.setString(1, s.getNum_carteiraTrabalho());
			sqlPrep2.setInt(2,RetornarCodigoPessoa());
			
			sqlPrep2.execute();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
	}
	
	public void AlterarServidor(Servidor s) throws Exception {
		try{
			String sql = "UPDATE pessoa SET nome=?, cpf=?, endereco=?, cidade=?, uf=?, pais=?, dt_nascimento=?, telefone=? WHERE id=?";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			String sql2 ="UPDATE servidor SET num_carteiraTrabalho =? where id_pessoa=?";
			PreparedStatement sqlPrep2 = Conexao.conectar().prepareStatement(sql2);
			
			sqlPrep.setString(1, s.getNome());
			sqlPrep.setString(2, s.getCpf());
			sqlPrep.setString(3, s.getEndereco());
			sqlPrep.setString(4, s.getCidade());
			sqlPrep.setString(5, s.getUf());
			sqlPrep.setString(6,s.getPais());
			sqlPrep.setString(7, s.getDt_nascimento());
			sqlPrep.setString(8, s.getTelefone());
			sqlPrep.setInt(9, s.getId());
			sqlPrep.execute();
			sqlPrep2.setString(1, s.getNum_carteiraTrabalho());
			sqlPrep2.setInt(2, s.getId());
			
			sqlPrep2.execute();
			
			sqlPrep.execute();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public void deletarCliente(Servidor s) throws Exception{
		try{
			String sql = "DELETE FROM pessoa WHERE id=? ";
			PreparedStatement sqlPrep = (PreparedStatement) Conexao.conectar().prepareStatement(sql);
			String sql2 = "DELETE FROM servidor WHERE id_pessoa=? ";
			PreparedStatement sqlPrep2 = (PreparedStatement) Conexao.conectar().prepareStatement(sql2);
			sqlPrep.setInt(1, s.getId());
			sqlPrep2.setInt(1, s.getId());
			sqlPrep2.execute();
			sqlPrep.execute();
			
		} catch (SQLException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public List<Object> buscarTodos() throws SQLException, Exception{
		List<Object> servidor = new ArrayList<Object>();
		try {
			String sql ="select pessoa.* ,servidor.num_carteiraTrabalho from pessoa inner JOIN servidor where pessoa.id=servidor.id_pessoa";
			java.sql.Statement state = Conexao.conectar().createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while (rs.next())
			{
				Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
				servidor.add(linha);
			}
			state.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return servidor;
	}
	
	public List<Object> buscarTodos1() throws SQLException, Exception{
		List<Object> servidor1 = new ArrayList<Object>();
		try {
			String sql ="select pessoa.nome ,pessoa.CPF, servidor.id_pessoa from pessoa inner JOIN servidor where pessoa.id=servidor.id_pessoa";
			java.sql.Statement state = Conexao.conectar().createStatement();
			ResultSet rs = state.executeQuery(sql);
			
			while (rs.next())
			{
				Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3)};
				servidor1.add(linha);
			}
			state.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return servidor1;
	}
	
	
	public int RetornarProximoCodigoServidor() throws Exception {
		try{
			String sql ="SELECT MAX(id_pessoa) AS codigo FROM servidor";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = sqlPrep.executeQuery();
			
			if (rs.next()){
				return rs.getInt("codigo") +1;
			}else{
				return 1;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 1;
		}
	}
	
	public int RetornarCodigoPessoa() throws Exception {
		try{
			String sql ="SELECT MAX(id) AS codigo FROM pessoa ";
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
	public int RetornarCodigoPessoa1() throws Exception {
		try{
			String sql ="SELECT MAX(id) AS codigo FROM pessoa ";
			PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = sqlPrep.executeQuery();
			
			if (rs.next()){
				return rs.getInt("codigo")+1;
			}else{
				return 1;
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return 1;
		}
	}
}
