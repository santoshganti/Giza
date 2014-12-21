package edu.lab.casting;

public class Mammal extends Animal {

	public Mammal() {
		super("Mammal");
		System.out.println("Mammal()");
	}

	public Mammal(String s, HungerLevel hungerlevel) {
		super(s, hungerlevel);
		System.out.println("Mammal(String s, HungerLevel hungerlevel)");
	}

	public boolean feed() {
		return false;
	}

	@Override
	public String toString() {
		return "Mammal [" + super.toString() +

		"]";
	}

}
