package edu.lab.algorithm.recursion;

public class SquareRoot {

	private final double EPSILON = 0.15;

	double roughtApproximation(double a) {

		double k = String.valueOf(a).length();// no. of the digits
		double n = k - 2; // we raise this as the power
		double j = k - n;// this gives the value of first two digits

		if (j < 10) {
			return (2 * Math.pow(10.0, n));
		} else {
			return (6 * Math.pow(10.0, n));
		}

	}

	public double squareRoot(double a) {
		squareRoot(roughtApproximation(a), a);
		return squareRoot(a);
	}

	double squareRoot(double roughtApproximation, double a) {
		if (isGoodEnough(roughtApproximation, a))
			return roughtApproximation;
		else
			squareRoot(improve(roughtApproximation, a), a);
		return a;

	}

	double improve(double guess, double a) {
		return 1 / 2 * (guess + a / guess);

	}

	boolean isGoodEnough(double guess, double a) {
		return (modulus(a - guess * guess) < EPSILON);

	}

	double modulus(double a) {
		if (a >= 0)
			return a;
		else
			return -a;
	}
}