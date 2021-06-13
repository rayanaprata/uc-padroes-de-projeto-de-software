package adapter.exercicio2;

public class LinkedinAdapter extends Linkedin implements SocialNetworks {

	@Override
	public void Share(String message) {
		submit(message);
	}

}
