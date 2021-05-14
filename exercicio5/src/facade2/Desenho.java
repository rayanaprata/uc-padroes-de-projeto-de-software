package facade2;

public class Desenho {

	Forma circulo = new Circulo();
	Forma retangulo = new Retangulo();
	Forma quadrado = new Quadradro();
	Forma trapezio = new Trapezio();
	
	public void desenharCirculo() {
		circulo.desenhar();
	}
	
	public void desenharRetangulo() {
		retangulo.desenhar();
	}
	
	public void desenharQuadrado() {
		quadrado.desenhar();
	}
	
	public void desenharTrapezio() {
		trapezio.desenhar();
	}
	
}