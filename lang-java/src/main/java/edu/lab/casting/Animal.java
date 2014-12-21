package edu.lab.casting;

import static edu.lab.casting.HungerLevel.*;

public class Animal {
	private final String name;
	private final HungerLevel hungerlevel;

	public Animal() {
		//this.name = "Animal";
		
		this("Animal");
		System.out.println("Animal()");
	}

	public Animal(String s) {
		//this.name = s;
		this(s,NOTHUNGRY);
		System.out.println("Animal(String s)");
	}
	
	public Animal(String s,HungerLevel hungerlevel){
		this.name=s;
		this.hungerlevel=hungerlevel;
		System.out.println("Animal(String s,HungerLevel hungerlevel)");
	}
	public HungerLevel eat() {
		System.out.println("Hey I am about to eat");
		return NOTHUNGRY;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", hungerlevel=" + hungerlevel + "]";
	}

}
