package decorator2;

public class Oregano extends PizzaDecorator {

	public Oregano(Pizza umaPizza) {
		super(umaPizza);
		descricao = "Oregano";
		preco = 0.10;
	}

}
