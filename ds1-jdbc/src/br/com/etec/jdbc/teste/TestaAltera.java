package br.com.etec.jdbc.teste;

import br.com.etec.jdbc.dao.ProdutoDAO;
import br.com.etec.jdbc.modelo.Produto;

public class TestaAltera {

	public static void main(String[] args) {
		
		// Instancia classe produto
		Produto produto = new Produto();
		
		// Descrição do Produto
		produto.setId(4);  // Necessario passar a chave do que será alterado.
		produto.setNome("Notebook Gamer Acer VX5");
		produto.setDescricao("Intel Core i7 - GTX1050");
		produto.setPreco(3899.0);
		
		// Envio do produto ao DAO (Objeto inteiro)
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.altera(produto);
		
		System.out.print("Produto Alterado com Sucesso!");
		System.out.print(dao.getLista());
	}

}
