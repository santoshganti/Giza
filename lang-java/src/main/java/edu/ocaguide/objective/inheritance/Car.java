package edu.ocaguide.objective.inheritance;

/*
 * 1. Used final in from this superclass
 * 2. Removed public and check how it affects the inheritance
 * 3. Put private and protected and see the difference
 */
public abstract class Car {
	private double price;
	private String model;
	private String year;

//	public abstract void goFast();
//
//	public abstract void goUpHill();
//
//	public abstract void impressNeightbors();

	public static void main(String args[]) {
		System.out.println("Hi,I am from superclass car");
	}
}
