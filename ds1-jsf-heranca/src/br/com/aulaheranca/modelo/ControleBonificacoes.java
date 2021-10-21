package br.com.aulaheranca.modelo;

public class ControleBonificacoes {
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario){
		this.totalDeBonificacoes = this.totalDeBonificacoes + funcionario.calculaBonificacao();
	}
	
	public double getTotalDeBonificacoes(){
		return this.totalDeBonificacoes;
	}
}
