package facade1;

public class Restaurante {
	
	public boolean isAvailable() {
		return true;
	}
	
	public void reservarRestaurante() {
		System.out.println("Restaurante Reservado");
	}
	
	public void definirMenu(String...comidas) {
		System.out.println("\nComidas selecionadas:");
		for (int i = 0; i < comidas.length; i++) {
			System.out.println("-"+comidas[i]);
		}
	}

}
