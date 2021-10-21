package br.com.etec.jdbc.dao;

// � necessario realizar esses imports para usar o getConnection()
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	// Metodo que realiza o retorno da conex�o ap�s a criar (fabrica de conex�es).
	public Connection getConnection(){
		
		//� necessario passsar corretamente a string de conex�o
		try {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} 
			return DriverManager.getConnection("jdbc:sqlserver://DESKTOP-JFIVRDG:1433;databaseName=jdbc;user=sa;password=haha123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}