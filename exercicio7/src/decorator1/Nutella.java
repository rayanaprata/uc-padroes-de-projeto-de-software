package decorator1;

public class Nutella extends AcaiDecorator {

	public Nutella(Acai umAcai) {
		super(umAcai);
		descricao = "Nutella";
		preco = 1.00;
	}

}
