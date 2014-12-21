package edu.lab.casting;

public class AnimalDoctor {
	public boolean treat(Cat c) {
		System.out.println("I am treating a cat");
		return true;

	}

	public boolean treat(Dog d) {
		System.out.println("I am treating a dog");
		return true;
	}

//	public boolean treat(Animal a) {
//		System.out.println("I am treating a Animal");
//		if (a instanceof Dog) {
//			return treat((Dog) a);
//		} else if (a instanceof Cat) {
//			return treat((Cat) a);
//		} else {
//			throw new IllegalArgumentException("Don't know which animal");
//		}
//	}
	
	public boolean pets(Animal a){
		System.out.println("I am petting an animal");
		return true;
		
	}
}
