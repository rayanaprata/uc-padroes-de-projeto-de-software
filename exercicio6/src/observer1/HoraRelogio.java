package observer1;

public class HoraRelogio {

	int hora, min, seg;

	public HoraRelogio(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public void setHora(int hora, int min, int seg) {
		this.hora = hora;
		this.min = min;
		this.seg = seg;
	}

	public int getHora() {
		return hora;
	}

	public int getMin() {
		return min;
	}

	public int getSeg() {
		return seg;
	}

}
