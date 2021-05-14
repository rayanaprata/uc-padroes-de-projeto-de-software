package builder2;

public class IglooBuilder extends CasaBuilder {

	@Override
	public void buildAlicerce() {
		casa.setAlicerce("Barras de Gelo");
	}

	@Override
	public void buildEstrutura() {
		casa.setEstrutura("Blocos de Gelo");
	}

	@Override
	public void buildTelhado() {
		casa.setTelhado("Telhado de Gelo");
	}

	@Override
	public void buildInterior() {
		casa.setInterior("Esculturas de Gelo");
	}
	 
} 