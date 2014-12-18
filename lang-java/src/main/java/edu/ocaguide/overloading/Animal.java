package edu.ocaguide.overloading;

public class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	Animal() {
		this(makeRandomName());
	}

	static String makeRandomName() {
		int x = (int) (Math.random() * 5);

		String name = new String[] { "Flufy", "Fido", "Rover", "Spike", "Gigi" }[x];
		return name;
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);
		Animal b = new Animal("zeus");
		System.out.println(b.name);
	}
}
