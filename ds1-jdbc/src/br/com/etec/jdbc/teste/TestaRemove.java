package br.com.etec.jdbc.teste;

import br.com.etec.jdbc.dao.ProdutoDAO;
import br.com.etec.jdbc.modelo.Produto;

public class TestaRemove {

	public static void main(String[] args) {
		
		// Instancia classe produto
		Produto produto = new Produto();
		
		// Descrição do Produto
		produto.setId(7);  // Necessario passar a chave do que será removido.
		
		// Envio do produto ao DAO (Objeto inteiro)
		ProdutoDAO dao = new ProdutoDAO();
		
		dao.remove(produto);
		
		System.out.print("Produto Removido com Sucesso!");
		System.out.print(dao.getLista()+" \n");
	}

}
