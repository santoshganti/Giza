package edu.lab.algorithm.recursion;

public class SquareRoot {

	public double roughtApproximation(double a) {

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
		
		return a;
	}

	public double squareRoot(double roughtApproximation, double a) {
		if (isGoodEnough(roughtApproximation, a))
			return roughtApproximation;
		else
			squareRoot(improve( roughtApproximation,a),  a);
		return a;

	}

	private double improve(double roughtApproximation, double a) {
		
		return a;
	}

	private boolean isGoodEnough(double roughtApproximation,double a) {
		
		return false;
	}

}