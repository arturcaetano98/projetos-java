package br.com.etec.escola.teste;

import br.com.etec.escola.dao.AlunoDAO;
import br.com.etec.escola.modelo.Aluno;

public class TestaInsere {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Artur");
		aluno.setTelefone("(11)1111-1111");
		aluno.setEmail("a@a.com");
		
		AlunoDAO dao = new AlunoDAO();
		dao.insere(aluno);
		
		System.out.print("Inserido...");

	}

}
