package public_protected_private;

public class Code2 {
	private Code cod;
	public void method() {
		// this.cod.a => không truy cập đc a
		this.cod.b=0; //=>truy cập đc b cùng 1 package
		this.cod.c =0;
		this.cod.d=0;
	}
}
