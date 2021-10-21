package br.com.aulaheranca.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.aulaheranca.modelo.ControleBonificacoes;
import br.com.aulaheranca.modelo.Gerente;
import br.com.aulaheranca.modelo.Vendedor;

@ManagedBean(name="bonificacaoBean")
@SessionScoped

public class BonificacaoBean {
	
	private double salarioVendedor;
	private double salarioGerente;
	private double totalBonificacao;
	
	public double getSalarioVendedor() {
		return salarioVendedor;
	}

	public void setSalarioVendedor(double salarioVendedor) {
		this.salarioVendedor = salarioVendedor;
	}

	public double getSalarioGerente() {
		return salarioGerente;
	}

	public void setSalarioGerente(double salarioGerente) {
		this.salarioGerente = salarioGerente;
	}

	public double getTotalBonificacao() {
		return totalBonificacao;
	}

	public void setTotalBonificacao(double totalBonificacao) {
		this.totalBonificacao = totalBonificacao;
	}

	public void registrar(){
		ControleBonificacoes c = new ControleBonificacoes();
		
		Gerente f1 = new Gerente();
		f1.setSalario(this.getSalarioGerente());
		c.registra(f1);
		
		Vendedor f2 = new Vendedor();
		f2.setSalario(this.getSalarioVendedor()); 
		c.registra(f2);
		
		this.totalBonificacao = c.getTotalDeBonificacoes();
	}
	
}
