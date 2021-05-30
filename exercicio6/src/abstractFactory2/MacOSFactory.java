package abstractFactory2;

public class MacOSFactory implements ApplicationFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
