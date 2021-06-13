package state.exemplo3;

public class TVRemote {

	State tvState;
	
	public TVRemote() {
		turnOff();
	}
	
	public void turnOn() {
		this.tvState= new Channel1();
	}

	public void turnOff() {
		this.tvState = new TVOffState();
	}

	public void changeChannel() {
		this.tvState.changeChannel(this);
	}
	
	public void watch() {		
		this.tvState.watch();
	}	

}