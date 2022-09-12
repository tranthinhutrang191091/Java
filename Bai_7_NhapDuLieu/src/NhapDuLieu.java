import java.util.Scanner;

public class NhapDuLieu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào Họ và Tên: ");
		String hoVaTen= sc.nextLine();
		System.out.print("Nhập mã sinh viên: ");
		long maSinhVien=sc.nextLong();
		System.out.print("Nhập vào điểm thi: ");
		float diemThi = sc.nextFloat();
		System.out.println("------------------");
		System.out.println("Họ và Tên: "+hoVaTen);
		System.out.println("Mã Sinh Vien: "+maSinhVien);
		System.out.println("Điểm Thi: "+diemThi);
	}
}
