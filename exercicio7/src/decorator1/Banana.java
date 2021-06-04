package decorator1;

public class Banana extends AcaiDecorator {

	public Banana(Acai umAcai) {
		super(umAcai);
		descricao = "Banana";
		preco = 1.50;
	}

}
