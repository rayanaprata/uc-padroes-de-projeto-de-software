package adapter.exercicio2;

public class FacebookAdapter extends Facebook implements SocialNetworks {

	@Override
	public void Share(String message) {
		updateStatus(message);
	}

}
