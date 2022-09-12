package public_protected_private;

public class SubCode extends Code {
	public void method() {
		// super.a => ko dùng đc biến a
		super.b=5; //=> truy cập được vì chung 1 package
		super.c=5;
		super.d=5;
	}
}
