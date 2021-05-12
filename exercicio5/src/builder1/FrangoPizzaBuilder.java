package builder1;

public class FrangoPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildMassa() {
		pizza.setMassa("com borda");
	}

	@Override
	public void buildMolho() {
		pizza.setMolho("picante");
	}

	@Override
	public void buildCobertura() {
		pizza.setCobertura("frango");
	}
    
}

//Massa: com borda
//Molho: picante
//Cobertura: frango