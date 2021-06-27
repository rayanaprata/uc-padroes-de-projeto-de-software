
public class MarchaRe implements Cambio{

	@Override
	public Cambio aumentarMarcha() {
		return new Neutro();
	}

	@Override
	public Cambio diminuirMarcha() {
		return null;
	}

	@Override
	public Cambio desligar() {
		return new Desligado();
	}

	@Override
	public Cambio ligar() {
		return null;
	}

}
