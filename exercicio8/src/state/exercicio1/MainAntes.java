package state.exercicio1;

public class MainAntes {
	public static void main(String[] args) {

		OldBug bug = new OldBug(1,"Erro");
		bug.abre();
		bug.abre();
		bug.fecha();
		bug.analisa();
		bug.abre();
		bug.analisa();
		bug.fecha();
		bug.abre();
		bug.analisa();


	}
}
