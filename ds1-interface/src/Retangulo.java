
public class Retangulo implements AreaCalculavel {
	
	private int altura;
	private int largura;
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public double calculaArea() {
		return this.largura * this.altura;
	}
	
}
