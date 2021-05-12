package facade1;

public class MainDepois {
	
	public static void main(String[] args) {
		
		OrganizadorEventos organizador = new OrganizadorEventos();
		organizador.fazerReservas();
		organizador.selecionarFlores("Amarílis","Amor-perfeito","Azaléia");
		organizador.definirMenu("Chinesa","Japonesa");
		organizador.definirPlayList("Musica1", "Musica2", "Musica3", "Musica4");
				
	}

}
//SAIDA ESPERADA
//Hotel Reservado
//Florista Reservado
//Músico Reservado
//Restaurante Reservado
//
//Flores selecionadas:
//-Amarílis
//-Amor-perfeito
//-Azaléia
//
//Músicas selecionadas:
//-Chinesa
//-Japonesa
//
//Comidas selecionadas:
//-Musica1
//-Musica2
//-Musica3
//-Musica4