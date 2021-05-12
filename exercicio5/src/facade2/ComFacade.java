package facade2;

public class ComFacade {
	public static void main(String[] args) {
		Desenho desenho = new Desenho();

		desenho.desenharCirculo();
		desenho.desenharRetangulo();
		desenho.desenharQuadrado();	
		desenho.desenharTrapezio();
	}
}

//SAIDA ESPERADA
//Circulo::desenhar()
//Retangulo::desenhar()
//Quadrado::desenhar()
//Trapezio::desenhar()
