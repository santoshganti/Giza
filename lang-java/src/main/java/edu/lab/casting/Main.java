package edu.lab.casting;

import static edu.lab.casting.HungerLevel.*;

public class Main {
	public static void main(String[] args) {
		Animal a1 = new Mammal();
		System.out.println(a1.toString());
		Animal a = new Dog();
		System.out.println(a);
		checkHungerLevel(a);
		AnimalDoctor doc = new AnimalDoctor();
		// doc.treat(a);

		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.bark();
			doc.pets(d);
			doc.treat(d);
		}

		a = new Cat();

		if (a instanceof Cat) {
			Cat c = (Cat) a;
			c.meow();
			doc.treat(c);
		}
		checkHungerLevel(a);
		Vegetarian d1 = new Deer();
		if (d1 instanceof Deer) {
			((Deer) d1).jump();
		}

		d1 = new Elephant();
		if (d1 instanceof Animal) {
			((Animal) d1).eat();
		}
		if (d1 instanceof Elephant) {
			((Elephant) d1).sprayWater();
			((Elephant) d1).eat();
		}
	}

	private static void checkHungerLevel(Animal a) {
		switch (a.eat()) {
		case HUNGRY:
			System.out.println("I am hungry");
			break;

		case NOTHUNGRY:
			System.out.println("I am not hungry");
			break;
		}
	}
}
