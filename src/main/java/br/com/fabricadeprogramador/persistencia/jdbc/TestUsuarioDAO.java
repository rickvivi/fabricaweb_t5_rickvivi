package br.com.fabricadeprogramador.persistencia.jdbc;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}

	public static void testCadastrar() {

		Usuario usu = new Usuario();
		usu.setNome("beto");
		usu.setLogin("beto");
		usu.setSenha("123456");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cadastrado com Sucesso");
	}

	public static void testAlterar() {

		Usuario usu = new Usuario();
		usu.setId(4);
		usu.setNome("mercedes");
		usu.setLogin("meme");
		usu.setSenha("123456");

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com Sucesso");
	}
	
	public static void testExcluir() {

		Usuario usu = new Usuario();
		usu.setId(5);

		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com Sucesso");
	}

}
