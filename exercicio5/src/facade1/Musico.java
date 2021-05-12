package facade1;

public class Musico {
	
	public boolean isAvailable() {
		return true;
	}
		
	public void reservarMusico(){
		System.out.println("Músico Reservado");
	}

	public void definirPlayList(String...musicas) {
		System.out.println("\nMúsicas selecionadas:");
		for (int i = 0; i < musicas.length; i++) {
			System.out.println("-"+musicas[i]);
		}
	}
}
