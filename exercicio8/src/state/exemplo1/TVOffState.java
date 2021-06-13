package state.exemplo1;

public class TVOffState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}

}