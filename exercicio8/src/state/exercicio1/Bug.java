package state.exercicio1;

public class Bug {

	StatusDoBug bugState;

	public Bug(int id, String descricao) {
		abre();
	}

	public void abre() {
		this.bugState = new BugAberto();
	}

	public void fecha() {
		this.bugState = new BugFechado();
	}

	public void analisa() {
		this.bugState = new BugVerificando();
	}
	
}
