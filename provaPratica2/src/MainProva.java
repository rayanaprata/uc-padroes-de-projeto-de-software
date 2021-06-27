
public class MainProva {

	public static void main(String[] args) {
		Carro carro;

		String motor = "Motor:\n" +
				" Dianteiro, transversal, 4 cilindros em linha, 16V, comando duplo, flex\n" + 
				" Cilindrada: 1.598 cm³\n" + 
				" Potência: 114  cv a 5.600 rpm\n" + 
				" Torque: 15,5 kgfm a 4.000 rpm";
		
		String suspensao= "Suspensões:\n Independente McPherson na dianteira e eixo de torção na traseira";
		
		String direcao = "Direção:\n Elétrica";
		
		String bateria ="Bateria:\n Moura";
		
		carro= new Kicks(motor, suspensao, direcao,bateria);
		carro.getDescricao();
		
		System.out.println("*************************");
		
		motor = "Motor:\n" +
				" Dianteiro, transversal, 3 cilindros em linha, 1.0, 12V, comando duplo, turbo, injeção direta de gasolina.\n" +
				" Potência: 125 cv a 6.000 rpm\n" + 
				" Torque: 17,3 kgfm a 1.400 rpm";
		
		suspensao = "Suspensões:\n Independente Multilink na dianteira e eixo de torção na traseira";

		direcao = "Direção:\n Hidráulica";
		
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
