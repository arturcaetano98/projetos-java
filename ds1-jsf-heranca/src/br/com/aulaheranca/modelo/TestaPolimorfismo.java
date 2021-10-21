package br.com.aulaheranca.modelo;

public class TestaPolimorfismo {
	public static void main(String[] args){
		
		ControleBonificacoes controle = new ControleBonificacoes();
		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(2000.0); // Gerente recebe 2000
		controle.registra(funcionario1); // Registro do Gerente (funcionario1)
		
		Vendedor funcionario2 = new Vendedor();
		funcionario2.setSalario(1000.0); // Vendedor recebe 1000
		controle.registra(funcionario2); // Registro de Vendedor (funcionario2)
		
		System.out.print("Total de bonificacoes: "+controle.getTotalDeBonificacoes());

	}
	
}
