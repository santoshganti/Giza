/*
 * The following exercise will test your knowledge of public, defaul, final and abstract classes. 
 * 1. Create an abstract Superclass named fruit and a concrete subclass named Apple. The super class 
 * should belong to package called food and the sub class can belong to default package. Make superclass 
 * public and subclass default access. 
 * 
 * 2. Create super class as follows : 
 * package food;
 * public abstract class Fruit{/.....}
 * 
 * 3.Create subclass in a seperate file as follows: 
 * import food.Food;
 * class Apple extends Fruit{/...}
 * 
 * 4. Attempt to comple the two files. 
 * 
 */
import food.Fruit;

class Apple extends Fruit {

	public void printFruit() {
		System.out.println("Hi, My name is apple");

	}

	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.printFruit();
	}
}
