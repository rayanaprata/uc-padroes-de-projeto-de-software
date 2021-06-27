
public class Desligado implements Cambio{

	@Override
	public Cambio aumentarMarcha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cambio diminuirMarcha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cambio desligar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cambio ligar() {
		// TODO Auto-generated method stub
		return new Neutro();
	}

}
