package br.edu.ifcvideira.DAOs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifcvideira.beans.Cliente;
import br.edu.ifcvideira.utils.Conexao;

public class ClienteDao {
		public void CadastrarCliente(Cliente c) throws SQLException, Exception{
			try {
				String sql= "INSERT INTO pessoa (nome, cpf, endereco, cidade, uf, pais, dt_nascimento,telefone) VALUES (?,?,?,?,?,?,?,?)";
				java.sql.PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
				
				String sql2="INSERT INTO cliente (profissao, id_pessoa) VALUES (?,?)";
				java.sql.PreparedStatement sqlPrep2 = Conexao.conectar().prepareStatement(sql2);
				
				
				sqlPrep.setString(1, c.getNome());
				sqlPrep.setString(2, c.getCpf());
				sqlPrep.setString(3, c.getEndereco());
				sqlPrep.setString(4, c.getCidade());
				sqlPrep.setString(5, c.getUf());
				sqlPrep.setString(6,c.getPais());
				sqlPrep.setString(7, c.getDt_nascimento());
				sqlPrep.setString(8, c.getTelefone());
				sqlPrep.execute();
				sqlPrep2.setString(1, c.getProfissao());
				sqlPrep2.setInt(2,RetornarCodigoPessoa());
				
				sqlPrep2.execute();
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null,e.getMessage());
			}
		}
		
		public void AlterarCliente(Cliente c) throws Exception {
			try{
				String sql = "UPDATE pessoa SET nome=?, cpf=?, endereco=?, cidade=?, uf=?, pais=?, dt_nascimento=?, telefone=? WHERE id=?";
				PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
				String sql2 ="UPDATE cliente SET profissao =? where id_pessoa=?";
				PreparedStatement sqlPrep2 = Conexao.conectar().prepareStatement(sql2);
				
				sqlPrep.setString(1, c.getNome());
				sqlPrep.setString(2, c.getCpf());
				sqlPrep.setString(3, c.getEndereco());
				sqlPrep.setString(4, c.getCidade());
				sqlPrep.setString(5, c.getUf());
				sqlPrep.setString(6,c.getPais());
				sqlPrep.setString(7, c.getDt_nascimento());
				sqlPrep.setString(8, c.getTelefone());
				sqlPrep2.setString(1,c.getProfissao());
				sqlPrep.setInt(9, c.getId_pessoa());
				sqlPrep.execute();
				
				sqlPrep.setInt(2, c.getId_pessoa());
				
				sqlPrep2.execute();
				
				sqlPrep.execute();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}

		public void deletarCliente(Cliente c) throws Exception{
			try{
				String sql = "DELETE FROM pessoa WHERE id=? ";
				PreparedStatement sqlPrep = (PreparedStatement) Conexao.conectar().prepareStatement(sql);
				String sql2 = "DELETE FROM cliente WHERE id=? ";
				PreparedStatement sqlPrep2 = (PreparedStatement) Conexao.conectar().prepareStatement(sql2);
				sqlPrep.setInt(1, c.getId_pessoa());
				sqlPrep2.setInt(1, c.getId_pessoa());
				sqlPrep.execute();
				sqlPrep2.execute();
			} catch (SQLException e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		public List<Object> buscarTodos() throws SQLException, Exception{
			List<Object> cliente = new ArrayList<Object>();
			try {
				String sql ="select pessoa.* ,cleinte.profisao from pessoa inner JOIN servidor";
				
				java.sql.Statement state = Conexao.conectar().createStatement();
				ResultSet rs = state.executeQuery(sql);
				
				while (rs.next())
				{
					Object[] linha = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
					cliente.add(linha);
				}
				state.close();
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			return cliente;
		}
		
		
		public int RetornarProximoCodigoCliente() throws Exception {
			try{
				String sql ="SELECT MAX(id_pessoa) AS codigo FROM cliente";
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
		
		public int RetornarCodigoPessoa() throws Exception {
			try{
				String sql ="SELECT MAX(id) AS codigo FROM pessoa ";
				PreparedStatement sqlPrep = Conexao.conectar().prepareStatement(sql);
				ResultSet rs = sqlPrep.executeQuery();
				
				if (rs.next()){
					return rs.getInt("codigo");
				}else if(rs.getInt("codigo")==Integer.parseInt(null)){
					return 1;
				}else {
					return 1;
				}
					
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
				return 1;
			}
		}
	}
