
public class CalculoDiaria implements CalculoValor {
	@Override
	public long calcular(long horas, long dias) {
		return ( dias * 20 ) + (int)horas%12 * 2;
	}
 }