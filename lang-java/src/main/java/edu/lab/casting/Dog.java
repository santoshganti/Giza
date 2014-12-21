package edu.lab.casting;

import static edu.lab.casting.HungerLevel.*;

public class Dog extends Mammal {

	public Dog() {
		this("Dog", HUNGRY);
		System.out.println("Dog()");
	}

	public Dog(String s, HungerLevel hungerlevel) {
		super(s, hungerlevel);
		System.out.println("Dog(String s, HungerLevel hungerlevel)");
	}

	@Override
	public boolean feed() {
		return true;
	}

	public boolean bark() {
		return true;
	}

	@Override
	public HungerLevel eat() {
		return HUNGRY;

	}

	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}

}
