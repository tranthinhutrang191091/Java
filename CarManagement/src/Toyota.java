
public class Toyota extends Car {

	public Toyota(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color,
			double price) {
		super(longCar, widthCar, cylinderCapacity, numberSeat, color, price);
	}

	@Override
	public void startUp() {
		System.out.println("Toyota Start Up!");

	}

	@Override
	public void acceleration() {
		System.out.println("Toyota Acceleration...");

	}

	@Override
	public void stop() {
		System.out.println("Toyota Stop!");

	}

	@Override
	public double getSpeedAfterTax() {
		return 0;
	}

	@Override
	public String toString() {
		return "Toyota"+ super.toString()+ "|";
	}

}
