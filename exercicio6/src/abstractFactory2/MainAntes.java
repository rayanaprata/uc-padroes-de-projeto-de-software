package abstractFactory2;

public class MainAntes {
	public static void main(String[] args) {

		Application app = new Application();

		app.setButton(new MacOSButton());
		app.setCheckbox(new MacOSCheckbox());
		app.paint();

		app.setButton(new WindowsButton());
		app.setCheckbox(new WindowsCheckbox());
		app.paint();
	}
}
