package package_compareto;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1= new SinhVien(150, "Trần Thi Thanh", "Lớp 1A", 9);
		SinhVien sv2= new SinhVien(100, "Trần Thi Thanh Hoa", "Lớp 1B", 8);
		SinhVien sv3= new SinhVien(199, "Nguyễn Văn An", "Lớp 1C", 10);
		/*
		 * Hàm so sánh tất cả các đối tượng
		 */
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv1.compareTo(sv3));
	}
}
