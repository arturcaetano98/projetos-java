package br.com.etec.jdbc.mb;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.etec.jdbc.dao.ProdutoDAO;
import br.com.etec.jdbc.modelo.Produto;

@ManagedBean(name="produtoBean")
@SessionScoped
public class ProdutoBean {
	
	private Produto produto = new Produto();
	ProdutoDAO dao = new ProdutoDAO();
	private List<Produto> produtos;
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	// A alteração está contida neste metodo
	public String grava() throws ClassNotFoundException{
		if(produto.getId() == 0){
			dao.insere(produto);
			this.produto = new Produto();
			this.produtos = dao.getLista();
		}
		else{
			dao.altera(produto); //alteração
			this.produto = new Produto();
			this.produtos = dao.getLista();
		}
		return "listar?faces-redirect=true";
	}
	
	public List<Produto> getProdutos(){
		if(produtos == null){
			produtos = dao.getLista();
		}
		return produtos;
	}
	
	public void remove() throws ClassNotFoundException{
		dao.remove(produto);
		this.produto = new Produto();
		this.produtos = dao.getLista();
	}
	
	public String redireciona(){
		return "preencher?faces-redirect=true";
	}
	
}
