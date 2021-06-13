package state.exemplo1;

public class TVRemote implements State {

	private State tvState;

	public void setState(State state) {
		this.tvState=state;
	}

	@Override
	public void doAction() {
		this.tvState.doAction();
	}

}