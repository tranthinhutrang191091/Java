package kethuabac;

import kethuadon.Animal;

public class Cat extends Animal {
	public Cat() {
		super("Cat");
	}

	public void meow() {
		System.out.println("Meo Meo!");
	}

	@Override
	public void eat() {
		System.out.println("Tôi ăn cá!");
	}

	@Override
	public void makeSound() {
		System.out.println("meo meo!");
	}
	
}
