package br.com.aulaheranca.modelo;

public class Gerente extends Funcionario{
	
	private double gratificacao;
	
	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

	public double calculaBonificacao(){
		return super.getSalario() * 0.4;
	}

}
