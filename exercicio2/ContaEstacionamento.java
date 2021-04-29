
public class ContaEstacionamento {
	
	Veiculo umVeiculo;
	String entrada, saida;
	
	public ContaEstacionamento(Veiculo umVeiculo, String entrada, String saida) {
		super();
		this.umVeiculo = umVeiculo;
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public Veiculo getUmVeiculo() {
		return umVeiculo;
	}

	public void setUmVeiculo(Veiculo umVeiculo) {
		this.umVeiculo = umVeiculo;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}


	void imprimirConta() {
		System.out.println("Placa: ");
		System.out.println("Entrada: ");
		System.out.println("Saída: ");
		System.out.println("Tempo Estacionado: ");
		System.out.println("Valor Pago: R$ ");
	}
	
}