package state.exemplo3;

public class Channel3 implements State {

	@Override
	public void changeChannel(TVRemote remote) {
		remote.tvState = new Channel1();
	}
	
	@Override
	public void watch() {
		System.out.println("Watching channel 3");	
	}

}