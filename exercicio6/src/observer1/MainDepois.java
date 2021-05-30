package observer1;

public class MainDepois {
	public static void main(String[] args) {

		HoraRelogio horaRelogio = new HoraRelogio(0, 0, 0);

		RelogioAnalogico analogico = new RelogioAnalogico(horaRelogio);
		RelogioDigital digital = new RelogioDigital(horaRelogio);

		horaRelogio.setHora(18, 30, 10);
		horaRelogio.setHora(22, 30, 20);

	}

}

//Relogio Analogico: 18:30:10
//Relogio Digital: 18:30:10
//Relogio Analogico: 22:30:20
//Relogio Digital: 22:30:20
