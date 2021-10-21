package br.com.etec.escola.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.etec.escola.dao.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("conexao aberta");
		connection.close();
		
	
	}

}
