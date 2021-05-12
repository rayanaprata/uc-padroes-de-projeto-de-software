package facade2;

public class SemFacade {
	public static void main(String[] args) {
		Forma circulo;
		Forma retangulo;
		Forma quadrado;
		Forma trapezio;

		circulo = new Circulo();
		retangulo = new Retangulo();
		quadrado = new Quadradro();
		trapezio = new Trapezio();

		circulo.desenhar();
		retangulo.desenhar();
		quadrado.desenhar();
		trapezio.desenhar();

	}
}

