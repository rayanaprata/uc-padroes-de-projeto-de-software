package facade1;

public class MainAntes {
	public static void main(String[] args) {

		Hotel hotel  = new Hotel();
		Florista florista = new Florista();
		Restaurante restaurante = new Restaurante();
		Musico musico = new Musico();

		if(hotel.isAvailable())
			hotel.reservarHotel();
		
		if(florista.isAvailable())
			florista.reservarFlorista();
		
		if(musico.isAvailable())
			musico.reservarMusico();
		
		if(restaurante.isAvailable())
			restaurante.reservarRestaurante();

		florista.selecionarFlores("Amarílis","Amor-perfeito","Azaléia");
		restaurante.definirMenu("Chinesa","Japonesa");
		musico.definirPlayList("Musica1", "Musica2", "Musica3", "Musica4");
		
		
	}


}
