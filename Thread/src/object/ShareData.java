package object;
// synchronized:

public class ShareData {
	private int x = 0;
	private int rad;

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public synchronized void add(int plus) {
		x += plus;
		System.out.println("\nList x = " + x + "");
		for (int i = 0; i < x; i++) {
			System.out.print(" " + i);
		}
	}

}
