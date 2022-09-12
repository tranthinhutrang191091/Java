import java.util.Scanner;

public class If_Else_GiaiPTBac2 {
	public static void main(String[] args) {
		// PTB2: ax^2+bx+c=0
		double a, b, c, x1, x2, delta;
		// Nhập dữ liệu
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = ");
		a = sc.nextDouble();
		System.out.print("Nhập b = ");
		b = sc.nextDouble();
		System.out.print("Nhập c = ");
		c = sc.nextDouble();

		// Kiểm tra có phải PTB2
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm!");
				} else {
					System.out.println("Phương trình vô nghiệm!");
				}
			} else {
				x1 = -c / b;
				System.out.println("Phương trình có nghiệm x1 = " + x1);
			}
		} else {

			delta = Math.pow(b, 2) - 4 * a * c;

			// Kiểm tra delta
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm!");
			} else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
			} else {
				x1 = (-b - Math.sqrt(delta)) / (2 * a);
				x2 = (-b + Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm:");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
