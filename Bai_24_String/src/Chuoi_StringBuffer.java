
public class Chuoi_StringBuffer {
	/*
	 * Khả biến, dùng trong multi - thread (syschronized) 
	 * Nguyên nhân là tất cả các method trong StringBuffer là bất đồng bộ 
	 * và sử dụng cơ chế thread safe (luồng an toàn) 
	 * vì vậy mà quá trình xử lý phải chờ đợi lẫn nhau gây ra tình trạng 
	 * sử dụng StringBuffer thì chậm.
	 */
	public static void main(String[] args) {
		// Constructor
		System.out.println("-------- 2. StringBuffer------");
		StringBuffer stringBuffer = new StringBuffer();
		System.out.println("Capacity stringBuffer: " + stringBuffer.capacity());
		System.out.println("stringBuffer: " + stringBuffer);

		StringBuffer stringBuffer1 = new StringBuffer("trần thị như trang");
		System.out.println("Capacity stringBuffer1: " + stringBuffer1.capacity());
		System.out.println("stringBuffer1: " + stringBuffer1);

		StringBuffer stringBuffer2 = new StringBuffer(10);
		stringBuffer2.append("12345");
		System.out.println("Capacity stringBuffer2: " + stringBuffer2.capacity());
		System.out.println("stringBuffer2: " + stringBuffer2);

		// Method public StringBuffer append(...): connect string
		System.out.println("-------- append(...)------");
		stringBuffer.append("trần");// append(String s)
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.append('-');// append(char c)
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.append(true);// append(boolean b)
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.append(1);// append(int a)...
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.append(2.0);// append(float a), append(double a)......
		System.out.println("stringBuffer: " + stringBuffer);

		// Method public StringBuffer insert(int offset, ...): insert string at offset
		System.out.println("-------- insert(...)------");
		stringBuffer.insert(5, "thị"); // insert(int offset, String s)
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.insert(8, '-'); // insert(int offset, char c)
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.insert(13, false); // insert(int offset, boolean b)
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.insert(13, 0); // insert(int offset, int a)...
		System.out.println("stringBuffer: " + stringBuffer);
		stringBuffer.insert(14, 20.0f); // insert(int offset, float a)....
		System.out.println("stringBuffer: " + stringBuffer);

		// Method public StringBuffer replace(int startIndex, int endIndex, String s):
		// replace string
		System.out.println("-------- replace(int startIndex, int endIndex, String s)------");
		stringBuffer.replace(9, 13, "như");
		System.out.println("stringBuffer: " + stringBuffer);

		// Method public StringBuffer delete(int startIndex, int endIndex): delete
		// string
		System.out.println("-------- delete(int startIndex, int endIndex)------");
		stringBuffer.delete(12, stringBuffer.length());
		System.out.println("stringBuffer: " + stringBuffer);

		// Method public StringBuffer reverse(): reverse string
		System.out.println("-------- reverse()------");
		stringBuffer.reverse();
		System.out.println("stringBuffer: " + stringBuffer);

		// Method public int capacity(): return capacity of string
		System.out.println("-------- capacity()------");
		int capacity = stringBuffer.capacity();
		System.out.println("capacity stringBuffer: " + capacity);

		// Method public int length(): return length of string
		System.out.println("-------- length()------");
		int length = stringBuffer.length();
		System.out.println("length stringBuffer: " + length);

		// Method public void ensureCapacity(int minimumCapacity): guaranteed minimum
		// capacity of string
		System.out.println("-------- ensureCapacity(int minimumCapacity) ------");
		StringBuffer stringBuffer3 = new StringBuffer(); // capacity default: 16
		System.out.println("Capacity stringBuffer3 default: " + stringBuffer3.capacity());
		stringBuffer3.append("trần");// if newCapacity < oldCapacity return oldCapacity
		System.out.println("stringBuffer3= '" + stringBuffer3 + "' Capacity : " + stringBuffer3.capacity());
		stringBuffer3.append(" thị như trang");// if newCapacity > oldCapacity return newCapacity = (oldCapacity*2)+2
		System.out.println("stringBuffer3= '" + stringBuffer3 + "' Capacity : " + stringBuffer3.capacity());
		stringBuffer3.ensureCapacity(10);// set minimumCapacity < Capacity => capacity unchanged
		System.out.println("stringBuffer3= '" + stringBuffer3 + "' Capacity : " + stringBuffer3.capacity());
		stringBuffer3.ensureCapacity(50);// set minimumCapacity > Capacity => capacity changed newCapacity =
											// (oldCapacity*2)+2
		System.out.println("stringBuffer3= '" + stringBuffer3 + "' Capacity : " + stringBuffer3.capacity());

		// Method public char charAt(int index): return char in index
		System.out.println("-------- charAt(int index) ------");
		char c = stringBuffer.charAt(0);
		System.out.println("stringBuffer.charAt(0): " + c);

		// Method public String substring(int beginIndex): return sub string from begin
		// index
		System.out.println("-------- substring(int beginIndex) ------");
		String substring = stringBuffer.substring(4);
		System.out.println("stringBuffer.substring(4): " + substring);

		// Method public String substring(int beginIndex, int endIndex): return sub
		// string from begin index to end index
		System.out.println("-------- substring(int beginIndex, int endIndex) ------");
		String strstring1 = stringBuffer.substring(4, 7);
		System.out.println("stringBuffer.substring(4,7): " + strstring1);

	}
}
