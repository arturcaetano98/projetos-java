
public class SomaAreas {
	
	private int somaAreas = 0;
	
	public int getSomaAreas() {
		return somaAreas;
	}

	public void setSomaAreas(int somaAreas) {
		this.somaAreas = somaAreas;
	}
	
	void registraArea(AreaCalculavel area){
		somaAreas += area.calculaArea();
	}

}
