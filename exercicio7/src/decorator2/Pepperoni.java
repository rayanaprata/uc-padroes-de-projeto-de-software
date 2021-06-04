package decorator2;

public class Pepperoni extends PizzaDecorator {

	public Pepperoni(Pizza umaPizza) {
		super(umaPizza);
		descricao = "Pepperoni";
		preco = 3.00;
	}

}
