package state.exemplo2;

public class TVRemote implements State {

	private State tvState;
	
	public TVRemote() {
		turnOff();
	}
	
	public void turnOn() {
		this.tvState= new TVOnState();
	}

	public void turnOff() {
		this.tvState= new TVOffState();
	}

	public void changeChannel(int channel) {
		this.tvState.changeChannel(channel);
	}

}