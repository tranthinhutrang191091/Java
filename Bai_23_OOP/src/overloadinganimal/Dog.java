package overloadinganimal;
public class Dog extends Animal {

	public Dog() {
		super("Dog");
	}
	
	public void Bark() {
		System.out.println("Gâu Gâu!");
	}

	@Override
	public void eat() {
		System.out.println("Tôi ăn xương!");
	}

	@Override
	public void makeSound() {
		System.out.println("gâu gâu!");
	}
	
}
