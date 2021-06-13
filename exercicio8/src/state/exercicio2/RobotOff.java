package state.exercicio2;

public class RobotOff implements RoboticState {

	@Override
	public void walk() {
		System.out.println("Robot is switched off");	
	}

	@Override
	public void cook() {
		System.out.println("Cannot switched off while cooking...");
		
	}

	@Override
	public void off() {
		System.out.println("Robot is switched off");	
	}

}
