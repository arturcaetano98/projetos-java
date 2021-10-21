package br.com.aulaheranca.mb;

import br.com.aulaheranca.modelo.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="vendedorBean")
@SessionScoped
public class VendedorBean {
	
	private String nome;
	private double salario;
	private double valorVendas;
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
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalariofinal(double salariofinal) {
		this.salarioFinal = salariofinal;
	}
	
	public void calcula(){
		Vendedor v = new Vendedor();
		v.setNome(this.getNome());
		v.setSalario(this.getSalario());
		this.salarioFinal = v.getSalario() + v.calculaComissao(this.getValorVendas());
	}
	
}
