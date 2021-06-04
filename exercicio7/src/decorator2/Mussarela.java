package decorator2;

public class Mussarela extends PizzaDecorator {

	public Mussarela(Pizza umaPizza) {
		super(umaPizza);
		descricao = "Mussarela";
		preco = 1.00;
	}

}
