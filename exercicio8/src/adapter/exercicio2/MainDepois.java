package adapter.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class MainDepois {
	public static void main(String[] args) {
		List<SocialNetworks> list =  new ArrayList<SocialNetworks>();
		list.add(new FacebookAdapter());
		list.add(new LinkedinAdapter());
		list.add(new TwitterAdapter());
		list.add(new GooglePlusAdapter());
				
		for (SocialNetworks socialNetworks: list) {
			socialNetworks.Share("Message");
		}
	} 
}
