package builder2;

public class AlvenariaBuilder extends CasaBuilder {

	@Override
	public void buildAlicerce() {
		casa.setAlicerce("Barras de Ferro");
	}

	@Override
	public void buildEstrutura() {
		casa.setEstrutura("Blocos de Cimento");
	}

	@Override
	public void buildTelhado() {
		casa.setTelhado("Telhado de Barro");
	}

	@Override
	public void buildInterior() {
		casa.setInterior("Churrasqueira");
	}
	
} 