
public class Kicks extends Carro {
	
	public Kicks(FabricaKicks fabricaKicks) {
		this.nome="Kicks";
		this.preco=89990.00;
//		this.motor = fabricaKicks.criarMotor();
//		this.suspensao = fabricaKicks.criarSuspensao();
//		this.direcao = fabricaKicks.criarDirecao();
//		this.bateria = fabricaKicks.criarBateria();
	}
	
	public Kicks(String motor, String suspensao, String direcao, String bateria) {
		super(motor, suspensao, direcao, bateria);
		this.nome="Kicks";
		this.preco=89990.00;
	}
	
}
