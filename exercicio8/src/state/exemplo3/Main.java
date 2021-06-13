package state.exemplo3;

public class Main {

	public static void main(String[] args) {
		TVRemote remote = new TVRemote();
		
		remote.watch();
		remote.changeChannel();
		
		remote.turnOn();
		remote.watch();		
		
		remote.changeChannel();
		remote.watch();
		
		remote.changeChannel();
		remote.watch();			
		
		remote.changeChannel();
		remote.watch();
		
		remote.turnOff();
		remote.watch();	
		remote.changeChannel();
		
	}
}