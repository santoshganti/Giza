package edu.ocaguide.conditionalstatements;

enum Fruit {
	apple, carrot, mango, orange;
}

public class SwtichCase {
	public static void main(String[] args) {
		String value = "apple";
		Fruit fruit = Fruit.valueOf(value); // returns string as Integer Object
											// so that it can be used in switch
											// case

		switch (fruit) {
		case apple:
			System.out.println("Hi! My name is apple");
			break;

		case carrot:
			System.out.println("Hi! My name is apple");
			break;

		case mango:
			System.out.println("Hi! My name is apple");
			break;

		case orange:
			System.out.println("Hi! My name is apple");
			break;
		default:
			System.out.println("I don't have what you are looking for");
			break;
		}
	}
}
