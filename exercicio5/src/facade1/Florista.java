package facade1;

public class Florista {
	
	public boolean isAvailable() {
		return true;
	}
	
	public void reservarFlorista() {
		System.out.println("Florista Reservado");
	}
	
	public void selecionarFlores(String...flores) {
		System.out.println("\nFlores selecionadas:");
		for (int i = 0; i < flores.length; i++) {
			System.out.println("-"+flores[i]);
		}
	}
	
	

}
