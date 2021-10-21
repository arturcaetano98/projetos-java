package br.com.etec.jdbc.teste;

import br.com.etec.jdbc.dao.ProdutoDAO;
import br.com.etec.jdbc.modelo.Produto;

public class TestaInsere {

	public static void main(String[] args){
		
		// Instancia classe produto
		Produto produto = new Produto();
				
		// Descrição do Produto
		produto.setNome("Controle Xbox Series X");
		produto.setDescricao("Original Microsoft");
		produto.setPreco(279.00);
				
		// Envio do produto ao DAO (Objeto inteiro)
		ProdutoDAO dao = new ProdutoDAO();
				
		dao.insere(produto);
				
		System.out.print("Produto Inserido com Sucesso!");
	}

}
