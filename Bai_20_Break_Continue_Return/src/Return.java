
public class Return {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			for (int i = 2; i <= 10; i++) {
				if (i > 5)
					return;
				System.out.print(i + " x " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}