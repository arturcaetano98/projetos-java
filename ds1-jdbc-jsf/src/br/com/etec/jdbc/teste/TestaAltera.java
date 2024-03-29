package br.com.etec.jdbc.teste;

import br.com.etec.jdbc.dao.ProdutoDAO;
import br.com.etec.jdbc.modelo.Produto;

public class TestaAltera {

	public static void main(String[] args){
		
		// Instancia classe produto
		Produto produto = new Produto();
		
		// Descri��o do Produto
		produto.setId(1);  // Necessario passar a chave do que ser� alterado.
		produto.setNome("Notebook Lenovo Legion");
		produto.setDescricao("Intel Core i7 - GTX1050");
		produto.setPreco(3799.0);
		
		// Envio do produto ao DAO (Objeto inteiro)
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.altera(produto);
		
		System.out.print("Produto Alterado com Sucesso!");
	}

}
