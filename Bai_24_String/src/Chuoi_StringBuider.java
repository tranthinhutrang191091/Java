
public class Chuoi_StringBuider {
	/*
	 * Khả biến, dùng trong single - thread(non-syschronized)
	 * 
	 */
	public static void main(String[] args) {
		// Constructor
		System.out.println("-------- 1. StringBuider------");
		StringBuilder stringBuider = new StringBuilder();
		System.out.println("Capacity stringbuider: " + stringBuider.capacity());
		System.out.println("stringBuider: " + stringBuider);

		StringBuilder stringBuider1 = new StringBuilder("trần thị như trang");
		System.out.println("Capacity stringbuider1: " + stringBuider1.capacity());
		System.out.println("stringBuider1: " + stringBuider1);

		StringBuilder stringBuider2 = new StringBuilder(10);
		stringBuider2.append("12345");
		System.out.println("Capacity stringbuider1: " + stringBuider2.capacity());
		System.out.println("stringBuider2: " + stringBuider2);

		// Method public StringBuider append(...): connect string
		System.out.println("-------- append(...)------");
		stringBuider.append("trần");// append(String s)
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.append('-');// append(char c)
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.append(true);// append(boolean b)
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.append(1);// append(int a)...
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.append(2.0);// append(float a), append(double a)......
		System.out.println("stringBuider: " + stringBuider);

		// Method public StringBuider insert(int offset, ...): insert string at offset
		System.out.println("-------- insert(...)------");
		stringBuider.insert(5, "thị"); // insert(int offset, String s)
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.insert(8, '-'); // insert(int offset, char c)
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.insert(13, false); // insert(int offset, boolean b)
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.insert(13, 0); // insert(int offset, int a)...
		System.out.println("stringBuider: " + stringBuider);
		stringBuider.insert(14, 20.0f); // insert(int offset, float a)....
		System.out.println("stringBuider: " + stringBuider);

		// Method public StringBuider replace(int startIndex, int endIndex, String s):
		// replace string
		System.out.println("-------- replace(int startIndex, int endIndex, String s)------");
		stringBuider.replace(9, 13, "như");
		System.out.println("stringBuider: " + stringBuider);

		// Method public StringBuider delete(int startIndex, int endIndex): delete
		// string
		System.out.println("-------- delete(int startIndex, int endIndex)------");
		stringBuider.delete(12, stringBuider.length());
		System.out.println("stringBuider: " + stringBuider);

		// Method public StringBuider reverse(): reverse string
		System.out.println("-------- reverse()------");
		stringBuider.reverse();
		System.out.println("stringBuider: " + stringBuider);

		// Method public int capacity(): return capacity of string
		System.out.println("-------- capacity()------");
		int capacity = stringBuider.capacity();
		System.out.println("capacity stringBuider: " + capacity);

		// Method public int length(): return length of string
		System.out.println("-------- length()------");
		int length = stringBuider.length();
		System.out.println("length stringBuider: " + length);

		// Method public void ensureCapacity(int minimumCapacity): guaranteed minimum
		// capacity of string
		System.out.println("-------- ensureCapacity(int minimumCapacity) ------");
		StringBuilder stringBuider3 = new StringBuilder(); // capacity default: 16
		System.out.println("Capacity stringBuider3 default: " + stringBuider3.capacity());
		stringBuider3.append("trần");// if newCapacity < oldCapacity return oldCapacity
		System.out.println("stringBuider3= '" + stringBuider3 + "' Capacity : " + stringBuider3.capacity());
		stringBuider3.append(" thị như trang");// if newCapacity > oldCapacity return newCapacity = (oldCapacity*2)+2
		System.out.println("stringBuider3= '" + stringBuider3 + "' Capacity : " + stringBuider3.capacity());
		stringBuider3.ensureCapacity(10);// set minimumCapacity < Capacity => capacity unchanged
		System.out.println("stringBuider3= '" + stringBuider3 + "' Capacity : " + stringBuider3.capacity());
		stringBuider3.ensureCapacity(50);// set minimumCapacity > Capacity => capacity changed newCapacity =
											// (oldCapacity*2)+2
		System.out.println("stringBuider3= '" + stringBuider3 + "' Capacity : " + stringBuider3.capacity());

		// Method public char charAt(int index): return char in index
		System.out.println("-------- charAt(int index) ------");
		char c = stringBuider.charAt(0);
		System.out.println("stringBuider.charAt(0): " + c);

		// Method public String substring(int beginIndex): return sub string from begin
		// index
		// index
		System.out.println("-------- substring(int beginIndex) ------");
		String substring = stringBuider.substring(4);
		System.out.println("stringBuider.substring(4): " + substring);

		// Method public String substring(int beginIndex, int endIndex): return sub
		// string from begin index to end index
		System.out.println("-------- substring(int beginIndex, int endIndex) ------");
		String strstring1 = stringBuider.substring(4, 7);
		System.out.println("stringBuider.substring(4,7): " + strstring1);

	}

}
