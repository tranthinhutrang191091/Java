

import buttons.Button;
import checkboxes.Checkbox;
import factories.AbstractFactoryGUI;

public class Application {
	private Button button;
	private Checkbox checkbox;
	public Application(AbstractFactoryGUI factory) {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}
	public void paint() {
		button.paint();
		checkbox.paint();
	}
	
}
