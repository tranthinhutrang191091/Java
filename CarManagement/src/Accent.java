
public class Accent extends HuynDai {
	
	public Accent(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color, double price,
			String typeFuel) {
		super(longCar, widthCar, cylinderCapacity, numberSeat, color, price, typeFuel);
	}

	@Override
	public String toString() {
		return "Accent ["+super.toString()+"]";
	}
	@Override
	public double getSpeedAfterTax() {
		return price*130/100;
	}

}
