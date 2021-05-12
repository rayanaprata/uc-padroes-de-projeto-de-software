package builder1;

public class Main {
	public static void main(String[] args) {
		Garcom garcom = new Garcom();        
		PizzaBuilder pizzaBuilder;
		Pizza pizza;

		pizzaBuilder = new CalabresaPizzaBuilder();
		garcom.setPizzaBuilder(pizzaBuilder);
		garcom.construirPizza();
		pizza = pizzaBuilder.getPizza();
		System.out.println(pizza);
		
		pizzaBuilder = new FrangoPizzaBuilder();
		garcom.setPizzaBuilder(pizzaBuilder);
		garcom.construirPizza();
		pizza = pizzaBuilder.getPizza();
		System.out.println(pizza);
		
		pizzaBuilder = new QuatroQueijosPizzaBuilder();
		garcom.setPizzaBuilder(pizzaBuilder);
		garcom.construirPizza();
		pizza = pizzaBuilder.getPizza();
		System.out.println(pizza);
	}
}
//SAIDA ESPERADA
//Massa: tradicional
//Molho: tomate
//Cobertura: calabresa

//Massa: com borda
//Molho: picante
//Cobertura: frango

//Massa: fina
//Molho: branco
//Cobertura: 4 Queijos