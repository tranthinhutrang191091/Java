import java.util.Scanner;

public class PhepToan {
	public static void main(String[] args) {
		// Khai báo biến
		int a, b;
		// Nhập dữ liệu
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = ");
		a = sc.nextInt();
		System.out.print("Nhập b = ");
		b = sc.nextInt();
		// Phép toán
		int tong = a + b;
		System.out.println(a + " + " + b + " = " + tong);
		int hieu = a - b;
		System.out.println(a + " - " + b + " = " + hieu);
		int nhan = a * b;
		System.out.println(a + " * " + b + " = " + nhan);
		float chia = (float) a / b;
		System.out.println(a + " / " + b + " = " + chia);
		int du = a % b;
		System.out.print(a + " % " + b + " = " + du);

	}
}
