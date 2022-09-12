import java.util.Scanner;

public class While_ThapPhanSangNhiPhan {
	public static void main(String[] args) {
		int thapPhan=0,n;
		String nhiPhan="";
		Scanner sc = new Scanner(System.in);
		
		while(thapPhan<=0) {
			System.out.print("Nhập số nguyên >0 n = ");
			thapPhan =sc.nextInt();
		}
		n=thapPhan;
		while (thapPhan>0) {
			nhiPhan=thapPhan%2+ nhiPhan;
			thapPhan=thapPhan/2;
		}
		System.out.println(n + " số nhị phân là : "+nhiPhan);
	}
}
