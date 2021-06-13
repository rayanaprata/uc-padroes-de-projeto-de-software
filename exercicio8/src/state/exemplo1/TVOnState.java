package state.exemplo1;

public class TVOnState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}

}