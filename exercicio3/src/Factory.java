
public interface Forma getForma(String str) {
	
	if(str.equalsIgnoreCase("CIRCULO")) {
		return new Circulo();
	}else if(str.equalsIgnoreCase("QUADRADO")) {
		return new Quadrado();
	}else if(str.equalsIgnoreCase("RETANGULO")) {
		return new Retangulo();
	}else if(str.equalsIgnoreCase("TRAPEZIO")) {
		return new Trapezio();
	}
	
	return null;
	
}