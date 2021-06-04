package decorator2;

public class CreamCheese extends PizzaDecorator {

	public CreamCheese(Pizza umaPizza) {
		super(umaPizza);
		descricao = "Cream Cheese";
		preco = 1.20;
	}

}
