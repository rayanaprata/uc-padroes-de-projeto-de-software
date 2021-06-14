package state.exercicio2;

public class Robot {

	RoboticState roboticState;

	public Robot() {
		
	}

	public void walk() {
		this.roboticState = new RobotWalk();
	}

	public void cook() {
		this.roboticState = new RobotCook();
	}

	public void off() {
		this.roboticState = new RobotOff();
	}
	
}