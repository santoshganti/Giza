package edu.ocaguide.exceptions;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 10, y = 0, z;
		try {
			z = x / y;
			System.out.println("Z=" + z);
			System.out
					.println("Once the control leaves try block it doesn't come back ");
		} catch (ArithmeticException e) {
			String msg = e.getMessage();
			System.out.println("An error has occured. Error is " + msg);
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
			System.out
					.println("Only one catch block is executed even though there are multiple catch blocks");
		}
		System.out
				.println("The control will come to the next block after try block. It will not come goto the try block again");
		System.out.println("We have reached the end of the program");
	}
}
