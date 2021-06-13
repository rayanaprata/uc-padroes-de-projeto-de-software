package state.exemplo3;

public class TVOffState implements State {
	
	@Override
	public void changeChannel(TVRemote remote) {
		System.out.println("TV is turned OFF");
	}
	
	@Override
	public void watch() {
		System.out.println("TV is turned OFF");
	}

}