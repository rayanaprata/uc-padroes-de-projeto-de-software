package builder1;

public class CalabresaPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildMassa() {
		pizza.setMassa("tradicional");
	}

	@Override
	public void buildMolho() {
		pizza.setMolho("tomate");
	}

	@Override
	public void buildCobertura() {
		pizza.setCobertura("calabresa");
	}
    
}

//Massa: tradicional
//Molho: tomate
//Cobertura: calabresa