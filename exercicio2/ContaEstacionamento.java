import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ContaEstacionamento {

	SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date dataEntrada, dataSaida;

	Veiculo umVeiculo;
	String entrada;
	String saida;

	String tempoEstacionado;
	long hours, days, valor;

	CalculoHoras calculoHoras = new CalculoHoras();
	CalculoDiaria calculoDiaria = new CalculoDiaria();

	public ContaEstacionamento(Veiculo umVeiculo, String entrada, String saida) {
		super();
		this.umVeiculo = umVeiculo;
		this.entrada = entrada;
		this.saida = saida;

		try {
			dataEntrada = dataFormatada.parse(entrada);
			dataSaida = dataFormatada.parse(saida);
		} catch (ParseException e) {
			System.out.println("Erro no cálculo de datas.");
			e.printStackTrace();
		}

		@SuppressWarnings("deprecation")
		LocalDateTime oldDate = LocalDateTime.of(dataEntrada.getYear(), dataEntrada.getMonth(), dataEntrada.getDay(),
				dataEntrada.getHours(), dataEntrada.getMinutes(), dataEntrada.getSeconds());

		@SuppressWarnings("deprecation")
		LocalDateTime newDate = LocalDateTime.of(dataSaida.getYear(), dataSaida.getMonth(), dataSaida.getDay(),
				dataSaida.getHours(), dataSaida.getMinutes(), dataSaida.getSeconds());

		hours = ChronoUnit.HOURS.between(oldDate, newDate);
		days = ChronoUnit.DAYS.between(oldDate, newDate);
		
		switch (umVeiculo.tipo) {
		case PASSEIO:
			
			if(hours < 12) {
				valor = calculoHoras.calcular(hours, days);
			}else {
				valor = calculoDiaria.calcular(hours, days);
			}
			
			tempoEstacionado = hours + " horas";
			
			break;
		case MENSALISTAS:
			// caso o sistema não fosse apenas para veículos de passeio, seria implementado
			break;
		case CAMINHOES:
			// caso o sistema não fosse apenas para veículos de passeio, seria implementado
			break;
		default:
			throw new RuntimeException("Tipo não encontrado!");
		}

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
		System.out.println("Tempo Estacionado: " + tempoEstacionado);
		System.out.println("Valor Pago: R$ " + valor + "\n");
	}

}