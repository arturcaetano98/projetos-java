package br.com.etec.jdbc.teste;

import br.com.etec.jdbc.dao.ProdutoDAO;
import br.com.etec.jdbc.modelo.Produto;

public class TestaInsere {

	public static void main(String[] args) {
		
		// Instancia classe produto
		Produto produto = new Produto();
		
		// Descrição do Produto
		produto.setId(8);
		produto.setNome("Apple Iphone SE");
		produto.setDescricao("32GB de Memoria");
		produto.setPreco(599.0);
		
		// Envio do produto ao DAO (Objeto inteiro)
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.insere(produto);
		
		System.out.print("Produto Inserido com Sucesso!");
		System.out.print(dao.getLista());
	}

}
