package edu.lab.casting;

import static edu.lab.casting.HungerLevel.*;

public class Elephant extends Mammal implements Vegetarian {

	public HungerLevel eatGreens() {

		return eat();
	}

	@Override
	public HungerLevel eat() {
		System.out.println("Hey,I am elephant and I am about to eat");
		return HUNGRY;
	}

	public boolean sprayWater() {
		return true;
	}
}
