package daicent.com;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String s="Xin chào các bạn, tôi là trang. aaa";
		System.out.println("s = "+s);
		String[] a=s.split(" ");
		System.out.println("a = "+Arrays.toString(a));
		String[] b=s.split(",");
		System.out.println("b = "+Arrays.toString(b));
		String[] c=s.split("\\,|\\.");
		System.out.println("c = "+Arrays.toString(c));
		String s1 = "Trần Văn Hạnh";
		String[] d=s1.split(" ");
		System.out.println("d = "+Arrays.toString(d));
		System.out.println("Tên = "+d[d.length-1]);
		
	}
}
