package edu.lab.algorthms.lang_java;

public class PrefixAndPostfix {
	public static void main(String args[]) {
		int a = 9;
		int b = 5;

		// a++ return the original value of and then increase it by 1
		// ++a increase the value of a and return it

		int postAssignment = a++;

		System.out
				.println(" A will return its original value i.e 9 and then increase it by 1so this variable will hold "
						+ postAssignment);
		System.out.println("A is increased by 1" + a); // A is increased by 1

		int preAssignment = ++b;

		System.out
				.println("The value of b is frist incremented and then assigned hence the value will be 1+5 ="
						+ preAssignment);
		System.out
				.println("The new value of b is also the same since we are done incrementing it. The value is "
						+ b);
	}
}
