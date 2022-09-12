import javax.management.loading.PrivateClassLoader;

import factories.AbstractFactoryGUI;
import factories.MacOSFactory;
import factories.WindowsFactory;

	

public class Main {
	public static void main(String[] args) {
		Application app= configureApplication();
		app.paint();
		
	}
	private static Application configureApplication() {
		Application app;
		AbstractFactoryGUI factory;
		String osName =System.getProperty("os.name").toLowerCase();
		if(osName.contains("mac")) {
			factory = new MacOSFactory();
		}else {
			factory = new WindowsFactory();
		}
		app = new Application(factory);
		return app;
	}
}
