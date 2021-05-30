package observer1;

public class MainAntes {
	public static void main(String[] args) {

		HoraRelogio horaRelogio = new HoraRelogio(0,0,0);

		RelogioAnalogico analogico = new RelogioAnalogico(horaRelogio);
		RelogioDigital digital = new RelogioDigital(horaRelogio);

		horaRelogio.setHora(18,30,10);
		
		analogico.setHora(horaRelogio);
		digital.setHora(horaRelogio);
		
		analogico.mostrarHora();
		digital.mostrarHora();

		horaRelogio.setHora(22,30,20);

		analogico.setHora(horaRelogio);
		digital.setHora(horaRelogio);

		analogico.mostrarHora();
		digital.mostrarHora();

	}
}

//Relogio Analogico: 18:30:10
//Relogio Digital: 18:30:10
//Relogio Analogico: 22:30:20
//Relogio Digital: 22:30:20
