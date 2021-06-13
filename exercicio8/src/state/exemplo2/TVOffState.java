package state.exemplo2;

public class TVOffState implements State {

	@Override
	public void changeChannel(int channel) {
		System.out.println("TV is turned OFF");
		
	}

}