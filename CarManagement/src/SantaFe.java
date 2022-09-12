
public class SantaFe extends HuynDai{

	public SantaFe(double longCar, double widthCar, double cylinderCapacity, int numberSeat, String color, double price,
			String typeFuel) {
		super(longCar, widthCar, cylinderCapacity, numberSeat, color, price, typeFuel);
	}

	@Override
	public String toString() {
		return "SantaFe ["+super.toString()+"]";
	}
	@Override
	public double getSpeedAfterTax() {
		return price*150/100;
	}
}
