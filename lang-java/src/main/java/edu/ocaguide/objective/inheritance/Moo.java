package edu.ocaguide.objective.inheritance;

public class Moo extends Zoo {
	public void useZoo(){
		Zoo z = new Zoo();
		System.out.println("A moo says: "+this.coolMethod());
		System.out.println("A Zoo says "+z.coolMethod());
	}
}
