
public class SegundaMarcha implements Cambio{

	@Override
	public Cambio aumentarMarcha() {
		return null;
	}

	@Override
	public Cambio diminuirMarcha() {
		return new PrimeiraMarcha();
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
