
public abstract class Car implements ParentCar {
	protected double longCar;
	protected double widthCar;
	protected double cylinderCapacity;
	protected int numberSeat;
	protected String color;
	protected double price;
	
	public Car(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color, double price) {
		this.longCar = longCar;
		this.widthCar = widthCar;
		this.cylinderCapacity = cylinderCapacity;
		this.numberSeat = numberSeat;
		this.color = color;
		this.price = price;
	}

	public double getLongCar() {
		return longCar;
	}

	public void setLongCar(double longCar) {
		this.longCar = longCar;
	}

	public double getWidthCar() {
		return widthCar;
	}

	public void setWidthCar(double widthCar) {
		this.widthCar = widthCar;
	}

	public double getCylinderCapacity() {
		return cylinderCapacity;
	}

	public void setCylinderCapacity(double cylinderCapacity) {
		this.cylinderCapacity = cylinderCapacity;
	}

	public int getNumberSeat() {
		return numberSeat;
	}

	public void setNumberSeat(int numberSeat) {
		this.numberSeat = numberSeat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "|Long = " + longCar + "m|Width = " + widthCar + "m|Cylinder Capacity = " + cylinderCapacity
				+ "m3|Number Seat = " + numberSeat + "|Color = " + color + "|Price = " + price + "tỷ VNĐ|";
	}
	
}
