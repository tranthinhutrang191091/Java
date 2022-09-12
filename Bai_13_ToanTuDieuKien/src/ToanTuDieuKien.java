import java.util.Scanner;

public class ToanTuDieuKien {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập a = ");
		int a=sc.nextInt();
		
		String ketQua=(a%2==0)?"số chẵn":"số lẻ";
		System.out.println(a+ " là : "+ketQua);
		
	}
}
