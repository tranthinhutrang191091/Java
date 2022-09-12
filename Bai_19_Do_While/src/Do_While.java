import java.util.Scanner;

public class Do_While {
	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.print("Nhập n>0: n = ");
			n=sc.nextInt();
		}while(n<=0);
	}
}
