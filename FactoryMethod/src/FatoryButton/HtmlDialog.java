package FatoryButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button creatButton() {
		return new HtmlButton();
	}

}
