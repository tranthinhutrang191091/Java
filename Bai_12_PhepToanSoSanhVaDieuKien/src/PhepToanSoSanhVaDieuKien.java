import java.util.Scanner;

public class PhepToanSoSanhVaDieuKien {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Nhập a = ");
		a= sc.nextInt();
		System.out.print("Nhập b = ");
		b= sc.nextInt();
		//Xuất kết quả so sánh
		System.out.println(a+" == "+b+" : "+ (a==b));
		System.out.println(a+" != "+b+" : "+ (a!=b));
		System.out.println(a+" < "+b+" : "+ (a<b));
		System.out.println(a+" > "+b+" : "+ (a>b));
		System.out.println(a+" <= "+b+" : "+ (a<=b));
		System.out.println(a+" >= "+b+" : "+ (a>=b));
		System.out.println("--------------");
		System.out.println("Cả 2 đều là số chẵn : "+ (a%2==0&&b%2==0));
		System.out.println("Có ít nhất 1 số chẵn : "+ (a%2==0||b%2==0));
	}
}
