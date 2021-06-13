package state.exemplo3;

public class Channel1 implements State {

	@Override
	public void changeChannel(TVRemote remote) {
		remote.tvState = new Channel2();
	}
	
	@Override
	public void watch() {
		System.out.println("Watching channel 1");	
	}

}