package builder2;

public class MadeiraBuilder extends CasaBuilder {

	@Override
	public void buildAlicerce() {
		casa.setAlicerce("Barras de Madeira");
	}

	@Override
	public void buildEstrutura() {
		casa.setEstrutura("Blocos de Madeira");
	}

	@Override
	public void buildTelhado() {
		casa.setTelhado("Telhado de Madeira");
	}

	@Override
	public void buildInterior() {
		casa.setInterior("Lareira");
	}
	
} 
