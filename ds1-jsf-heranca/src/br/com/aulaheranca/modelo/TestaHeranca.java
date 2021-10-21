package br.com.aulaheranca.modelo;

public class TestaHeranca {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(2000); // Gerente recebe 2000
		gerente.setGratificacao(200); // Gerente recebe 200 de gratificação
		double salarioFinalG = gerente.getSalario() + gerente.getGratificacao(); // 2200 (Somou os de cima)
		System.out.print("Salario Final do gerente é: "+salarioFinalG);
		
		Vendedor vendedor = new Vendedor();
		vendedor.setSalario(1000); // Vendedor recebe 1000
		vendedor.calculaComissao(1000); // vendedor recebe 1000 de comissão
		double salarioFinalV = vendedor.getSalario() + vendedor.calculaComissao(1000); // 1100 (Somou o salario com + (1000*0.1))
		System.out.print("\nSalario Final do vendedor é: "+salarioFinalV);

	}

}
