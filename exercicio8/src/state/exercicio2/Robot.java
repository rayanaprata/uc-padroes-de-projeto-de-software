package state.exercicio2;

public class Robot {

	RoboticState roboticState;

	public Robot() {
		
	}

	public void walk() {
		this.roboticState = new BugAberto();
	}

	public void cook() {
		this.roboticState = new BugFechado();
	}

	public void off() {
		this.roboticState = new BugVerificando();
	}
	
}
