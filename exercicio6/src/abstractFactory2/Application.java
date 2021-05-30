package abstractFactory2;

public class Application {
	private Button button;
	private Checkbox checkbox;

	public Application() {
	}

	public Application(MacOSFactory macOSFactory) {
		this.button = macOSFactory.createButton();
		this.checkbox = macOSFactory.createCheckbox();
	}

	public Application(WindowsFactory windowsFactory) {
		this.button = windowsFactory.createButton();
		this.checkbox = windowsFactory.createCheckbox();
	}

	public void paint() {
		button.paint();
		checkbox.paint();
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public void setCheckbox(Checkbox checkbox) {
		this.checkbox = checkbox;
	}

}
