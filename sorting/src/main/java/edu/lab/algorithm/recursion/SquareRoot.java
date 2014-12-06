package edu.lab.algorithm.recursion;

class Seed {
	private int multiplier;
	private int exponent = 0;
	private final int DIVISOR = 100;

	private int calculateMultiplier(double s) {
		if (s < 100) {
			return (int) s;
		} else {
			exponent++;
			return calculateMultiplier(s / DIVISOR);
		}

	}

	Seed(double s) {
		multiplier = calculateMultiplier(s);
	}

	public int getExponent() {
		return exponent;
	}

	public int getMultiplier() {
		return multiplier;
	}
}

public class SquareRoot {

	private final double EPSILON = 0.15;

	double guess(double s) {
		return s;

	}

	public double squareRoot(double s) {
		squareRoot(guess(s), s);
		return squareRoot(s);
	}

	double squareRoot(double guess, double s) {
		if (isGoodEnough(guess, s))
			return guess;
		else
			return squareRoot(improve(guess, s), s);

	}

	double improve(double guess, double s) {
		return (guess + s / guess) / 2;

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