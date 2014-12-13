package edu.lab.algorthms.lang_java;

public class FieldAccessTest{
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		/*
		 * Create one instance of human class
		 */
		Human jack = new Human();// Jack will store the memeory location on the
		// instance of this human
		/*
		 * Increase count by one
		 */
		Human.count++;

		/*
		 * Reference variables can be used to access instance variables because
		 * they cannot be accessed directly
		 * 
		 * General syntax : <<reference variable Name>>.<<instance variable
		 * Name>>
		 */

		/*
		 * Assign values to name and gender
		 */
		jack.name = "Jack Parker";
		jack.gender = "Male";

		/*
		 * Read and print the values of name , gender and count
		 */
		String jackName = jack.name;
		String jackGender = jack.gender;

		/*
		 * Class Variable(i.e Static variable) can be accessed only in two ways
		 * <<Class Name>>.<<Class Variable Name>>
		 */
		// To read from the class variable you can do as below
		long population = Human.count;
		System.out.println("Name: " + jackName);
		System.out.println("Gender: " + jackGender);
		System.out.println("Population: " + population);
		/*
		 * Change the name
		 */
		jack.name = "Jackie Parker";
		/*
		 * Read and print the changed name
		 */
		String changedName = jack.name;
		System.out.println("Changed Name:" + changedName);

		/*
		 * Usage of NUll in reference variables
		 */
		/*
		 * Assign Null value to John null is a reference type and it can be used
		 * to assign to reference variable
		 * 
		 * A reference variable holding null type will not point to any object.
		 * It just means null
		 */
		Human john = null;
		john = new Human();// Now john is pointing to proper object

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

	}

}
