import java.util.Scanner;

public class Try_Catch_Finally {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		try {
			System.out.print("Nhập vào số nguyên n = ");
			n=sc.nextInt();
		} catch (Exception e) {
			
			System.out.println("Nhập dữ liệu không đúng ");
			
		}finally {
			System.out.println("Finally ");
		}
		
		System.out.println("n = ");
		System.out.println("Kết thúc chương trình");
	}
}
