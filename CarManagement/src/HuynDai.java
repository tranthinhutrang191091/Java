
public class HuynDai extends Car {
	protected String typeFuel;
	

	public HuynDai(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color, double price,
			String typeFuel) {
		super(longCar, widthCar, cylinderCapacity, numberSeat, color, price);
		this.typeFuel = typeFuel;
	}

	@Override
	public void startUp() {
		System.out.println("HuynDai Start Up!");
	}

	@Override
	public void acceleration() {
		System.out.println("HuynDai Acceleration...");
		
	}

	@Override
	public void stop() {
		System.out.println("HuynDai Stop!");
		
	}

	@Override
	public double getSpeedAfterTax() {
		return 0;
	}

	@Override
	public String toString() {
		return "HuynDai"+ super.toString()+ "Type Fuel = " + typeFuel + "|";
	}

}
