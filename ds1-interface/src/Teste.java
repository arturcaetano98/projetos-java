
public class Teste {

	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		r.setAltura(3);
		r.setLargura(3);
		System.out.print("Retângulo: "+r.calculaArea());
		
		Quadrado q = new Quadrado();
		q.setLado(3);
		System.out.print("\nQuadrado: "+q.calculaArea());
		
		SomaAreas soma = new SomaAreas();
		soma.registraArea(q);
		soma.registraArea(r);
		
		System.out.print("\nTotal das Áreas: "+soma.getSomaAreas());

	}

}
