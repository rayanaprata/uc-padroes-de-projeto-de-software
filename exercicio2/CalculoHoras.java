import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CalculoHoras implements CalculoValor {

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
				
				if(hours < 1) {                                   // se for menos de uma hora, paga 1 hora do mesmo jeito!
					tempoEstacionado = "1 hora";	
				} else if (hours < 12) {                          // se for menor que 12hrs paga por hora
					tempoEstacionado = hours + " horas";
				} 
				
				valor = hours * 2;
				
				System.out.println("Tempo Estacionado: " + tempoEstacionado);
				System.out.println("Valor Pago: R$ " + valor);		

	}
	
}