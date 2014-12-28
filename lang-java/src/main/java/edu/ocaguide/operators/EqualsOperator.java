package edu.ocaguide.operators;

public class EqualsOperator {
	static int field;
	public static void main(String[] args) {
		EqualsOperator b1 = new EqualsOperator();
		EqualsOperator b2 = new EqualsOperator();
		EqualsOperator b3 = b1;
		// Java equals method overrides the actual equals() method so as to
		// check the actual values in the objects
		// If equals is not overridden it behaves exactly the same way as the ==
		String s1 = "Bob";
		String s2 = "Bob";
		String s3 = "bob"; // lowercase

		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		 System.out.println(field); 

		 //line 2
//		 double[][][] matrix = new double[5][5][5];
//		 4.               for (int x = 0; x < matrix.length; x ++) {
//		 5.                    for (int y = 0; y < matrix[x].length; y++) {
//		 6.                         for (int z = 0; z < matrix[x][y].length; z++) {
//		 7.                              //insert code here
//		 8.                         }
	}
	
}


