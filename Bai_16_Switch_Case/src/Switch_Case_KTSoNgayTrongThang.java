import java.util.Scanner;

public class Switch_Case_KTSoNgayTrongThang {
	public static void main(String[] args) {
		int thang, nam;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tháng : ");
		thang = sc.nextInt();
		System.out.print("Nhập năm : ");
		nam = sc.nextInt();
		switch (thang) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				System.out.print("Tháng " + thang + " có 31 ngày");
				break;
			}
			case 2: {
				if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
					System.out.print("Tháng " + thang + " có 29 ngày");
				} else {
					System.out.print("Tháng " + thang + " có 28 ngày");
				}
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				System.out.print("Tháng " + thang + " có 30 ngày");
				break;
			}
			default:
				System.out.print("Nhập dữ liệu sai");
		}
	}
}
