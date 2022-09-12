import java.util.Scanner;

public class If_Else_ChanLe {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập só nguyên n: ");
		n=sc.nextInt();
		// Kiểm tra chẵn lẻ
		if(n%2==0) {
			System.out.println(n+" là số chẵn");
			
		}
		else {
			System.out.println(n + " là số lẻ");
		}
	}
}
