package observer1;

public class RelogioDigital {
	
	HoraRelogio hora;

	public RelogioDigital(HoraRelogio hora) {
		this.hora = hora;
	}

	public void mostrarHora() {
		System.out.print("Relogio Digital: ");
		System.out.print(hora.getHora() + ":");
		System.out.print(hora.getMin() + ":");
		System.out.println(hora.getSeg());
	}
	
	public HoraRelogio getHora() {
		return hora;
	}

	public void setHora(HoraRelogio hora) {
		this.hora = hora;
	}
	
}
