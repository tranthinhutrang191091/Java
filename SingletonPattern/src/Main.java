import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[]args) {
		System.out.println("Nếu thấy 2 value giống nhau thì singleton khởi tạo 1 đối tượng"
				+ "\nNếu thấy 2 value khác nhau thì singleton khởi tạo ra 2 đối tượng ");
		Singleton singleton = Singleton.getInstance("F0");
		Singleton singleton2 = Singleton.getInstance("F1");
		System.out.println(singleton.value);
		System.out.println(singleton2.value);
		
		System.out.println("1. Eager Singleton");
		EagerSingleton eager= EagerSingleton.getInstance();
		EagerSingleton eager2= EagerSingleton.getInstance();
		System.out.println(eager);
		System.out.println(eager2);
		
		System.out.println("2. Static Block Singleton");
		StaticBlockSingleton sta= StaticBlockSingleton.getIntance();
		StaticBlockSingleton sta1= StaticBlockSingleton.getIntance();
		System.out.println(sta);
		System.out.println(sta1);
		
		System.out.println("3. Lazy Singleton");
		LazySingleton lz = LazySingleton.getInstance("F0");
		LazySingleton lz1 = LazySingleton.getInstance("F1");
		System.out.println(lz.valueLazy);
		System.out.println(lz1.valueLazy);
		
		System.out.println("4. Thread Safe Singleton ");
		ThreadSafeSingleton th = ThreadSafeSingleton.getInstance("F0");
		ThreadSafeSingleton th1 = ThreadSafeSingleton.getInstance("F1");
		System.out.println(th.valueThreadSafe);
		System.out.println(th1.valueThreadSafe);
		
		System.out.println("5. Double Check Singleton ");
		DoubleCheckSingleton db= DoubleCheckSingleton.getInstance("F0");
		DoubleCheckSingleton db1= DoubleCheckSingleton.getInstance("F1");
		System.out.println(db.valueDoubleCheck);
		System.out.println(db1.valueDoubleCheck);
		
		System.out.println("6. Bill Pugh Singleton ");
		BillPughSingleton bi= BillPughSingleton.getInstance();
		BillPughSingleton bi2= BillPughSingleton.getInstance();
		System.out.println(bi);
		System.out.println(bi2);
		
		System.out.println("7. Enum Singleton ");
		EnumSingleton enu= EnumSingleton.INSTANCE;
		System.out.println(enu.getValue());
		enu.setValue(5);
		System.out.println(enu.getValue());
	}
}
