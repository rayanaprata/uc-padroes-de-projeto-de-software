package state.exemplo2;

public class TVOnState implements State {

	@Override
	public void changeChannel(int channel) {
		System.out.println("Channel changed to "+channel);		
	}

}