package edu.ocaguide.arrays;

public class ArrayAssignment {
	public void assignmentPrimitive() {
		int[] weightList = new int[5];
		byte b = 4;
		char c = 'c';
		short s = 7;
		weightList[0] = b;
		weightList[1] = c;
		weightList[2] = s;
	}

	public void assignmentObjectReferences() {
		Car[] myCars = { new Subaru(), new Car(), new Ferari() };
		Sporty[] sportyThings = new Sporty[3];
		sportyThings[0] = new Ferari();
		sportyThings[1] = new RacingFlats();

	}
}
