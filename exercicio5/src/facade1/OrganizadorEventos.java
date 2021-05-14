package facade1;

public class OrganizadorEventos {
	
	protected Hotel hotel  = new Hotel();
	protected Florista florista = new Florista();
	protected Restaurante restaurante = new Restaurante();
	protected Musico musico = new Musico();
	
	public void fazerReservas() {	
		
		if(hotel.isAvailable())
				hotel.reservarHotel();
		
		if(florista.isAvailable())
			florista.reservarFlorista();
		
		if(musico.isAvailable())
			musico.reservarMusico();

		if(restaurante.isAvailable())
			restaurante.reservarRestaurante();
	}
	 
	public void selecionarFlores(String...flores) {
		florista.selecionarFlores(flores);
	}
	
	public void definirMenu(String...comidas) {
		 restaurante.definirMenu(comidas);
	}
	
	public void definirPlayList(String...musicas) {
		 musico.definirPlayList(musicas);
	}
	
}
