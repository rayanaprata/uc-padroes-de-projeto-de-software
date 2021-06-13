package state.exemplo2;

public class Main {

	public static void main(String[] args) {
		TVRemote remote = new TVRemote();

		remote.changeChannel(5);
		
		remote.turnOn();
		
		remote.changeChannel(5);
		
		remote.turnOff();
		
		remote.changeChannel(5);

	}
}