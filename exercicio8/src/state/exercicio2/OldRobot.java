package state.exercicio2;

public class OldRobot {

	private String state;

	public OldRobot() {
		state = "ON";
	}

	public void walk() {
		state = "ON";
		System.out.println("Walking...");

	}

	public void cook() {
		if(state.equalsIgnoreCase("OFF")) {
			System.out.println("Cannot cook at Off state.");
		}else {
			state="COOK";
			System.out.println("Cooking...");
		}
	}

	public void off() {

		if(state.equalsIgnoreCase("COOK")) {			
			System.out.println("Cannot switched off while cooking...");
		}else {
			state = "OFF";
			System.out.println("Robot is switched off");	
		}


	}



}
