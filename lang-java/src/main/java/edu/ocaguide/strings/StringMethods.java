package edu.ocaguide.strings;

public class StringMethods {
	public static void main(String[] args) {

		String x = "Atlantic";
		String y = "Ocean";
		String z = "optimistic";
		String t = " hi ";

		// charAt Methods
		System.out.println("Character at position 4 is " + x.charAt(4));

		// Concatenation methods
		System.out.println("The after appending x to y is " + x.concat(y));

		// equalsIgnoreCase
		System.out
				.println("This methods returns true or false depending on whether two strings are same or not ignoring case "
						+ x.equalsIgnoreCase("Atlantic"));

		// Length of Sting
		System.out.println("Returns Length of a String " + x.length());

		// replace methods
		System.out
				.println("Replaces character in the first argument with another "
						+ z.replace('i', 'x'));

		// Substring
		System.out.println("Returns string starting from index 4 "
				+ x.substring(4));
		System.out.println("Returns string starting from index 2 to 6 "
				+ x.substring(2, 6));

		// toLowerCase
		System.out
				.println("Converts all the letters in the string to lowecase letters "
						+ x.toLowerCase());

		// toUpperCase
		System.out
				.println("Converts all the letters in the string to lowecase uppercase "
						+ x.toUpperCase());

		// toString
		System.out.println("Returns the string itself " + x.toString());

		// trim
		System.out.println("Returns a string after trimming whitespaces "
				+ t.trim() + "t");
	}
}