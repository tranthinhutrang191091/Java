
import java.util.Arrays;
import java.util.Scanner;


public class Mang_Array {
	public static void main(String[] args) {
		double[] mang1 = { 1, 2, 3, 4, 5 };
		double mang2[];
		mang1 = new double[10];
		/*
		 * Scanner sc = new Scanner(System.in); for (int i = 0; i < mang1.length; i++) {
		 * System.out.print("Nhập phần mang1[" + i + "] = "); mang1[i] =
		 * sc.nextDouble(); }
		 */
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
		}
		System.out.println("Tổng = " + tong);

		mang2 = new double[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < mang2.length; i++) {
			System.out.println("mang2[" + i + "] = " + mang2[i]);
		}

		// Kiểu dữ liệu nguyên thủy
		int[] mang3 = { 1, 2, 3 };
		// Copy mảng
		System.out.println("-----Copy mảng-----");
		int[] mang3_a = mang3;
		mang3_a[0] = 100;
		System.out.println("Mảng 3 = " + Arrays.toString(mang3));
		System.out.println("Mảng 3_a= " + Arrays.toString(mang3_a));

		// copy mảng dùng hàm clone()
		System.out.println("-----Copy mảng hàm clone()-----");
		int[] mang3_b = mang3.clone();
		mang3_b[0] = 50;
		System.out.println("Mảng 3 = " + Arrays.toString(mang3));
		System.out.println("Mảng 3_b= " + Arrays.toString(mang3_b));

		// copy mảng dùng hàm System.arraycopy()
		System.out.println("-----Copy mảng hàm System.arraycopy()-----");
		int[] mang3_c = new int[mang3.length];
		System.arraycopy(mang3, 0, mang3_c, 0, mang3.length);
		mang3_c[0] = 90;
		System.out.println("Mảng 3 = " + Arrays.toString(mang3));
		System.out.println("Mảng 3_c= " + Arrays.toString(mang3_c));

		// Kiểu dữ liệu đối tượng(tham chiếu)
		String[] mang4 = { "trang", "com" };
		// Copy mảng
		System.out.println("-----Copy mảng-----");
		String[] mang4_a = mang4;
		mang4_a[0] = "trần";
		System.out.println("Mảng 4 = " + Arrays.toString(mang4));
		System.out.println("Mảng 4_a= " + Arrays.toString(mang4_a));

		// copy mảng dùng hàm clone()
		System.out.println("-----Copy mảng hàm clone()-----");
		String[] mang4_b = mang4.clone();
		mang4_b[0] = "thị";
		System.out.println("Mảng 4 = " + Arrays.toString(mang4));
		System.out.println("Mảng 4_b= " + Arrays.toString(mang4_b));

		// copy mảng dùng hàm System.arraycopy()
		System.out.println("-----Copy mảng hàm System.arraycopy()-----");
		String[] mang4_c = new String[mang4.length];
		System.arraycopy(mang4, 0, mang4_c, 0, mang4.length);
		mang4_c[0] = "như";
		System.out.println("Mảng 4 = " + Arrays.toString(mang4));
		System.out.println("Mảng 4_c= " + Arrays.toString(mang4_c));

		// Hàm sắp xếp
		System.out.println("-----1. Hàm sắp xếp-----");
		int[] a = { 1, 2, 3, 8, 10, 4, 5 };
		System.out.println("a: ban đầu" + Arrays.toString(a));
		Arrays.sort(a);// Sắp xếp tăng dần
		System.out.println("a: sắp xếp Arrays.sort(a): " + Arrays.toString(a));

		// Hàm tìm kiếm
		System.out.println("-----2. Hàm tìm kiếm-----");
		// Arrays.binarySearch(array, char): return index
		System.out.println("Arrays.binarySearch(a, 4): " + Arrays.binarySearch(a, 4));
		System.out.println("Arrays.binarySearch(a, -1): " + Arrays.binarySearch(a, -1));

		// Hàm tìm kiếm
		System.out.println("-----3. Hàm điền giá trị-----");
		Arrays.fill(a, 100);
		System.out.println("a: Arrays.fill(a, 100): " + Arrays.toString(a));

		// Đảo ngược mảng
		System.out.println("-----4. Hàm đảo ngược mảng-----");
		int[] b = { 1, 2, 3, 8, 10, 4, 5 };
		System.out.println("b: ban đầu" + Arrays.toString(b));
		b = reverse(b);
		System.out.println("b: đảo ngược" + Arrays.toString(b));

		// Array Object
		System.out.println("-----5. Array Object-----");
		SinhVien sv1= new SinhVien(150, "Trần Thi Thanh", "Lớp 1A", 9);
		SinhVien sv2= new SinhVien(100, "Trần Thi Thanh Hoa", "Lớp 1B", 8);
		SinhVien sv3= new SinhVien(199, "Nguyễn Văn An", "Lớp 1C", 10);
		SinhVien[] arraySV = new SinhVien[] {sv1,sv2,sv3};
		
		System.out.println("Bắt đầu: \n"+Arrays.toString(arraySV));
		/// Hàm sắp xếp
		Arrays.sort(arraySV);
		System.out.println("Sắp xếp: \n"+Arrays.toString(arraySV));
		// Hàm tìm kiếm
		System.out.println("Tìm Kiếm sv1 ở vịt trí: "+Arrays.binarySearch(arraySV, sv1));
		System.out.println("Tìm Kiếm sv3 ở vịt trí: "+Arrays.binarySearch(arraySV, sv3));
		
		
		
		
		
		
	}

	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
}
