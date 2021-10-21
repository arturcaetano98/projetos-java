package br.com.etec.jsf.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

// 
@ManagedBean(name="camposBean")
@SessionScoped
public class CamposBean {
	
	private String campoSenha;
	private int tentativas = 0;
	private String campoResposta;
	
	// Private porque só essa classe enxerga.
	// Static porque apenas a classe poderá manipula-lo (e não objetos).
	// Final porque é uma constante.
	private static final String senhaCorreta = "123456"; 
	
	public String getCampoSenha() {
		return campoSenha;
	}

	public void setCampoSenha(String campoSenha) {
		this.campoSenha = campoSenha;
	}

	public int getTentativas() {
		return tentativas;
	}

	public void setTentativas(int tentativas) {
		this.tentativas = tentativas;
	}

	public String getCampoResposta() {
		return campoResposta;
	}

	public void setCampoResposta(String campoResposta) {
		this.campoResposta = campoResposta;
	}

	public void validarCampo(){
		if (this.campoSenha.equals(senhaCorreta) && this.tentativas <= 2){
			this.campoResposta = "Senha Correta. Acesso Liberado!";
		}
		else{
			if(this.tentativas >= 3){
				this.campoResposta = "Acesso bloqueado...";
				this.tentativas = this.tentativas + 1;
				return;
			}
			this.campoResposta = "Senha incorreta";
			this.tentativas = this.tentativas + 1;
		}
	}
}
