package state.exemplo1;

public class MainDepois {

	public static void main(String[] args) {
		TVRemote remote = new TVRemote();

		remote.setState(new TVOnState());
		remote.doAction();
		remote.doAction();

		remote.setState(new TVOffState());
		remote.doAction();
		remote.doAction();

	}
}