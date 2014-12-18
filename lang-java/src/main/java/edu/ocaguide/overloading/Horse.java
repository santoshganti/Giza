package edu.ocaguide.overloading;

public class Horse extends Animal {
	//Overriding Animal's eat method
	public void eat(){
		System.out.println("Horse eating hay, oats"+" and horse treats");
	}
	//A methods which animal class doesn't have
	public void buck(){
		
	}
}
