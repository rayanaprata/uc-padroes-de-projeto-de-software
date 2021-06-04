package decorator2;

public class Grande extends Pizza{
	
	public Grande(){
		setDescricao(this.descricao + " Grande");
	}

	@Override
	public double getPreco() {
		return 15.9;
	}

}
