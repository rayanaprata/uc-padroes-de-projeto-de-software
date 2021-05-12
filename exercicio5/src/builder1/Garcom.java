package builder1;

public class Garcom {

	protected PizzaBuilder cozinha;
	
	public void setPizzaBuilder(PizzaBuilder cozinha) {
		this.cozinha = cozinha;
	}
	
	public void construirPizza() {
		cozinha.buildMassa();
		cozinha.buildMolho();
		cozinha.buildCobertura();
	}
	
	public Pizza getPizza() {
		return cozinha.getPizza();
	}
	
}