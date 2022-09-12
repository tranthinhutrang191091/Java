
public class Continue {
	public static void main(String[] args) {
		int max = 100;
		// Không có label
		for (int i = 0; i < max; i++) {
			if (i < 50)
				continue;
			System.out.println(i);
		}
		// Có label
		outer: for (int j=1;j<=10;j++) {
			for(int i=2;i<=10;i++) {
				if(i>5)
					continue outer;
				System.out.print(i+" x "+j +" = "+i*j +"\t");
			}
			System.out.println();
		}
	}
}
