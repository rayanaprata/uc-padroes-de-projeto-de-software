package state.exemplo3;

public class Channel2 implements State {

	@Override
	public void changeChannel(TVRemote remote) {
		remote.tvState = new Channel3();
	}
	
	@Override
	public void watch() {
		System.out.println("Watching channel 2");	
	}

}