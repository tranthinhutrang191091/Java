import java.util.List;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Car car1= new Accent(2.5, 1.5, 500.0, 4, "red", 1,"gasoline" );
		System.out.println(car1);
		System.out.println("Price of Accent after tax: "+car1.getSpeedAfterTax()+"tỷ VNĐ");
		car1.startUp();
		car1.acceleration();
		car1.stop();
		
		HuynDai car2 = new Accent(3.5, 2.0, 600.0, 7, "blue", 1.5,"oil" );
		System.out.println(car2);
		System.out.println("Price of Accent after tax: "+car2.getSpeedAfterTax()+"tỷ VNĐ");
		car2.startUp();
		car2.acceleration();
		car2.stop();
		Car car3= new SantaFe(2.0, 1.5, 300.0, 4, "white", 2,"gasoline" );
		System.out.println(car3);
		System.out.println("Price of SantaFe after tax: "+car3.getSpeedAfterTax()+"tỷ VNĐ");
		
		Car car4= new Vios(2.0, 1.5, 300.0, 4, "orange", 2 );
		System.out.println(car4);
		System.out.println("Price of Vios after tax: "+car4.getSpeedAfterTax()+"tỷ VNĐ");
		car4.startUp();
		car4.acceleration();
		car4.stop();
		
		Toyota car5= new Vios(2.0, 1.5, 300.0, 4, "black", 1 );
		System.out.println(car5);
		System.out.println("Price of Vios after tax: "+car5.getSpeedAfterTax()+"tỷ VNĐ");
		
		Toyota car6= new Avanza(2.0, 2.0, 600.0, 7, "green", 1 );
		System.out.println(car5);
		System.out.println("Price of Vios after tax: "+car6.getSpeedAfterTax()+"tỷ VNĐ");
		
		
	}
}
