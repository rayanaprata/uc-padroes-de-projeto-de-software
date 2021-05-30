package observer1;

public class RelogioAnalogico {

	HoraRelogio hora;
	
	public RelogioAnalogico(HoraRelogio hora) {
		this.hora = hora;
	}
	
	public void mostrarHora() {
		System.out.print("Relogio Analogico: " );
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
