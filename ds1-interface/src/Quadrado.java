
public class Quadrado implements AreaCalculavel {
	
	private int lado;
	
	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}
	
}
