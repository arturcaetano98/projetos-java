package br.com.etec.jdbc.dao;
import br.com.etec.jdbc.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {
	
	private Connection connection;
	
	// Construtor da Classe (GCFS)
	public ProdutoDAO(){
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void insere(Produto produto){
		try{
			// Interrogações porque não sabemos o que sera inserido.
			PreparedStatement stmt = connection.prepareStatement("insert into produto values (?, ?, ?, ?)");
			
			// Passagem dos valores a serem inseridos
			stmt.setInt(1, produto.getId()); 			// Chave primaria
			stmt.setString(2, produto.getNome()); 		// Nome do produto
			stmt.setString(3, produto.getDescricao()); 	// Descrição do produto
			stmt.setDouble(4, produto.getPreco()); 		// Preço do produto
			stmt.execute(); 							// Execução das inclusões
			stmt.close();								// Fechamento da Conexão
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void remove(Produto produto){
		try{
			// Interrogações porque não sabemos o que sera removido.
			PreparedStatement stmt = connection.prepareStatement("delete from produto where id = ?");
			
			// Passagem dos valores a serem removidos
			stmt.setInt(1, produto.getId()); 			// Chave primaria
			stmt.execute(); 							// Execução das exclusão
			stmt.close();								// Fechamento da Conexão
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public void altera(Produto produto){
		try{
			// Interrogações porque não sabemos o que sera editado.
			PreparedStatement stmt = connection.prepareStatement("update produto set nome=?, descricao=?, preco=? where id = ?");
			
			// Passagem dos valores a serem editados
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.setDouble(3, produto.getPreco());
			stmt.setInt(4, produto.getId());
			stmt.execute(); 							// Execução das exclusão
			stmt.close();								// Fechamento da Conexão
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public List<Produto> getLista(){
		try{
		List<Produto> produtos = new ArrayList<Produto>();
		PreparedStatement stmt = this.connection.prepareStatement("select * from produto");
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()){
			Produto produto = new Produto();
			produto.setId(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setDescricao(rs.getString(3));
			produto.setPreco(rs.getDouble(4));
			produtos.add(produto);
		}
		
		rs.close();
		stmt.close();
		return produtos;
	}
		catch(SQLException e){
			throw new RuntimeException(e);
		}

	}
	
}
