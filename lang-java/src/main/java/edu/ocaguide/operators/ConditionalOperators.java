package edu.ocaguide.operators;

public class ConditionalOperators {
	public static void main(String[] args) {
		int sizeOfYards = 10;
		int numOfPets = 3;
		String status = (numOfPets < 4) ? "Pet Count Ok"
				: (sizeOfYards > 8) ? "pet limit on the edge" : "too many pets";
		System.out.println("Pet status is" + status);
	}

}
