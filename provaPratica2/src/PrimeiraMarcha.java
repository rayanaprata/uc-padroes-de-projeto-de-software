
public class PrimeiraMarcha implements Cambio{

	@Override
	public Cambio aumentarMarcha() {
		return new SegundaMarcha();
	}

	@Override
	public Cambio diminuirMarcha() {
		return new Neutro();
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

