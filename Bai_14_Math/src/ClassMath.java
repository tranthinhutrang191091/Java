import java.util.Scanner;

public class ClassMath {
	public static void main(String[] args) {
		double a,b;
		Scanner sc= new Scanner(System.in);
		System.out.print("Nhập a = ");
		a=sc.nextDouble();
		System.out.print("Nhập b = ");
		b=sc.nextDouble();
		
		// Hàm abs(double a) : tính giá trị tuyệt đối của số double
		// Hàm abs(float a) : tính giá trị tuyệt đối của số float
		// Hàm abs(int a) : tính giá trị tuyệt đối của số int
		// Hàm abs(long a) : tính giá trị tuyệt đối của số long
		System.out.println("|"+a+"| = " +Math.abs(a));
		
		// Hàm min(double x, double b) : trả về giá trị double nhỏ nhất
		// Hàm min(float x, float b) : trả về giá trị float nhỏ nhất
		// Hàm min(int x, int b) : trả về giá trị int nhỏ nhất
		// Hàm min(long x, long b) : trả về giá trị long nhỏ nhất
		System.out.println("min("+a+" , "+b+") = " +Math.min(a,b));
		
		// Hàm max(double x, double b) : trả về giá trị double lớn nhất
		// Hàm max(float x, float b) : trả về giá trị float lớn nhất
		// Hàm max(int x, int b) : trả về giá trị int lớn nhất
		// Hàm max(long x, long b) : trả về giá trị long lớn nhất
		System.out.println("max("+a+" , "+b+") = " +Math.max(a,b));
		
		// Hàm ceil(double a) : lấy số nguyên >=a
		System.out.println("cel("+a+") = " +Math.ceil(a));
		
		// Hàm floor(double a) : lấy số nguyên <=a
		System.out.println("floor("+a+") = " +Math.floor(a));
		
		// Hàm sqrt(double a) : căn bậc hai của a
		System.out.println("sqrt("+a+") = " +Math.sqrt(a));
		
		// Hàm pow(double a, double b): tính a^b
		System.out.println(a+"^"+b+" = " +Math.pow(a,b));
		
		// Hàm acos(double a) : tính acos của góc
		System.out.println("acos(0.5) = " +Math.acos(0.5));
		
		// Hàm addExact(int x, int y) = x+y
		System.out.println("addExact(7, 8) = " +Math.addExact(7,8));
		
		// Hàm asin(double a) : tính asin của một góc
		System.out.println("asin(0.5) = " +Math.asin(0.5));
		
		// Hàm atan(double a) : tính atan của một góc
		System.out.println("atan(0.5) = " +Math.atan(0.5));
		
		// Hàm atan2(double y, double x) : tính atan2
		System.out.println("atan2(0.9, 0.5) = " +Math.atan2(0.9,0.5));
		
		// Hàm cbrt(double a)
		System.out.println("cbrt("+a+") = " +Math.cbrt(a));
		
		// Hàm copySign(double magintude, doubel sign)
		// Hàm copySign(float magintude, float sign)
		System.out.println("copySign("+a+" , "+b+") = " +Math.copySign(a,b));
		
		// Hàm cos(double a) : tính cosin của 1 góc
		System.out.println("cos(0.6) = " +Math.cos(0.6));
		
		// Hàm cos(double a) : tính cosin của 1 góc
		System.out.println("cosh(0.6) = " +Math.cosh(0.6));
		
		// Hàm cosh(double a) 
		System.out.println("cos(0.6) = " +Math.cos(0.6));
		
		// Hàm decrementExact(int a)
		// Hàm decrementExact(long a)
		System.out.println("decrementExact(10) = " +Math.decrementExact(10));
		
		// Hàm exp(double a)
		System.out.println("exp("+a+") = " +Math.exp(a));
		
		// Hàm expm1(double x) : trả về e^(x -1)
		System.out.println("expm1(5) = " +Math.expm1(5));
		
		// Hàm floorDiv(int x, int y) : trả về giá trị int lớn nhất <= thương đại số
		// Hàm floorDiv(long x, long y) : trả về giá trị int lớn nhất <= thương đại số
		System.out.println("floorDiv(5,10) = " +Math.floorDiv(5,10));
		
		// Hàm floorMod(int x, int y) 
		// Hàm floorMod(long x, long y)
		System.out.println("floorMod(5,10) = " +Math.floorMod(5,10));
		
		// Hàm getExponent(double a)
		// Hàm getExponent(float a)
		System.out.println("getExponent("+a+") = " +Math.getExponent(a));
		
		// Hàm hypot(double a, double b) : trả về sqrt(a^2+b^2)
		System.out.println("hypot("+a+" , "+b+") = sqrt("+a+"^2 + "+b+"^2) = " +Math.hypot(a,b));
		
		// Hàm IEEEremainder(double a, double b) : trả về sqrt(x^2+y^2)
		System.out.println("IEEEremainder("+a+" , "+b+") = " +Math.IEEEremainder(a,b));
		
		// Hàm incrementExact(int a)
		// Hàm incrementExact(long a)
		System.out.println("incrementExact(5) = " +Math.incrementExact(5));
		
		// Hàm log(double a) : trả về logarit tự nhiên (cơ số e) của a
		System.out.println("log("+a+") = " +Math.log(a));
		
		// Hàm log10(double a) : trả về logarit cơ số 10 của a
		System.out.println("log10("+a+") = " +Math.log10(a));
		
		// Hàm log1p(double a) : trả về logarit tự nhiên của tổng đối số và 1
		System.out.println("log1p("+a+") = " +Math.log1p(a));
		
		// Hàm multiplyExact(int a, int b)
		// Hàm multiplyExact(long a, long b)
		System.out.println("multiplyExact(7,9) = " +Math.multiplyExact(7,9));
		
		// Hàm negateExacr(int a)
		// Hàm negateExacr(long a)
		
		// Hàm nextAfter(double start, double direction)
		// Hàm nextAfter(float start, float direction)
		
		// Hàm nextDown(double a)
		// Hàm nextDown(float a)
		
		// Hàm Up(double a)
		// Hàm nextUp(float a)
		
		// Hàm random() : tính số ngẫu nhiên (double), >=0.0 và <=1.0
		
		// Hàm round(double a) : làm tròn và trả về số double
		// Hàm round(long a) : làm tròn và trả về số long
		// Hàm round(float a) : làm tròn và trả về số float
		
		// Hàm scalb(double a, int scaleFactor)
		
		// Hàm signum(double a)
		// Hàm signum(float a)
		
		// Hàm sin(double a)
		
		// Hàm sinh(double a)
		
		// Hàm subtractExact(int x, int y)
		// Hàm subtractExact(long x, long y)
		
		// Hàm tan(double a)
		
		// Hàm tanh(double a)
		
		// Hàm toDegrees(double angrad)
		
		// Hàm toInExact(long value)
		
		// Hàm toRadians(double d)
		
		// Hàm ulp(float f)
		
	}
}
