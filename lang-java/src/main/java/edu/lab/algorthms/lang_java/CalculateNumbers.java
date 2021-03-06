package edu.lab.algorthms.lang_java;

/**
 * Interface to implement methods that perform arithmetic calcuations
 * 
 * @author santoshganti
 *
 */
 public interface CalculateNumbers {
	/**
	 * Computer takes and returns the value of addition of two numbers.
	 * 
	 * @param a
	 *            - First number you want to add
	 * @param b
	 *            - Second number you want to add
	 * @return - The sum of numbers after performing addition of a+b
	 */
	public double add(double a, double b);

	/**
	 * Computer takes and returns the value of subtraction of two numbers.
	 * 
	 * @param a
	 *            - First number you want to add
	 * @param b
	 *            - Second number you want to add
	 * @return - The sum of numbers after performing subtraction of a+b
	 */
	public double substract(double a, double b);

	/**
	 * Computer takes and returns the value of multiplication of two numbers.
	 * 
	 * @param a
	 *            - First number you want to add
	 * @param b
	 *            - Second number you want to add
	 * @return - The sum of numbers after performing multiplication of a+b
	 */
	public double multiply(double a, double b);

	/**
	 * Computer takes and returns the value of division of two numbers.
	 * 
	 * @param a
	 *            - First number you want to add
	 * @param b
	 *            - Second number you want to add
	 * @return - The sum of numbers after performing division of a+b
	 */
	public double divide(double a, double b);

	/**
	 * Computer takes and returns the value of modulus of two numbers. i.e |x| =
	 * x and |-x| = x
	 * 
	 * @param a
	 *            - First number you want to add
	 * @return - The sum of numbers after performing modulus of a
	 */
	public double modulus(double a);

	/**
	 * Computer takes a number "n" and performs factorial of that number i.e n!
	 * = n*(n-1)!......
	 * 
	 * @param n
	 *            - The number for which you want to find the factorial
	 * @return - The value after performing factorial
	 */
	public double factorial(double n);
}
