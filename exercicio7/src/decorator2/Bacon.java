package decorator2;

public class Bacon extends PizzaDecorator {

	public Bacon(Pizza umaPizza) {
		super(umaPizza);
		descricao = "Bacon";
		preco = 2.00;
	}

}
