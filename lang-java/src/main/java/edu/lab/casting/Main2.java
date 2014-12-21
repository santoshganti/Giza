package edu.lab.casting;

public class Main2 {
	public static void main(String[] args) {
		Animal a1 = new Mammal();
		System.out.println(a1.toString());
		Animal a = new Dog();
		System.out.println(a);
		Dog d = new Dog("Golden retriever", HungerLevel.HUNGRY);
		System.out.println(d);
	}
}
