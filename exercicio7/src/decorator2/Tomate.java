package decorator2;

public class Tomate extends PizzaDecorator {

	public Tomate(Pizza umaPizza) {
		super(umaPizza);
		descricao = "Tomate";
		preco = 0.50;
	}

}
