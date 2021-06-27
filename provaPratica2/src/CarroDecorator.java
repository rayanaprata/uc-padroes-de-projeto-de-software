
public abstract class CarroDecorator extends Carro {
	
	public Carro carro;
	
	public CarroDecorator(Carro umCarro) {
		carro = umCarro;
	}
	
	public CarroDecorator(String motor, String suspensao, String direcao, String bateria) {
		
	}

	public String getOpcional() {
        return carro.getOpcional() + opcional;
    }
	
}
