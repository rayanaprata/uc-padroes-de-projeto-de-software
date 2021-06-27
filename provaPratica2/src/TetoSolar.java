
public class TetoSolar extends CarroDecorator{
	
	public TetoSolar(Carro umCarro) {
		super(umCarro);
		opcional = "Opcional:\n Teto Solar";
	}

	public TetoSolar(String motor, String suspensao, String direcao, String bateria) {
		super(motor, suspensao, direcao, bateria);
	}
	
}
