package adapter.exercicio2;

public class MainAntes {
	public static void main(String[] args) {
		Facebook facebook  =  new Facebook();
		facebook.updateStatus("Message");

		Linkedin linkedin =  new Linkedin();
		linkedin.submit("Message");
		
		Twitter twitter =  new Twitter();
		twitter.send("Message");
		
		GooglePlus googlePlus = new GooglePlus();
		googlePlus.post("Message");
	}
}
