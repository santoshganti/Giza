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

	public void function(double x) {
		double y = x + a * Math.pow(x, -1);
	}

	public double squareRoot(double a) {
		if (int n == 0) {
			roughtApproximation(a);
		} else {

		}
		return 0;// for now returning some value

	}
}
