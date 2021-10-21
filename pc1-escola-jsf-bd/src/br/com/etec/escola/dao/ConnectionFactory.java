package br.com.etec.escola.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		try{
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return DriverManager.getConnection
					("jdbc:sqlserver://DESKTOP-JFIVRDG:1433;databaseName=escola;user=sa;password=haha123");
		}
		catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}
