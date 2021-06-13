package state.exercicio1;


public class MainDepois {

	public static void main(String[] args) {

		Bug bug = new Bug(1,"Erro");
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