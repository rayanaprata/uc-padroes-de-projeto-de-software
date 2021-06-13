package adapter.exercicio2;

public class GooglePlusAdapter extends GooglePlus implements SocialNetworks {

	@Override
	public void Share(String message) {
		post(message);
	}

}
