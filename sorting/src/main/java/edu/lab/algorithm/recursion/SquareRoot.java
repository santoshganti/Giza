package edu.lab.algorithm.recursion;

public class SquareRoot {

	private final double EPSILON = 0.15;

	int findExponentForGuess(double a){
		return 0;
	}
	double guess(double s) {

		double k = String.valueOf(s).length();// no. of the digits
		double n = k - 2; // we raise this as the power
		double j = k - n;// this gives the value of first two digits

		if (j < 10) {
			return (2 * Math.pow(10.0, n));
		} else {
			return (6 * Math.pow(10.0, n));
		} 

	}

	public double squareRoot(double s) {
		squareRoot(guess(s), s);
		return squareRoot(s);
	}

	double squareRoot(double guess, double s) {
		if (isGoodEnough(guess, s))
			return guess;
		else
		return	squareRoot(improve(guess, s), s);
		

	}

	double improve(double guess, double s) {
		return (guess + s / guess)/2;

	}

	boolean isGoodEnough(double guess, double s) {
		return (modulus(s - guess * guess) < EPSILON);

	}

	double modulus(double s) {
		if (s >= 0)
			return s;
		else
			return -s;
	}
}