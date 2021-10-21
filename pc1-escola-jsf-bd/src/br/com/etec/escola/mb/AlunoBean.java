package br.com.etec.escola.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.etec.escola.dao.AlunoDAO;
import br.com.etec.escola.modelo.Aluno;

@ManagedBean(name="alunoBean")
@ViewScoped
public class AlunoBean {

	private Aluno aluno = new Aluno();
	private AlunoDAO dao = new AlunoDAO();
	private List<Aluno> alunos;

	public String grava(){
		if (aluno.getId() == 0)
			dao.insere(aluno);
		else
			dao.altera(aluno);
		this.aluno= new Aluno();
		this.alunos = dao.getLista();
		return "alunos?faces-redirect=true";
	}
	
	public void remove(){
		dao.remove(aluno);
		this.aluno= new Aluno();
		this.alunos = dao.getLista();
	}
	
	public List<Aluno> getAlunos(){
		if (alunos==null){
			alunos = dao.getLista();
		}
		return alunos;
	}
	
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
