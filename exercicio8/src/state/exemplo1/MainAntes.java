package state.exemplo1;

public class MainAntes {

	public static void main(String args[]){
		TVRemoteBasic remote = new TVRemoteBasic();

		remote.setState("ON");
		remote.doAction();
		remote.doAction();

		remote.setState("OFF");
		remote.doAction();
		remote.doAction();
		
	}
}
