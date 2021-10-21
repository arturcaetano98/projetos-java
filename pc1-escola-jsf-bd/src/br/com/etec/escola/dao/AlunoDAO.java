package br.com.etec.escola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.etec.escola.modelo.Aluno;

public class AlunoDAO {
	private Connection connection;

	public AlunoDAO() {
		
			this.connection = new ConnectionFactory().getConnection();
		
	}

	public AlunoDAO(Connection connection) {
		this.connection = connection;
	}

	public void insere(Aluno aluno) {
		try {
			PreparedStatement stmt = connection
					.prepareStatement("insert into aluno values (?,?,?)");
			//stmt.setString(1, null);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getTelefone());
			stmt.setString(3, aluno.getEmail());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Aluno aluno) {
		try {
			PreparedStatement stmt = this.connection
					.prepareStatement("delete from aluno where id=?");
			stmt.setInt(1, aluno.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void altera(Aluno aluno) {
		String sql = "update aluno set nome = ?, telefone=?, email = ? where id = ?";
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getTelefone());
			stmt.setString(3, aluno.getEmail());
			stmt.setLong(4, aluno.getId());
			stmt.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Aluno> getLista() {
		try {
			List<Aluno> alunos = new ArrayList<Aluno>();
			PreparedStatement stmt = this.connection
					.prepareStatement("select * from aluno");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Aluno aluno = new Aluno();
				// popula o objeto aluno
				aluno.setId(rs.getInt(1));
				aluno.setNome(rs.getString(2));
				aluno.setTelefone(rs.getString(3));
				aluno.setEmail(rs.getString(4));
				alunos.add(aluno);
			}
			rs.close();
			stmt.close();
			return alunos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
