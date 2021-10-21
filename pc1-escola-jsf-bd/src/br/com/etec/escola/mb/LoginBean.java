package br.com.etec.escola.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.etec.escola.modelo.Usuario;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	private Usuario usuario = new Usuario();
	

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public String efetuarLogin() {
		
		return "aluno";
		
	}

}
