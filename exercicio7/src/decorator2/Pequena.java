package decorator2;

public class Pequena extends Pizza {

	public Pequena(){
		setDescricao(this.descricao + " Pequena");
	}

	@Override
	public double getPreco() {
		return 11.9;
	}

}
