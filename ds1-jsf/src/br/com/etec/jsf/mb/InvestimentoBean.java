package br.com.etec.jsf.mb;

import br.com.etec.jsf.modelo.Investimento;
import java.text.DecimalFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="investimentoBean")
@SessionScoped
public class InvestimentoBean {
	
	private Investimento investimento = new Investimento();
	private String resultado;
	
	
	public double getValor() {
		return investimento.getValor();
	}
	
	public void setValor(double valor) {
		investimento.setValor(valor);
	}
	
	public String getTipo() {
		return investimento.getTipo();
	}
	
	public void setTipo(String tipo) {
		investimento.setTipo(tipo);
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	private double poupanca(){
		return investimento.getValor() * 1.03;
	}
	
	private double rendaFixa(){
		return investimento.getValor() * 1.04;
	}
	
	public void calcula(){
		DecimalFormat df = new DecimalFormat("R$ 0.00");
		if (investimento.getTipo().equals("poupanca")){
			this.resultado = "Valor reajustado para: "+df.format(this.poupanca());
		}
		else{
			this.resultado = "Valor reajustado para: "+df.format(this.rendaFixa());
		}
	}
}
