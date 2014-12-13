package edu.lab.algorthms.lang_java;

public class Human {
	// class variable should be declared using the word static. Class variable
	// is also known as static variable
	static long count;
	// Every instance or object of this class will have these two fields
	// Instance variable is also known as non-static varible. Objects will have
	// a copy of instance variables in them
	String gender;
	String name;

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Human jack = new Human();// Jack will store the memeory location on the
									// instance of this human

		/*
		 * Assign Null value to John null is a reference type and it can be used
		 * to assign to reference variable
		 * 
		 * A reference variable holding null type will not point to any object.
		 * It just means null
		 */
		Human john = null;

		john = new Human(); // Now john is pointing to proper object

		if (john == null) {
			/*
			 * John is referring to null. Cannot use john for anything
			 */
		}
		if (john != null) {
			/*
			 * John is not null do something with john
			 */
		}
		/*
		 * Reference variables can be used to access instance variables because
		 * they cannot be accessed directly
		 * 
		 * General syntax : <<reference variable Name>>.<<instance variable Name>>
		 */
		jack.name="Jack Parker";
	}
}
