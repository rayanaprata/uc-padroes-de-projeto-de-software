
public class Main {

	public static void main(String[] args) {
		Carro carro;
		
		carro = new Kicks(new FabricaKicks());
		carro.getDescricao();
		
		System.out.println("*************************");
		
		carro = new TetoSolar(carro);
		carro.getDescricao();
		
		System.out.println("*************************");
		
		carro = new Fiesta(new FabricaFiesta());
		carro.getDescricao();
		
		System.out.println("*************************");
		
		carro = new VidroEletrico(carro);
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
