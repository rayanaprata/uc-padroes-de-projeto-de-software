package decorator1;

public class Granola extends AcaiDecorator {

	public Granola(Acai umAcai) {
		super(umAcai);
		descricao = "Granola";
		preco = 1.00;
	}

}
