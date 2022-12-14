import java.util.Scanner;

public class Chuoi_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Trần Thị Như Trang";
		// System.out.print("Nhập vào chuỗi s =");
		// s=sc.nextLine();
		System.out.println("--------------------");
		// Hàm length(): lấy độ dài của chuỗi
		System.out.println("Hàm length()");
		System.out.println("length(): " + s.length());
		int doDai = s.length();
		// Hàm charAt(vi tri): lấy ra 1 ký tự tại vị trí
		System.out.println("Hàm charAt(...)");
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Vị trí " + i + " là: " + s.charAt(i));
		}
		// Hàm getChars(vị trí bắt đầu, vị trí kết thúc -1,
		// mảng lưu dữ liệu, ví trí bắt đầu lưu mảng)
		System.out.println("Hàm getChars(...)");
		char[] arr = new char[20];
		s.getChars(2, 7, arr, 0);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Giá trị của mảng tại " + i + " là: " + arr[i]);
		}
		// Hàm getBytes()=> có 3 cách lấy ra giá trị của các
		// ký tự của 1 mảng
		System.out.println("Hàm getBytes()");
		byte[] arrByte = s.getBytes();
		for (byte b : arrByte) {
			System.out.print(b + ", ");
		}
		System.out.println();
		String s1 = "Trần Thị như Trang";
		String s2 = "TRẦN THỊ NHƯ TRANG";
		String s3 = "trần thị như trang";
		String s4 = "trần thị như trang";
		// Hàm equals()
		// => so sánh 2 chuỗi giống nhau có phân biệt hoa thường
		System.out.println("Hàm equals(...)");
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s3 equals s4: " + s3.equals(s4));
		// Hàm equalsIgnoreCase()
		// => so sánh 2 chuỗi giống nhau ko phân biệt hoa thường
		System.out.println("Hàm equalsIgnoreCase(...)");
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s3 equalsIgnoreCase s4: " + s3.equalsIgnoreCase(s4));

		// Hàm compareTo(): phân biệt chữ hoa chữ thường
		// => so sánh > < =
		// trả ra giá trị - :<
		// trả ra giá trị + :>
		// trả ra giá trị 0 :=
		System.out.println("Hàm compareTo(...)");
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

		// Hàm compareToIgnoreCase(): ko phân biệt hoa thường

		System.out.println("Hàm compareToIgnoreCase(...)");
		String sv5 = "Nguyễn Văn A";
		String sv6 = "Nguyễn Văn B";
		String sv7 = "Nguyễn Văn";
		String sv8 = "nguyễn văn a";
		System.out.println("sv5 compareToIgnoreCase sv6: " + sv5.compareToIgnoreCase(sv6));
		System.out.println("sv5 compareToIgnoreCase sv7: " + sv5.compareToIgnoreCase(sv7));
		System.out.println("sv5 compareToIgnoreCase sv8: " + sv5.compareToIgnoreCase(sv8));

		// Hàm regionMatches() => so sánh 1 đoạn

		System.out.println("Hàm regionMatches(...)");
		String r1 = "trần thị như trang";
		String r2 = "thị";
		boolean check = r1.regionMatches(5, r2, 0, 3);
		System.out.println(check);
		// So sánh ko phân biệt hoa thường: true
		// so sánh phân biệt hoa thường: flase
		String r3 = "Thị";
		boolean check1 = r1.regionMatches(true, 5, r3, 0, 3);
		System.out.println(check1);
		boolean check2 = r1.regionMatches(false, 5, r3, 0, 3);
		System.out.println(check2);

		// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu...
		System.out.println("Hàm startWith(...)");
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));

		// Hàm endWith() => Hàm kiểm tra chuỗi kết thúc...
		System.out.println("Hàm endWith(...)");
		String tenFile1 = "I love you.JPG";
		String tenFile2 = "Hoc Java.PDF";
		if (tenFile1.endsWith(".JPG")) {
			System.out.println("File " + tenFile1 + " là hình ảnh.");
		}
		if (tenFile2.endsWith(".PDF")) {
			System.out.println("File " + tenFile2 + " là file PDF.");

		}

		// Hàm indexOf()
		System.out.println("Hàm indexOf(...)");
		String str1 = "Xin chào các bạn, xin chào cô chú, Xin chào!";
		String str2 = "Xin chào";
		String str3 = "Xin chào 123";
		char c1 = 'ô';
		System.out.println("Vị trí của str2 trong str1 là: " + str1.indexOf(str2));
		System.out.println("Vị trí của str3 trong str1 là: " + str1.indexOf(str3));

		// Sử dụng vị trí bắt đầu
		System.out.println("Vị trí của str2 trong str1 là: " + str1.indexOf(str2, 2));
		// Tìm kiếm char
		System.out.println("Vị trí của char c trong str1 là: " + str1.indexOf(c1));
		System.out.println("Vị trí của char c trong str1 là: " + str1.indexOf(c1, 30));

		// Hàm lastIndexOf()=> tìm kiếm từ phải sang trái
		System.out.println("Hàm lastIndexOf(...)");
		System.out.println("Vị trí của str2  trong str1 là: " + str1.lastIndexOf(str2));
		System.out.println("Vị trí của str3 trong str1 là: " + str1.lastIndexOf(str3, 30));

		// Hàm concat(...)=> nối chuỗi
		System.out.println("Hàm concat(...)");
		String t1 = "tranthinhutrang";
		String t2 = "@gmail.com";
		String t3 = t1 + t2;
		String t4 = t1.concat(t2);
		System.out.println(t4);

		// Hàm replaceAll(...)=> thay thế
		System.out.println("Hàm replaceAll(...)");
		String t5 = "tranthiNhutrang.com";
		String t6 = t5.replaceAll("com", "vn");
		System.out.println(t5);
		System.out.println(t6);

		// Hàm toLowerCase()=> chuyển về viết thường
		System.out.println("Hàm toLowerCase()");
		String t7 = t5.toLowerCase();
		System.out.println(t7);
		// Hàm toUpperCase()=> chuyển về viết hoa
		System.out.println("Hàm toUpperCase()");
		String t8 = t5.toUpperCase();
		System.out.println(t8);
		
		// Hàm trim()=> xóa khoảng trắng dư thừa ở đầu chuỗi
		System.out.println("Hàm trim()");
		String t9="   Xin chào   các bạn   .";
		System.out.println(t9.trim());
		
		// Hàm subString(...)=> cắt chuỗi con
		System.out.println("Hàm subString(...)");
		String t10="Xin chào   các bạn   .";
		String t11=t10.substring(10);
		System.out.println(t11);
		String t12=t10.substring(10,15);
		System.out.println(t12);
		
		
		
	}
}
