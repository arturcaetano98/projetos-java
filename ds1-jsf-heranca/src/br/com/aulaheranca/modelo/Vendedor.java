package br.com.aulaheranca.modelo;

public class Vendedor extends Funcionario{
	
	public double calculaBonificacao(){
		return super.getSalario() * 0.2;
	}
	
	public double calculaComissao(double valorVendido){
		return (valorVendido * 0.1);
	}
}
