package abstractFactory2;

public class MainDepois {

	public static void main(String[] args) {

		Application app;

		app = new Application(new MacOSFactory());
		app.paint();

		app = new Application(new WindowsFactory());
		app.paint();
	}
}
