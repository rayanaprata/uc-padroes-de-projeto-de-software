package adapter.exercicio2;

public class TwitterAdapter extends Twitter implements SocialNetworks {

	@Override
	public void Share(String message) {
		send(message);
	}

}
