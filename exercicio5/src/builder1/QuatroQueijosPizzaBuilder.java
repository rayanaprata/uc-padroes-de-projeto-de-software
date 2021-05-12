package builder1;

public class QuatroQueijosPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildMassa() {
		pizza.setMassa("fina");
	}

	@Override
	public void buildMolho() {
		pizza.setMolho("branco");
	}

	@Override
	public void buildCobertura() {
		pizza.setCobertura("4 Queijos");
	}
    
}

//Massa: fina
//Molho: branco
//Cobertura: 4 Queijos