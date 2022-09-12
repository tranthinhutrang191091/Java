package abstracthinh;

public class ToaDo {
	private int x, y;

	public ToaDo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
