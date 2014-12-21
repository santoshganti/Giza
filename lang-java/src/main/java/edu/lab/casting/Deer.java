package edu.lab.casting;

public class Deer extends Mammal implements Vegetarian {

	public HungerLevel eatGreens() {

		return eat();
	}

	public boolean jump() {
		System.out.println("I am jumping");
		return true;
	}
}
