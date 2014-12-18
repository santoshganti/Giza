package edu.ocaguide.overloading;

public class TestAnimals {
	public static void main(String[] args){
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat(); //Runs Animal version of eat
		b.eat(); // Runs Horse version of eat
		
		//Animal c = new Horse();
		//c.buck();  //Cannot run this method because animal class doesn't have it.
		
	
	}
}
