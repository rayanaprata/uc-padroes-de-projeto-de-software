package builder1;

public abstract class PizzaBuilder {
    
	protected Pizza pizza = new Pizza();
	
	public abstract void buildMassa();
	public abstract void buildMolho();
	public abstract void buildCobertura();
	
	public Pizza getPizza() {
		return pizza;
	}
    
}