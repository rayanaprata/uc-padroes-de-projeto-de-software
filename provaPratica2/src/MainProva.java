
public class MainProva {

	public static void main(String[] args) {
		Carro carro;

		String motor = "Motor:\n" +
				" Dianteiro, transversal, 4 cilindros em linha, 16V, comando duplo, flex\n" + 
				" Cilindrada: 1.598 cm�\n" + 
				" Pot�ncia: 114  cv a 5.600 rpm\n" + 
				" Torque: 15,5 kgfm a 4.000 rpm";
		
		String suspensao= "Suspens�es:\n Independente McPherson na dianteira e eixo de tor��o na traseira";
		
		String direcao = "Dire��o:\n El�trica";
		
		String bateria ="Bateria:\n Moura";
		
		carro= new Kicks(motor, suspensao, direcao,bateria);
		carro.getDescricao();
		
		System.out.println("*************************");
		
		motor = "Motor:\n" +
				" Dianteiro, transversal, 3 cilindros em linha, 1.0, 12V, comando duplo, turbo, inje��o direta de gasolina.\n" +
				" Pot�ncia: 125 cv a 6.000 rpm\n" + 
				" Torque: 17,3 kgfm a 1.400 rpm";
		
		suspensao = "Suspens�es:\n Independente Multilink na dianteira e eixo de tor��o na traseira";

		direcao = "Dire��o:\n Hidr�ulica";
		
		bateria = "Bateria:\n ACDelco";
		
		carro= new Fiesta(motor, suspensao, direcao,bateria);
		carro.getDescricao();

		System.out.println("*************************");
			
		carro.acelerar(18);
		carro.aumentarMarcha();
		carro.ligar();
		carro.acelerar(18);
		carro.aumentarMarcha();
		carro.acelerar(30);
		carro.acelerar(70);
		carro.aumentarMarcha();
		carro.acelerar(80);
		carro.acelerar(35);
		carro.diminuirMarcha();
		carro.acelerar(35);
		carro.diminuirMarcha();
		carro.acelerar(35);
		carro.diminuirMarcha();
		carro.acelerar(20);
		carro.diminuirMarcha();
		carro.desligar();
		carro.acelerar(20);
		carro.diminuirMarcha();

	}

}
