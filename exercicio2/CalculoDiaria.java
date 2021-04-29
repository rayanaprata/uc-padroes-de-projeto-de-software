import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CalculoDiaria implements CalculoValor {
	
	SimpleDateFormat dataFormatada = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	Date dataEntrada, dataSaida;
	String tempoEstacionado;
	long hours, days, valor;
	
	@Override
	public void calcular(String entrada, String saida) {
		
		//calculo horas
				try {
					dataEntrada = dataFormatada.parse(entrada);
					dataSaida = dataFormatada.parse(saida);
				} catch (ParseException e) {
					System.out.println("Erro no cálculo de datas.");
					e.printStackTrace();
				}
				
				@SuppressWarnings("deprecation")
				LocalDateTime oldDate = LocalDateTime.of(dataEntrada.getYear(), dataEntrada.getMonth(), dataEntrada.getDay(), dataEntrada.getHours(), dataEntrada.getMinutes(), dataEntrada.getSeconds());
				
				@SuppressWarnings("deprecation")
				LocalDateTime newDate = LocalDateTime.of(dataSaida.getYear(), dataSaida.getMonth(), dataSaida.getDay(), dataSaida.getHours(), dataSaida.getMinutes(), dataSaida.getSeconds());
				
				hours = ChronoUnit.HOURS.between(oldDate, newDate);
				days = ChronoUnit.DAYS.between(oldDate, newDate);
				
				if (days == 1){                            // se for igual a um dia, paga diária
					tempoEstacionado = "1 dia";
				} else {                                          // se não, paga mais de uma diária
					tempoEstacionado = days + " dias";
				}
				
				valor = days * 20;
				
				System.out.println("Tempo Estacionado: " + tempoEstacionado);
				System.out.println("Valor Pago: R$ " + valor);
		
	}
	
}