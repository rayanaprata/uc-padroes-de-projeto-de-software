package state.exercicio1;

public class BugAberto implements StatusDoBug {

	@Override
	public void abre(Bug bug) {
		System.out.println("Bug aberto");
	}

	@Override
	public void analisa(Bug bug) {
		System.out.println("Bug em an�lise");
		bug.analisa();
	}

	@Override
	public void fecha(Bug bug) {
		System.out.println("Bug ainda n�o foi analisado");
	}
	
}
