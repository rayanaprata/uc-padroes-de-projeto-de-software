
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

/*

Considere o sistema de um estacionamento que precisa utilizar diversos 
critérios para calcular o valor que deve ser cobrado de seus clientes. 

Para um veículo de passeio, o valor deve ser calculado como R$2,00 
por hora, porém, caso o tempo seja maior do que 12 horas, será 
cobrada uma taxa diária de R$20,00 para cada dia. 

Além disso, pode-se implementar regras diferentes para mensalistas, 
caminhões, que dependem do número de eixos e do valor da carga 
carregada, e para veículos para muitos passageiros, como ônibus e 
vans. Faça um programa para fazer o cálculo do estacionamento para 
os veículos de passeio.


import java.text.SimpleDateFormat;


SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
Date dataFormatada;
formato.parse(entrada)

*/