import java.util.Scanner;

public class If_Else_GiaiPTBacNhat {
	public static void main(String[] args) {
		//PTBN: ax+b=0
		double a,b,x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a = ");
		a= sc.nextDouble();
		System.out.print("Nhập b = ");
		b= sc.nextDouble();
		if(a==0) {
			// Nếu a=0
			if(b==0) {
				// Nếu a=0 và b=0
				System.out.println("Phương trình vô số nghiệm!");
			}else {
				// Nếu a=0 và b#0
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			// Nếu a#0
			x=-b/a;
			System.out.println("Phương trình có nghiệm x = "+x);
		}
	}
}
