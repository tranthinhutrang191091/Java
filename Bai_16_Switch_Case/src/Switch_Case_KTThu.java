import java.util.Scanner;

public class Switch_Case_KTThu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên từ 0 đến 8: n = ");
		n = sc.nextInt();
		switch (n) {
			case 1: {
				System.out.println("Thứ 2");
				break;
			}
			case 2: {
				System.out.println("Thứ 3");
				break;
			}
			case 3: {
				System.out.println("Thứ 42");
				break;
			}
			case 4: {
				System.out.println("Thứ 5");
				break;
			}
			case 5: {
				System.out.println("Thứ 6");
				break;
			}
			case 6: {
				System.out.println("Thứ 7");
				break;
			}
			case 8: {
				System.out.println("Chủ Nhật");
				break;
			}
			default:
				System.out.println("Nhập sai");
		}
	}
}
