package br.com.aulaheranca.mb;

import br.com.aulaheranca.modelo.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="gerenteBean")
@SessionScoped
public class GerenteBean {
	
	private String nome;
	private double salario;
	private double gratificacao;
	private double salarioFinal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getGratificacao() {
		return gratificacao;
	}
	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}
	public double getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
	public void calcula(){
		Gerente g = new Gerente();
		g.setNome(this.getNome());
		g.setSalario(this.getSalario());
		g.setGratificacao(this.getGratificacao());
		this.salarioFinal = g.getSalario() + g.getGratificacao();
	}
	
}
