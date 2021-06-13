package state.exercicio1;

public class BugFechado implements StatusDoBug {

	@Override
	public void abre(Bug bug) {
		System.out.println("Bug fechado");		
	}

	@Override
	public void analisa(Bug bug) {
		System.out.println("Bug fechado");		
	}

	@Override
	public void fecha(Bug bug) {
		System.out.println("Bug fechado");		
	}

}
