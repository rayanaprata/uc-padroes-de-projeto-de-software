package state.exercicio1;

public class OldBug {
	private Integer id;
	private String descricao;
	public String status;

	public OldBug(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
		this.status = "ABERTO";
	}

	public void abre() {
		if(status.equalsIgnoreCase("ABERTO")) {
			System.out.println("Bug aberto");

		}else if(status.equalsIgnoreCase("VERIFICANDO")) {

			System.out.println("Bug em an�lise");

		}else if(status.equalsIgnoreCase("FECHADO")) {

			System.out.println("Bug fechado");
		}
	}

	public void analisa() {
		if(status.equalsIgnoreCase("ABERTO")) {
			System.out.println("Bug em an�lise");
			status = "VERIFICANDO";

		}else if(status.equalsIgnoreCase("VERIFICANDO")) {

			System.out.println("Bug est� sendo analisado, falta fechar");		

		}else if(status.equalsIgnoreCase("FECHADO")) {

			System.out.println("Bug fechado");
		}
	}

	public void fecha() {
		if(status.equalsIgnoreCase("ABERTO")) {

			System.out.println("Bug ainda n�o foi analisado");

		}else if(status.equalsIgnoreCase("VERIFICANDO")) {

			System.out.println("Bug fechado");
			status="FECHADO";

		}else if(status.equalsIgnoreCase("FECHADO")) {

			System.out.println("Bug fechado");
		}
	}
}