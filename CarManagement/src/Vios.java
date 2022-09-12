
public class Vios extends Toyota {

	public Vios(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color, double price) {
		super(longCar, widthCar, cylinderCapacity, numberSeat, color, price);
	}

	@Override
	public String toString() {
		return "Vios ["+super.toString()+"]";
	}
	@Override
	public double getSpeedAfterTax() {
		return price*170/100;
	}
}
