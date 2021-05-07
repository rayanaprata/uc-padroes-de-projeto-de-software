
public class Main {

	public static void main(String[] args) {
		Forma forma;

		Factory factory = new FormaFactory();

		forma = factory.getForma("CIRCULO");

		forma.desenhar();

		forma = factory.getForma("RETANGULO");

		forma.desenhar();

		forma = factory.getForma("QUADRADO");

		forma.desenhar();

		forma = factory.getForma("TRAPEZIO");

		forma.desenhar();
	}
}

//SAIDA ESPERADA
//Circulo::desenhar()
//Retangulo::desenhar()
//Quadrado::desenhar()
//Trapezio::desenhar()
