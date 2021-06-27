
public class Fiesta extends Carro {
	
	public Fiesta(String motor, String suspensao, String direcao, String bateria) {
		super(motor, suspensao, direcao, bateria);
		this.nome="Fiesta";
		this.preco=69790.00;
	}
	
	public Fiesta(FabricaFiesta fabricaFiesta) {
		this.nome="Fiesta";
		this.preco=69790.00;
//		this.motor = fabricaFiesta.criarMotor();
//		this.suspensao = fabricaFiesta.criarSuspensao();
//		this.direcao = fabricaFiesta.criarDirecao();
//		this.bateria = fabricaFiesta.criarBateria();
	}

}
