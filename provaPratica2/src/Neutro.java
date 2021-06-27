
public class Neutro implements Cambio{

	@Override
	public Cambio aumentarMarcha() {
		return new PrimeiraMarcha();
	}

	@Override
	public Cambio diminuirMarcha() {
		return new MarchaRe();
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
