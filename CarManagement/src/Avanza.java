
public class Avanza extends Toyota {

	public Avanza(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color,
			double price) {
		super(longCar, widthCar, cylinderCapacity, numberSeat, color, price);
	}
	@Override
	public String toString() {
		return "Avanza ["+super.toString()+"]";
	}
	@Override
	public double getSpeedAfterTax() {
		return price*110/100;
	}
}
