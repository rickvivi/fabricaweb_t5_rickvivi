package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class UsuarioDAO {

	public void cadastrar(Usuario usu) {
		Connection con = ConexaoDAO.getConnection();
		String sql = "insert into usuario (nome, login, senha) values (?,?,?)";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, usu.getNome());
			stmt.setString(2, usu.getLogin());
			stmt.setString(3, usu.getSenha());
			// Executando o comando SQL no Banco
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void alterar(Usuario usu) {
		Connection con = ConexaoDAO.getConnection();
		String sql = "update usuario set nome = ?, login = ?, senha = ? where id=?";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, usu.getNome());
			stmt.setString(2, usu.getLogin());
			stmt.setString(3, usu.getSenha());
			stmt.setInt(4, usu.getId());
			// Executando o comando SQL no Banco
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void excluir(Usuario usu) {
		Connection con = ConexaoDAO.getConnection();
		String sql = "delete from usuario where id = ?";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, usu.getId());
			
			// Executando o comando SQL no Banco
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
