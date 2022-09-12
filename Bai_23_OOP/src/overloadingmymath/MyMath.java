package overloadingmymath;

public class MyMath {
	public int timMin(int a, int b) {
		return (a < b) ? a : b;
	}
	
	public double timMin(double a, double b) {
		return (a < b) ? a : b;
	}

	public double tinhTong(double a, double b) {
		return a + b;
	}

	public double tinhTong(double[] array) {
		double tong = 0;
		for (int i = 0; i < array.length; i++) {
			tong += array[i];
		}
		return tong;
	}
}
