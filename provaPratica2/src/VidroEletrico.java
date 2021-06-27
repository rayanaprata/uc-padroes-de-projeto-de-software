
public class VidroEletrico extends CarroDecorator {

	public VidroEletrico(Carro umCarro) {
		super(umCarro);
		opcional = "Opcional:\n Vidro Elétrico";
	}
	
	public VidroEletrico(String motor, String suspensao, String direcao, String bateria) {
		super(motor, suspensao, direcao, bateria);
	}

}
