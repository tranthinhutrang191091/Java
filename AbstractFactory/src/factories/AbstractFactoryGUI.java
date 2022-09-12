package factories;

import buttons.Button;
import checkboxes.Checkbox;

public interface AbstractFactoryGUI {
	Button createButton();
	Checkbox createCheckbox();
}
