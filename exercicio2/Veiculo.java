enum TipoVeiculo {
	PASSEIO,
	MENSALISTAS,
	CAMINHOES
}

public class Veiculo {
	
	String placa;
	TipoVeiculo tipo;
	
	public Veiculo(String placa, TipoVeiculo tipo) {
		super();
		this.placa = placa;
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public TipoVeiculo getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	
}
