
public class ContaEstacionamento {

	Veiculo umVeiculo;
	String entrada;
	String saida;	
	CalculoValor estrategiaDeCalculo;

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
		System.out.println("Placa: " + umVeiculo.getPlaca());
		System.out.println("Entrada: " + entrada);
		System.out.println("Saída: " + saida);
		
		switch (umVeiculo.tipo) {
		case PASSEIO:
			estrategiaDeCalculo.calcular(entrada, saida);
			break;
		case MENSALISTAS:
			//caso o sistema não fosse apenas para veículos de passeio, seria implementado
			break;
		case CAMINHOES:
			//caso o sistema não fosse apenas para veículos de passeio, seria implementado
			break;
		default:
			throw new RuntimeException("Tipo não encontrado!");
		}		
		
	}

	public CalculoValor getEstrategiaDeCalculo() {
		return estrategiaDeCalculo;
	}

	public void setEstrategiaDeCalculo(CalculoValor estrategiaDeCalculo) {
		this.estrategiaDeCalculo = estrategiaDeCalculo;
	}

}