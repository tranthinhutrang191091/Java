package components;

public class GPSNavigator {
	private String route;

	public GPSNavigator(String route) {
		this.route = route;
	}

	public GPSNavigator() {
		this.route = "A1, IA20, CipuTra, Đông Ngạc, Bắc Từ Liêm, Hà Nội, VIệt Nam";
	}

	public String getRoute() {
		return route;
	}
}
