
public class CalculoDiaria implements CalculoValor {
	
	@Override
	public long calcular(long horas, long dias) {
		return 20 * dias;
	}
	
}