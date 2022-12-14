
public class String_StringBuider_StringBuffer {

	public static void main(String[] args) {
		// Compare String vs StringBuider vs StringBuffer
		System.out.println("-------- 1. String vs StringBuider vs StringBuffer ------");
		long startTime = System.currentTimeMillis();
		String str = "Java";
		concatWithString(str);
		System.out.println("Time concat string with String: " + (System.currentTimeMillis() - startTime) + "ms");

		StringBuilder strBuider = new StringBuilder("Java");
		startTime = System.currentTimeMillis();
		concatWithStringBuider(strBuider);
		System.out.println("Time concat string with StringBuider: " + (System.currentTimeMillis() - startTime) + "ms");
		
		StringBuffer strBuffer = new StringBuffer("Java");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer(strBuffer);
		System.out.println("Time concat string with StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		
	}

	public static String concatWithString(String str) {
		for (int i = 0; i < 10000; i++) {
			str = str + "Hello";
		}
		return str;
	}

	public static String concatWithStringBuider(StringBuilder strBuider) {
		for (int i = 0; i < 10000; i++) {
			strBuider.append("Hello");
		}
		return strBuider.toString();
	}
	
	public static String concatWithStringBuffer(StringBuffer strBuffer) {
		for (int i = 0; i < 10000; i++) {
			strBuffer.append("Hello");
		}
		return strBuffer.toString();
	}
}
