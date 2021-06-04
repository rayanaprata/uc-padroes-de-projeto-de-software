package decorator2;

public class Media extends Pizza{
	
	public Media(){
		setDescricao(this.descricao + " Media");
	}

	@Override
	public double getPreco() {
		return 13.9;
	}

}
